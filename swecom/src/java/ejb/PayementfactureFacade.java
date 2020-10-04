/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejb;

import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import jpa.Payementfacture;

/**
 *
 * @author skysofttech
 */
@Stateful
public class PayementfactureFacade extends AbstractFacade<Payementfacture> implements PayementfactureFacadeLocal {
    @PersistenceContext(type =PersistenceContextType.EXTENDED, unitName = "swecomPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PayementfactureFacade() {
        super(Payementfacture.class);
    }
    
}
