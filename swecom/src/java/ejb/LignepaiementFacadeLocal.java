/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejb;

import java.util.List;
import javax.ejb.Local;
import jpa.Facture;
import jpa.Lignepaiement;

/**
 *
 * @author skysofttech
 */
@Local
public interface LignepaiementFacadeLocal {

    void create(Lignepaiement lignepaiement);

    void edit(Lignepaiement lignepaiement);

    void remove(Lignepaiement lignepaiement);

    Lignepaiement find(Object id);

    List<Lignepaiement> findAll();

    List<Lignepaiement> findRange(int[] range);

    int count();
    
    List<Lignepaiement> findLinepaiemebtByfacture(Facture facture);
    
}
