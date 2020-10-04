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
@Table(name = "abonne")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Abonne.findAll", query = "SELECT a FROM Abonne a"),
    @NamedQuery(name = "Abonne.findById", query = "SELECT a FROM Abonne a WHERE a.id = :id"),
    @NamedQuery(name = "Abonne.findByNumeroabonne", query = "SELECT a FROM Abonne a WHERE a.numeroabonne = :numeroabonne"),
    @NamedQuery(name = "Abonne.findByCivilite", query = "SELECT a FROM Abonne a WHERE a.civilite = :civilite"),
    @NamedQuery(name = "Abonne.findByNom", query = "SELECT a FROM Abonne a WHERE a.nom = :nom"),
    @NamedQuery(name = "Abonne.findByPrenom", query = "SELECT a FROM Abonne a WHERE a.prenom = :prenom"),
    @NamedQuery(name = "Abonne.findByCni", query = "SELECT a FROM Abonne a WHERE a.cni = :cni"),
    @NamedQuery(name = "Abonne.findByAdresse", query = "SELECT a FROM Abonne a WHERE a.adresse = :adresse"),
    @NamedQuery(name = "Abonne.findByProfession", query = "SELECT a FROM Abonne a WHERE a.profession = :profession"),
    @NamedQuery(name = "Abonne.findByTelephone", query = "SELECT a FROM Abonne a WHERE a.telephone = :telephone"),
    @NamedQuery(name = "Abonne.findByEmail", query = "SELECT a FROM Abonne a WHERE a.email = :email"),
    @NamedQuery(name = "Abonne.findByPassword", query = "SELECT a FROM Abonne a WHERE a.password = :password"),
    @NamedQuery(name = "Abonne.findByDateabonnement", query = "SELECT a FROM Abonne a WHERE a.dateabonnement = :dateabonnement"),
    @NamedQuery(name = "Abonne.findByVersion", query = "SELECT a FROM Abonne a WHERE a.version = :version"),
    @NamedQuery(name = "Abonne.findByNomcomplet", query = "SELECT a FROM Abonne a WHERE a.nomcomplet = :nomcomplet"),
    @NamedQuery(name = "Abonne.findByJan", query = "SELECT a FROM Abonne a WHERE a.jan = :jan"),
    @NamedQuery(name = "Abonne.findByFev", query = "SELECT a FROM Abonne a WHERE a.fev = :fev"),
    @NamedQuery(name = "Abonne.findByConnection", query = "SELECT a FROM Abonne a WHERE a.numeroabonne = :numeroabonne AND a.password = :password"),
    @NamedQuery(name = "Abonne.findByMars", query = "SELECT a FROM Abonne a WHERE a.mars = :mars"),
    @NamedQuery(name = "Abonne.findByAvril", query = "SELECT a FROM Abonne a WHERE a.avril = :avril"),
    @NamedQuery(name = "Abonne.findByMai", query = "SELECT a FROM Abonne a WHERE a.mai = :mai"),
    @NamedQuery(name = "Abonne.findByJuin", query = "SELECT a FROM Abonne a WHERE a.juin = :juin"),
    @NamedQuery(name = "Abonne.findByJuil", query = "SELECT a FROM Abonne a WHERE a.juil = :juil"),
    @NamedQuery(name = "Abonne.findByAout", query = "SELECT a FROM Abonne a WHERE a.aout = :aout"),
    @NamedQuery(name = "Abonne.findBySept", query = "SELECT a FROM Abonne a WHERE a.sept = :sept"),
    @NamedQuery(name = "Abonne.findByOct", query = "SELECT a FROM Abonne a WHERE a.oct = :oct"),
    @NamedQuery(name = "Abonne.findByNov", query = "SELECT a FROM Abonne a WHERE a.nov = :nov"),
    @NamedQuery(name = "Abonne.findByDecem", query = "SELECT a FROM Abonne a WHERE a.decem = :decem"),
    @NamedQuery(name = "Abonne.findByRepere", query = "SELECT a FROM Abonne a WHERE a.repere = :repere"),
    @NamedQuery(name = "Abonne.findByActif", query = "SELECT a FROM Abonne a WHERE a.actif = :actif"),
    @NamedQuery(name = "Abonne.findByResilier", query = "SELECT a FROM Abonne a WHERE a.resilier = :resilier"),
    @NamedQuery(name = "Abonne.findByDecodeur", query = "SELECT a FROM Abonne a WHERE a.decodeur = :decodeur"),
    @NamedQuery(name = "Abonne.findByProximite", query = "SELECT a FROM Abonne a WHERE a.proximite = :proximite"),
    @NamedQuery(name = "Abonne.findByMontantabonnement", query = "SELECT a FROM Abonne a WHERE a.montantabonnement = :montantabonnement"),
    @NamedQuery(name = "Abonne.findByCodeutilisateur", query = "SELECT a FROM Abonne a WHERE a.codeutilisateur = :codeutilisateur"),
    @NamedQuery(name = "Abonne.findByLangue", query = "SELECT a FROM Abonne a WHERE a.langue = :langue"),
    @NamedQuery(name = "Abonne.findByRecepteur", query = "SELECT a FROM Abonne a WHERE a.recepteur = :recepteur"),
    @NamedQuery(name = "Abonne.findBySerialcarte", query = "SELECT a FROM Abonne a WHERE a.serialcarte = :serialcarte"),
    @NamedQuery(name = "Abonne.findByBarcode", query = "SELECT a FROM Abonne a WHERE a.barcode = :barcode"),
    @NamedQuery(name = "Abonne.findByTypeclient", query = "SELECT a FROM Abonne a WHERE a.typeclient = :typeclient"),
    @NamedQuery(name = "Abonne.findByReductionclient", query = "SELECT a FROM Abonne a WHERE a.reductionclient = :reductionclient"),
    @NamedQuery(name = "Abonne.findByPeriodicite", query = "SELECT a FROM Abonne a WHERE a.periodicite = :periodicite")})
