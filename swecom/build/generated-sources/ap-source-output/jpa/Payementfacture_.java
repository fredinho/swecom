package jpa;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Caisse;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-04-09T11:32:10")
@StaticMetamodel(Payementfacture.class)
public class Payementfacture_ { 

    public static volatile SingularAttribute<Payementfacture, String> codeutilisateur;
    public static volatile SingularAttribute<Payementfacture, String> montantLettre;
    public static volatile SingularAttribute<Payementfacture, String> observation;
    public static volatile SingularAttribute<Payementfacture, Integer> montant;
    public static volatile SingularAttribute<Payementfacture, String> modepaiement;
    public static volatile SingularAttribute<Payementfacture, Integer> abonne;
    public static volatile SingularAttribute<Payementfacture, Integer> idCarnet;
    public static volatile SingularAttribute<Payementfacture, Date> datepaiement;
    public static volatile SingularAttribute<Payementfacture, Integer> agence;
    public static volatile SingularAttribute<Payementfacture, String> numeropaiement;
    public static volatile SingularAttribute<Payementfacture, String> numRecuPaiement;
    public static volatile SingularAttribute<Payementfacture, Integer> version;
    public static volatile SingularAttribute<Payementfacture, Integer> id;
    public static volatile SingularAttribute<Payementfacture, Date> datesaisie;
    public static volatile SingularAttribute<Payementfacture, String> typepaiement;
    public static volatile SingularAttribute<Payementfacture, Caisse> caisse;
    public static volatile SingularAttribute<Payementfacture, Integer> commercial;

}