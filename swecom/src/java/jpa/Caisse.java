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
@Table(name = "caisse")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Caisse.findAll", query = "SELECT c FROM Caisse c"),
    @NamedQuery(name = "Caisse.findById", query = "SELECT c FROM Caisse c WHERE c.id = :id"),
    @NamedQuery(name = "Caisse.findByCodecaisse", query = "SELECT c FROM Caisse c WHERE c.codecaisse = :codecaisse"),
    @NamedQuery(name = "Caisse.findByCodeutilisateur", query = "SELECT c FROM Caisse c WHERE c.codeutilisateur = :codeutilisateur"),
    @NamedQuery(name = "Caisse.findByDateouverture", query = "SELECT c FROM Caisse c WHERE c.dateouverture = :dateouverture"),
    @NamedQuery(name = "Caisse.findByDatefermeture", query = "SELECT c FROM Caisse c WHERE c.datefermeture = :datefermeture"),
    @NamedQuery(name = "Caisse.findByMachine", query = "SELECT c FROM Caisse c WHERE c.machine = :machine"),
    @NamedQuery(name = "Caisse.findByIpmachine", query = "SELECT c FROM Caisse c WHERE c.ipmachine = :ipmachine"),
    @NamedQuery(name = "Caisse.findByVersion", query = "SELECT c FROM Caisse c WHERE c.version = :version"),
    @NamedQuery(name = "Caisse.findByEtat", query = "SELECT c FROM Caisse c WHERE c.etat = :etat"),
    @NamedQuery(name = "Caisse.findByMontantespeces", query = "SELECT c FROM Caisse c WHERE c.montantespeces = :montantespeces"),
    @NamedQuery(name = "Caisse.findByMontantcheque", query = "SELECT c FROM Caisse c WHERE c.montantcheque = :montantcheque"),
    @NamedQuery(name = "Caisse.findByMontantmtnmoney", query = "SELECT c FROM Caisse c WHERE c.montantmtnmoney = :montantmtnmoney"),
    @NamedQuery(name = "Caisse.findByMontantorangemoney", query = "SELECT c FROM Caisse c WHERE c.montantorangemoney = :montantorangemoney"),
    @NamedQuery(name = "Caisse.findByMontantcarte", query = "SELECT c FROM Caisse c WHERE c.montantcarte = :montantcarte"),
    @NamedQuery(name = "Caisse.findByEncaissement", query = "SELECT c FROM Caisse c WHERE c.encaissement = :encaissement"),
    @NamedQuery(name = "Caisse.findByDecaissement", query = "SELECT c FROM Caisse c WHERE c.decaissement = :decaissement"),
    @NamedQuery(name = "Caisse.findByTotalcaisse", query = "SELECT c FROM Caisse c WHERE c.totalcaisse = :totalcaisse")})
