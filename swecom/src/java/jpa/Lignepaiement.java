/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author skysofttech
 */
@Entity
@Cacheable(false)
@Table(name = "lignepaiement")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lignepaiement.findAll", query = "SELECT l FROM Lignepaiement l"),
    @NamedQuery(name = "Lignepaiement.findById", query = "SELECT l FROM Lignepaiement l WHERE l.id = :id"),
    @NamedQuery(name = "Lignepaiement.findByIndexligne", query = "SELECT l FROM Lignepaiement l WHERE l.indexligne = :indexligne"),
    @NamedQuery(name = "Lignepaiement.findByMontantpaiement", query = "SELECT l FROM Lignepaiement l WHERE l.montantpaiement = :montantpaiement"),
    @NamedQuery(name = "Lignepaiement.findByPeriode", query = "SELECT l FROM Lignepaiement l WHERE l.periode = :periode"),
    @NamedQuery(name = "Lignepaiement.findByLibellefacture", query = "SELECT l FROM Lignepaiement l WHERE l.libellefacture = :libellefacture"),
    @NamedQuery(name = "Lignepaiement.findByMontantquittance", query = "SELECT l FROM Lignepaiement l WHERE l.montantquittance = :montantquittance"),
    @NamedQuery(name = "Lignepaiement.findByVersion", query = "SELECT l FROM Lignepaiement l WHERE l.version = :version"),
    @NamedQuery(name = "Lignepaiement.findByFacture", query = "SELECT l FROM Lignepaiement l WHERE l.facture = :facture AND l.paiement= :paiement"),
    @NamedQuery(name = "Lignepaiement.findByTypefacture", query = "SELECT l FROM Lignepaiement l WHERE l.typefacture = :typefacture")})
public class Lignepaiement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "indexligne")
    private Integer indexligne;
    @Column(name = "montantpaiement")
    private Integer montantpaiement;
    @Size(max = 50)
    @Column(name = "periode")
    private String periode;
    @Size(max = 50)
    @Column(name = "libellefacture")
    private String libellefacture;
    @Column(name = "montantquittance")
    private Integer montantquittance;
    @Basic(optional = false)
    @NotNull
    @Column(name = "version")
    private int version;
    @Basic(optional = false)
    @NotNull
    @Column(name = "typefacture")
    private int typefacture;
    @JoinColumn(name = "paiement", referencedColumnName = "id")
    @ManyToOne
    private Payementfacture paiement;
    @JoinColumn(name = "facture", referencedColumnName = "id")
    @ManyToOne
    private Facture facture;

    public Lignepaiement() {
    }

    public Lignepaiement(Integer id) {
        this.id = id;
    }

    public Lignepaiement(Integer id, int version, int typefacture) {
        this.id = id;
        this.version = version;
        this.typefacture = typefacture;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIndexligne() {
        return indexligne;
    }

    public void setIndexligne(Integer indexligne) {
        this.indexligne = indexligne;
    }

    public Integer getMontantpaiement() {
        return montantpaiement;
    }

    public void setMontantpaiement(Integer montantpaiement) {
        this.montantpaiement = montantpaiement;
    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    public String getLibellefacture() {
        return libellefacture;
    }

    public void setLibellefacture(String libellefacture) {
        this.libellefacture = libellefacture;
    }

    public Integer getMontantquittance() {
        return montantquittance;
    }

    public void setMontantquittance(Integer montantquittance) {
        this.montantquittance = montantquittance;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getTypefacture() {
        return typefacture;
    }

    public void setTypefacture(int typefacture) {
        this.typefacture = typefacture;
    }

    public Payementfacture getPaiement() {
        return paiement;
    }

    public void setPaiement(Payementfacture paiement) {
        this.paiement = paiement;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lignepaiement)) {
            return false;
        }
        Lignepaiement other = (Lignepaiement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Lignepaiement[ id=" + id + " ]";
    }
    
}
