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
import jpa.Facture;

/**
 *
 * @author skysofttech
 */
@Stateful
public class FactureFacade extends AbstractFacade<Facture> implements FactureFacadeLocal {
    @PersistenceContext(type =PersistenceContextType.EXTENDED, unitName = "swecomPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FactureFacade() {
        super(Facture.class);
    }
    
    @Override
    public List<Facture> findbyabonne(Abonne abonne){
        return getEntityManager().createNamedQuery("Facture.findByAbonne1").setParameter("abonne", abonne).getResultList();
    }
    
    
    @Override
    public List<Facture> findbyabonnerestant(Abonne abonne, Boolean solder){
        return getEntityManager().createNamedQuery("Facture.findByFactureimpayes").setParameter("abonne", abonne).setParameter("solder", solder).getResultList();
    }
    
}
