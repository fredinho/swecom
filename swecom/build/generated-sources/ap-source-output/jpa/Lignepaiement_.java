package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Facture;
import jpa.Payementfacture;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-04-09T11:32:10")
@StaticMetamodel(Lignepaiement.class)
public class Lignepaiement_ { 

    public static volatile SingularAttribute<Lignepaiement, Integer> id;
    public static volatile SingularAttribute<Lignepaiement, Facture> facture;
    public static volatile SingularAttribute<Lignepaiement, String> periode;
    public static volatile SingularAttribute<Lignepaiement, Integer> montantquittance;
    public static volatile SingularAttribute<Lignepaiement, Payementfacture> paiement;
    public static volatile SingularAttribute<Lignepaiement, Integer> indexligne;
    public static volatile SingularAttribute<Lignepaiement, Integer> typefacture;
    public static volatile SingularAttribute<Lignepaiement, String> libellefacture;
    public static volatile SingularAttribute<Lignepaiement, Integer> montantpaiement;
    public static volatile SingularAttribute<Lignepaiement, Integer> version;

}