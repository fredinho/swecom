/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jpa;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
@Table(name = "agence")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Agence.findAll", query = "SELECT a FROM Agence a"),
    @NamedQuery(name = "Agence.findById", query = "SELECT a FROM Agence a WHERE a.id = :id"),
    @NamedQuery(name = "Agence.findByVersion", query = "SELECT a FROM Agence a WHERE a.version = :version"),
    @NamedQuery(name = "Agence.findByNomagence", query = "SELECT a FROM Agence a WHERE a.nomagence = :nomagence"),
    @NamedQuery(name = "Agence.findByTelephone", query = "SELECT a FROM Agence a WHERE a.telephone = :telephone"),
    @NamedQuery(name = "Agence.findByTelephoneDirector", query = "SELECT a FROM Agence a WHERE a.telephoneDirector = :telephoneDirector"),
    @NamedQuery(name = "Agence.findByCodeabreger", query = "SELECT a FROM Agence a WHERE a.codeabreger = :codeabreger"),
    @NamedQuery(name = "Agence.findByAdresse", query = "SELECT a FROM Agence a WHERE a.adresse = :adresse"),
    @NamedQuery(name = "Agence.findByMessagefactureA", query = "SELECT a FROM Agence a WHERE a.messagefactureA = :messagefactureA"),
    @NamedQuery(name = "Agence.findByMessagefactureB", query = "SELECT a FROM Agence a WHERE a.messagefactureB = :messagefactureB"),
    @NamedQuery(name = "Agence.findByFraisretablissement", query = "SELECT a FROM Agence a WHERE a.fraisretablissement = :fraisretablissement"),
    @NamedQuery(name = "Agence.findByLibelleQuittance", query = "SELECT a FROM Agence a WHERE a.libelleQuittance = :libelleQuittance"),
    @NamedQuery(name = "Agence.findByModeleQuittance", query = "SELECT a FROM Agence a WHERE a.modeleQuittance = :modeleQuittance"),
    @NamedQuery(name = "Agence.findByVille", query = "SELECT a FROM Agence a WHERE a.ville = :ville"),
    @NamedQuery(name = "Agence.findByUsersms", query = "SELECT a FROM Agence a WHERE a.usersms = :usersms"),
    @NamedQuery(name = "Agence.findByPasswordsms", query = "SELECT a FROM Agence a WHERE a.passwordsms = :passwordsms"),
    @NamedQuery(name = "Agence.findBySender", query = "SELECT a FROM Agence a WHERE a.sender = :sender"),
    @NamedQuery(name = "Agence.findByAccuse", query = "SELECT a FROM Agence a WHERE a.accuse = :accuse"),
    @NamedQuery(name = "Agence.findBySignersms", query = "SELECT a FROM Agence a WHERE a.signersms = :signersms"),
    @NamedQuery(name = "Agence.findBySignaturesms", query = "SELECT a FROM Agence a WHERE a.signaturesms = :signaturesms"),
    @NamedQuery(name = "Agence.findByUseremail", query = "SELECT a FROM Agence a WHERE a.useremail = :useremail"),
    @NamedQuery(name = "Agence.findByPasswordemail", query = "SELECT a FROM Agence a WHERE a.passwordemail = :passwordemail"),
    @NamedQuery(name = "Agence.findByServeurmail", query = "SELECT a FROM Agence a WHERE a.serveurmail = :serveurmail"),
    @NamedQuery(name = "Agence.findByPortserveurmail", query = "SELECT a FROM Agence a WHERE a.portserveurmail = :portserveurmail"),
    @NamedQuery(name = "Agence.findByPositionsignaturesms", query = "SELECT a FROM Agence a WHERE a.positionsignaturesms = :positionsignaturesms"),
    @NamedQuery(name = "Agence.findByMessagefactureC", query = "SELECT a FROM Agence a WHERE a.messagefactureC = :messagefactureC"),
    @NamedQuery(name = "Agence.findByMessagefactureD", query = "SELECT a FROM Agence a WHERE a.messagefactureD = :messagefactureD"),
    @NamedQuery(name = "Agence.findByHeureouverture", query = "SELECT a FROM Agence a WHERE a.heureouverture = :heureouverture"),
    @NamedQuery(name = "Agence.findByHeurefermeture", query = "SELECT a FROM Agence a WHERE a.heurefermeture = :heurefermeture"),
    @NamedQuery(name = "Agence.findByNotifiepaiement", query = "SELECT a FROM Agence a WHERE a.notifiepaiement = :notifiepaiement"),
    @NamedQuery(name = "Agence.findByGestioncarnet", query = "SELECT a FROM Agence a WHERE a.gestioncarnet = :gestioncarnet"),
    @NamedQuery(name = "Agence.findByDelaipaiement", query = "SELECT a FROM Agence a WHERE a.delaipaiement = :delaipaiement"),
    @NamedQuery(name = "Agence.findByNombrecharcodeabonne", query = "SELECT a FROM Agence a WHERE a.nombrecharcodeabonne = :nombrecharcodeabonne"),
    @NamedQuery(name = "Agence.findByCodeabonneauto", query = "SELECT a FROM Agence a WHERE a.codeabonneauto = :codeabonneauto"),
    @NamedQuery(name = "Agence.findByPrioriteminsms", query = "SELECT a FROM Agence a WHERE a.prioriteminsms = :prioriteminsms"),
    @NamedQuery(name = "Agence.findByPrioriteagence", query = "SELECT a FROM Agence a WHERE a.prioriteagence = :prioriteagence"),
    @NamedQuery(name = "Agence.findByDelaisaisie", query = "SELECT a FROM Agence a WHERE a.delaisaisie = :delaisaisie"),
    @NamedQuery(name = "Agence.findByNomsText", query = "SELECT a FROM Agence a WHERE a.nomsText = :nomsText"),
    @NamedQuery(name = "Agence.findByMensualiteText", query = "SELECT a FROM Agence a WHERE a.mensualiteText = :mensualiteText"),
    @NamedQuery(name = "Agence.findByCodeabonneText", query = "SELECT a FROM Agence a WHERE a.codeabonneText = :codeabonneText"),
    @NamedQuery(name = "Agence.findByDeadlineText", query = "SELECT a FROM Agence a WHERE a.deadlineText = :deadlineText"),
    @NamedQuery(name = "Agence.findByMonthText", query = "SELECT a FROM Agence a WHERE a.monthText = :monthText"),
    @NamedQuery(name = "Agence.findByNotifieDirector", query = "SELECT a FROM Agence a WHERE a.notifieDirector = :notifieDirector"),
    @NamedQuery(name = "Agence.findByMaxNomsSms", query = "SELECT a FROM Agence a WHERE a.maxNomsSms = :maxNomsSms"),
    @NamedQuery(name = "Agence.findBySoldeText", query = "SELECT a FROM Agence a WHERE a.soldeText = :soldeText"),
    @NamedQuery(name = "Agence.findByServeursms", query = "SELECT a FROM Agence a WHERE a.serveursms = :serveursms")})
