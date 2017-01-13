/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author daniel_hernandez
 */
@ManagedBean
@ViewScoped
public class Test {
    
    private String msg;

    @PostConstruct
    public void init() {
        msg = "demo ..." + System.getenv("MYSQL_DATABASE") ;
    }
    
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    
    
}
