/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jpa;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author skysofttech
 */
@Entity
@Cacheable(false)
@Table(name = "mutation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mutation.findAll", query = "SELECT m FROM Mutation m"),
    @NamedQuery(name = "Mutation.findById", query = "SELECT m FROM Mutation m WHERE m.id = :id"),
    @NamedQuery(name = "Mutation.findByDatemutation", query = "SELECT m FROM Mutation m WHERE m.datemutation = :datemutation"),
    @NamedQuery(name = "Mutation.findByMotifmutation", query = "SELECT m FROM Mutation m WHERE m.motifmutation = :motifmutation"),
    @NamedQuery(name = "Mutation.findByMutation", query = "SELECT m FROM Mutation m WHERE m.mutation = :mutation"),
    @NamedQuery(name = "Mutation.findBySoldemutation", query = "SELECT m FROM Mutation m WHERE m.soldemutation = :soldemutation"),
    @NamedQuery(name = "Mutation.findByVersion", query = "SELECT m FROM Mutation m WHERE m.version = :version"),
    @NamedQuery(name = "Mutation.findByTechnicien", query = "SELECT m FROM Mutation m WHERE m.technicien = :technicien"),
    @NamedQuery(name = "Mutation.findByAgent", query = "SELECT m FROM Mutation m WHERE m.agent = :agent"),
    @NamedQuery(name = "Mutation.findByAbonne", query = "SELECT m FROM Mutation m WHERE m.abonne = :abonne"),
    @NamedQuery(name = "Mutation.findByNumeromutation", query = "SELECT m FROM Mutation m WHERE m.numeromutation = :numeromutation")})
public class Mutation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datemutation")
    @Temporal(TemporalType.DATE)
    private Date datemutation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "motifmutation")
    private String motifmutation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "mutation")
    private String mutation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "soldemutation")
    private int soldemutation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "version")
    private int version;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "technicien")
    private String technicien;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "agent")
    private String agent;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "numeromutation")
    private String numeromutation;
    @JoinColumn(name = "abonne", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Abonne abonne;
    @JoinColumn(name = "agence", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Agence agence;

    public Mutation() {
    }

    public Mutation(Integer id) {
        this.id = id;
    }

    public Mutation(Integer id, Date datemutation, String motifmutation, String mutation, int soldemutation, int version, String technicien, String agent, String numeromutation) {
        this.id = id;
        this.datemutation = datemutation;
        this.motifmutation = motifmutation;
        this.mutation = mutation;
        this.soldemutation = soldemutation;
        this.version = version;
        this.technicien = technicien;
        this.agent = agent;
        this.numeromutation = numeromutation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDatemutation() {
        return datemutation;
    }

    public void setDatemutation(Date datemutation) {
        this.datemutation = datemutation;
    }

    public String getMotifmutation() {
        return motifmutation;
    }

    public void setMotifmutation(String motifmutation) {
        this.motifmutation = motifmutation;
    }

    public String getMutation() {
        return mutation;
    }

    public void setMutation(String mutation) {
        this.mutation = mutation;
    }

    public int getSoldemutation() {
        return soldemutation;
    }

    public void setSoldemutation(int soldemutation) {
        this.soldemutation = soldemutation;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getTechnicien() {
        return technicien;
    }

    public void setTechnicien(String technicien) {
        this.technicien = technicien;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getNumeromutation() {
        return numeromutation;
    }

    public void setNumeromutation(String numeromutation) {
        this.numeromutation = numeromutation;
    }

    public Abonne getAbonne() {
        return abonne;
    }

    public void setAbonne(Abonne abonne) {
        this.abonne = abonne;
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
        if (!(object instanceof Mutation)) {
            return false;
        }
        Mutation other = (Mutation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Mutation[ id=" + id + " ]";
    }
    
}
