/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import modele.dao.DaoException;
import modele.dao.DaoLabo;
import modele.dao.DaoVisiteur;
import modele.jdbc.FabriqueJdbc;
import modele.jdbc.Jdbc;
import modele.metier.Labo;
import modele.metier.Visiteur;

/**
 *
 * @author btssio
 */
public class testDaoLabo {

    static DaoLabo daoLabo = new DaoLabo();

    public static boolean testSelectOne() throws ClassNotFoundException, SQLException, Exception {
        boolean ok = true;
        String labCode = "BC";
        Labo labo = daoLabo.getOne(labCode);
        System.out.println(labo) ;
        return ok;
    }

    public static boolean testSelectAll() throws ClassNotFoundException, SQLException, Exception {
        boolean ok = true;
        ArrayList<Labo> lesLabo = new ArrayList<Labo>();
        lesLabo = daoLabo.getAll();
        System.out.println(lesLabo) ;
        return ok;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException, DaoException, Exception {
        System.out.println("Tests unitaires DAO");
        FabriqueJdbc.creer("gsbJdbc.properties");
        Jdbc.getInstance().connecter();
        System.out.println("Test 1 : Selection d'un visiteur\n\r ");
        testSelectOne();
        System.out.println("Test 2 : Selection des visiteurs\n\r ");
        testSelectAll();

        System.out.println("\nDéconnexion");
        Jdbc.getInstance().deconnecter();

    }

}
