/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejb;

import java.util.List;
import javax.ejb.Local;
import jpa.Mensualite;

/**
 *
 * @author skysofttech
 */
@Local
public interface MensualiteFacadeLocal {

    void create(Mensualite mensualite);

    void edit(Mensualite mensualite);

    void remove(Mensualite mensualite);

    Mensualite find(Object id);

    List<Mensualite> findAll();

    List<Mensualite> findRange(int[] range);

    int count();
    
}
