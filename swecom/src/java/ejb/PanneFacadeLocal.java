/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejb;

import java.util.List;
import javax.ejb.Local;
import jpa.Abonne;
import jpa.Panne;

/**
 *
 * @author skysofttech
 */
@Local
public interface PanneFacadeLocal {

    void create(Panne panne);

    void edit(Panne panne);

    void remove(Panne panne);

    Panne find(Object id);

    List<Panne> findAll();

    List<Panne> findRange(int[] range);

    int count();
    
    List<Panne> findbyabonne(Abonne abonne);
    
}
