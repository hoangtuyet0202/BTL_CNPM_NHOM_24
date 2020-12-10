/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapper;

import com.model.ThuPhiModel;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author VITQUAY
 */
public class ThuPhiMapper implements RowMapper{

    @Override
    public Object mapRow(ResultSet rs) {
        try {
			ThuPhiModel thuPhi = new ThuPhiModel();
			
			thuPhi.setMaThuPhi(rs.getInt("maThuPhi"));
			thuPhi.setMaHoKhau(rs.getInt("maHoKhau"));
			thuPhi.setNgayThuPhi(rs.getDate("ngayThuPhi"));
			thuPhi.setSoTien(rs.getInt("soTien"));
			
			return thuPhi;
		} catch(SQLException ex) {
			ex.printStackTrace();
			return null;
		}
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
