/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.impl;

import com.dao.ITaiKhoanDAO;
import com.mapper.TaiKhoanMapper;
import com.model.TaiKhoanModel;
/**
 *
 * @author VITQUAY
 */
public class TaiKhoanDAO extends AbstractDAO<TaiKhoanModel> implements ITaiKhoanDAO {

    private String sql;

    @Override
    public TaiKhoanModel findByUserPass(String user, String pass) {
        sql = "SELECT * FROM taikhoan WHERE username = ? AND password = ?";
        if(!query(sql, new TaiKhoanMapper(), user, pass).isEmpty())
            return query(sql, new TaiKhoanMapper(), user, pass).get(0);
        return null;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
