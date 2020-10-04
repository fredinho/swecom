package jpa;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Abonne;
import jpa.Agence;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-04-09T11:32:10")
@StaticMetamodel(Panne.class)
public class Panne_ { 

    public static volatile SingularAttribute<Panne, String> numeropanne;
    public static volatile SingularAttribute<Panne, Date> datedeclaration;
    public static volatile SingularAttribute<Panne, Integer> priorite;
    public static volatile SingularAttribute<Panne, String> codeutilisateur;
    public static volatile SingularAttribute<Panne, String> lieu;
    public static volatile SingularAttribute<Panne, String> libelle;
    public static volatile SingularAttribute<Panne, Abonne> abonne;
    public static volatile SingularAttribute<Panne, Agence> agence;
    public static volatile SingularAttribute<Panne, Integer> version;
    public static volatile SingularAttribute<Panne, Integer> id;
    public static volatile SingularAttribute<Panne, Boolean> reparee;
    public static volatile SingularAttribute<Panne, Date> datereparation;
    public static volatile SingularAttribute<Panne, Integer> famille;

}