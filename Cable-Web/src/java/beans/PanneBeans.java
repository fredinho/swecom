/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import config.DataModel;
import ejb.PanneFacadeLocal;
import static java.lang.Boolean.TRUE;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import jpa.Abonne;
import jpa.Panne;

/**
 *
 * @author skysofttech
 */
@ManagedBean
@RequestScoped
public class PanneBeans {

    @EJB
    public PanneFacadeLocal pannelocal;
    private Panne panne1;
    private String panne;
    private DataModel model;
    private List<Panne> pannelist;
    private int idagence;
    private int idabonne;
    private String statut;

    public PanneBeans() {
    }

    public PanneFacadeLocal getPannelocal() {
        return pannelocal;
    }

    public void setPannelocal(PanneFacadeLocal pannelocal) {
        this.pannelocal = pannelocal;
    }

    public Panne getPanne1() {
        return panne1;
    }

    public void setPanne1(Panne panne1) {
        this.panne1 = panne1;
    }

    public String getPanne() {
        return panne;
    }

    public void setPanne(String panne) {
        this.panne = panne;
    }

    public DataModel getModel() {
        return model;
    }

    public void setModel(DataModel model) {
        this.model = model;
    }

    public List<Panne> getPannelist() {
        return pannelist;
    }

    public void setPannelist(List<Panne> pannelist) {
        this.pannelist = pannelist;
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

    public String getStatut() {
        int abonneID = Integer.parseInt(FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("abonne").toString()); 
	 Abonne ab = new Abonne();
         ab.setId(abonneID);
        
        List<Panne> lf =  getPannelocal().findbyabonne(ab);
        for(Panne lf2:lf){
            Boolean sold = lf2.getReparee();
            
            if(sold == TRUE){
                statut = "REPAREE";
                
            }else{
                statut = "EN COURS";
                
            }
        }
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
    
    
    
    public void somepanne(){
        pannelist = new ArrayList<Panne>();
        model = new DataModel(pannelist);
        int abonneID = Integer.parseInt(FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("abonne").toString()); 
	 Abonne ab = new Abonne();
         ab.setId(abonneID);
        System.out.println(ab);
        List<Panne> lf =  getPannelocal().findbyabonne(ab);
        System.out.println(lf);
        for (Panne lf1 : lf) {
             getPannelist().add(lf1); 
        }
    }
}
