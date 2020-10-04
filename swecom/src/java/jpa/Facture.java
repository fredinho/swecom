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
import javax.persistence.PostLoad;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
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
@Table(name = "facture")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facture.findAll", query = "SELECT f FROM Facture f"),
    @NamedQuery(name = "Facture.findByNumeroFacture", query = "SELECT f FROM Facture f WHERE f.numeroFacture = :numeroFacture"),
    @NamedQuery(name = "Facture.findByMois", query = "SELECT f FROM Facture f WHERE f.mois = :mois"),
    @NamedQuery(name = "Facture.findByMoisabreger", query = "SELECT f FROM Facture f WHERE f.moisabreger = :moisabreger"),
    @NamedQuery(name = "Facture.findByIndexmois", query = "SELECT f FROM Facture f WHERE f.indexmois = :indexmois"),
    @NamedQuery(name = "Facture.findByAnnee", query = "SELECT f FROM Facture f WHERE f.annee = :annee"),
    @NamedQuery(name = "Facture.findBySolder", query = "SELECT f FROM Facture f WHERE f.solder = :solder"),
    @NamedQuery(name = "Facture.findByMontant", query = "SELECT f FROM Facture f WHERE f.montant = :montant"),
    @NamedQuery(name = "Facture.findByMontantaffiche", query = "SELECT f FROM Facture f WHERE f.montantaffiche = :montantaffiche"),
    @NamedQuery(name = "Facture.findByPenalite", query = "SELECT f FROM Facture f WHERE f.penalite = :penalite"),
    @NamedQuery(name = "Facture.findByReduction", query = "SELECT f FROM Facture f WHERE f.reduction = :reduction"),
    @NamedQuery(name = "Facture.findByAvance", query = "SELECT f FROM Facture f WHERE f.avance = :avance"),
    @NamedQuery(name = "Facture.findByGratuit", query = "SELECT f FROM Facture f WHERE f.gratuit = :gratuit"),
    @NamedQuery(name = "Facture.findByConsommer", query = "SELECT f FROM Facture f WHERE f.consommer = :consommer"),
    @NamedQuery(name = "Facture.findByDatefacturation", query = "SELECT f FROM Facture f WHERE f.datefacturation = :datefacturation"),
    @NamedQuery(name = "Facture.findByDatelimitepaiement", query = "SELECT f FROM Facture f WHERE f.datelimitepaiement = :datelimitepaiement"),
    @NamedQuery(name = "Facture.findByObservation", query = "SELECT f FROM Facture f WHERE f.observation = :observation"),
    @NamedQuery(name = "Facture.findByLibelle", query = "SELECT f FROM Facture f WHERE f.libelle = :libelle"),
    @NamedQuery(name = "Facture.findByTypefacture", query = "SELECT f FROM Facture f WHERE f.typefacture = :typefacture"),
    @NamedQuery(name = "Facture.findById", query = "SELECT f FROM Facture f WHERE f.id = :id"),
    @NamedQuery(name = "Facture.findByVersion", query = "SELECT f FROM Facture f WHERE f.version = :version"),
    @NamedQuery(name = "Facture.findByDuree", query = "SELECT f FROM Facture f WHERE f.duree = :duree"),
    @NamedQuery(name = "Facture.findByFactureimpayes", query = "SELECT f FROM Facture f WHERE f.abonne = :abonne AND f.solder = :solder"),
    @NamedQuery(name = "Facture.findByAbonne1", query = "SELECT f FROM Facture f WHERE f.abonne = :abonne"),
    @NamedQuery(name = "Facture.findByPriorite", query = "SELECT f FROM Facture f WHERE f.priorite = :priorite")})
