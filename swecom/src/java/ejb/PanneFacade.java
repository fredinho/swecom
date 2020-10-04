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
import jpa.Panne;

/**
 *
 * @author skysofttech
 */
@Stateful
public class PanneFacade extends AbstractFacade<Panne> implements PanneFacadeLocal {
    @PersistenceContext(type =PersistenceContextType.EXTENDED, unitName = "swecomPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PanneFacade() {
        super(Panne.class);
    }
    
    @Override
    public List<Panne> findbyabonne(Abonne abonne){
        return getEntityManager().createNamedQuery("Panne.findByAbonne").setParameter("abonne", abonne).getResultList();
    }
    
}
