/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import modele.dao.DaoException;
import modele.dao.DaoVisiteur;
import modele.jdbc.FabriqueJdbc;
import modele.jdbc.Jdbc;

/**
 *
 * @author btssio
 */
public class testDaoVisiteur {

    static DaoVisiteur daoVisiteur = new DaoVisiteur();
    
     public static boolean testGetAll()  {
         boolean ok = true ;
         return ok ;
     }
     
}
