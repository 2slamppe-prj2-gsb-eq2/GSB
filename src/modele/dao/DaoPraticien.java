package modele.dao;

import java.sql.*;
import java.util.*;
import modele.jdbc.Jdbc;
import modele.metier.*;

/**
 * Classe DAO pour la classe Visiteur
 *
 * @version 22 novembre 2013
 * @author nbourgeois
 */
public class DaoPraticien implements DaoInterface<Praticien, String> {
    private Praticien praticien;
    /**
     * Non implémenté
     * @param unPraticien
     * @return 
     * @throws java.lang.Exception
     */
    public int create(Praticien unPraticien) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Lire un enregistrement d'après son identifiant
     *
     * @param numero
     * @return objet métier trouvé, ou null sinon
     * @throws modele.dao.DaoException
     * @throws Exception
     */
    public Praticien getOne(String numero) throws DaoException, Exception {
        Praticien result = null;
        // préparer la requête
        String requete = "SELECT * FROM PRATICIEN WHERE PRA_NUM=?";
        try {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            ps.setString(1, numero);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                result = chargerUnEnregistrement(rs);
            }
        } catch (SQLException ex) {
            throw new modele.dao.DaoException("DaoPraticien::getOne : erreur requete SELECT : " + ex.getMessage());
        }
        return (result);
    }
    
    /**
     * getAll
     * @return 
     * @throws modele.dao.DaoException
     */
    public ArrayList<Praticien> getAll() throws DaoException, Exception {
        ArrayList<Praticien> result = new ArrayList<>();
        ResultSet rs;
        // préparer la requête
        String requete = "SELECT * FROM PRATICIEN";
        try {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            rs = ps.executeQuery();
            // Charger les enregistrements dans la collection
            while (rs.next()) {
                Praticien unPraticien = chargerUnEnregistrement(rs);
                result.add(unPraticien);
            }
        } catch (SQLException ex) {
            throw new modele.dao.DaoException("DaoPraticien::getAll : erreur requete SELECT : " + ex.getMessage());
        }
        return result;
    }

    /**
     * @param num
     * @param objetMetier
     * @return 
     * @throws java.lang.Exception
     */
    public int update(String num, Praticien objetMetier) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @param num
     * @return 
     * @throws java.lang.Exception
     */
    public int delete(String num) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //----------------------------------------------------------------------
    //  Méthodes privées
    //----------------------------------------------------------------------
    /**
     * chargerUnEnregistrementPraticien Instancie un objet praticien avec les
     * valeurs lues dans la base de données
     *
     * @param rs enregistrement de la table Visiteur courant
     * @throws DaoException
     */
    private Praticien chargerUnEnregistrement(ResultSet rs) throws DaoException, Exception {
        try {
            Praticien Praticien = new Praticien();
            Praticien.setNum(rs.getInt("PRA_NUM"));
            Praticien.setNom(rs.getString("PRA_NOM"));
            Praticien.setPrenom(rs.getString("PRA_PRENOM"));
            Praticien.setAdresse(rs.getString("PRA_ADRESSE"));
            Praticien.setCp(rs.getString("PRA_CP"));
            Praticien.setVille(rs.getString("PRA_VILLE"));
            Praticien.setCoefNotoriete(rs.getFloat("PRA_COEFNOTORIETE") );                
            Praticien.setTypeCode(rs.getString("TYP_CODE"));
            return praticien;
        } catch (SQLException ex) {
            throw new DaoException("DaoPraticien - chargerUnEnregistrement : pb JDBC\n" + ex.getMessage());
        }
    }
    
    
}