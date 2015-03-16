package controleur;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import modele.dao.DaoException;
import modele.dao.DaoPraticien;
import modele.dao.DaoRapportVisite;
import modele.metier.Praticien;
import modele.metier.RapportVisite;
import modele.metier.Visiteur;
import vue.VueVisite;

/**
 *
 * @author Groupe2 PPE SLAM
 */
public class CtrlVisite  extends CtrlAbstrait {
        
    private final DaoPraticien daoPraticien = new DaoPraticien();
    private final DaoRapportVisite daoRapportVisite = new DaoRapportVisite();
    private String str ;
    private List<Praticien> listPraticiens;
    private List<RapportVisite> listRapportsVisite;
    private int indiceCourant = 0 ;
    DateFormat format = new SimpleDateFormat("MM/dd/yy");
    private Date newDate ;
    private String newMotif ;
    private String newBilan ;
    private String split[] ;
    private  String newNom ;
    private   String newPrenom ;
    private int newNum ;
    
    /**
     * @param ctrlPrincipal
     * @throws Exception 
     */
      public CtrlVisite(CtrlPrincipal ctrlPrincipal) throws Exception {
        super(ctrlPrincipal);
        vue = new VueVisite(this);
        actualiser();
     
    }
      
      /**
       * Charge les praticiens et la liste des rapports puis affiche le rapport courant
       * @throws Exception 
       */
       public final void actualiser() throws Exception {
           chargerListePraticiens() ;
           chargerListeRapport() ;
           rapportSelectionner() ;
            getVue().jComboBoxPraticien.setEditable(false);
            getVue().date.setEditable(false);
            getVue().motif.setEditable(false);
            getVue().bilan.setEditable(false);
            getVue().validerRapport.setEnabled(false);
    }
   
       /**
        * Permet de quitter la vue
        * @throws Exception 
        */
    public void visiteQuitter() throws Exception{
         this.getCtrlPrincipal().action(EnumAction.VISITE_RETOUR);
    }

    
    
     /**
     * chargerListePraticiens renseigner le modèle du composant JcomBoxPraticien
     * à partir de la base de données
     * @throws DaoException
     */
    private void chargerListePraticiens() throws DaoException, Exception {
        getVue().jComboBoxPraticien.removeAllItems();
        getVue().jComboBoxPraticien.addItem("Aucun");
        listPraticiens = daoPraticien.getAll() ;
        for (Praticien unPraticien : listPraticiens) {
            getVue().jComboBoxPraticien.addItem(unPraticien.toString());

        }
    }
    public void chargerListeRapport() throws DaoException, Exception {
        listRapportsVisite = daoRapportVisite.getAll() ;  
        System.out.println(listRapportsVisite);
    }
    
    /**
     *
     * 
     **/
    public void rapportSelectionner() {
        RapportVisite unRapport = listRapportsVisite.get(indiceCourant) ;
        getVue().num.setText(Integer.toString(unRapport.getNum()));
        getVue().date.setText(format.format(unRapport.getDate()));
        getVue().motif.setText(unRapport.getMotif());
        getVue().bilan.setText(unRapport.getBilan());
        Praticien unPraticien = unRapport.getPraticien() ;
        
        getVue().jComboBoxPraticien.setSelectedItem(unPraticien.toString());
    }
    
    /**
    *
    *
    **/
    
    public void visiteSuivant(){
        indiceCourant = indiceCourant + 1;
        if (indiceCourant>listRapportsVisite.size()-1) {
            indiceCourant=0;
            }                
        rapportSelectionner();
    }
    
    /**
     * 
     **/
    
    public void visitePrecedent(){
        indiceCourant = indiceCourant - 1;
        if (indiceCourant<0) {
            indiceCourant=listRapportsVisite.size()-1;
            }               
        rapportSelectionner();
    }
    
    /**
     * 
     * 
     **/
    
    public void visiteReset(){
        Date date = new Date();
        getVue().num.setText(" ");
        getVue().jComboBoxPraticien.setEditable(true);
        getVue().jComboBoxPraticien.setSelectedItem("Aucun");
        getVue().date.setText(format.format(date));
        getVue().date.setEditable(true);
        getVue().motif.setText(" ") ;
        getVue().motif.setEditable(true);
        getVue().bilan.setText(" ") ;
        getVue().bilan.setEditable(true);
        getVue().validerRapport.setEnabled(true);
    }
    
    /**
     * 
     * 
     */
    
    public void creerRapport() throws ParseException, Exception{
      
        String unPraticien = getVue().jComboBoxPraticien.getSelectedItem().toString() ;
        Praticien lePraticien = new Praticien() ;
        Praticien lePraticienBis = new Praticien() ;
        Visiteur leVisiteur = new Visiteur() ;

       
        str = getVue().date.getText() ;
        newDate = format.parse(str) ;
        newMotif = getVue().motif.getText() ;
        newBilan = getVue().bilan.getText() ; 
        
        split = unPraticien.split(" ") ;
        newNom = split[0] ;
        newPrenom = split[1] ;
        lePraticienBis =  daoPraticien.getByName(newNom, newPrenom) ;
        newNum = lePraticienBis.getNum() ;
        
        lePraticien.setNom(newNom);
        lePraticien.setPrenom(newPrenom);
        lePraticien.setNum(newNum);
        
        leVisiteur.setNom("swiss") ;
        leVisiteur.setPrenom("bourdin");
        
        RapportVisite leRapport = new RapportVisite(leVisiteur, 0, lePraticien, newDate, newBilan, newMotif) ;

        daoRapportVisite.create(leRapport) ;
                        
        actualiser() ;

    }
    
     /**
     * Charge la vue visiteur
     *
     * @throws DaoException
     */
    
    @Override
    public VueVisite getVue() {
        return (VueVisite) vue;
    }

}
