/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jpa;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author skysofttech
 */
@Entity
@Cacheable(false)
@Table(name = "panne")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Panne.findAll", query = "SELECT p FROM Panne p"),
    @NamedQuery(name = "Panne.findById", query = "SELECT p FROM Panne p WHERE p.id = :id"),
    @NamedQuery(name = "Panne.findByLibelle", query = "SELECT p FROM Panne p WHERE p.libelle = :libelle"),
    @NamedQuery(name = "Panne.findByDatedeclaration", query = "SELECT p FROM Panne p WHERE p.datedeclaration = :datedeclaration"),
    @NamedQuery(name = "Panne.findByLieu", query = "SELECT p FROM Panne p WHERE p.lieu = :lieu"),
    @NamedQuery(name = "Panne.findByReparee", query = "SELECT p FROM Panne p WHERE p.reparee = :reparee"),
    @NamedQuery(name = "Panne.findByPriorite", query = "SELECT p FROM Panne p WHERE p.priorite = :priorite"),
    @NamedQuery(name = "Panne.findByVersion", query = "SELECT p FROM Panne p WHERE p.version = :version"),
    @NamedQuery(name = "Panne.findByFamille", query = "SELECT p FROM Panne p WHERE p.famille = :famille"),
    @NamedQuery(name = "Panne.findByAbonne", query = "SELECT p FROM Panne p WHERE p.abonne = :abonne"),
    @NamedQuery(name = "Panne.findByDatereparation", query = "SELECT p FROM Panne p WHERE p.datereparation = :datereparation"),
    @NamedQuery(name = "Panne.findByCodeutilisateur", query = "SELECT p FROM Panne p WHERE p.codeutilisateur = :codeutilisateur")})
public class Panne implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "numeropanne")
    private String numeropanne;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "libelle")
    private String libelle;
    @Column(name = "datedeclaration")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datedeclaration;
    @Size(max = 50)
    @Column(name = "lieu")
    private String lieu;
    @Column(name = "reparee")
    private Boolean reparee;
    @Column(name = "priorite")
    private Integer priorite;
    @Basic(optional = false)
    @NotNull
    @Column(name = "version")
    private int version;
    @Basic(optional = false)
    @NotNull
    @Column(name = "famille")
    private int famille;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datereparation")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datereparation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "codeutilisateur")
    private String codeutilisateur;
    @JoinColumn(name = "agence", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Agence agence;
    @JoinColumn(name = "abonne", referencedColumnName = "id")
    @ManyToOne
    private Abonne abonne;

    public Panne() {
    }

    public Panne(Integer id) {
        this.id = id;
    }

    public Panne(Integer id, int version, int famille, Date datereparation, String codeutilisateur) {
        this.id = id;
        this.version = version;
        this.famille = famille;
        this.datereparation = datereparation;
        this.codeutilisateur = codeutilisateur;
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

    public Date getDatedeclaration() {
        return datedeclaration;
    }

    public void setDatedeclaration(Date datedeclaration) {
        this.datedeclaration = datedeclaration;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Boolean getReparee() {
        return reparee;
    }

    public void setReparee(Boolean reparee) {
        this.reparee = reparee;
    }

    public Integer getPriorite() {
        return priorite;
    }

    public void setPriorite(Integer priorite) {
        this.priorite = priorite;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getFamille() {
        return famille;
    }

    public void setFamille(int famille) {
        this.famille = famille;
    }

    public Date getDatereparation() {
        return datereparation;
    }

    public void setDatereparation(Date datereparation) {
        this.datereparation = datereparation;
    }

    public String getCodeutilisateur() {
        return codeutilisateur;
    }

    public void setCodeutilisateur(String codeutilisateur) {
        this.codeutilisateur = codeutilisateur;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public Abonne getAbonne() {
        return abonne;
    }

    public void setAbonne(Abonne abonne) {
        this.abonne = abonne;
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
        if (!(object instanceof Panne)) {
            return false;
        }
        Panne other = (Panne) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Panne[ id=" + id + " ]";
    }

    public String getNumeropanne() {
        return numeropanne;
    }

    public void setNumeropanne(String numeropanne) {
        this.numeropanne = numeropanne;
    }
    
}
