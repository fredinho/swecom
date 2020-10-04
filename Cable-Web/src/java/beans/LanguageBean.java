package beans;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
 
@ManagedBean(name="languageBean")
@SessionScoped
public class LanguageBean implements Serializable{
    
    private String locale="fr";
    
    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }
    
    public String french(){
        locale ="fr";
        System.out.print("Français");
        return "Abonne/facture-paiement";
    }
    
    public String english(){
        
        locale ="en_CA";
       System.out.print("Anglais");
        return "Abonne/facture-paiement";
    }
    
    public String french2(){
        locale ="fr";
        System.out.print("Français");
        return "connexion";
    }
    
    public String english2(){
        locale ="en_CA";
       System.out.print("Anglais");
        return "connexion";
    }
}