/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejb;

import java.util.List;
import javax.ejb.Local;
import jpa.Abonne;
import jpa.Mutation;

/**
 *
 * @author skysofttech
 */
@Local
public interface MutationFacadeLocal {

    void create(Mutation mutation);

    void edit(Mutation mutation);

    void remove(Mutation mutation);

    Mutation find(Object id);

    List<Mutation> findAll();

    List<Mutation> findRange(int[] range);

    int count();
    
    List<Mutation> findbyabonne(Abonne abonne);
    
}
