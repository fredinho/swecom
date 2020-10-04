/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejb;

import java.util.List;
import javax.ejb.Local;
import jpa.Abonne;
import jpa.Facture;

/**
 *
 * @author skysofttech
 */
@Local
public interface FactureFacadeLocal {

    void create(Facture facture);

    void edit(Facture facture);

    void remove(Facture facture);

    Facture find(Object id);

    List<Facture> findAll();

    List<Facture> findRange(int[] range);

    int count();
    
    List<Facture> findbyabonne(Abonne abonne);
    
    List<Facture> findbyabonnerestant(Abonne abonne, Boolean solder);
    
}
