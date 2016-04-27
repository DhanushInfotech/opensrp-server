/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ei.drishti.reporting.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 *
 * @author administrator
 */
@Entity
@Table(name = "poc_table")
@NamedQuery(name = POC_Table.FIND_BY_VISITENTITYID_AND_ENTITYIDEC, query = "select e from POC_Table e where e.visitentityid=:visitentityid and e.entityidec = :entityidec")

public class POC_Table {

	public static final String FIND_BY_VISITENTITYID_AND_ENTITYIDEC = "find.by.visitentityid";
	
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "visitentityid")
    private String visitentityid;

    @Column(name = "entityidec")
    private String entityidec;

    @Column(name = "anmid")
    private String anmid;

    @Column(name = "level")
    private String level;

    @Column(name = "clientversion")
    private String clientversion;

    @Column(name = "serverversion")
    private String serverversion;

    @Column(name = "visittype")
    private String visittype;

    @Column(name = "phc")
    private String phc;

    @Column(name = "pending")
    private String pending;

    @Column(name = "docid")
    private String docid;

    @Column(name = "timestamp")
    private Timestamp timestamp;

    @Column(name = "wifename")
    private String wifename;

    private POC_Table() {
    }

    public POC_Table(String visitentityid, String entityidec, String anmid, String level, String clientversion, String serverversion, String visittype, String phc, String pending, String docid, Timestamp timestamp, String wifename) {

        this.visitentityid = visitentityid;
        this.entityidec = entityidec;
        this.anmid = anmid;
        this.level = level;
        this.clientversion = clientversion;
        this.serverversion = serverversion;
        this.visittype = visittype;
        this.phc = phc;
        this.pending = pending;
        this.docid = docid;
        this.timestamp = timestamp;
        this.wifename = wifename;

    }

    public Integer id() {
        return id;
    }

    public String visitentityid() {
        return visitentityid;
    }
    public void setvisitentityid(String visitentityid) {
    	this.visitentityid=visitentityid;
    }

    public String entityidec() {
        return entityidec;
    }
    public void setentityidec(String entityidec) {
    	this.entityidec=entityidec;
    }

    public String anmid() {
        return anmid;
    }
    public void setanmid(String anmid) {
    	this.anmid=anmid;
    }

    public String level() {
        return level;
    }
    public void setlevel(String level) {
    	this.level=level;
    }

    public String clientversion() {
        return clientversion;
    }
    public void setclientversion(String clientversion) {
    	this.clientversion=clientversion;
    }

    public String serverversion() {
        return serverversion;
    }
    public void setserverversion(String serverversion) {
    	this.serverversion=serverversion;
    }

    public String visittype() {
        return visittype;
    }
    public void setvisittype(String visittype) {
    	this.visittype=visittype;
    }

    public String phc() {
        return phc;
    }
    public void setphc(String phc) {
    	this.phc=phc;
    }

    public String pending() {
        return pending;
    }
    public void setpending(String pending) {
    	this.pending=pending;
    }

    public String docid() {
        return docid;
    }
    public void setdocid(String docid) {
    	this.docid=docid;
    }

    public Timestamp timestamp() {
        return timestamp;
    }
    public void settimestamp(Timestamp timestamp) {
    	this.timestamp=timestamp;
    }

    public String wifename() {
        return wifename;
    }
    public void setwifename(String wifename) {
    	this.wifename=wifename;
    }

    @Override
    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o, new String[]{"id"});
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, new String[]{"id"});
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
