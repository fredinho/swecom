/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import config.DataModel;
import ejb.ZoneFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import jpa.Zone;

/**
 *
 * @author FREDINHO
 */
@ManagedBean
@RequestScoped
public class ZoneBeans implements Serializable {
    @EJB
    /**
     * Attributs
     */
    private ZoneFacadeLocal zonelocal;
    private Zone zone;
    private String zone1;
    private DataModel model;
    private List<Zone> zonelist;
    private int idquartier;

    /**
     * Constructors
     */
    public ZoneBeans() {
    }
    
    /**
     * gettters and Setters
     */

    public ZoneFacadeLocal getZonelocal() {
        return zonelocal;
    }

    public void setZonelocal(ZoneFacadeLocal zonelocal) {
        this.zonelocal = zonelocal;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public String getZone1() {
        return zone1;
    }

    public void setZone1(String zone1) {
        this.zone1 = zone1;
    }

    public DataModel getModel() {
        return model;
    }

    public void setModel(DataModel model) {
        this.model = model;
    }

    public List<Zone> getZonelist() {
        return zonelist;
    }

    public void setZonelist(List<Zone> zonelist) {
        this.zonelist = zonelist;
    }

    public int getIdquartier() {
        return idquartier;
    }

    public void setIdquartier(int idquartier) {
        this.idquartier = idquartier;
    }

    
    
    
    
}
