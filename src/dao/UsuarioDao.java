/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Usuario;
import singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class UsuarioDao {
    
    private EntityManager manager;
    
    public Usuario salvar(Usuario usuario) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        usuario = manager.merge(usuario);
        //fechando uma transação
        manager.getTransaction().commit();
        return usuario;
    }
    
    public Usuario consultar(String login, String senha) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        Query q = manager.createQuery("select u from Usuario u where u.login='" + login + "' and u.senha='" + senha + "'  order by u.nome");
        if (q.getResultList().size()>0){
            return (Usuario) q.getResultList().get(0);
        }
        return null;
    }
    
    public List<Usuario> listar(String nome) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        Query q = manager.createQuery("select u from Usuario u where u.nome like'" + nome + "%'  order by u.nome");
        return  q.getResultList();
    }
    
    public Usuario consultar(int idUsuario) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Usuario usuario = manager.find(Usuario.class, idUsuario);
        //fechando uma transação
        manager.getTransaction().commit();
        return usuario;
    }
    
}
