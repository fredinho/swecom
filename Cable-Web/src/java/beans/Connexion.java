/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import ejb.AbonneFacadeLocal;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import jpa.Abonne;
import jpa.Agence;
import jpa.Mensualite;
import jpa.Zone;

/**
 *
 * @author FREDINHO
 */
@ManagedBean
@SessionScoped
public class Connexion implements Serializable {

    @EJB
    private AbonneFacadeLocal abonneLocal;
    private List<Abonne> abonne;

    private String numeroabonne;
    private String password;
    private String password1;
    private Abonne utilisateur=new Abonne();
    private Abonne user =new Abonne();
    private int id;
    private String nomAbonne;
    private String pnomAbonne;
    private String emailAbonne;
    private String emailconfirm;
    private String emailnouveau;
    private String profAbonne;
    private String cni;
    private String periodicite;
    private Mensualite idmensualite;
    private String adresse;
    private Zone idzone;
    private Agence idagence;
    private String newPassword;
    private String newPasswordConfirmation;
    private String tel;

    private Date datjr = new Date();

//    @Resource(name="jdbc/swecom")
//    private DataSource dataSource;
    /**
     * Constructor
     */
    public Connexion() {
    }

    public AbonneFacadeLocal getAbonneLocal() {
        return abonneLocal;
    }

    public void setAbonneLocal(AbonneFacadeLocal abonneLocal) {
        this.abonneLocal = abonneLocal;
    }

    public List<Abonne> getAbonne() {
        return abonne;
    }

    public void setAbonne(List<Abonne> abonne) {
        this.abonne = abonne;
    }

    public String getNumeroabonne() {
        return numeroabonne;
    }

