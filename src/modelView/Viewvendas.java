/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelView;

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
@Table(name = "viewvendas")
public class Viewvendas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "idvendas")
    @Id
    private int idvendas;
    @Column(name = "dataVenda")
    @Temporal(TemporalType.DATE)
    private Date dataVenda;
    @Column(name = "nomeCliente")
    private String nomeCliente;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorBruto")
    private Float valorBruto;
    @Column(name = "valorLiquido")
    private Float valorLiquido;
    @Column(name = "valorDesconto")
    private Float valorDesconto;
    @Column(name = "valorPagoFornecedor")
    private Float valorPagoFornecedor;
    @Column(name = "valorRecebido")
    private Float valorRecebido;
    @Column(name = "razaoSocial")
    private String razaoSocial;
    @Basic(optional = false)
    @Column(name = "cliente_idcliente")
    private int clienteIdcliente;
    @Column(name = "situacao")
    private String situacao;
    @Column(name = "planoContas")
    private int planoContas;
    @Column(name = "nomeFantasia")
    private String nomeFantasia;

    public Viewvendas() {
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

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public Float getValorBruto() {
        return valorBruto;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getPlanoContas() {
        return planoContas;
    }

    public void setPlanoContas(int planoContas) {
        this.planoContas = planoContas;
    }


    public Float getValorPagoFornecedor() {
        return valorPagoFornecedor;
    }

    public void setValorPagoFornecedor(Float valorPagoFornecedor) {
        this.valorPagoFornecedor = valorPagoFornecedor;
    }

    public Float getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(Float valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    public void setValorBruto(Float valorBruto) {
        this.valorBruto = valorBruto;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public int getClienteIdcliente() {
        return clienteIdcliente;
    }

    public Float getValorLiquido() {
        return valorLiquido;
    }

    public void setValorLiquido(Float valorLiquido) {
        this.valorLiquido = valorLiquido;
    }

    public Float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public void setClienteIdcliente(int clienteIdcliente) {
        this.clienteIdcliente = clienteIdcliente;
    }
    
}
