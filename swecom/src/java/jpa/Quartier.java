/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author skysofttech
 */
@Entity
@Cacheable(false)
@Table(name = "quartier")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Quartier.findAll", query = "SELECT q FROM Quartier q"),
    @NamedQuery(name = "Quartier.findById", query = "SELECT q FROM Quartier q WHERE q.id = :id"),
    @NamedQuery(name = "Quartier.findByNomquartier", query = "SELECT q FROM Quartier q WHERE q.nomquartier = :nomquartier"),
    @NamedQuery(name = "Quartier.findByVersion", query = "SELECT q FROM Quartier q WHERE q.version = :version")})
public class Quartier implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "nomquartier")
    private String nomquartier;
    @Basic(optional = false)
    @NotNull
    @Column(name = "version")
    private int version;
    @JoinColumn(name = "agence", referencedColumnName = "id")
    @ManyToOne
    private Agence agence;

    public Quartier() {
    }

    public Quartier(Integer id) {
        this.id = id;
    }

    public Quartier(Integer id, int version) {
        this.id = id;
        this.version = version;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomquartier() {
        return nomquartier;
    }

    public void setNomquartier(String nomquartier) {
        this.nomquartier = nomquartier;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Quartier)) {
            return false;
        }
        Quartier other = (Quartier) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Quartier[ id=" + id + " ]";
    }
    
}
