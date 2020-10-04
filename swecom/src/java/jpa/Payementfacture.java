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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "payementfacture")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Payementfacture.findAll", query = "SELECT p FROM Payementfacture p"),
    @NamedQuery(name = "Payementfacture.findByNumeropaiement", query = "SELECT p FROM Payementfacture p WHERE p.numeropaiement = :numeropaiement"),
    @NamedQuery(name = "Payementfacture.findByDatepaiement", query = "SELECT p FROM Payementfacture p WHERE p.datepaiement = :datepaiement"),
    @NamedQuery(name = "Payementfacture.findByMontant", query = "SELECT p FROM Payementfacture p WHERE p.montant = :montant"),
    @NamedQuery(name = "Payementfacture.findByModepaiement", query = "SELECT p FROM Payementfacture p WHERE p.modepaiement = :modepaiement"),
    @NamedQuery(name = "Payementfacture.findByCodeutilisateur", query = "SELECT p FROM Payementfacture p WHERE p.codeutilisateur = :codeutilisateur"),
    @NamedQuery(name = "Payementfacture.findByCommercial", query = "SELECT p FROM Payementfacture p WHERE p.commercial = :commercial"),
    @NamedQuery(name = "Payementfacture.findByMontantLettre", query = "SELECT p FROM Payementfacture p WHERE p.montantLettre = :montantLettre"),
    @NamedQuery(name = "Payementfacture.findByNumRecuPaiement", query = "SELECT p FROM Payementfacture p WHERE p.numRecuPaiement = :numRecuPaiement"),
    @NamedQuery(name = "Payementfacture.findByIdCarnet", query = "SELECT p FROM Payementfacture p WHERE p.idCarnet = :idCarnet"),
    @NamedQuery(name = "Payementfacture.findByDatesaisie", query = "SELECT p FROM Payementfacture p WHERE p.datesaisie = :datesaisie"),
    @NamedQuery(name = "Payementfacture.findById", query = "SELECT p FROM Payementfacture p WHERE p.id = :id"),
    @NamedQuery(name = "Payementfacture.findByVersion", query = "SELECT p FROM Payementfacture p WHERE p.version = :version"),
    @NamedQuery(name = "Payementfacture.findByAbonne", query = "SELECT p FROM Payementfacture p WHERE p.abonne = :abonne"),
    @NamedQuery(name = "Payementfacture.findByAgence", query = "SELECT p FROM Payementfacture p WHERE p.agence = :agence"),
    @NamedQuery(name = "Payementfacture.findByObservation", query = "SELECT p FROM Payementfacture p WHERE p.observation = :observation"),
    @NamedQuery(name = "Payementfacture.findByTypepaiement", query = "SELECT p FROM Payementfacture p WHERE p.typepaiement = :typepaiement")})
public class Payementfacture implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "numeropaiement")
    private String numeropaiement;
    @Column(name = "datepaiement")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datepaiement;
    @Column(name = "montant")
    private Integer montant;
    @Size(max = 50)
    @Column(name = "modepaiement")
    private String modepaiement;
    @Size(max = 50)
    @Column(name = "codeutilisateur")
    private String codeutilisateur;
    @Column(name = "commercial")
    private Integer commercial;
    @Size(max = 250)
    @Column(name = "montantLettre")
    private String montantLettre;
    @Size(max = 50)
    @Column(name = "numRecuPaiement")
    private String numRecuPaiement;
    @Column(name = "IdCarnet")
    private Integer idCarnet;
    @Column(name = "datesaisie")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datesaisie;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "version")
    private int version;
    @Basic(optional = false)
    @NotNull
    @Column(name = "abonne")
    private int abonne;
    @Basic(optional = false)
    @NotNull
    @Column(name = "agence")
    private int agence;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "observation")
    private String observation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "typepaiement")
    private String typepaiement;
    @JoinColumn(name = "caisse", referencedColumnName = "id")
    @ManyToOne
    private Caisse caisse;
    @OneToMany(mappedBy = "paiement")
    private transient List<Lignepaiement> lignepaiementList;

    public Payementfacture() {
    }

    public Payementfacture(Integer id) {
        this.id = id;
    }

    public Payementfacture(Integer id, String numeropaiement, int version, int abonne, int agence, String observation, String typepaiement) {
        this.id = id;
        this.numeropaiement = numeropaiement;
        this.version = version;
        this.abonne = abonne;
        this.agence = agence;
        this.observation = observation;
        this.typepaiement = typepaiement;
    }

    public String getNumeropaiement() {
        return numeropaiement;
    }

    public void setNumeropaiement(String numeropaiement) {
        this.numeropaiement = numeropaiement;
    }

    public Date getDatepaiement() {
        return datepaiement;
    }

    public void setDatepaiement(Date datepaiement) {
        this.datepaiement = datepaiement;
    }

    public Integer getMontant() {
        return montant;
    }

    public void setMontant(Integer montant) {
        this.montant = montant;
    }

    public String getModepaiement() {
        return modepaiement;
    }

    public void setModepaiement(String modepaiement) {
        this.modepaiement = modepaiement;
    }

    public String getCodeutilisateur() {
        return codeutilisateur;
    }

    public void setCodeutilisateur(String codeutilisateur) {
        this.codeutilisateur = codeutilisateur;
    }

    public Integer getCommercial() {
        return commercial;
    }

    public void setCommercial(Integer commercial) {
        this.commercial = commercial;
    }

    public String getMontantLettre() {
        return montantLettre;
    }

    public void setMontantLettre(String montantLettre) {
        this.montantLettre = montantLettre;
    }

    public String getNumRecuPaiement() {
        return numRecuPaiement;
    }

    public void setNumRecuPaiement(String numRecuPaiement) {
        this.numRecuPaiement = numRecuPaiement;
    }

    public Integer getIdCarnet() {
        return idCarnet;
    }

    public void setIdCarnet(Integer idCarnet) {
        this.idCarnet = idCarnet;
    }

    public Date getDatesaisie() {
        return datesaisie;
    }

    public void setDatesaisie(Date datesaisie) {
        this.datesaisie = datesaisie;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getAbonne() {
        return abonne;
    }

    public void setAbonne(int abonne) {
        this.abonne = abonne;
    }

    public int getAgence() {
        return agence;
    }

    public void setAgence(int agence) {
        this.agence = agence;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getTypepaiement() {
        return typepaiement;
    }

    public void setTypepaiement(String typepaiement) {
        this.typepaiement = typepaiement;
    }

    public Caisse getCaisse() {
        return caisse;
    }

    public void setCaisse(Caisse caisse) {
        this.caisse = caisse;
    }

    @XmlTransient
    public List<Lignepaiement> getLignepaiementList() {
        return lignepaiementList;
    }

    public void setLignepaiementList(List<Lignepaiement> lignepaiementList) {
        this.lignepaiementList = lignepaiementList;
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
        if (!(object instanceof Payementfacture)) {
            return false;
        }
        Payementfacture other = (Payementfacture) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Payementfacture[ id=" + id + " ]";
    }
    
}
