/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;


/**
 *
 * @author aluno
 */
public class ConexaoSingletonTM {
    
    private static EntityManagerFactory emf = null;
    private static EntityManager manager = null;
   

    public static EntityManager getConexao()throws SQLException{
        if (manager == null) {
            String localIni = System.getProperty("user.dir");
            localIni = localIni + "/systm.properties";
            File file = new File(localIni);
            Properties props = new Properties();
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(file);
                //lÃª os dados que estÃ£o no arquivo
                props.load(fis);
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(ConexaoSingletonTM.class.getName()).log(Level.SEVERE, null, ex);
            }
            String banco = props.getProperty("banco");
            String local = props.getProperty("local");
            String senha = props.getProperty("senha");
            String usuario = props.getProperty("usuario");
            String porta = props.getProperty("porta");
            Map mapa = new HashMap();
            mapa.put("hibernate.connection.url", "jdbc:mysql://" + local + ":" + porta + "/"
                    + banco);
            mapa.put("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
            mapa.put("hibernate.connection.password", senha);
            mapa.put("hibernate.connection.username", usuario);
            mapa.put("hibernate.cache.provider_class", "org.hibernate.cache.NoCacheProvider");
            mapa.put("hibernate.show_sql", "true");
            mapa.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");

            try {
                emf = Persistence.createEntityManagerFactory("SysTMPU", mapa);
                manager = emf.createEntityManager();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro " + e.getMessage());

            }
        }
        return manager;
    }
    
    public static void desconectar()throws SQLException{
        manager.close();
        emf = null;
        manager = null;
    }
}