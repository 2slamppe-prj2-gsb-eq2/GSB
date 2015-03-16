package modele.dao;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import modele.jdbc.Jdbc;
import modele.metier.*;

public class DaoRapportVisite implements DaoInterface<RapportVisite, String> {

    private DaoVisiteur daoVisiteur = new DaoVisiteur();
    private DaoPraticien daoPraticien = new DaoPraticien();
    private int newNum ;
    private String split[] ;
    private String split2[] ;
    
    public int create(RapportVisite unRapportVisite) throws Exception {
        
        DateFormat format = new SimpleDateFormat("MM/dd/yy");
        split = unRapportVisite.getPraticien().toString().split(" ") ;
        String praticienNom = split[0];
        String praticienPrenom = split[1];
        Praticien praticien = daoPraticien.getByName(praticienNom,praticienPrenom);
       
        int numPraticien = praticien.getNum() ;
        
        split2 = unRapportVisite.getVisiteur().toString().split(" ") ;
        String visiteurNom = split2[0];
        String visiteurPrenom = split2[1];
        Visiteur visiteur = daoVisiteur.getByName(visiteurNom,visiteurPrenom);
        String numVisiteur = visiteur.getMatricule() ;
        
        java.sql.Date sqlDate = new java.sql.Date(unRapportVisite.getDate().getTime());
        String requete =" INSERT INTO RAPPORT_VISITE (VIS_MATRICULE, PRA_NUM, RAP_DATE, RAP_BILAN, RAP_MOTIF) VALUES (?,?,?,?,?)" ;
        PreparedStatement preparedStatement = Jdbc.getInstance().getConnexion().prepareStatement(requete);
        preparedStatement.setString(1, numVisiteur);
        preparedStatement.setInt(2,numPraticien);
        preparedStatement.setDate(3, sqlDate);
        preparedStatement.setString(4, unRapportVisite.getBilan());
        preparedStatement.setString(5, unRapportVisite.getMotif());

        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        return 1 ;
       
    }

    /**
     * Lire un enregistrement d'après son identifiant
     *
     * @param num métier de l'objet recherché
     * @return objet métier trouvé, ou null sinon
     * @throws modele.dao.DaoException
     * @throws Exception
     */
    public RapportVisite getOne(int num) throws DaoException, Exception {
        RapportVisite result = null;
        ResultSet rs = null;
        // préparer la requête
        String requete = "SELECT * FROM RAPPORT_VISITE WHERE RAP_NUM=?";
        try {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            ps.setInt(1, num);
            rs = ps.executeQuery();
            if (rs.next()) {
                result = chargerUnEnregistrement(rs);
            }
        } catch (SQLException ex) {
            throw new modele.dao.DaoException("DaoRapportVisite::getOne : erreur requete SELECT : " + ex.getMessage());
        }
        return (result);
    }

    public ArrayList<RapportVisite> getAll() throws DaoException, Exception {
        ArrayList<RapportVisite> result = new ArrayList();
        ResultSet rs;
        // préparer la requête
        String requete = "SELECT * FROM RAPPORT_VISITE ORDER BY RAP_NUM";
        try {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            rs = ps.executeQuery();
            // Charger les enregistrements dans la collection
            while (rs.next()) {
                RapportVisite unRapportVisite = chargerUnEnregistrement(rs);
                result.add(unRapportVisite);
            }
        } catch (SQLException ex) {
            throw new modele.dao.DaoException("DaoRapportVisite::getAll : erreur requete SELECT : " + ex.getMessage());
        }

        return result;
    }

    public int update(String num, RapportVisite objetMetier) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int delete(String num) throws Exception {
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
    private RapportVisite chargerUnEnregistrement(ResultSet rs) throws DaoException, Exception {

        try {
            RapportVisite rapportVisite = new RapportVisite();
            rapportVisite.setVisiteur(daoVisiteur.getOne(rs.getString("VIS_MATRICULE")));
            rapportVisite.setNum(rs.getInt("RAP_NUM"));
            rapportVisite.setPraticien(daoPraticien.getOne(rs.getInt("PRA_NUM")));
            rapportVisite.setDate(rs.getDate("RAP_DATE"));
            rapportVisite.setBilan(rs.getString("RAP_BILAN"));
            rapportVisite.setMotif(rs.getString("RAP_MOTIF"));

            return rapportVisite;
        } catch (SQLException ex) {
            throw new DaoException("DaoRapportVisite - chargerUnEnregistrement : pb JDBC\n" + ex.getMessage());
        }
    }

    @Override
    public RapportVisite getOne(String idMetier) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
