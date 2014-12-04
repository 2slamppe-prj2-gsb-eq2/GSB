package controleur;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;


/**
 * Ambulances
 *
 * @version v2 21 novembre 2013
 * @author nbourgeois 
 * Objectif : 
 * - exemple de dynamique Vue/Controleur avec controleur principal
 * - exemple de pattern Dao
 * - exemple de singleton de connexion à un SGBD
 * - exemple de paramétrage utilisant un fichier de "properties"
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {

        String ficPropertiesJdbc ="GsbJdbc.properties" ; // nom du fichier de properties
        Properties propertiesJdbc;                              // objet de propriétés (paramètres de l'appplication) pour Jdbc
        FileInputStream input;                                  // flux de lecture des properties
        CtrlPrincipal ctrlPrincipal;                                  // référence vers le contrôleur principal

    }
}
    
