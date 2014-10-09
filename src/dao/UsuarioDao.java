/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import com.sun.codemodel.JOp;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import model.Usuario;
import singleton.ConectionFactory;

/**
 *
 * @author Wolverine
 */
public class UsuarioDao {
    
    
    public Usuario salvar(Usuario usuario) throws SQLException{
        ConectionFactory conexao = new ConectionFactory();
        EntityManager manager = conexao.getConnection();
        //abrindo uma transação
        manager.getTransaction().begin();
        usuario = manager.merge(usuario);
        //fechando uma transação
        manager.getTransaction().commit();
        manager.close();
        return usuario;
    }
    
    public Usuario consultar(String login, String senha) throws SQLException{
        ConectionFactory conexao = new ConectionFactory();
        EntityManager manager = conexao.getConnection();
        manager.getTransaction().begin();
        Query q = manager.createQuery("select u from Usuario u where u.login='" + login + "' and u.senha='" + senha + "'  order by u.nome");
        Usuario usuario = null;
        if (q.getResultList().size()>0){
            usuario = (Usuario) q.getResultList().get(0);
        }
        manager.getTransaction().commit();
        manager.close();
        return usuario;
    }
    
    public List<Usuario> listar(String nome) throws SQLException{
        ConectionFactory conexao = new ConectionFactory();
        EntityManager manager = conexao.getConnection();
        Query q = manager.createQuery("select u from Usuario u where u.nome like'" + nome + "%'  order by u.nome");
        List<Usuario> lista = q.getResultList();
        manager.close();
        return  lista;
    }
    
    public Usuario consultar(int idUsuario) throws SQLException{
        ConectionFactory conexao = new ConectionFactory();
        EntityManager manager = conexao.getConnection();
        Usuario usuario = manager.find(Usuario.class, idUsuario);
        manager.close();
        return usuario;
    }
    
}
