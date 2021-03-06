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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "movimentobanco")
public class Movimentobanco implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmovimentoBanco")
    private Integer idmovimentoBanco;
    @Column(name = "dataVencimento")
    @Temporal(TemporalType.DATE)
    private Date dataVencimento;
    @Column(name = "descricao")
    private String descricao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorEntrada")
    private Float valorEntrada;
    @Column(name = "valorSaida")
    private Float valorSaida;
    @Column(name = "dataRegistro")
    @Temporal(TemporalType.DATE)
    private Date dataRegistro;
    @Column(name = "dataCompensacao")
    @Temporal(TemporalType.DATE)
    private Date dataCompensacao;
    @Column(name = "tipoDocumento")
    private String tipoDocumento;
    @Column(name = "compentencia")
    private String compentencia;
    @JoinColumn(name = "banco_idbanco", referencedColumnName = "idbanco")
    @ManyToOne(optional = false)
    private Banco banco;
    @JoinColumn(name = "cliente_idcliente", referencedColumnName = "idcliente")
    @ManyToOne(optional = false)
    private Cliente cliente;
    @JoinColumn(name = "planoContas_idplanoContas", referencedColumnName = "idplanoContas")
    @ManyToOne(optional = false)
    private Planocontas planocontas;
    @JoinColumn(name = "usuario_idusuario", referencedColumnName = "idusuario")
    @ManyToOne(optional = false)
    private Usuario usuario;

    public Movimentobanco() {
    }

    public Movimentobanco(Integer idmovimentoBanco) {
        this.idmovimentoBanco = idmovimentoBanco;
    }

    public Integer getIdmovimentoBanco() {
        return idmovimentoBanco;
    }

    public void setIdmovimentoBanco(Integer idmovimentoBanco) {
        this.idmovimentoBanco = idmovimentoBanco;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(Float valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public Float getValorSaida() {
        return valorSaida;
    }

    public void setValorSaida(Float valorSaida) {
        this.valorSaida = valorSaida;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public Date getDataCompensacao() {
        return dataCompensacao;
    }

    public void setDataCompensacao(Date dataCompensacao) {
        this.dataCompensacao = dataCompensacao;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getCompentencia() {
        return compentencia;
    }

    public void setCompentencia(String compentencia) {
        this.compentencia = compentencia;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Planocontas getPlanocontas() {
        return planocontas;
    }

    public void setPlanocontas(Planocontas planocontas) {
        this.planocontas = planocontas;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmovimentoBanco != null ? idmovimentoBanco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movimentobanco)) {
            return false;
        }
        Movimentobanco other = (Movimentobanco) object;
        if ((this.idmovimentoBanco == null && other.idmovimentoBanco != null) || (this.idmovimentoBanco != null && !this.idmovimentoBanco.equals(other.idmovimentoBanco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Movimentobanco[ idmovimentoBanco=" + idmovimentoBanco + " ]";
    }
    
}