public class Abonne implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "numeroabonne")
    private String numeroabonne;
    @Size(max = 50)
    @Column(name = "civilite")
    private String civilite;
    @Size(max = 50)
    @Column(name = "nom")
    private String nom;
    @Size(max = 50)
    @Column(name = "prenom")
    private String prenom;
    @Size(max = 50)
    @Column(name = "cni")
    private String cni;
    @Size(max = 250)
    @Column(name = "adresse")
    private String adresse;
    @Size(max = 50)
    @Column(name = "profession")
    private String profession;
    @Size(max = 50)
    @Column(name = "telephone")
    private String telephone;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "email")
    private String email;
    @Size(max = 50)
    @Column(name = "password")
    private String password;
    @Column(name = "dateabonnement")
    @Temporal(TemporalType.DATE)
    private Date dateabonnement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "version")
    private int version;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "nomcomplet")
    private String nomcomplet;
    @Basic(optional = false)
    @NotNull
    @Column(name = "jan")
    private boolean jan;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fev")
    private boolean fev;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mars")
    private boolean mars;
    @Basic(optional = false)
    @NotNull
    @Column(name = "avril")
    private boolean avril;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mai")
    private boolean mai;
    @Basic(optional = false)
    @NotNull
    @Column(name = "juin")
    private boolean juin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "juil")
    private boolean juil;
    @Basic(optional = false)
    @NotNull
    @Column(name = "aout")
    private boolean aout;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sept")
    private boolean sept;
    @Basic(optional = false)
    @NotNull
    @Column(name = "oct")
    private boolean oct;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nov")
    private boolean nov;
    @Basic(optional = false)
    @NotNull
    @Column(name = "decem")
    private boolean decem;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "repere")
    private String repere;
    @Basic(optional = false)
    @NotNull
    @Column(name = "actif")
    private boolean actif;
    @Basic(optional = false)
    @NotNull
    @Column(name = "resilier")
    private boolean resilier;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "decodeur")
    private String decodeur;
    @Basic(optional = false)
    @NotNull
    @Column(name = "proximite")
    private int proximite;
    @Basic(optional = false)
    @NotNull
    @Column(name = "montantabonnement")
    private int montantabonnement;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "codeutilisateur")
    private String codeutilisateur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "langue")
    private String langue;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "recepteur")
    private String recepteur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "serialcarte")
    private String serialcarte;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "barcode")
    private String barcode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "typeclient")
    private String typeclient;
    @Basic(optional = false)
    @NotNull
    @Column(name = "reductionclient")
    private int reductionclient;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "periodicite")
    private String periodicite;
    @OneToMany(mappedBy = "abonne")
    private transient List<Facture> factureList;
    @OneToMany(mappedBy = "abonne")
    private transient List<Panne> panneList;
    @JoinColumn(name = "zone", referencedColumnName = "id")
    @ManyToOne
    private Zone zone;
    @JoinColumn(name = "mensualite", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Mensualite mensualite;
    @JoinColumn(name = "agence", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Agence agence;
    @OneToMany(mappedBy = "abonne")
    private transient List<Mutation> mutationList;

    public Abonne() {
    }

    public Abonne(Integer id) {
        this.id = id;
    }

    public Abonne(Integer id, String numeroabonne, int version, String nomcomplet, boolean jan, boolean fev, boolean mars, boolean avril, boolean mai, boolean juin, boolean juil, boolean aout, boolean sept, boolean oct, boolean nov, boolean decem, String repere, boolean actif, boolean resilier, String decodeur, int proximite, int montantabonnement, String codeutilisateur, String langue, String recepteur, String serialcarte, String barcode, String typeclient, int reductionclient, String periodicite) {
        this.id = id;
        this.numeroabonne = numeroabonne;
        this.version = version;
        this.nomcomplet = nomcomplet;
        this.jan = jan;
        this.fev = fev;
        this.mars = mars;
        this.avril = avril;
        this.mai = mai;
        this.juin = juin;
        this.juil = juil;
        this.aout = aout;
        this.sept = sept;
        this.oct = oct;
        this.nov = nov;
        this.decem = decem;
        this.repere = repere;
        this.actif = actif;
        this.resilier = resilier;
        this.decodeur = decodeur;
        this.proximite = proximite;
        this.montantabonnement = montantabonnement;
        this.codeutilisateur = codeutilisateur;
        this.langue = langue;
        this.recepteur = recepteur;
        this.serialcarte = serialcarte;
        this.barcode = barcode;
        this.typeclient = typeclient;
        this.reductionclient = reductionclient;
        this.periodicite = periodicite;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroabonne() {
        return numeroabonne;
    }

    public void setNumeroabonne(String numeroabonne) {
        this.numeroabonne = numeroabonne;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCni() {
        return cni;
    }

    public void setCni(String cni) {
        this.cni = cni;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateabonnement() {
        return dateabonnement;
    }

    public void setDateabonnement(Date dateabonnement) {
        this.dateabonnement = dateabonnement;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getNomcomplet() {
        return nomcomplet;
    }

    public void setNomcomplet(String nomcomplet) {
        this.nomcomplet = nomcomplet;
    }

    public boolean getJan() {
        return jan;
    }

    public void setJan(boolean jan) {
        this.jan = jan;
    }

    public boolean getFev() {
        return fev;
    }

    public void setFev(boolean fev) {
        this.fev = fev;
    }

    public boolean getMars() {
        return mars;
    }

    public void setMars(boolean mars) {
        this.mars = mars;
    }

    public boolean getAvril() {
        return avril;
    }

    public void setAvril(boolean avril) {
        this.avril = avril;
    }

    public boolean getMai() {
        return mai;
    }

    public void setMai(boolean mai) {
        this.mai = mai;
    }

    public boolean getJuin() {
        return juin;
    }

    public void setJuin(boolean juin) {
        this.juin = juin;
    }

    public boolean getJuil() {
        return juil;
    }

    public void setJuil(boolean juil) {
        this.juil = juil;
    }

    public boolean getAout() {
        return aout;
    }

    public void setAout(boolean aout) {
        this.aout = aout;
    }

    public boolean getSept() {
        return sept;
    }

    public void setSept(boolean sept) {
        this.sept = sept;
    }

    public boolean getOct() {
        return oct;
    }

    public void setOct(boolean oct) {
        this.oct = oct;
    }

    public boolean getNov() {
        return nov;
    }

    public void setNov(boolean nov) {
        this.nov = nov;
    }

    public boolean getDecem() {
        return decem;
    }

    public void setDecem(boolean decem) {
        this.decem = decem;
    }

    public String getRepere() {
        return repere;
    }

    public void setRepere(String repere) {
        this.repere = repere;
    }

    public boolean getActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public boolean getResilier() {
        return resilier;
    }

    public void setResilier(boolean resilier) {
        this.resilier = resilier;
    }

    public String getDecodeur() {
        return decodeur;
    }

    public void setDecodeur(String decodeur) {
        this.decodeur = decodeur;
    }

    public int getProximite() {
        return proximite;
    }

    public void setProximite(int proximite) {
        this.proximite = proximite;
    }

    public int getMontantabonnement() {
        return montantabonnement;
    }

    public void setMontantabonnement(int montantabonnement) {
        this.montantabonnement = montantabonnement;
    }

    public String getCodeutilisateur() {
        return codeutilisateur;
    }

    public void setCodeutilisateur(String codeutilisateur) {
        this.codeutilisateur = codeutilisateur;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public String getRecepteur() {
        return recepteur;
    }

    public void setRecepteur(String recepteur) {
        this.recepteur = recepteur;
    }

    public String getSerialcarte() {
        return serialcarte;
    }

    public void setSerialcarte(String serialcarte) {
        this.serialcarte = serialcarte;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getTypeclient() {
        return typeclient;
    }

    public void setTypeclient(String typeclient) {
        this.typeclient = typeclient;
    }

    public int getReductionclient() {
        return reductionclient;
    }

    public void setReductionclient(int reductionclient) {
        this.reductionclient = reductionclient;
    }

    public String getPeriodicite() {
        return periodicite;
    }

    public void setPeriodicite(String periodicite) {
        this.periodicite = periodicite;
    }

    @XmlTransient
    public List<Facture> getFactureList() {
        return factureList;
    }

    public void setFactureList(List<Facture> factureList) {
        this.factureList = factureList;
    }

    @XmlTransient
    public List<Panne> getPanneList() {
        return panneList;
    }

    public void setPanneList(List<Panne> panneList) {
        this.panneList = panneList;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public Mensualite getMensualite() {
        return mensualite;
    }

    public void setMensualite(Mensualite mensualite) {
        this.mensualite = mensualite;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    @XmlTransient
    public List<Mutation> getMutationList() {
        return mutationList;
    }

    public void setMutationList(List<Mutation> mutationList) {
        this.mutationList = mutationList;
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
        if (!(object instanceof Abonne)) {
            return false;
        }
        Abonne other = (Abonne) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Abonne[ id=" + id + " ]";
    }
    
}
