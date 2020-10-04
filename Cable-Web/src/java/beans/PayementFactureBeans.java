/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import config.DataModel;
import ejb.PayementfactureFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import jpa.Payementfacture;

/**
 *
 * @author FREDINHO
 */
@ManagedBean
@RequestScoped
public class PayementFactureBeans implements Serializable{
     @EJB
    /**
     * Attributs
     */
    private PayementfactureFacadeLocal payefacturelocal;
    private Payementfacture payementfacture1;
    private String payementfacture;
    private DataModel model;
    private List<Payementfacture> payementfacturelist;

    public PayementFactureBeans() {
    }

    public PayementfactureFacadeLocal getPayefacturelocal() {
        return payefacturelocal;
    }

    public void setPayefacturelocal(PayementfactureFacadeLocal payefacturelocal) {
        this.payefacturelocal = payefacturelocal;
    }

    public Payementfacture getPayementfacture1() {
        return payementfacture1;
    }

    public void setPayementfacture1(Payementfacture payementfacture1) {
        this.payementfacture1 = payementfacture1;
    }

    public String getPayementfacture() {
        return payementfacture;
    }

    public void setPayementfacture(String payementfacture) {
        this.payementfacture = payementfacture;
    }

    public DataModel getModel() {
        return model;
    }

    public void setModel(DataModel model) {
        this.model = model;
    }

    public List<Payementfacture> getPayementfacturelist() {
        return payementfacturelist;
    }

    public void setPayementfacturelist(List<Payementfacture> payementfacturelist) {
        this.payementfacturelist = payementfacturelist;
    }
    
    
}
