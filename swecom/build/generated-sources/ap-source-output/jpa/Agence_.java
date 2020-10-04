package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Abonne;
import jpa.Caisse;
import jpa.Facture;
import jpa.Mutation;
import jpa.Panne;
import jpa.Quartier;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-04-09T11:32:10")
@StaticMetamodel(Agence.class)
public class Agence_ { 

    public static volatile SingularAttribute<Agence, Boolean> codeabonneauto;
    public static volatile SingularAttribute<Agence, String> adresse;
    public static volatile SingularAttribute<Agence, String> fraisretablissement;
    public static volatile SingularAttribute<Agence, String> ville;
    public static volatile ListAttribute<Agence, Facture> factureList;
    public static volatile SingularAttribute<Agence, Integer> modeleQuittance;
    public static volatile ListAttribute<Agence, Panne> panneList;
    public static volatile SingularAttribute<Agence, String> telephoneDirector;
    public static volatile SingularAttribute<Agence, String> mensualiteText;
    public static volatile SingularAttribute<Agence, String> passwordemail;
    public static volatile SingularAttribute<Agence, String> sender;
    public static volatile SingularAttribute<Agence, Boolean> signersms;
    public static volatile SingularAttribute<Agence, Integer> delaipaiement;
    public static volatile SingularAttribute<Agence, String> codeabreger;
    public static volatile SingularAttribute<Agence, String> serveursms;
    public static volatile ListAttribute<Agence, Mutation> mutationList;
    public static volatile SingularAttribute<Agence, String> codeabonneText;
    public static volatile SingularAttribute<Agence, String> nomagence;
    public static volatile SingularAttribute<Agence, Integer> delaisaisie;
    public static volatile SingularAttribute<Agence, String> accuse;
    public static volatile SingularAttribute<Agence, String> messagefactureB;
    public static volatile SingularAttribute<Agence, String> messagefactureA;
    public static volatile SingularAttribute<Agence, String> messagefactureD;
    public static volatile SingularAttribute<Agence, String> messagefactureC;
    public static volatile SingularAttribute<Agence, String> serveurmail;
    public static volatile SingularAttribute<Agence, String> usersms;
    public static volatile ListAttribute<Agence, Abonne> abonneList;
    public static volatile SingularAttribute<Agence, Integer> nombrecharcodeabonne;
    public static volatile SingularAttribute<Agence, Boolean> notifiepaiement;
    public static volatile SingularAttribute<Agence, String> signaturesms;
    public static volatile SingularAttribute<Agence, String> libelleQuittance;
    public static volatile SingularAttribute<Agence, Boolean> gestioncarnet;
    public static volatile SingularAttribute<Agence, String> deadlineText;
    public static volatile SingularAttribute<Agence, Integer> maxNomsSms;
    public static volatile SingularAttribute<Agence, String> nomsText;
    public static volatile SingularAttribute<Agence, Integer> version;
    public static volatile SingularAttribute<Agence, Integer> id;
    public static volatile SingularAttribute<Agence, Integer> prioriteminsms;
    public static volatile SingularAttribute<Agence, String> heurefermeture;
    public static volatile SingularAttribute<Agence, Integer> prioriteagence;
    public static volatile SingularAttribute<Agence, String> positionsignaturesms;
    public static volatile SingularAttribute<Agence, String> heureouverture;
    public static volatile SingularAttribute<Agence, String> passwordsms;
    public static volatile SingularAttribute<Agence, byte[]> logo;
    public static volatile ListAttribute<Agence, Quartier> quartierList;
    public static volatile SingularAttribute<Agence, Boolean> notifieDirector;
    public static volatile SingularAttribute<Agence, String> monthText;
    public static volatile SingularAttribute<Agence, String> useremail;
    public static volatile ListAttribute<Agence, Caisse> caisseList;
    public static volatile SingularAttribute<Agence, String> soldeText;
    public static volatile SingularAttribute<Agence, String> telephone;
    public static volatile SingularAttribute<Agence, String> portserveurmail;

}