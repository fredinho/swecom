/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import config.DataModel;
import ejb.MutationFacadeLocal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import jpa.Abonne;
import jpa.Mutation;

/**
 *
 * @author FREDINHO
 */
@ManagedBean
@RequestScoped
public class MutationBeans {
    
    @EJB
    public MutationFacadeLocal mutationlocal;
    private Mutation mutation1;
    private String panne;
    private DataModel model;
    private List<Mutation> mutationlist;
    private int idagence;
    private int idabonne;

    public MutationBeans() {
    }

    public MutationFacadeLocal getMutationlocal() {
        return mutationlocal;
    }

    public void setMutationlocal(MutationFacadeLocal mutationlocal) {
        this.mutationlocal = mutationlocal;
    }

    public Mutation getMutation1() {
        return mutation1;
    }

    public void setMutation1(Mutation mutation1) {
        this.mutation1 = mutation1;
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

    public List<Mutation> getMutationlist() {
        return mutationlist;
    }

    public void setMutationlist(List<Mutation> mutationlist) {
        this.mutationlist = mutationlist;
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
    
    
    
    public void somemutation(){
        mutationlist = new ArrayList<Mutation>();
        model = new DataModel(mutationlist);
        int abonneID = Integer.parseInt(FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("abonne").toString()); 
	 Abonne ab = new Abonne();
         ab.setId(abonneID);
        System.out.println(ab);
        List<Mutation> lf =  getMutationlocal().findbyabonne(ab);
        System.out.println(lf);
        for (Mutation lf1 : lf) {
             getMutationlist().add(lf1); 
        }
    }
}
