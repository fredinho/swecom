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
import jpa.Facture;
import jpa.Lignepaiement;

/**
 *
 * @author skysofttech
 */
@Stateful
public class LignepaiementFacade extends AbstractFacade<Lignepaiement> implements LignepaiementFacadeLocal {
    @PersistenceContext(type =PersistenceContextType.EXTENDED, unitName = "swecomPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LignepaiementFacade() {
        super(Lignepaiement.class);
    }
    
    @Override
    public List<Lignepaiement> findLinepaiemebtByfacture(Facture facture){
        return getEntityManager().createQuery("SELECT t from Lignepaiement t WHERE t.facture = ?1").setParameter(1, facture).getResultList();
    }
}
