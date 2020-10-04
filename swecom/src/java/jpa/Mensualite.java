/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jpa;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author skysofttech
 */
@Entity
@Cacheable(false)
@Table(name = "mensualite")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mensualite.findAll", query = "SELECT m FROM Mensualite m"),
    @NamedQuery(name = "Mensualite.findById", query = "SELECT m FROM Mensualite m WHERE m.id = :id"),
    @NamedQuery(name = "Mensualite.findByLibelle", query = "SELECT m FROM Mensualite m WHERE m.libelle = :libelle"),
    @NamedQuery(name = "Mensualite.findByMontant", query = "SELECT m FROM Mensualite m WHERE m.montant = :montant"),
    @NamedQuery(name = "Mensualite.findByMontantaffiche", query = "SELECT m FROM Mensualite m WHERE m.montantaffiche = :montantaffiche"),
    @NamedQuery(name = "Mensualite.findByDatecreation", query = "SELECT m FROM Mensualite m WHERE m.datecreation = :datecreation"),
    @NamedQuery(name = "Mensualite.findByAgence", query = "SELECT m FROM Mensualite m WHERE m.agence = :agence")})
public class Mensualite implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "libelle")
    private String libelle;
    @Column(name = "montant")
    private Integer montant;
    @Column(name = "montantaffiche")
    private Integer montantaffiche;
    @Column(name = "datecreation")
    @Temporal(TemporalType.DATE)
    private Date datecreation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "agence")
    private int agence;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mensualite")
    private transient List<Abonne> abonneList;

    public Mensualite() {
    }

    public Mensualite(Integer id) {
        this.id = id;
    }

    public Mensualite(Integer id, int agence) {
        this.id = id;
        this.agence = agence;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Integer getMontant() {
        return montant;
    }

    public void setMontant(Integer montant) {
        this.montant = montant;
    }

    public Integer getMontantaffiche() {
        return montantaffiche;
    }

    public void setMontantaffiche(Integer montantaffiche) {
        this.montantaffiche = montantaffiche;
    }

    public Date getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(Date datecreation) {
        this.datecreation = datecreation;
    }

    public int getAgence() {
        return agence;
    }

    public void setAgence(int agence) {
        this.agence = agence;
    }

    @XmlTransient
    public List<Abonne> getAbonneList() {
        return abonneList;
    }

    public void setAbonneList(List<Abonne> abonneList) {
        this.abonneList = abonneList;
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
        if (!(object instanceof Mensualite)) {
            return false;
        }
        Mensualite other = (Mensualite) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Mensualite[ id=" + id + " ]";
    }
    
}
