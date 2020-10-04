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
import jpa.Mutation;

/**
 *
 * @author skysofttech
 */
@Stateful
public class MutationFacade extends AbstractFacade<Mutation> implements MutationFacadeLocal {
    @PersistenceContext(type =PersistenceContextType.EXTENDED, unitName = "swecomPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MutationFacade() {
        super(Mutation.class);
    }
    
    @Override
    public List<Mutation> findbyabonne(Abonne abonne){
        return getEntityManager().createNamedQuery("Mutation.findByAbonne").setParameter("abonne", abonne).getResultList();
    }
    
}
