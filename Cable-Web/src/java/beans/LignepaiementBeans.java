/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import config.DataModel;
import ejb.AbonneFacadeLocal;
import ejb.FactureFacadeLocal;
import ejb.LignepaiementFacadeLocal;
import ejb.PayementfactureFacadeLocal;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import jpa.Abonne;
import jpa.Facture;
import jpa.Lignepaiement;
import jpa.Payementfacture;

/**
 *
 * @author FREDINHO
 */
@ManagedBean
@RequestScoped
public class LignepaiementBeans implements Serializable{
    /**
     * Attributs
     */
    @EJB
    private LignepaiementFacadeLocal lignepaiementlocal;
    @EJB
    private FactureFacadeLocal facturelocal;
    @EJB
    private PayementfactureFacadeLocal payementlocal;
    @EJB
    private AbonneFacadeLocal abonnelocal;
    private Lignepaiement lignepaiement1;
    private String lignepaiement;
    private DataModel model;
    private List<Lignepaiement> lignepaiementlist;
    private int idfacture;
    private int idpayement;

    public LignepaiementBeans() {
    }

    public LignepaiementFacadeLocal getLignepaiementlocal() {
        return lignepaiementlocal;
    }

    public void setLignepaiementlocal(LignepaiementFacadeLocal lignepaiementlocal) {
        this.lignepaiementlocal = lignepaiementlocal;
    }

    public Lignepaiement getLignepaiement1() {
        return lignepaiement1;
    }

    public void setLignepaiement1(Lignepaiement lignepaiement1) {
        this.lignepaiement1 = lignepaiement1;
    }

    public String getLignepaiement() {
        return lignepaiement;
    }

    public void setLignepaiement(String lignepaiement) {
        this.lignepaiement = lignepaiement;
    }

    public DataModel getModel() {
        return model;
    }

    public void setModel(DataModel model) {
        this.model = model;
    }

    public List<Lignepaiement> getLignepaiementlist() {
        return lignepaiementlist;
    }

    public void setLignepaiementlist(List<Lignepaiement> lignepaiementlist) {
        this.lignepaiementlist = lignepaiementlist;
    }

    public int getIdfacture() {
        return idfacture;
    }

    public void setIdfacture(int idfacture) {
        this.idfacture = idfacture;
    }

    public int getIdpayement() {
        return idpayement;
    }

    public void setIdpayement(int idpayement) {
        this.idpayement = idpayement;
    }

    public AbonneFacadeLocal getAbonnelocal() {
        return abonnelocal;
    }

    public void setAbonnelocal(AbonneFacadeLocal abonnelocal) {
        this.abonnelocal = abonnelocal;
    }

    public FactureFacadeLocal getFacturelocal() {
        return facturelocal;
    }

    public void setFacturelocal(FactureFacadeLocal facturelocal) {
        this.facturelocal = facturelocal;
    }

    public PayementfactureFacadeLocal getPayementlocal() {
        return payementlocal;
    }

    public void setPayementlocal(PayementfactureFacadeLocal payementlocal) {
        this.payementlocal = payementlocal;
    }
    
    
    
    public void someFactureHistorisque(){
        List<Lignepaiement> list = new ArrayList<>();
        
        Abonne ab = new Abonne();
        int abonneID = Integer.parseInt(FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("abonne").toString());
	       System.out.println(abonneID);	
        int size = getAbonnelocal().count();
        System.out.println(size);
        
        ab = getAbonnelocal().find(abonneID);
//         ab.setId(abonneID);
                
        List<Facture> istOfFacture =  getFacturelocal().findbyabonnerestant(ab, Boolean.TRUE);
        System.out.println(istOfFacture);
        
        for(Facture facture: istOfFacture){
            List<Lignepaiement> lstOfPaiement = getLignepaiementlocal().findLinepaiemebtByfacture(facture);
            System.out.println(lstOfPaiement);
            if(!lstOfPaiement.isEmpty()){
                list.addAll(lstOfPaiement);
            }
        }
        
        setLignepaiementlist(list);
        
    }

}
