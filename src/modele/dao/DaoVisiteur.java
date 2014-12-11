/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import modele.jdbc.Jdbc;
import modele.metier.Visiteur;

/**
 * @author btssio
 */
public class DaoVisiteur implements DaoInterface<Visiteur, String>{

    @Override
    public int create(Visiteur unVisiteur) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public Visiteur getOne(String matricule) throws Exception {
        Visiteur result = null;
        ResultSet rs = null;
      
        System.out.println(matricule) ;
        String requete = "SELECT * FROM VISITEUR WHERE VIS_MATRICULE = ?";
        System.out.println(requete) ;
        try {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            System.out.println(ps) ;
            ps.setString(1, matricule);
            rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println(rs) ;
                result = chargerUnEnregistrement(rs);
            }
        } catch (SQLException ex) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        System.out.println(result) ;
        return (result);
    }

    @Override
    public Collection getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
     * chargerUnEnregistrementEquipier Instancie un objet visiteur avec les
     * valeurs lues dans la base de données La jointure avec la table PRESENCE
     * n'est pas effectuée
     *
     * @param rs enregistrement de la table Equipier courant
     * @return un objet Equipier, dont la liste des "présences" n'est pas
     * renseignée
     * @throws DaoException
     */
    private Visiteur chargerUnEnregistrement(ResultSet rs) throws DaoException {
        try {
            System.out.println(rs) ;
            Visiteur visiteur = new Visiteur();
            visiteur.setMatricule(rs.getString("VIS_MATRICULE"));
            visiteur.setNom(rs.getString("VIS_NOM"));
            visiteur.setPrenom(rs.getString("VIS_PRENOM"));
            visiteur.setAdresse(rs.getString("VIS_PRENOM"));
            visiteur.setCp(rs.getString("VIS_CP"));
            visiteur.setVille(rs.getString("VIS_VILLE"));
            visiteur.setDateEmbauche(rs.getDate("VIS_DATEEMBAUCHE"));
            
            System.out.println(visiteur) ;
            return visiteur;
        } catch (SQLException ex) {
            throw new DaoException("DaoEquipier - chargerUnEnregistrement : pb JDBC\n" + ex.getMessage());
        }
    }

}
