/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejb;

import java.util.List;
import javax.ejb.Local;
import jpa.Zone;

/**
 *
 * @author skysofttech
 */
@Local
public interface ZoneFacadeLocal {

    void create(Zone zone);

    void edit(Zone zone);

    void remove(Zone zone);

    Zone find(Object id);

    List<Zone> findAll();

    List<Zone> findRange(int[] range);

    int count();
    
}