public class Caisse implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "codecaisse")
    private String codecaisse;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "codeutilisateur")
    private String codeutilisateur;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateouverture")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateouverture;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datefermeture")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datefermeture;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "machine")
    private String machine;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ipmachine")
    private String ipmachine;
    @Basic(optional = false)
    @NotNull
    @Column(name = "version")
    private int version;
    @Basic(optional = false)
    @NotNull
    @Column(name = "etat")
    private boolean etat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "montantespeces")
    private int montantespeces;
    @Basic(optional = false)
    @NotNull
    @Column(name = "montantcheque")
    private int montantcheque;
    @Basic(optional = false)
    @NotNull
    @Column(name = "montantmtnmoney")
    private int montantmtnmoney;
    @Basic(optional = false)
    @NotNull
    @Column(name = "montantorangemoney")
    private int montantorangemoney;
    @Basic(optional = false)
    @NotNull
    @Column(name = "montantcarte")
    private int montantcarte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "encaissement")
    private int encaissement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "decaissement")
    private int decaissement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "totalcaisse")
    private int totalcaisse;
    @OneToMany(mappedBy = "caisse")
    private List<Payementfacture> payementfactureList;
    @JoinColumn(name = "agence", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Agence agence;

    public Caisse() {
    }

    public Caisse(Integer id) {
        this.id = id;
    }

    public Caisse(Integer id, String codecaisse, String codeutilisateur, Date dateouverture, Date datefermeture, String machine, String ipmachine, int version, boolean etat, int montantespeces, int montantcheque, int montantmtnmoney, int montantorangemoney, int montantcarte, int encaissement, int decaissement, int totalcaisse) {
        this.id = id;
        this.codecaisse = codecaisse;
        this.codeutilisateur = codeutilisateur;
        this.dateouverture = dateouverture;
        this.datefermeture = datefermeture;
        this.machine = machine;
        this.ipmachine = ipmachine;
        this.version = version;
        this.etat = etat;
        this.montantespeces = montantespeces;
        this.montantcheque = montantcheque;
        this.montantmtnmoney = montantmtnmoney;
        this.montantorangemoney = montantorangemoney;
        this.montantcarte = montantcarte;
        this.encaissement = encaissement;
        this.decaissement = decaissement;
        this.totalcaisse = totalcaisse;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodecaisse() {
        return codecaisse;
    }

    public void setCodecaisse(String codecaisse) {
        this.codecaisse = codecaisse;
    }

    public String getCodeutilisateur() {
        return codeutilisateur;
    }

    public void setCodeutilisateur(String codeutilisateur) {
        this.codeutilisateur = codeutilisateur;
    }

    public Date getDateouverture() {
        return dateouverture;
    }

    public void setDateouverture(Date dateouverture) {
        this.dateouverture = dateouverture;
    }

    public Date getDatefermeture() {
        return datefermeture;
    }

    public void setDatefermeture(Date datefermeture) {
        this.datefermeture = datefermeture;
    }

    public String getMachine() {
        return machine;
    }

    public void setMachine(String machine) {
        this.machine = machine;
    }

    public String getIpmachine() {
        return ipmachine;
    }

    public void setIpmachine(String ipmachine) {
        this.ipmachine = ipmachine;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public boolean getEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public int getMontantespeces() {
        return montantespeces;
    }

    public void setMontantespeces(int montantespeces) {
        this.montantespeces = montantespeces;
    }

    public int getMontantcheque() {
        return montantcheque;
    }

    public void setMontantcheque(int montantcheque) {
        this.montantcheque = montantcheque;
    }

    public int getMontantmtnmoney() {
        return montantmtnmoney;
    }

    public void setMontantmtnmoney(int montantmtnmoney) {
        this.montantmtnmoney = montantmtnmoney;
    }

    public int getMontantorangemoney() {
        return montantorangemoney;
    }

    public void setMontantorangemoney(int montantorangemoney) {
        this.montantorangemoney = montantorangemoney;
    }

    public int getMontantcarte() {
        return montantcarte;
    }

    public void setMontantcarte(int montantcarte) {
        this.montantcarte = montantcarte;
    }

    public int getEncaissement() {
        return encaissement;
    }

    public void setEncaissement(int encaissement) {
        this.encaissement = encaissement;
    }

    public int getDecaissement() {
        return decaissement;
    }

    public void setDecaissement(int decaissement) {
        this.decaissement = decaissement;
    }

    public int getTotalcaisse() {
        return totalcaisse;
    }

    public void setTotalcaisse(int totalcaisse) {
        this.totalcaisse = totalcaisse;
    }

    @XmlTransient
    public List<Payementfacture> getPayementfactureList() {
        return payementfactureList;
    }

    public void setPayementfactureList(List<Payementfacture> payementfactureList) {
        this.payementfactureList = payementfactureList;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
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
        if (!(object instanceof Caisse)) {
            return false;
        }
        Caisse other = (Caisse) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Caisse[ id=" + id + " ]";
    }
    
}
