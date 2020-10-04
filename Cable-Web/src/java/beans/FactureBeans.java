/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import config.DataModel;
import ejb.AbonneFacadeLocal;
import ejb.FactureFacadeLocal;
import java.io.Serializable;
import static java.lang.Boolean.TRUE;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import jpa.Abonne;
import jpa.Facture;
import jpa.Payementfacture;

/**
 *
 * @author FREDINHO
 */
@ManagedBean
@RequestScoped
public class FactureBeans implements Serializable{
    
    /**
     * Attributs
     */
    @EJB
    private FactureFacadeLocal facturelocal;
    @EJB
    private AbonneFacadeLocal abonnelocal;
    private Facture facture1;
    private String facture;
    private DataModel model;
    private List<Facture> facturelist;
    private List<Payementfacture> payementlist;
    private int idagence;
    private int idabonne;
    private int reste;
    private Abonne utilisateur;
    private int sometotalreste;
    private List<Facture> factureByRessource=new ArrayList<Facture>();
    
    
    
    
    public FactureBeans() {
    }
    
    

    public FactureFacadeLocal getFacturelocal() {
        return facturelocal;
    }

    public void setFacturelocal(FactureFacadeLocal facturelocal) {
        this.facturelocal = facturelocal;
    }

    public Facture getFacture1() {
        return facture1;
    }

    public void setFacture1(Facture facture1) {
        this.facture1 = facture1;
    }

    public String getFacture() {
        return facture;
    }

    public void setFacture(String facture) {
        this.facture = facture;
    }

    public DataModel getModel() {
        return model;
    }

    public void setModel(DataModel model) {
        this.model = model;
    }

    public List<Facture> getFacturelist() {
        return facturelist;
    }

    public void setFacturelist(List<Facture> facturelist) {
        this.facturelist = facturelist;
    }

    public int getIdagence() {
        return idagence;
    }

    public void setIdagence(int idagence) {
        this.idagence = idagence;
    }

    public int getIdabonne() {
        return idabonne;
    }

    public void setIdabonne(int idabonne) {
        this.idabonne = idabonne;
    }

    public AbonneFacadeLocal getAbonnelocal() {
        return abonnelocal;
    }

    public void setAbonnelocal(AbonneFacadeLocal abonnelocal) {
        this.abonnelocal = abonnelocal;
    }

    public int getReste() {
        return reste;
    }

    public void setReste(int reste) {
        this.reste = reste;
    }

    public List<Payementfacture> getPayementlist() {
        return payementlist;
    }

    public void setPayementlist(List<Payementfacture> payementlist) {
        this.payementlist = payementlist;
    }

    public Abonne getUtilisateur() {
        System.out.println(utilisateur);
        return utilisateur;
    }

    public void setUtilisateur(Abonne utilisateur) {
        this.utilisateur = utilisateur;
    }

    public List<Facture> getFactureByRessource() {
        factureByRessource=getFacturelocal().findbyabonne(utilisateur);
        
        return factureByRessource;
    }

    public void setFactureByRessource(List<Facture> factureByRessource) {
        this.factureByRessource = factureByRessource;
    }

    

     
    

    public int getSometotalreste() {
        int sometotalreste = 0;
        int reste1 = 0;
        facturelist = new ArrayList<Facture>();
        model = new DataModel(facturelist);
        int abonneID = Integer.parseInt(FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("abonne").toString()); 
	 Abonne ab = new Abonne();
         ab.setId(abonneID);
        System.out.println(ab);
        List<Facture> lf =  getFacturelocal().findbyabonne(ab);
        System.out.println(lf);
        for (Facture lf1 : lf) {
            reste1 = lf1.getMontantaffiche() - lf1.getAvance();
            sometotalreste =   sometotalreste + reste1;
        }
        return sometotalreste;
        
    }

    public void setSometotalreste(int sometotalreste) {
        this.sometotalreste = sometotalreste;
    }
    
   

  

    
    
    
    
    
     
    
//    public void allfacture(){
//        facturelist = new ArrayList<Facture>();
//        List<Facture> faclist = getFacturelocal().findbyabonne(FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("abonne").getClass());
//        for(Facture f : faclist){
//            getFacturelist().add(f);
//        }
//    }
    
    
//    public void allfactureimpaye(){
//        int ab = Integer.parseInt(FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("abonne").toString());
//        int sol = 1;
//        List<Facture> listfac = getFacturelocal().findbyabonnerestant(ab, sol);
//        facturelist = new ArrayList<Facture>();
//        for(Facture f : listfac){
//            getFacturelist().add(f);
//        }
//    }
    
//    public void somefacture(){
////        facturelist = new ArrayList<Facture>();
////        model = new DataModel(facturelist);
////        int abonneID = Integer.parseInt(FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("abonne").toString()); 
//	 
//        
//        List<Facture> lf =  getFacturelocal().findbyabonne(utilisateur);
//        System.out.println(lf);
//        for (Facture lf1 : lf) {
//             getFacturelist().add(lf1); 
//        }
//    }
    
    public void somefactureimpayes(){
        facturelist = new ArrayList<Facture>();
        model = new DataModel(facturelist);
        int abonneID = Integer.parseInt(FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("abonne").toString()); 
	 Abonne ab = new Abonne();
         ab.setId(abonneID);
        System.out.println(ab);
        List<Facture> lf =  getFacturelocal().findbyabonne(ab);
        System.out.println(lf);
        for (Facture lf1 : lf) {
            if(lf1.getSolder() == false){
               getFacturelist().add(lf1); 
            }
              
        }
    }    
}
