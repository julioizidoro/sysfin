/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package singleton;


import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author Wolverine
 */
public class ConectionFactory {
    
    public static EntityManager manager;
    
    
    public static EntityManager getConnection() {
        if (manager == null) {
            EntityManagerFactory emf = null;
            Map mapa = null;
            try {
                mapa = DadosConexao.getDadosConexao();
            } catch (Exception ex) {
                Logger.getLogger(ConectionFactory.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Erro obter dados de conexão");
            }
            emf = Persistence.createEntityManagerFactory("SysFinPU", mapa);
            manager = emf.createEntityManager();
            if (!manager.isOpen()) {
                JOptionPane.showMessageDialog(null, "Conexão fechada");
            }
        }
        return manager;
    }
    
    public static void  desconectar(){
        manager.close();
        manager=null;
    }
}
