/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import config.DataModel;
import ejb.AgenceFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import jpa.Agence;

/**
 *
 * @author FREDINHO
 */
@ManagedBean
@RequestScoped
public class AgenceBeans implements Serializable{
      @EJB
    /**
     * Attributs
     */
    private AgenceFacadeLocal agencelocal;
    private Agence agence1;
    private String agence;
    private DataModel model;
    private List<Agence> agencelist;

    public AgenceBeans() {
    }

    public AgenceFacadeLocal getAgencelocal() {
        return agencelocal;
    }

    public void setAgencelocal(AgenceFacadeLocal agencelocal) {
        this.agencelocal = agencelocal;
    }

    public Agence getAgence1() {
        return agence1;
    }

    public void setAgence1(Agence agence1) {
        this.agence1 = agence1;
    }

    public String getAgence() {
        return agence;
    }

    public void setAgence(String agence) {
        this.agence = agence;
    }

    public DataModel getModel() {
        return model;
    }

    public void setModel(DataModel model) {
        this.model = model;
    }

    public List<Agence> getAgencelist() {
        return agencelist;
    }

    public void setAgencelist(List<Agence> agencelist) {
        this.agencelist = agencelist;
    }
    
    

}
