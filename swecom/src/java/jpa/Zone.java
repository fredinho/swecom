/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jpa;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author skysofttech
 */
@Entity
@Cacheable(false)
@Table(name = "zone")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zone.findAll", query = "SELECT z FROM Zone z"),
    @NamedQuery(name = "Zone.findById", query = "SELECT z FROM Zone z WHERE z.id = :id"),
    @NamedQuery(name = "Zone.findByLibelle", query = "SELECT z FROM Zone z WHERE z.libelle = :libelle"),
    @NamedQuery(name = "Zone.findByQuartier", query = "SELECT z FROM Zone z WHERE z.quartier = :quartier"),
    @NamedQuery(name = "Zone.findByCodezone", query = "SELECT z FROM Zone z WHERE z.codezone = :codezone"),
    @NamedQuery(name = "Zone.findByVersion", query = "SELECT z FROM Zone z WHERE z.version = :version")})
public class Zone implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "libelle")
    private String libelle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quartier")
    private int quartier;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "codezone")
    private String codezone;
    @Basic(optional = false)
    @NotNull
    @Column(name = "version")
    private int version;
    @OneToMany(mappedBy = "zone")
    private transient List<Abonne> abonneList;

    public Zone() {
    }

    public Zone(Integer id) {
        this.id = id;
    }

    public Zone(Integer id, int quartier, String codezone, int version) {
        this.id = id;
        this.quartier = quartier;
        this.codezone = codezone;
        this.version = version;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getQuartier() {
        return quartier;
    }

    public void setQuartier(int quartier) {
        this.quartier = quartier;
    }

    public String getCodezone() {
        return codezone;
    }

    public void setCodezone(String codezone) {
        this.codezone = codezone;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @XmlTransient
    public List<Abonne> getAbonneList() {
        return abonneList;
    }

    public void setAbonneList(List<Abonne> abonneList) {
        this.abonneList = abonneList;
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
        if (!(object instanceof Zone)) {
            return false;
        }
        Zone other = (Zone) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Zone[ id=" + id + " ]";
    }
    
}
