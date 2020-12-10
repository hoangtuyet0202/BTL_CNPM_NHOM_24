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
public class ThuPhiModel {
    private int maThuPhi;
    private int maHoKhau;
    private Date ngayThuPhi;
    private int soTien;

    public ThuPhiModel() {
    }

    public ThuPhiModel(int maThuPhi, int maHoKhau, Date ngayThuPhi, int soTien) {
        this.maThuPhi = maThuPhi;
        this.maHoKhau = maHoKhau;
        this.ngayThuPhi = ngayThuPhi;
        this.soTien = soTien;
    }

    public int getMaThuPhi() {
        return maThuPhi;
    }

    public void setMaThuPhi(int maThuPhi) {
        this.maThuPhi = maThuPhi;
    }

    public int getMaHoKhau() {
        return maHoKhau;
    }

    public void setMaHoKhau(int maHoKhau) {
        this.maHoKhau = maHoKhau;
    }

    public Date getNgayThuPhi() {
        return ngayThuPhi;
    }

    public void setNgayThuPhi(Date ngayThuPhi) {
        this.ngayThuPhi = ngayThuPhi;
    }

    public int getSoTien() {
        return soTien;
    }

    public void setSoTien(int soTien) {
        this.soTien = soTien;
    }
    
    
}