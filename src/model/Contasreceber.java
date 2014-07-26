/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "contasreceber")
public class Contasreceber implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcontasReceber")
    private Integer idcontasReceber;
    @Column(name = "numeroDocumento")
    private String numeroDocumento;
    @Column(name = "nomeCliente")
    private String nomeCliente;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorParcela")
    private Float valorParcela;
    @Column(name = "numeroParcela")
    private Integer numeroParcela;
    @Column(name = "dataVencimento")
    @Temporal(TemporalType.DATE)
    private Date dataVencimento;
    @Column(name = "juros")
    private Float juros;
    @Column(name = "desagio")
    private Float desagio;
    @Column(name = "dataPagamento")
    @Temporal(TemporalType.DATE)
    private Date dataPagamento;
    @Column(name = "valorPago")
    private Float valorPago;
    @Column(name = "tipodocumento")
    private String tipodocumento;
    @Column(name = "venda")
    private int venda;
    @Column(name = "cliente_idcliente")
    private int cliente;
    @Column(name = "usuario_idusuario")
    private int usuario;
    @Column(name = "banco_idbanco")
    private int banco;
    @Column(name = "movimentoBanco")
    private int movimentoBanco;
    @Column(name = "planoContas_idplanoContas")
    private int planocontas;
    @Column(name = "vendaComissao")
    private int vendaComissao;
    

    public Contasreceber() {
    }

    public Contasreceber(Integer idcontasReceber) {
        this.idcontasReceber = idcontasReceber;
    }

    public Integer getIdcontasReceber() {
        return idcontasReceber;
    }

    public void setIdcontasReceber(Integer idcontasReceber) {
        this.idcontasReceber = idcontasReceber;
    }

    public String getTipodocumento() {
        return tipodocumento;
    }

    public int getVendaComissao() {
        return vendaComissao;
    }

    public void setVendaComissao(int vendaComissao) {
        this.vendaComissao = vendaComissao;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public int getPlanocontas() {
        return planocontas;
    }

    public void setPlanocontas(int planocontas) {
        this.planocontas = planocontas;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Float getValorPago() {
        return valorPago;
    }

    public void setValorPago(Float valorPago) {
        this.valorPago = valorPago;
    }

    public int getBanco() {
        return banco;
    }

    public void setBanco(int banco) {
        this.banco = banco;
    }

    public int getMovimentoBanco() {
        return movimentoBanco;
    }

    public void setMovimentoBanco(int movimentoBanco) {
        this.movimentoBanco = movimentoBanco;
    }

    public Float getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(Float valorParcela) {
        this.valorParcela = valorParcela;
    }

    public Integer getNumeroParcela() {
        return numeroParcela;
    }

    public void setNumeroParcela(Integer numeroParcela) {
        this.numeroParcela = numeroParcela;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Float getJuros() {
        return juros;
    }

    public void setJuros(Float juros) {
        this.juros = juros;
    }

    public Float getDesagio() {
        return desagio;
    }

    public void setDesagio(Float desagio) {
        this.desagio = desagio;
    }

    public int getVenda() {
        return venda;
    }

    public void setVenda(int venda) {
        this.venda = venda;
    }

   

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcontasReceber != null ? idcontasReceber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contasreceber)) {
            return false;
        }
        Contasreceber other = (Contasreceber) object;
        if ((this.idcontasReceber == null && other.idcontasReceber != null) || (this.idcontasReceber != null && !this.idcontasReceber.equals(other.idcontasReceber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Contasreceber[ idcontasReceber=" + idcontasReceber + " ]";
    }
    
}
