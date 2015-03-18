/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Wolverine
 */
public class DadosConexao {

    private static Map mapa;

    public static Map getDadosConexao() throws Exception{
        if (mapa == null) {
            String localIni = System.getProperty("user.dir");
            localIni = localIni + "/sysfin.properties";
            File file = new File(localIni);
            Properties props = new Properties();
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(file);
                //lÃª os dados que estÃ£o no arquivo
                props.load(fis);
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(DadosConexao.class.getName()).log(Level.SEVERE, null, ex);
            }
            String banco = props.getProperty("banco");
            String local = props.getProperty("local");
            String senha = props.getProperty("senha");
            String usuario = props.getProperty("usuario");
            String porta = props.getProperty("porta");
            mapa = new HashMap();
            mapa.put("javax.persistence.jdbc.url", "jdbc:mysql://" + local + ":" + porta + "/"
                    + banco);
            mapa.put("javax.persistence.jdbc.driver", "com.mysql.jdbc.Driver");
            mapa.put("javax.persistence.jdbc.password", senha);
            mapa.put("javax.persistence.jdbc.user", usuario);
            mapa.put("hibernate.cache.provider_class", "org.hibernate.cache.NoCacheProvider");
            mapa.put("hibernate.show_sql", "true");
            mapa.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        }
        return mapa;
    }
}
    
