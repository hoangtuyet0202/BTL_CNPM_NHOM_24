/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.impl;

import com.dao.ITheLoaiDongGopDAO;
import com.mapper.TheLoaiDongGopMapper;
import com.model.TheLoaiDongGopModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class TheLoaiDongGopDAO extends AbstractDAO<TheLoaiDongGopModel> implements ITheLoaiDongGopDAO{

    String sql;
//    @Override
//    public Vector findAll() {
//        Vector vt = new Vector();
//        sql = "SELECT * FROM theloaidonggop";
//        ArrayList<TheLoaiDongGopModel> arr = (ArrayList<TheLoaiDongGopModel>) query(sql, new TheLoaiDongGopMapper());
//        for(TheLoaiDongGopModel tl : arr) {
//            vt.add(arr);
//        }
//        return vt;
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    
    @Override
    public void insert(TheLoaiDongGopModel newTL) {
        sql = "INSERT INTO theloaidonggop(MaTheLoaiDG, TenLoaiDG, NgayBatDauThu) VALUES (?,?,?)";
        insert(sql, newTL.getMaTheLoaiDG(), newTL.getTenTheLoaiDG(), newTL.getNgayBDThu());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(TheLoaiDongGopModel updateTL) {
        sql = "UPDATE theloaidonggop SET TenLoaiDG = ?, NgayBatDauThu = ? WHERE MaTheLoaiDG =?";
        update(sql, updateTL.getTenTheLoaiDG(), updateTL.getNgayBDThu(), updateTL.getMaTheLoaiDG());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int maTL) {
        sql = "DELETE FROM theloaidonggop WHERE MaTheLoaiDG = ?";
        update(sql, maTL);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vector findTL(ArrayList<TheLoaiDongGopModel> listTL) {
        Vector vt = new Vector();
        TheLoaiDongGopModel ftl = new TheLoaiDongGopModel();
        ftl.setTenTheLoaiDG("Toàn bộ");
        vt.add(ftl);
        for(TheLoaiDongGopModel tl: listTL) {
            vt.add(tl);
        }
        return vt;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TheLoaiDongGopModel> findAll() {
        sql = "SELECT * FROM theloaidonggop";
        return query(sql, new TheLoaiDongGopMapper());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TheLoaiDongGopModel findByMa(int maTL) {
        sql = "SELECT * FROM theloaidonggop WHERE MaTheLoaiDG = ?";
        return (TheLoaiDongGopModel) query(sql, new TheLoaiDongGopMapper(), maTL).get(0);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
