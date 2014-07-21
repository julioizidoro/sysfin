/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facade;

import dao.PlanoContasDao;
import java.sql.SQLException;
import java.util.List;
import model.Planocontas;

/**
 *
 * @author Wolverine
 */
public class PlanoContasFacade {
    
    PlanoContasDao planoContasDao;
    
    public Planocontas salvar(Planocontas plano) throws SQLException{
        planoContasDao = new PlanoContasDao();
        return planoContasDao.salvar(plano);
    }
    
    public List<Planocontas> listar() throws SQLException{
        planoContasDao = new PlanoContasDao();
        return planoContasDao.listar();
    }
    
    public Planocontas consultar(int idPlanoContas) throws SQLException{
        planoContasDao = new PlanoContasDao();
        return planoContasDao.consultar(idPlanoContas);
    }
    
    public List<Planocontas> listar(String descricao) throws SQLException{
        planoContasDao = new PlanoContasDao();
        return planoContasDao.listar(descricao);
    }
    
}
