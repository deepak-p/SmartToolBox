/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author deepak
 */
@Entity
@Table(name = "TOOLS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tools.findAll", query = "SELECT t FROM Tools t"),
    @NamedQuery(name = "Tools.findById", query = "SELECT t FROM Tools t WHERE t.id = :id"),
    @NamedQuery(name = "Tools.findByToolName", query = "SELECT t FROM Tools t WHERE t.toolName = :toolName"),
    @NamedQuery(name = "Tools.findByDrawer", query = "SELECT t FROM Tools t WHERE t.drawer = :drawer")})
public class Tools implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private String id;
    @Size(max = 45)
    @Column(name = "toolName")
    private String toolName;
    @Column(name = "drawer")
    private Integer drawer;
    @Column(name = "drawer")
    private String type;
    

    public Tools() {
    }

    public Tools(String id, String toolName, Integer drawer, String type) {
        this.id = id;
        this.toolName = toolName;
        this.drawer = drawer;
        this.type = type;
    }
    
    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public Tools(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    public Integer getDrawer() {
        return drawer;
    }

    public void setDrawer(Integer drawer) {
        this.drawer = drawer;
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
        if (!(object instanceof Tools)) {
            return false;
        }
        Tools other = (Tools) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Tools[ id=" + id + " ]";
    }
    
}