public class Facture implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "numeroFacture")
    private String numeroFacture;
    @Size(max = 50)
    @Column(name = "mois")
    private String mois;
    @Size(max = 50)
    @Column(name = "moisabreger")
    private String moisabreger;
    @Column(name = "indexmois")
    private Integer indexmois;
    @Column(name = "annee")
    private Integer annee;
    @Column(name = "solder")
    private Boolean solder;
    @Column(name = "montant")
    private Integer montant;
    @Column(name = "montantaffiche")
    private Integer montantaffiche;
    @Column(name = "penalite")
    private Integer penalite;
    @Column(name = "reduction")
    private Integer reduction;
    @Column(name = "avance")
    private Integer avance;
    @Column(name = "gratuit")
    private Boolean gratuit;
    @Column(name = "consommer")
    private Boolean consommer;
    @Column(name = "datefacturation")
    @Temporal(TemporalType.DATE)
    private Date datefacturation;
    @Column(name = "datelimitepaiement")
    @Temporal(TemporalType.DATE)
    private Date datelimitepaiement;
    @Size(max = 250)
    @Column(name = "observation")
    private String observation;
    @Size(max = 250)
    @Column(name = "libelle")
    private String libelle;
    @Column(name = "typefacture")
    private Integer typefacture;
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
    @Column(name = "duree")
    private int duree;
    @Basic(optional = false)
    @NotNull
    @Column(name = "priorite")
    private int priorite;
    @JoinColumn(name = "agence", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Agence agence;
    @JoinColumn(name = "abonne", referencedColumnName = "id")
    @ManyToOne
    private Abonne abonne;
    @OneToMany(mappedBy = "facture")
    private transient List<Lignepaiement> lignepaiementList;
    
    @Transient
    private String statut;
    
    @Transient
    private String periode;
    
    @Transient
    private int solde;

    public Facture() {
    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }
    
    
    

    public Facture(Integer id) {
        this.id = id;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }
    
    

    public Facture(Integer id, String numeroFacture, int version, int duree, int priorite) {
        this.id = id;
        this.numeroFacture = numeroFacture;
        this.version = version;
        this.duree = duree;
        this.priorite = priorite;
    }

    public String getNumeroFacture() {
        return numeroFacture;
    }

 

    public void setStatut(String statut) {
        this.statut = statut;
    }
    
    
    

    public void setNumeroFacture(String numeroFacture) {
        this.numeroFacture = numeroFacture;
    }

    public String getMois() {
        return mois;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }

    public String getMoisabreger() {
        return moisabreger;
    }

    public void setMoisabreger(String moisabreger) {
        this.moisabreger = moisabreger;
    }

    public Integer getIndexmois() {
        return indexmois;
    }

    public void setIndexmois(Integer indexmois) {
        this.indexmois = indexmois;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public Boolean getSolder() {
        return solder;
    }

    public void setSolder(Boolean solder) {
        this.solder = solder;
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

    public Integer getPenalite() {
        return penalite;
    }

    public void setPenalite(Integer penalite) {
        this.penalite = penalite;
    }

    public Integer getReduction() {
        return reduction;
    }

    public void setReduction(Integer reduction) {
        this.reduction = reduction;
    }

    public Integer getAvance() {
        return avance;
    }

    public void setAvance(Integer avance) {
        this.avance = avance;
    }

    public Boolean getGratuit() {
        return gratuit;
    }

    public void setGratuit(Boolean gratuit) {
        this.gratuit = gratuit;
    }

    public Boolean getConsommer() {
        return consommer;
    }

    public void setConsommer(Boolean consommer) {
        this.consommer = consommer;
    }

    public Date getDatefacturation() {
        return datefacturation;
    }

    public void setDatefacturation(Date datefacturation) {
        this.datefacturation = datefacturation;
    }

    public Date getDatelimitepaiement() {
        return datelimitepaiement;
    }

    public void setDatelimitepaiement(Date datelimitepaiement) {
        this.datelimitepaiement = datelimitepaiement;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Integer getTypefacture() {
        return typefacture;
    }

    public void setTypefacture(Integer typefacture) {
        this.typefacture = typefacture;
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

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public int getPriorite() {
        return priorite;
    }

    public void setPriorite(int priorite) {
        this.priorite = priorite;
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

    @XmlTransient
    public List<Lignepaiement> getLignepaiementList() {
        return lignepaiementList;
    }

    public void setLignepaiementList(List<Lignepaiement> lignepaiementList) {
        this.lignepaiementList = lignepaiementList;
    }

    public String getStatut() {
        return statut;
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
        if (!(object instanceof Facture)) {
            return false;
        }
        Facture other = (Facture) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Facture[ id=" + id + " ]";
    }
    
    
    //***************************** ADD *****************
    
    
      public String getPeriodeFacture(){
        return mois+" "+annee;
    }
       
       public int getNetPayer(){

         int mont = getMontantTotal() - getAvance();
         
          return isSolder()?0:( mont >= 0 ? mont : 0);
    }
       
       public int getMontantTotal(){
      
         int mont = getMontant()+getPenalite()-getReduction();
          return mont>=0 ? mont : 0;
    }
  
       
       public boolean isSolder(){
        return solder;
    }
       
       
       @PostLoad void postload(){
           
           solde = getNetPayer();
           
           statut = getStatutFacture();
           
           periode = getPeriodeFacture();
       }
       
   
     public String getStatutFacture() {

        if (getAbonne().getLangue().equalsIgnoreCase("fr")) {

            return isSolder() || (montant + penalite > 0 && (montant + penalite - reduction - avance) == 0) ? "Solder" : getGratuit() && getMontantTotal() == 0 ? "Mois Offert" : (getMontantTotal() == 0 ? "Annuler" : "Non Solder");
        } else {

            return isSolder() || montant + penalite > 0 && (montant + penalite - reduction - avance) == 0 ? "Paid" : getGratuit() && getMontantTotal() == 0 ? "Free" : (getMontantTotal() == 0 ? "Cancel" : "UnPaid");
        }

    }
}
