package jpa;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-04-09T11:32:10")
@StaticMetamodel(Mensualite.class)
public class Mensualite_ { 

    public static volatile SingularAttribute<Mensualite, Integer> id;
    public static volatile SingularAttribute<Mensualite, Integer> montantaffiche;
    public static volatile SingularAttribute<Mensualite, Date> datecreation;
    public static volatile SingularAttribute<Mensualite, Integer> montant;
    public static volatile SingularAttribute<Mensualite, String> libelle;
    public static volatile SingularAttribute<Mensualite, Integer> agence;

}