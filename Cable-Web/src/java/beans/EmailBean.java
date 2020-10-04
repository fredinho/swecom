/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

 @ManagedBean
 public class EmailBean{
     private String email;
     
     public void submit() {
        System.out.println("EmailBean:: received valid email: " + email);
        // Set the message here
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Email is OK", "ok");  
        FacesContext.getCurrentInstance().addMessage(null, msg);
     }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
     
}
