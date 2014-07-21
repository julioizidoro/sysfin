/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Cliente;
import model.Dadosmunicipais;
import singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class DadosMunicipaisDao {
    
    private EntityManager manager;
    
    public Dadosmunicipais salvar(Dadosmunicipais dados) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        dados = manager.merge(dados);
        //fechando uma transação
        manager.getTransaction().commit();
        return dados;
    }
    
    public Dadosmunicipais consultar(int idCliente) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        Query q = manager.createQuery("select d from Dadosmunicipais d where d.cliente=" + idCliente);
        if (q.getResultList().size()>0){
            return (Dadosmunicipais) q.getResultList().get(0);
        }
        return null;
    }
    
}
