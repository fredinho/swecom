/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejb;

import java.util.List;
import javax.ejb.Local;
import jpa.Caisse;

/**
 *
 * @author skysofttech
 */
@Local
public interface CaisseFacadeLocal {

    void create(Caisse caisse);

    void edit(Caisse caisse);

    void remove(Caisse caisse);

    Caisse find(Object id);

    List<Caisse> findAll();

    List<Caisse> findRange(int[] range);

    int count();
    
}
