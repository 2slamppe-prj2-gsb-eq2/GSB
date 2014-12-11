/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modele.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import modele.jdbc.Jdbc;
import modele.metier.Labo;

/**
 *
 * @author btssio
 */
public class DaoLabo implements DaoInterface<Labo, String> {

    @Override
    public int create(Labo objetMetier) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Labo getOne(String labCode) throws Exception {
        Labo result = null;
        ResultSet rs = null;

    
        String requete = "SELECT * FROM LABO WHERE LAB_CODE = ?";
        try {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            ps.setString(1, labCode);
            rs = ps.executeQuery();
            if (rs.next()) {
                result = chargerUnEnregistrement(rs);
            }
        } catch (SQLException ex) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        return (result);
        
    }

    @Override
    public ArrayList<Labo> getAll() throws Exception {
        ArrayList<Labo> result = new ArrayList<>();
        ResultSet rs;
        // préparer la requête
        String requete = "SELECT * FROM LABO";
        try {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            rs = ps.executeQuery();
            // Charger les enregistrements dans la collection
            while (rs.next()) {
                Labo unLabo = chargerUnEnregistrement(rs);
                result.add(unLabo);
            }
        } catch (SQLException ex) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        return result;
        
    }

    @Override
    public int update(String idMetier, Labo objetMetier) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(String idMetier) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     //----------------------------------------------------------------------
    //  Méthodes privées
    //----------------------------------------------------------------------
    /**
     * chargerUnEnregistrementVisiteur Instancie un objet labo avec les
     * valeurs lues dans la base de données 
     * @param rs enregistrement de la table Visiteur courant
     * @return un objet Visiteur
     * @throws DaoException
     */
    private Labo chargerUnEnregistrement(ResultSet rs) throws DaoException {
        try {          
            Labo labo = new Labo();
            labo.setCode(rs.getString("LAB_CODE"));
            labo.setNom(rs.getString("LAB_NOM"));
            labo.setChefVente(rs.getString("LAB_CHEFVENTE"));
          
            return labo;
        } catch (SQLException ex) {
            throw new DaoException("DaoEquipier - chargerUnEnregistrement : pb JDBC\n" + ex.getMessage());
        }
    
    }
}
