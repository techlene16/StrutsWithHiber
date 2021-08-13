/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinay.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.vinay.dto.regDTO;
import com.vinay.service.regService;
import java.util.List;

/**
 *
 * @author Vinay1
 */
public class regaction extends ActionSupport implements ModelDriven<regDTO> {

    private regDTO reg = new regDTO();
    private List slist;
    private String button;
    private int aj;

    public int getAj() {
        return aj;
    }

    public void setAj(int aj) {
        this.aj = aj;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public List getSlist() {
        return slist;
    }

    public void setSlist(List slist) {
        this.slist = slist;
    }

    public regDTO getModel() {
        return reg;
    }

    @Override
    public void validate() {
    }

    public String execute() throws Exception {
        regService re = new regService();
        if (button != null) {
            reg.setPwd("V123");
            re.Save(reg);
            return "add";
        }
        if (aj == 1) {
            re.delete(reg.getId());
        }
        System.out.println(aj+"====="+reg.getId());
        if (aj == 2) {
            slist = re.ShowList(reg.getId());
            regDTO  rdto = (regDTO)slist.get(0);
            reg.setId(rdto.getId());
            reg.setName(rdto.getName());
            reg.setRegno(rdto.getRegno());
            reg.setSemail(rdto.getSemail());
            reg.setSmob(rdto.getSmob());
            reg.setPwd(rdto.getPwd());
        }
        slist = re.ShowList(0);
        return SUCCESS;
    }
}
