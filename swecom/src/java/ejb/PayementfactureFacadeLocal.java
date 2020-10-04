/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejb;

import java.util.List;
import javax.ejb.Local;
import jpa.Payementfacture;

/**
 *
 * @author skysofttech
 */
@Local
public interface PayementfactureFacadeLocal {

    void create(Payementfacture payementfacture);

    void edit(Payementfacture payementfacture);

    void remove(Payementfacture payementfacture);

    Payementfacture find(Object id);

    List<Payementfacture> findAll();

    List<Payementfacture> findRange(int[] range);

    int count();
    
}
