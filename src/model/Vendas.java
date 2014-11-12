/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "vendas")
public class Vendas implements Serializable {
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "vendas")
    private Emissaonota emissaonota;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idvendas")
    private Integer idvendas;
    @Column(name = "nomeCliente")
    private String nomeCliente;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorBruto")
    private Float valorBruto;
    @Column(name = "valorDesconto")
    private Float valorDesconto;
    @Column(name = "valorLiquido")
    private Float valorLiquido;
    @Column(name = "valorPagoFornecedor")
    private Float valorPagoFornecedor;
    @Column(name = "valorRecebido")
    private Float valorRecebido;
    @Column(name = "dataVenda")
    @Temporal(TemporalType.DATE)
    private Date dataVenda;
    @Column(name = "comissaoLiquidaTotal")
    private Float comissaoLiquidaTotal;
    @Column(name = "despesasFinanceiras")
    private Float despesasFinanceiras;
    @Column(name = "comissaoFuncionarios")
    private Float comissaoFuncionarios;
    @Column(name = "comissaoTerceiros")
    private Float comissaoTerceiros;
    @Column(name = "dataPagamentoFornecedor")
    @Temporal(TemporalType.DATE)
    private Date dataPagamentoFornecedor;
    @Column(name = "cliente_idcliente")
    private int cliente;
    @Column(name = "planoContas_idplanoContas")
    private int planoContas;
    @Column(name = "usuario_idusuario")
    private int usuario;
    @Column(name = "produto_idproduto")
    private int produto;
    @Column(name = "liquidoVendas")
    private Float liquidoVendas;
    @Column(name = "nomeFornecedor")
    private String nomeFornecedor;
    @Column(name = "liquidoReceber")
    private Float liquidoReceber;
    @Column(name = "situacao")
    private String situacao;
    @Column(name = "consultor")
    private String consultor;
    @Column(name = "observacao")
    private String observacao;
    
    
    
    
    
    
    

    public Vendas() {
    }

    public Vendas(Integer idvendas) {
        this.idvendas = idvendas;
    }

    public Integer getIdvendas() {
        return idvendas;
    }

    public void setIdvendas(Integer idvendas) {
        this.idvendas = idvendas;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Float getLiquidoReceber() {
        return liquidoReceber;
    }

    public int getPlanoContas() {
        return planoContas;
    }

    public void setPlanoContas(int planoContas) {
        this.planoContas = planoContas;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getConsultor() {
        return consultor;
    }

    public void setConsultor(String consultor) {
        this.consultor = consultor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }


    public void setLiquidoReceber(Float liquidoReceber) {
        this.liquidoReceber = liquidoReceber;
    }

    

    public Float getLiquidoVendas() {
        return liquidoVendas;
    }

    public void setLiquidoVendas(Float liquidoVendas) {
        this.liquidoVendas = liquidoVendas;
    }

    public Float getValorBruto() {
        return valorBruto;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public void setValorBruto(Float valorBruto) {
        this.valorBruto = valorBruto;
    }

    public Float getValorDesconto() {
        return valorDesconto;
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

    public void setValorDesconto(Float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public Float getValorLiquido() {
        return valorLiquido;
    }

    public void setValorLiquido(Float valorLiquido) {
        this.valorLiquido = valorLiquido;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Float getComissaoLiquidaTotal() {
        return comissaoLiquidaTotal;
    }

    public void setComissaoLiquidaTotal(Float comissaoLiquidaTotal) {
        this.comissaoLiquidaTotal = comissaoLiquidaTotal;
    }

    public Float getDespesasFinanceiras() {
        return despesasFinanceiras;
    }

    public void setDespesasFinanceiras(Float despesasFinanceiras) {
        this.despesasFinanceiras = despesasFinanceiras;
    }

    public Float getComissaoFuncionarios() {
        return comissaoFuncionarios;
    }

    public void setComissaoFuncionarios(Float comissaoFuncionarios) {
        this.comissaoFuncionarios = comissaoFuncionarios;
    }

    public Float getComissaoTerceiros() {
        return comissaoTerceiros;
    }

    public void setComissaoTerceiros(Float comissaoTerceiros) {
        this.comissaoTerceiros = comissaoTerceiros;
    }

    public Date getDataPagamentoFornecedor() {
        return dataPagamentoFornecedor;
    }

    public void setDataPagamentoFornecedor(Date dataPagamentoFornecedor) {
        this.dataPagamentoFornecedor = dataPagamentoFornecedor;
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

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }

    public Emissaonota getEmissaonota() {
        return emissaonota;
    }

    public void setEmissaonota(Emissaonota emissaonota) {
        this.emissaonota = emissaonota;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvendas != null ? idvendas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vendas)) {
            return false;
        }
        Vendas other = (Vendas) object;
        if ((this.idvendas == null && other.idvendas != null) || (this.idvendas != null && !this.idvendas.equals(other.idvendas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Vendas[ idvendas=" + idvendas + " ]";
    }


}
