/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapper;

import com.model.TheLoaiDongGopModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TheLoaiDongGopMapper implements RowMapper{

    @Override
    public TheLoaiDongGopModel mapRow(ResultSet rs) {
        try {
            TheLoaiDongGopModel tl = new TheLoaiDongGopModel();
            tl.setMaTheLoaiDG(rs.getInt("MaTheLoaiDG"));
            tl.setTenTheLoaiDG(rs.getString("TenLoaiDG"));
            tl.setNgayBDThu(rs.getDate("NgayBatDauThu"));
            return tl;
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanMapper.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
}
