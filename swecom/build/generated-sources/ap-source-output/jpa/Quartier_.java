package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Agence;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-04-09T11:32:10")
@StaticMetamodel(Quartier.class)
public class Quartier_ { 

    public static volatile SingularAttribute<Quartier, Integer> id;
    public static volatile SingularAttribute<Quartier, String> nomquartier;
    public static volatile SingularAttribute<Quartier, Agence> agence;
    public static volatile SingularAttribute<Quartier, Integer> version;

}