    public void setNumeroabonne(String numeroabonne) {
        this.numeroabonne = numeroabonne;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomAbonne() {
        return nomAbonne;
    }

    public void setNomAbonne(String nomAbonne) {
        this.nomAbonne = nomAbonne;
    }

    public String getPnomAbonne() {
        return pnomAbonne;
    }

    public void setPnomAbonne(String pnomAbonne) {
        this.pnomAbonne = pnomAbonne;
    }

    public String getEmailAbonne() {
        return emailAbonne;
    }

    public void setEmailAbonne(String emailAbonne) {
        this.emailAbonne = emailAbonne;
    }

    public String getProfAbonne() {
        return profAbonne;
    }

    public void setProfAbonne(String profAbonne) {
        this.profAbonne = profAbonne;
    }

    public Agence getIdagence() {
        return idagence;
    }

    public void setIdagence(Agence idagence) {
        this.idagence = idagence;
    }

    public Date getDatjr() {
        return datjr;
    }

    public void setDatjr(Date datjr) {
        this.datjr = datjr;
    }

    public String getCni() {
        return cni;
    }

    public void setCni(String cni) {
        this.cni = cni;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Zone getIdzone() {
        return idzone;
    }

    public void setIdzone(Zone idzone) {
        this.idzone = idzone;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getNewPasswordConfirmation() {
        return newPasswordConfirmation;
    }

    public void setNewPasswordConfirmation(String newPasswordConfirmation) {
        this.newPasswordConfirmation = newPasswordConfirmation;
    }

    public String getEmailconfirm() {
        return emailconfirm;
    }

    public void setEmailconfirm(String emailconfirm) {
        this.emailconfirm = emailconfirm;
    }

    public String getEmailnouveau() {
        return emailnouveau;
    }

    public void setEmailnouveau(String emailnouveau) {
        this.emailnouveau = emailnouveau;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public Abonne getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Abonne utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getPeriodicite() {
        return periodicite;
    }

    public void setPeriodicite(String periodicite) {
        this.periodicite = periodicite;
    }

    public Mensualite getIdmensualite() {
        return idmensualite;
    }

    public void setIdmensualite(Mensualite idmensualite) {
        this.idmensualite = idmensualite;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Abonne getUser() {
        return user;
    }

    public void setUser(Abonne user) {
        this.user = user;
    }
    
    
    
    

    /**
     * Methods
     *
     * @throws IOException
     */
    public void connect() throws IOException {
        
//        FacesContext.getCurrentInstance().getExternalContext().getSession(true);

       List<Abonne> users = getAbonneLocal().connexion(getNumeroabonne(), getCryptedPassword(getPassword()));

        if (users.isEmpty()) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Connexion Echouée", "Parametre de connexion incorrecte."));
        } else {

            for (Abonne r: users) {
                utilisateur = r;
               
            }
            System.out.print("Bon "+ utilisateur.getId() );
              FacesContext.getCurrentInstance().getExternalContext().redirect("Abonne/facture-paiement.xhtml"); 
             
        }
    }

    private String getCryptedPassword(String notCryptedPassword) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ex) {
            //Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (md == null) {
            return notCryptedPassword;
        }

        md.update(notCryptedPassword.getBytes());

        byte input[] = md.digest();

        // Convert the byte variable to hexadecimal format
        StringBuilder hexaString = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            String hexaChar = Integer.toHexString(0xff & input[i]);
            if (hexaChar.length() == 1) {
                hexaString.append('0');
            }
            hexaString.append(hexaChar);
        }
        return hexaString.toString();
    }

    private Boolean isPasswordValid(String password) throws IOException {

        String dbCryptedPassword = FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("password").toString();

        String cryptedCurrentPassword = this.getCryptedPassword(password);
        if (cryptedCurrentPassword.equals(dbCryptedPassword)) {
            return true;
        } else {
            return false;
        }
    }

    private void updatePassword(String ID, String newPassword) throws IOException {
        String newpass = getCryptedPassword(newPassword);
        Abonne ab1 = new Abonne();
        ab1 = getAbonneLocal().find(Integer.parseInt(ID));

        if (ab1 != null) {

            ab1.setPassword(newpass);
            getAbonneLocal().edit(ab1);
        }
    }

    public String changePassword() throws IOException {
        System.out.println("changé");
        FacesContext context = FacesContext.getCurrentInstance();

        //1)Checking whether both new password and password confirmation are the same or not
        if (!this.newPassword.equals(this.newPasswordConfirmation)) {
            System.out.println("changé2");
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Le nouveau mot de passe ne correspond pas à celui confirmé", "Le nouveau mot de passe ne correspond pas à celui confirmé"));
        } //2)Checking whether the new password is equal to the current one or not
        else if (this.newPassword.equals(this.password)) {
            System.out.println("changé3");
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Le nouveau mot de passe et l'ancien ne doivent pas etre le meme", "Le nouveau mot de passe et l'ancien ne doivent pas etre le meme"));
        } else {

            if (!this.isPasswordValid(password)) {
                System.out.println("changé4");
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "L'ancien mot de passe ne correspond pas. Essayez encore ! ! !", "L'ancien mot de passe ne correspond pas. Essayez encore ! ! !"));
            } else {
                System.out.println("changé5");
                String ID = FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("abonne").toString();

                // Password update in the database
                this.updatePassword(ID, newPassword);
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Votre mot de passe a été bien modifié.", "Votre mot de passe a été bien modifié."));
            }

        }
       return "profil";
    }
    
    public String changeEmail() throws IOException{
        System.out.println("email1");
        FacesContext context = FacesContext.getCurrentInstance();
        
        if(!this.emailnouveau.equals(this.emailconfirm)){
            System.out.println("email2");
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "La nouvelle adresse email ne correspond pas à celui confirmé", "La nouvelle adresse email ne correspond pas à celui confirmé"));
        }
        else if (this.emailnouveau.equals(this.emailAbonne)) {
            System.out.println("email3");
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "La nouvelle adresse email et l'ancien ne doivent pas etre le meme", "La nouvelle adresse email et l'ancien ne doivent pas etre le meme"));
        } else {

            if (!this.isPasswordValid(password1)) {
                System.out.println("email4");
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Votre mot de passe ne correspond pas. Essayez encore ! ! !", "Votre mot de passe ne correspond pas. Essayez encore ! ! !"));
            } else {
                System.out.println("email5");
                String ID = FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("abonne").toString();

                // Password update in the database
                this.updateEmail(ID, emailnouveau);
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Votre email a été bien modifié.", "Votre email a été bien modifié."));
            }

        }
        
        return "profil";
    }

    private void updateEmail(String ID, String emailnouveau) throws IOException{
        
        Abonne ab2 = new Abonne();
        ab2 = getAbonneLocal().find(Integer.parseInt(ID));

        if (ab2 != null) {

            ab2.setEmail(emailnouveau);
            getAbonneLocal().edit(ab2);
        }
        
    }
    
    private void updateParams1(String ID, String nom, String prenom, String cni, String adresse, String profession) throws IOException{
        
        Abonne ab3 = new Abonne();
        ab3 = getAbonneLocal().find(Integer.parseInt(ID));

        if (ab3 != null) {

            ab3.setNom(nom);
            ab3.setPrenom(prenom);
            ab3.setCni(cni);
            ab3.setAdresse(adresse);
            ab3.setProfession(profession);
            getAbonneLocal().edit(ab3);
        }
        
    }
    
    public String changeParams1() throws IOException{
        System.out.println("params1");
        FacesContext context = FacesContext.getCurrentInstance();
        String ID = FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("abonne").toString();
        this.updateParams1(ID,nomAbonne,pnomAbonne,cni,adresse,profAbonne);
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Vos coordonnées ont été bien modifié.", "Vos coordonnées ont été bien modifié."));
        return "profil";
    }
    
    public String deconnexion() {
      
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "connexion.xhtml?faces-redirect=true";
    }

}
