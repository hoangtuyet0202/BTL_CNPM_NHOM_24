/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapper;

import com.model.TaiKhoanModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VITQUAY
 */
public class TaiKhoanMapper implements RowMapper<TaiKhoanModel>{

    @Override
    public TaiKhoanModel mapRow(ResultSet rs) {
        try {
            TaiKhoanModel tk = new TaiKhoanModel();
            tk.setId(rs.getInt("id"));
            tk.setUsername(rs.getString("username"));
            tk.setPassword(rs.getString("password"));
            return tk;
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanMapper.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
}