public class Agence implements Serializable {
    @Lob
    @Column(name = "logo")
    private byte[] logo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agence")
    private List<Mutation> mutationList;
    private static final long serialVersionUID = 1L;
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
    @Size(min = 1, max = 100)
    @Column(name = "nomagence")
    private String nomagence;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "telephone")
    private String telephone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "telephoneDirector")
    private String telephoneDirector;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "codeabreger")
    private String codeabreger;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "adresse")
    private String adresse;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "messagefactureA")
    private String messagefactureA;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "messagefactureB")
    private String messagefactureB;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "fraisretablissement")
    private String fraisretablissement;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "libelleQuittance")
    private String libelleQuittance;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modeleQuittance")
    private int modeleQuittance;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ville")
    private String ville;
    @Size(max = 45)
    @Column(name = "usersms")
    private String usersms;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "passwordsms")
    private String passwordsms;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "sender")
    private String sender;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "accuse")
    private String accuse;
    @Basic(optional = false)
    @NotNull
    @Column(name = "signersms")
    private boolean signersms;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "signaturesms")
    private String signaturesms;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "useremail")
    private String useremail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "passwordemail")
    private String passwordemail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "serveurmail")
    private String serveurmail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "portserveurmail")
    private String portserveurmail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "positionsignaturesms")
    private String positionsignaturesms;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "messagefactureC")
    private String messagefactureC;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "messagefactureD")
    private String messagefactureD;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "heureouverture")
    private String heureouverture;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "heurefermeture")
    private String heurefermeture;
    @Basic(optional = false)
    @NotNull
    @Column(name = "notifiepaiement")
    private boolean notifiepaiement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "gestioncarnet")
    private boolean gestioncarnet;
    @Basic(optional = false)
    @NotNull
    @Column(name = "delaipaiement")
    private int delaipaiement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nombrecharcodeabonne")
    private int nombrecharcodeabonne;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codeabonneauto")
    private boolean codeabonneauto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prioriteminsms")
    private int prioriteminsms;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prioriteagence")
    private int prioriteagence;
    @Basic(optional = false)
    @NotNull
    @Column(name = "delaisaisie")
    private int delaisaisie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "noms_text")
    private String nomsText;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "mensualite_text")
    private String mensualiteText;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "codeabonne_text")
    private String codeabonneText;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "deadline_text")
    private String deadlineText;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "month_text")
    private String monthText;
    @Basic(optional = false)
    @NotNull
    @Column(name = "notifie_director")
    private boolean notifieDirector;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_noms_sms")
    private int maxNomsSms;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "solde_text")
    private String soldeText;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "serveursms")
    private String serveursms;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agence")
    private List<Facture> factureList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agence")
    private List<Panne> panneList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agence")
    private List<Abonne> abonneList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agence")
    private List<Caisse> caisseList;
    @OneToMany(mappedBy = "agence")
    private List<Quartier> quartierList;

    public Agence() {
    }

    public Agence(Integer id) {
        this.id = id;
    }

    public Agence(Integer id, int version, String nomagence, String telephone, String telephoneDirector, String codeabreger, String adresse, String messagefactureA, String messagefactureB, String fraisretablissement, String libelleQuittance, int modeleQuittance, String ville, String passwordsms, String sender, String accuse, boolean signersms, String signaturesms, String useremail, String passwordemail, String serveurmail, String portserveurmail, String positionsignaturesms, String messagefactureC, String messagefactureD, String heureouverture, String heurefermeture, boolean notifiepaiement, boolean gestioncarnet, int delaipaiement, int nombrecharcodeabonne, boolean codeabonneauto, int prioriteminsms, int prioriteagence, int delaisaisie, String nomsText, String mensualiteText, String codeabonneText, String deadlineText, String monthText, boolean notifieDirector, int maxNomsSms, String soldeText, String serveursms) {
        this.id = id;
        this.version = version;
        this.nomagence = nomagence;
        this.telephone = telephone;
        this.telephoneDirector = telephoneDirector;
        this.codeabreger = codeabreger;
        this.adresse = adresse;
        this.messagefactureA = messagefactureA;
        this.messagefactureB = messagefactureB;
        this.fraisretablissement = fraisretablissement;
        this.libelleQuittance = libelleQuittance;
        this.modeleQuittance = modeleQuittance;
        this.ville = ville;
        this.passwordsms = passwordsms;
        this.sender = sender;
        this.accuse = accuse;
        this.signersms = signersms;
        this.signaturesms = signaturesms;
        this.useremail = useremail;
        this.passwordemail = passwordemail;
        this.serveurmail = serveurmail;
        this.portserveurmail = portserveurmail;
        this.positionsignaturesms = positionsignaturesms;
        this.messagefactureC = messagefactureC;
        this.messagefactureD = messagefactureD;
        this.heureouverture = heureouverture;
        this.heurefermeture = heurefermeture;
        this.notifiepaiement = notifiepaiement;
        this.gestioncarnet = gestioncarnet;
        this.delaipaiement = delaipaiement;
        this.nombrecharcodeabonne = nombrecharcodeabonne;
        this.codeabonneauto = codeabonneauto;
        this.prioriteminsms = prioriteminsms;
        this.prioriteagence = prioriteagence;
        this.delaisaisie = delaisaisie;
        this.nomsText = nomsText;
        this.mensualiteText = mensualiteText;
        this.codeabonneText = codeabonneText;
        this.deadlineText = deadlineText;
        this.monthText = monthText;
        this.notifieDirector = notifieDirector;
        this.maxNomsSms = maxNomsSms;
        this.soldeText = soldeText;
        this.serveursms = serveursms;
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

    public String getNomagence() {
        return nomagence;
    }

    public void setNomagence(String nomagence) {
        this.nomagence = nomagence;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephoneDirector() {
        return telephoneDirector;
    }

    public void setTelephoneDirector(String telephoneDirector) {
        this.telephoneDirector = telephoneDirector;
    }

    public String getCodeabreger() {
        return codeabreger;
    }

    public void setCodeabreger(String codeabreger) {
        this.codeabreger = codeabreger;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


    public String getMessagefactureA() {
        return messagefactureA;
    }

    public void setMessagefactureA(String messagefactureA) {
        this.messagefactureA = messagefactureA;
    }

    public String getMessagefactureB() {
        return messagefactureB;
    }

    public void setMessagefactureB(String messagefactureB) {
        this.messagefactureB = messagefactureB;
    }

    public String getFraisretablissement() {
        return fraisretablissement;
    }

    public void setFraisretablissement(String fraisretablissement) {
        this.fraisretablissement = fraisretablissement;
    }

    public String getLibelleQuittance() {
        return libelleQuittance;
    }

    public void setLibelleQuittance(String libelleQuittance) {
        this.libelleQuittance = libelleQuittance;
    }

    public int getModeleQuittance() {
        return modeleQuittance;
    }

    public void setModeleQuittance(int modeleQuittance) {
        this.modeleQuittance = modeleQuittance;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getUsersms() {
        return usersms;
    }

    public void setUsersms(String usersms) {
        this.usersms = usersms;
    }

    public String getPasswordsms() {
        return passwordsms;
    }

    public void setPasswordsms(String passwordsms) {
        this.passwordsms = passwordsms;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getAccuse() {
        return accuse;
    }

    public void setAccuse(String accuse) {
        this.accuse = accuse;
    }

    public boolean getSignersms() {
        return signersms;
    }

    public void setSignersms(boolean signersms) {
        this.signersms = signersms;
    }

    public String getSignaturesms() {
        return signaturesms;
    }

    public void setSignaturesms(String signaturesms) {
        this.signaturesms = signaturesms;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getPasswordemail() {
        return passwordemail;
    }

    public void setPasswordemail(String passwordemail) {
        this.passwordemail = passwordemail;
    }

    public String getServeurmail() {
        return serveurmail;
    }

    public void setServeurmail(String serveurmail) {
        this.serveurmail = serveurmail;
    }

    public String getPortserveurmail() {
        return portserveurmail;
    }

    public void setPortserveurmail(String portserveurmail) {
        this.portserveurmail = portserveurmail;
    }

    public String getPositionsignaturesms() {
        return positionsignaturesms;
    }

    public void setPositionsignaturesms(String positionsignaturesms) {
        this.positionsignaturesms = positionsignaturesms;
    }

    public String getMessagefactureC() {
        return messagefactureC;
    }

    public void setMessagefactureC(String messagefactureC) {
        this.messagefactureC = messagefactureC;
    }

    public String getMessagefactureD() {
        return messagefactureD;
    }

    public void setMessagefactureD(String messagefactureD) {
        this.messagefactureD = messagefactureD;
    }

    public String getHeureouverture() {
        return heureouverture;
    }

    public void setHeureouverture(String heureouverture) {
        this.heureouverture = heureouverture;
    }

    public String getHeurefermeture() {
        return heurefermeture;
    }

    public void setHeurefermeture(String heurefermeture) {
        this.heurefermeture = heurefermeture;
    }

    public boolean getNotifiepaiement() {
        return notifiepaiement;
    }

    public void setNotifiepaiement(boolean notifiepaiement) {
        this.notifiepaiement = notifiepaiement;
    }

    public boolean getGestioncarnet() {
        return gestioncarnet;
    }

    public void setGestioncarnet(boolean gestioncarnet) {
        this.gestioncarnet = gestioncarnet;
    }

    public int getDelaipaiement() {
        return delaipaiement;
    }

    public void setDelaipaiement(int delaipaiement) {
        this.delaipaiement = delaipaiement;
    }

    public int getNombrecharcodeabonne() {
        return nombrecharcodeabonne;
    }

    public void setNombrecharcodeabonne(int nombrecharcodeabonne) {
        this.nombrecharcodeabonne = nombrecharcodeabonne;
    }

    public boolean getCodeabonneauto() {
        return codeabonneauto;
    }

    public void setCodeabonneauto(boolean codeabonneauto) {
        this.codeabonneauto = codeabonneauto;
    }

    public int getPrioriteminsms() {
        return prioriteminsms;
    }

    public void setPrioriteminsms(int prioriteminsms) {
        this.prioriteminsms = prioriteminsms;
    }

    public int getPrioriteagence() {
        return prioriteagence;
    }

    public void setPrioriteagence(int prioriteagence) {
        this.prioriteagence = prioriteagence;
    }

    public int getDelaisaisie() {
        return delaisaisie;
    }

    public void setDelaisaisie(int delaisaisie) {
        this.delaisaisie = delaisaisie;
    }

    public String getNomsText() {
        return nomsText;
    }

    public void setNomsText(String nomsText) {
        this.nomsText = nomsText;
    }

    public String getMensualiteText() {
        return mensualiteText;
    }

    public void setMensualiteText(String mensualiteText) {
        this.mensualiteText = mensualiteText;
    }

    public String getCodeabonneText() {
        return codeabonneText;
    }

    public void setCodeabonneText(String codeabonneText) {
        this.codeabonneText = codeabonneText;
    }

    public String getDeadlineText() {
        return deadlineText;
    }

    public void setDeadlineText(String deadlineText) {
        this.deadlineText = deadlineText;
    }

    public String getMonthText() {
        return monthText;
    }

    public void setMonthText(String monthText) {
        this.monthText = monthText;
    }

    public boolean getNotifieDirector() {
        return notifieDirector;
    }

    public void setNotifieDirector(boolean notifieDirector) {
        this.notifieDirector = notifieDirector;
    }

    public int getMaxNomsSms() {
        return maxNomsSms;
    }

    public void setMaxNomsSms(int maxNomsSms) {
        this.maxNomsSms = maxNomsSms;
    }

    public String getSoldeText() {
        return soldeText;
    }

    public void setSoldeText(String soldeText) {
        this.soldeText = soldeText;
    }

    public String getServeursms() {
        return serveursms;
    }

    public void setServeursms(String serveursms) {
        this.serveursms = serveursms;
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

    @XmlTransient
    public List<Abonne> getAbonneList() {
        return abonneList;
    }

    public void setAbonneList(List<Abonne> abonneList) {
        this.abonneList = abonneList;
    }

    @XmlTransient
    public List<Caisse> getCaisseList() {
        return caisseList;
    }

    public void setCaisseList(List<Caisse> caisseList) {
        this.caisseList = caisseList;
    }

    @XmlTransient
    public List<Quartier> getQuartierList() {
        return quartierList;
    }

    public void setQuartierList(List<Quartier> quartierList) {
        this.quartierList = quartierList;
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
        if (!(object instanceof Agence)) {
            return false;
        }
        Agence other = (Agence) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Agence[ id=" + id + " ]";
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    @XmlTransient
    public List<Mutation> getMutationList() {
        return mutationList;
    }

    public void setMutationList(List<Mutation> mutationList) {
        this.mutationList = mutationList;
    }
    
}
