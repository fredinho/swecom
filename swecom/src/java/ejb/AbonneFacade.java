/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejb;

import java.util.List;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import jpa.Abonne;

/**
 *
 * @author skysofttech
 */
@Stateful
public class AbonneFacade extends AbstractFacade<Abonne> implements AbonneFacadeLocal {
    @PersistenceContext(type =PersistenceContextType.EXTENDED, unitName = "swecomPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AbonneFacade() {
        super(Abonne.class);
    }
    
    @Override
    public List<Abonne> connexion(Object numeroabonne, Object password){
        return getEntityManager().createNamedQuery("Abonne.findByConnection").
                setParameter("numeroabonne",numeroabonne).
                setParameter("password",password).
                getResultList();
    }
    
}
