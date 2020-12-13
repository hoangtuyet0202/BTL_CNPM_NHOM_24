/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.util.Date;


public class TheLoaiDongGopModel {

    private int maTheLoaiDG;
    private String tenTheLoaiDG;
    private Date ngayBDThu;

    public TheLoaiDongGopModel() {
    }

    public TheLoaiDongGopModel(int maTheLoaiDG, String tenTheLoaiDG, Date ngayBDThu) {
        this.maTheLoaiDG = maTheLoaiDG;
        this.tenTheLoaiDG = tenTheLoaiDG;
        this.ngayBDThu = ngayBDThu;
    }
    
    public int getMaTheLoaiDG() {
        return maTheLoaiDG;
    }

    public void setMaTheLoaiDG(int maTheLoaiDG) {
        this.maTheLoaiDG = maTheLoaiDG;
    }

    public String getTenTheLoaiDG() {
        return tenTheLoaiDG;
    }

    public void setTenTheLoaiDG(String tenTheLoaiDG) {
        this.tenTheLoaiDG = tenTheLoaiDG;
    }

    public Date getNgayBDThu() {
        return ngayBDThu;
    }

    public void setNgayBDThu(Date ngayBDThu) {
        this.ngayBDThu = ngayBDThu;
    }

    
    @Override
    public String toString() {
        return this.tenTheLoaiDG; //To change body of generated methods, choose Tools | Templates.
    }
}
