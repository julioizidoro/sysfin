/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facade;

import dao.ClienteDao;
import java.sql.SQLException;
import java.util.List;
import model.Cliente;

/**
 *
 * @author Wolverine
 */
public class ClienteFacade {
    
    ClienteDao clienteDao;
    
    public Cliente salvar(Cliente cliente) throws SQLException{
        clienteDao = new ClienteDao();
        return clienteDao.salvar(cliente);
    }
    
    public Cliente consultar(int idCliente) throws SQLException{
        clienteDao = new ClienteDao();
        return clienteDao.consultar(idCliente);
    }
    
    public List<Cliente> listar(String nome) throws SQLException{
        clienteDao = new ClienteDao();
        return clienteDao.listar(nome);
    }
    
}