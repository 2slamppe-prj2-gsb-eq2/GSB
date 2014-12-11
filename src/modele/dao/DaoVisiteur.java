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
import modele.jdbc.Jdbc;
import modele.metier.Labo;
import modele.metier.Visiteur;

/**
 * @author btssio
 */
public class DaoVisiteur implements DaoInterface<Visiteur, String> {

    private DaoLabo daoLabo = new DaoLabo();
    
    @Override
    public int create(Visiteur unVisiteur) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Visiteur getOne(String matricule) throws Exception {
        Visiteur result = null;
        ResultSet rs = null;

    
        String requete = "SELECT * FROM VISITEUR WHERE VIS_MATRICULE = ?";
        try {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            ps.setString(1, matricule);
            rs = ps.executeQuery();
            if (rs.next()) {
                result = chargerUnEnregistrement(rs);
            }
        } catch (SQLException ex) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        return (result);
    } 
    
    public Visiteur getByName(String nom,String prenom) throws DaoException, Exception
    {
         Visiteur result = null;
        ResultSet rs = null;

        
        String requete = "SELECT * FROM VISITEUR WHERE VIS_NOM = ? AND VIS_PRENOM = ?";
        try {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            ps.setString(1, nom);
            ps.setString(2, prenom);
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
    public ArrayList<Visiteur> getAll() throws Exception {
        ArrayList<Visiteur> result = new ArrayList<Visiteur>();
        ResultSet rs;
        // préparer la requête
        String requete = "SELECT * FROM VISITEUR ORDER BY VIS_NOM";
        try {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            rs = ps.executeQuery();
            // Charger les enregistrements dans la collection
            while (rs.next()) {
                Visiteur unVisiteur = chargerUnEnregistrement(rs);
                result.add(unVisiteur);
            }
        } catch (SQLException ex) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        return result;
    }

    @Override
    public int update(String matricule, Visiteur unVisiteur) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(String matricule) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //----------------------------------------------------------------------
    //  Méthodes privées
    //----------------------------------------------------------------------
    /**
     * chargerUnEnregistrementVisiteur Instancie un objet visiteur avec les
     * valeurs lues dans la base de données 
     * @param rs enregistrement de la table Visiteur courant
     * @return un objet Visiteur
     * @throws DaoException
     */
    private Visiteur chargerUnEnregistrement(ResultSet rs) throws DaoException, Exception {
        try {
            
            String labCode ;
            Visiteur visiteur = new Visiteur();
            visiteur.setMatricule(rs.getString("VIS_MATRICULE"));
            visiteur.setNom(rs.getString("VIS_NOM"));
            visiteur.setPrenom(rs.getString("VIS_PRENOM"));
            visiteur.setAdresse(rs.getString("VIS_ADRESSE"));
            visiteur.setCp(rs.getString("VIS_CP"));
            visiteur.setVille(rs.getString("VIS_VILLE"));
            visiteur.setDateEmbauche(rs.getDate("VIS_DATEEMBAUCHE"));
            labCode = rs.getString("LAB_CODE") ;
            System.out.println(labCode) ;
            visiteur.setLeLabo(daoLabo.getOne(rs.getString("LAB_CODE")));
            
        
            return visiteur;
        } catch (SQLException ex) {
            throw new DaoException("DaoEquipier - chargerUnEnregistrement : pb JDBC\n" + ex.getMessage());
        }
    }

}
