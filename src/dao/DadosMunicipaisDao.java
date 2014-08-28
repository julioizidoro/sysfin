/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Dadosmunicipais;
import singleton.ConectionFactory;

/**
 *
 * @author Wolverine
 */
public class DadosMunicipaisDao {
    
    
    public Dadosmunicipais salvar(Dadosmunicipais dados) throws SQLException{
        ConectionFactory conexao = new ConectionFactory();
        EntityManager manager = conexao.getConnection();
        manager.getTransaction().begin();
        dados = manager.merge(dados);
        manager.getTransaction().commit();
        manager.close();
        return dados;
    }
    
    public Dadosmunicipais consultar(int idCliente) throws SQLException{
        ConectionFactory conexao = new ConectionFactory();
        EntityManager manager = conexao.getConnection();
        Query q = manager.createQuery("select d from Dadosmunicipais d where d.cliente=" + idCliente);
        Dadosmunicipais dadosmunicipais = null;
        if (q.getResultList().size()>0){
            dadosmunicipais = (Dadosmunicipais) q.getResultList().get(0);
        }
        manager.close();
        return dadosmunicipais;
    }
}
