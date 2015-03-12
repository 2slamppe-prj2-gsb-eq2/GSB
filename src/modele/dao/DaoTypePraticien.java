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
public class DaoTypePraticien implements DaoInterface<TypePraticien, String> {
    private TypePraticien typePraticien;

    /**
     *
     * @param unTypePraticien
     * @return
     * @throws Exception
     */
    public int create(TypePraticien unTypePraticien) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Lire un enregistrement d'après son identifiant
     *
     * @param code
     * @return objet métier trouvé, ou null sinon
     * @throws modele.dao.DaoException
     * @throws Exception
     */
    public TypePraticien getOne(String code) throws DaoException, Exception {
        TypePraticien result = null;
        // préparer la requête
        String requete = "SELECT * FROM TYPE_PRATICIEN WHERE TYP_CODE=?";
        try {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            ps.setString(1, code);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                result = chargerUnEnregistrement(rs);
            }
        } catch (SQLException ex) {
            throw new modele.dao.DaoException("DaoTypePraticien::getOne : erreur requete SELECT : " + ex.getMessage());
        }
        return (result);
    }
    
    /**
     * getAll
     * @return 
     * @throws modele.dao.DaoException
     */
    public ArrayList<TypePraticien> getAll() throws DaoException, Exception {
        ArrayList<TypePraticien> result = new ArrayList<>();
        ResultSet rs;
        // préparer la requête
        String requete = "SELECT * FROM TYPE_PRATICIEN";
        try {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            rs = ps.executeQuery();
            // Charger les enregistrements dans la collection
            while (rs.next()) {
                TypePraticien unTypePraticien = chargerUnEnregistrement(rs);
                result.add(unTypePraticien);
            }
        } catch (SQLException ex) {
            throw new modele.dao.DaoException("DaoTypePraticien::getAll : erreur requete SELECT : " + ex.getMessage());
        }
        return result;
    }

    /**
     * @param code
     * @param objetMetier
     * @return 
     * @throws java.lang.Exception
     */
    public int update(String code, TypePraticien objetMetier) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @param code
     * @return 
     * @throws java.lang.Exception
     */
    public int delete(String code) throws Exception {
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
    private TypePraticien chargerUnEnregistrement(ResultSet rs) throws DaoException, Exception {
        try {
            TypePraticien typePraticien = new TypePraticien(null, null, null);
            typePraticien.setCode(rs.getString("PRA_NUM"));
            typePraticien.setLibelle(rs.getString("PRA_NOM"));
            typePraticien.setLieu(rs.getString("PRA_CP"));
            return typePraticien;
        } catch (SQLException ex) {
            throw new DaoException("DaoTypePraticien - chargerUnEnregistrement : pb JDBC\n" + ex.getMessage());
        }
    }
    
    
}