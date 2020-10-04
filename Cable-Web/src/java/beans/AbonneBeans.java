/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import config.DataModel;
import ejb.AbonneFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import jpa.Abonne;

/**
 *
 * @author FREDINHO
 */
@ManagedBean
@RequestScoped
public class AbonneBeans implements Serializable{
      @EJB
    /**
     * Attributs
     */
    private AbonneFacadeLocal abonnelocal;
    
    private String abonne;
    private Abonne abonne1;
    private DataModel model;
    private List<Abonne> abonnelist;
    private int idagence;
    private int idmensualite;
    private int idzone;
    
    private String numabonne;
    private String nomabonne;
    private String prenomabonne;
    private String cni;
    private String adresse;
    private String profession;
    private String email;

    public AbonneBeans() {
    }

    public AbonneFacadeLocal getAbonnelocal() {
        return abonnelocal;
    }

    public void setAbonnelocal(AbonneFacadeLocal abonnelocal) {
        this.abonnelocal = abonnelocal;
    }

    public String getAbonne() {
        return abonne;
    }

    public void setAbonne(String abonne) {
        this.abonne = abonne;
    }

    public DataModel getModel() {
        return model;
    }

    public void setModel(DataModel model) {
        this.model = model;
    }

    public List<Abonne> getAbonnelist() {
        return abonnelist;
    }

    public void setAbonnelist(List<Abonne> abonnelist) {
        this.abonnelist = abonnelist;
    }

    public int getIdagence() {
        return idagence;
    }

    public void setIdagence(int idagence) {
        this.idagence = idagence;
    }

    public int getIdmensualite() {
        return idmensualite;
    }

    public void setIdmensualite(int idmensualite) {
        this.idmensualite = idmensualite;
    }

    public int getIdzone() {
        return idzone;
    }

    public void setIdzone(int idzone) {
        this.idzone = idzone;
    }

    public Abonne getAbonne1() {
        return abonne1;
    }

    public void setAbonne1(Abonne abonne1) {
        this.abonne1 = abonne1;
    }

    public String getNumabonne() {
        String abonneID = FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("numeroabonne").toString(); 
        Abonne ab = new Abonne();
        ab.setNumeroabonne(abonneID);
        String numabonne = ab.getNumeroabonne();
        return numabonne;
    }

    public void setNumabonne(String numabonne) {
        this.numabonne = numabonne;
    }

    public String getNomabonne() {
        String abonneID = FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("nom").toString(); 
        Abonne ab = new Abonne();
        ab.setNom(abonneID);
        String nomabonne = ab.getNom();
        return nomabonne;
    }

    public void setNomabonne(String nomabonne) {
        this.nomabonne = nomabonne;
    }

    public String getPrenomabonne() {
        String abonneID = FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("prenom").toString(); 
        Abonne ab = new Abonne();
        ab.setPrenom(abonneID);
        String prenomabonne = ab.getPrenom();
        return prenomabonne;
    }

    public void setPrenomabonne(String prenomabonne) {
        this.prenomabonne = prenomabonne;
    }

    public String getCni() {
        String abonneID = FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("cni").toString(); 
        Abonne ab = new Abonne();
        ab.setCni(abonneID);
        String cni = ab.getCni();
        return cni;
    }

    public void setCni(String cni) {
        this.cni = cni;
    }

    public String getAdresse() {
        String abonneID = FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("adresse").toString(); 
        Abonne ab = new Abonne();
        ab.setAdresse(abonneID);
        String adresse = ab.getAdresse();
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getProfession() {
        String abonneID = FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("profession").toString(); 
        Abonne ab = new Abonne();
        ab.setProfession(abonneID);
        String profession = ab.getProfession();
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEmail() {
        String abonneID = FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("email").toString(); 
        Abonne ab = new Abonne();
        ab.setEmail(abonneID);
        String email = ab.getEmail();
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    

}
