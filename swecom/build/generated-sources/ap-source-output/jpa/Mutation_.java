package jpa;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Abonne;
import jpa.Agence;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-04-09T11:32:10")
@StaticMetamodel(Mutation.class)
public class Mutation_ { 

    public static volatile SingularAttribute<Mutation, Integer> id;
    public static volatile SingularAttribute<Mutation, Abonne> abonne;
    public static volatile SingularAttribute<Mutation, String> mutation;
    public static volatile SingularAttribute<Mutation, Integer> soldemutation;
    public static volatile SingularAttribute<Mutation, String> motifmutation;
    public static volatile SingularAttribute<Mutation, String> numeromutation;
    public static volatile SingularAttribute<Mutation, Date> datemutation;
    public static volatile SingularAttribute<Mutation, String> agent;
    public static volatile SingularAttribute<Mutation, Agence> agence;
    public static volatile SingularAttribute<Mutation, String> technicien;
    public static volatile SingularAttribute<Mutation, Integer> version;

}