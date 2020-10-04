/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import config.DataModel;
import ejb.QuartierFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import jpa.Quartier;

/**
 *
 * @author FREDINHO
 */
@ManagedBean
@RequestScoped
public class QuartierBeans  implements Serializable{
     @EJB
    /**
     * Attributs
     */
    private QuartierFacadeLocal quartierlocal;
    private Quartier quartiers;
    private String quartier;
    private DataModel model;
    private List<Quartier> quartierlist;
    private int idagence;

    public QuartierBeans() {
    }

    public QuartierFacadeLocal getQuartierlocal() {
        return quartierlocal;
    }

    public void setQuartierlocal(QuartierFacadeLocal quartierlocal) {
        this.quartierlocal = quartierlocal;
    }

    public Quartier getQuartiers() {
        return quartiers;
    }

    public void setQuartiers(Quartier quartiers) {
        this.quartiers = quartiers;
    }

    public String getQuartier() {
        return quartier;
    }

    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    public DataModel getModel() {
        return model;
    }

    public void setModel(DataModel model) {
        this.model = model;
    }

    public List<Quartier> getQuartierlist() {
        return quartierlist;
    }

    public void setQuartierlist(List<Quartier> quartierlist) {
        this.quartierlist = quartierlist;
    }

    public int getIdagence() {
        return idagence;
    }

    public void setIdagence(int idagence) {
        this.idagence = idagence;
    }
    
    
}
