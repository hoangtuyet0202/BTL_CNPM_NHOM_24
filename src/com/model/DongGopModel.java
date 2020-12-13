/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.util.Date;

/**
 *
 * @author VITQUAY
 */
public class DongGopModel {

    private int maDongGop;
    private int maHoKhau;
    private int soTienDG;
    private int maTheLoaiDG;
    private Date ngayDG;
    private String ghiChu;

    public DongGopModel() {
    }

    public DongGopModel(int maDongGop, int maHoKhau, int soTienDG, int maTheLoaiDG, Date ngayDG, String ghiChu) {
        this.maDongGop = maDongGop;
        this.maHoKhau = maHoKhau;
        this.soTienDG = soTienDG;
        this.maTheLoaiDG = maTheLoaiDG;
        this.ngayDG = ngayDG;
        this.ghiChu = ghiChu;
    }

    public int getMaDongGop() {
        return this.maDongGop;
    }

    public void setMaDongGop(int maDongGop) {
        this.maDongGop = maDongGop;
    }

    public int getMaHoKhau() {
        return this.maHoKhau;
    }

    public void setMaHoKhau(int maHoKhau) {
        this.maHoKhau = maHoKhau;
    }

    public int getSoTienDG() {
        return this.soTienDG;
    }

    public void setSoTienDG(int soTienDG) {
        this.soTienDG = soTienDG;
    }

    public int getMaTheLoaiDG() {
        return this.maTheLoaiDG;
    }

    public void setMaTheLoaiDG(int maTheLoaiDG) {
        this.maTheLoaiDG = maTheLoaiDG;
    }

    public Date getNgayDG() {
        return this.ngayDG;
    }

    public void setNgayDG(Date ngayDG) {
        this.ngayDG = ngayDG;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

}
