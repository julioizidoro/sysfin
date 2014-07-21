/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IntegracaoSysTM;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "viewvendasintegracao")
public class Viewvendasintegracao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "idvendas")
    @Id
    private int idvendas;
    @Column(name = "dataVenda")
    @Temporal(TemporalType.DATE)
    private Date dataVenda;
    @Basic(optional = false)
    @Column(name = "produtos_idprodutos")
    private int produtosIdprodutos;
    @Basic(optional = false)
    @Column(name = "unidadeNegocio_idunidadeNegocio")
    private int unidadeNegocioidunidadeNegocio;
    @Basic(optional = false)
    @Column(name = "cliente_idcliente")
    private int clienteIdcliente;
    @Column(name = "nomeCliente")
    private String nomeCliente;
    @Basic(optional = false)
    @Column(name = "idformaPagamento")
    private int idformaPagamento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "totalMoedaNacional")
    private Float totalMoedaNacional;
    @Column(name = "valorJuros")
    private Float valorJuros;
    @Basic(optional = false)
    @Column(name = "idorcamento")
    private int idorcamento;
   
    
    

    public Viewvendasintegracao() {
    }

    public int getIdvendas() {
        return idvendas;
    }

    public void setIdvendas(int idvendas) {
        this.idvendas = idvendas;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getProdutosIdprodutos() {
        return produtosIdprodutos;
    }

    public void setProdutosIdprodutos(int produtosIdprodutos) {
        this.produtosIdprodutos = produtosIdprodutos;
    }

    public Float getValorJuros() {
        return valorJuros;
    }

    public void setValorJuros(Float valorJuros) {
        this.valorJuros = valorJuros;
    }

    public int getUnidadeNegocioidunidadeNegocio() {
        return unidadeNegocioidunidadeNegocio;
    }

    public void setUnidadeNegocioidunidadeNegocio(int unidadeNegocioidunidadeNegocio) {
        this.unidadeNegocioidunidadeNegocio = unidadeNegocioidunidadeNegocio;
    }

    public int getClienteIdcliente() {
        return clienteIdcliente;
    }

    public void setClienteIdcliente(int clienteIdcliente) {
        this.clienteIdcliente = clienteIdcliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getIdformaPagamento() {
        return idformaPagamento;
    }

    public void setIdformaPagamento(int idformaPagamento) {
        this.idformaPagamento = idformaPagamento;
    }

    public Float getTotalMoedaNacional() {
        return totalMoedaNacional;
    }

    public void setTotalMoedaNacional(Float totalMoedaNacional) {
        this.totalMoedaNacional = totalMoedaNacional;
    }

    public int getIdorcamento() {
        return idorcamento;
    }

    public void setIdorcamento(int idorcamento) {
        this.idorcamento = idorcamento;
    }
    
}
