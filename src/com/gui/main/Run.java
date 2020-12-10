/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gui.main;

import com.model.TaiKhoanModel;

/**
 *
 * @author VITQUAY
 */
public class Run {
    public static frmMain QLDongGop;
    public static frmLogin login;
    public static TaiKhoanModel tk;
    
    public static void main(String[] args) {
        log();
    }
    public static void log() {
        login = new frmLogin();
        login.setVisible(true);
    }
    public static void QLDG() {
        QLDongGop = new frmMain();
        QLDongGop.setVisible(true);
    }
}
