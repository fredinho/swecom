package jpa;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Abonne;
import jpa.Agence;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-04-09T11:32:10")
@StaticMetamodel(Facture.class)
public class Facture_ { 

    public static volatile SingularAttribute<Facture, Integer> priorite;
    public static volatile SingularAttribute<Facture, String> observation;
    public static volatile SingularAttribute<Facture, Integer> montant;
    public static volatile SingularAttribute<Facture, String> libelle;
    public static volatile SingularAttribute<Facture, Abonne> abonne;
    public static volatile SingularAttribute<Facture, Integer> avance;
    public static volatile SingularAttribute<Facture, String> moisabreger;
    public static volatile SingularAttribute<Facture, Agence> agence;
    public static volatile SingularAttribute<Facture, Integer> indexmois;
    public static volatile SingularAttribute<Facture, Integer> annee;
    public static volatile SingularAttribute<Facture, Integer> version;
    public static volatile SingularAttribute<Facture, Integer> id;
    public static volatile SingularAttribute<Facture, Integer> montantaffiche;
    public static volatile SingularAttribute<Facture, Date> datelimitepaiement;
    public static volatile SingularAttribute<Facture, Boolean> solder;
    public static volatile SingularAttribute<Facture, Integer> typefacture;
    public static volatile SingularAttribute<Facture, String> mois;
    public static volatile SingularAttribute<Facture, Integer> duree;
    public static volatile SingularAttribute<Facture, Integer> reduction;
    public static volatile SingularAttribute<Facture, Date> datefacturation;
    public static volatile SingularAttribute<Facture, Boolean> consommer;
    public static volatile SingularAttribute<Facture, String> numeroFacture;
    public static volatile SingularAttribute<Facture, Integer> penalite;
    public static volatile SingularAttribute<Facture, Boolean> gratuit;

}