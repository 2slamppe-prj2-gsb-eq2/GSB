package modele.dao;

import java.sql.*;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.*;
import modele.jdbc.Jdbc;
import modele.metier.*;

/**
 * Classe DAO pour la classe Visiteur
 *
 * @version 22 novembre 2013
 * @author nbourgeois
 */
public class DaoVisiteur implements DaoInterface<Visiteur, String> {
//private DaoSecteur daoSecteur = new DaoSecteur();
private DaoLabo daoLabo = new DaoLabo();
private DaoSecteur daoSecteur = new DaoSecteur() ;
    /**
     * Non implémenté
     */
    @Override
    public int create(Visiteur unVisiteur) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Lire un enregistrement d'après son identifiant
     *
     * @param identifiant métier de l'objet recherché
     * @return objet métier trouvé, ou null sinon
     * @throws Exception
     */
    @Override
    public Visiteur getOne(String matricule) throws DaoException, Exception {
        Visiteur result = null;
        ResultSet rs = null;
        // préparer la requête
        String requete = "SELECT * FROM VISITEUR WHERE VIS_MATRICULE=?";
        try {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            ps.setString(1, matricule);
            rs = ps.executeQuery();
            if (rs.next()) {
                result = chargerUnEnregistrement(rs);
            }
        } catch (SQLException ex) {
            throw new modele.dao.DaoException("DaoVisiteur::getOne : erreur requete SELECT : " + ex.getMessage());
        }
        return (result);
    }
    
    public Visiteur getOneByLogin(String login) throws SQLException, Exception
    {
        Visiteur result = null ;
        ResultSet rs = null ;
        String requete = "SELECT * FROM VISITEUR WHERE VIS_NOM = ? " ;
        System.out.println("Requete sans parametre : "+requete) ;
        PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
        ps.setString(1, login);
        rs = ps.executeQuery() ;
        if (rs.next()) {
            result = chargerUnEnregistrement (rs) ;
        }
        return result ;          
    }
        /**
     * Vérifier le login d'un Visiteur
     *
     * @param em : contexte de persistance
     * @param login : nom du visiteur
     * @param mdp : date d'embauche avec format JJ-MMM-AA
     * @return une valeur boolean
     */
    public boolean verifierLoginMdp(String login, String mdp) throws Exception {
        boolean ok = false;
        String dateEmbauche=null;
        Visiteur unVisiteur = getOneByLogin(login);
        if (unVisiteur != null) {
            Format formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
              dateEmbauche = formatter.format(unVisiteur.getDateEmbauche());
        }
   
 

        if (dateEmbauche!=null && dateEmbauche.toLowerCase().equals(mdp)) {
            ok = true;
        }

        return ok;
    }    
    
    /**
     * getAll
     *
     * @return ArrayList de l'ensemble des occurences d'visiteurs de la table
     * VISITEUR
     */
    @Override
    public ArrayList<Visiteur> getAll() throws DaoException, Exception {
        ArrayList<Visiteur> result = new ArrayList<Visiteur>();
        ResultSet rs;
        // préparer la requête
        String requete = "SELECT * FROM VISITEUR";
        try {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            rs = ps.executeQuery();
            // Charger les enregistrements dans la collection
            while (rs.next()) {
                Visiteur unVisiteur = chargerUnEnregistrement(rs);
                result.add(unVisiteur);
            }
        } catch (SQLException ex) {
            throw new modele.dao.DaoException("DaoVisiteur::getAll : erreur requete SELECT : " + ex.getMessage());
        }
        return result;
    }

    /**
     * Non implémenté
     */
    @Override
    public int update(String idMetier, Visiteur objetMetier) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Non implémenté
     */
    @Override
    public int delete(String idMetier) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //----------------------------------------------------------------------
    //  Méthodes privées
    //----------------------------------------------------------------------
    /**
     * chargerUnEnregistrementVisiteur Instancie un objet visiteur avec les
     * valeurs lues dans la base de données La jointure avec la table PRESENCE
     * n'est pas effectuée
     *
     * @param rs enregistrement de la table Visiteur courant
     * @return un objet Visiteur, dont la liste des "présences" n'est pas
     * renseignée
     * @throws DaoException
     */
    private Visiteur chargerUnEnregistrement(ResultSet rs) throws DaoException, Exception {
        try {
            Visiteur visiteur = new Visiteur(null,null,null,null,null,null,null,null,null);
            visiteur.setMatricule(rs.getString("VIS_MATRICULE"));
            visiteur.setPrenom(rs.getString("VIS_PRENOM"));
            visiteur.setNom(rs.getString("VIS_NOM"));
            visiteur.setAdresse(rs.getString("VIS_ADRESSE"));
            visiteur.setVille(rs.getString("VIS_VILLE"));
            visiteur.setDateEmbauche(rs.getDate("VIS_DATEEMBAUCHE") );                
            visiteur.setCp(rs.getString("VIS_CP"));
            visiteur.setSecteur(daoSecteur.getOne(rs.getString("SEC_CODE")));
            visiteur.setLabo(daoLabo.getOne(rs.getString("LAB_CODE")));
            return visiteur;
        } catch (SQLException ex) {
            throw new DaoException("DaoVisiteur - chargerUnEnregistrement : pb JDBC\n" + ex.getMessage());
        }
    }
    
    
}