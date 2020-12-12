/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapper;

import com.model.HoKhauModel;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author VITQUAY
 */
public class HoKhauMapper implements RowMapper{

    @Override
    public HoKhauModel mapRow(ResultSet rs) {
        try {
            HoKhauModel hk = new HoKhauModel();
            hk.setMaHK(rs.getInt("MaHoKhau"));
            hk.setTenHK(rs.getString("TenHoKhau"));
            hk.setSoNhanKhau(rs.getInt("SoNhanKhau"));
            hk.setDiaChi(rs.getString("DiaChi"));
            return hk;
        } catch (SQLException e) {
            return null;

            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
