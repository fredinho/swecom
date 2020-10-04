package jpa;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Agence;
import jpa.Payementfacture;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-04-09T11:32:10")
@StaticMetamodel(Caisse.class)
public class Caisse_ { 

    public static volatile SingularAttribute<Caisse, Date> datefermeture;
    public static volatile SingularAttribute<Caisse, Integer> montantmtnmoney;
    public static volatile SingularAttribute<Caisse, String> codeutilisateur;
    public static volatile SingularAttribute<Caisse, Date> dateouverture;
    public static volatile SingularAttribute<Caisse, Integer> montantcheque;
    public static volatile SingularAttribute<Caisse, Integer> montantespeces;
    public static volatile SingularAttribute<Caisse, String> machine;
    public static volatile SingularAttribute<Caisse, Agence> agence;
    public static volatile SingularAttribute<Caisse, Integer> version;
    public static volatile SingularAttribute<Caisse, Integer> id;
    public static volatile SingularAttribute<Caisse, Boolean> etat;
    public static volatile SingularAttribute<Caisse, Integer> totalcaisse;
    public static volatile SingularAttribute<Caisse, Integer> montantorangemoney;
    public static volatile SingularAttribute<Caisse, Integer> encaissement;
    public static volatile SingularAttribute<Caisse, String> ipmachine;
    public static volatile SingularAttribute<Caisse, String> codecaisse;
    public static volatile ListAttribute<Caisse, Payementfacture> payementfactureList;
    public static volatile SingularAttribute<Caisse, Integer> decaissement;
    public static volatile SingularAttribute<Caisse, Integer> montantcarte;

}