/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinay.dto;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Registration_Master")
public class regDTO implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String regno;
    private String name;
    private String semail;
    private String smob;

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    private String pwd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getSemail() {
        return semail;
    }

    public void setSemail(String semail) {
        this.semail = semail;
    }

    public String getSmob() {
        return smob;
    }

    public void setSmob(String smob) {
        this.smob = smob;
    }

    @Override
    public String toString() {
        return id + " " + regno + " " + name + " " + semail + " " + smob ;
    }

}
