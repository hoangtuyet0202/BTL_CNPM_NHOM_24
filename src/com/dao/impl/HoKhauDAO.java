/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.impl;

import com.dao.IHoKhauDAO;
import com.mapper.HoKhauMapper;
import com.model.HoKhauModel;
import java.util.List;

/**
 *
 * @author VITQUAY
 */
public class HoKhauDAO extends AbstractDAO<HoKhauModel> implements IHoKhauDAO{

    @Override
    public List<HoKhauModel> findAll() {
        String sql = "SELECT * FROM hokhau";
	return query(sql, new HoKhauMapper());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(HoKhauModel newHK) {
        String sql = "INSERT INTO hokhau(MaHoKhau, TenHoKhau, SoNhanKhau, DiaChi) VALUES (?,?,?,?)";
        insert(sql,newHK.getMaHK(), newHK.getTenHK(), newHK.getSoNhanKhau(), newHK.getDiaChi());  
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(HoKhauModel updateHK) {
        String sql = "UPDATE hokhau SET TenHoKhau  = ?, SoNhanKhau = ?, DiaChi = ? WHERE MaHoKhau = ?";
    	update(sql, updateHK.getTenHK(), updateHK.getSoNhanKhau(), updateHK.getDiaChi(), updateHK.getMaHK());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int maHK) {
        String sql = "DELETE FROM hokhau WHERE MaHoKhau = ?";
    	update(sql, maHK);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HoKhauModel findByMa(int maHK) {
        String sql = "SELECT * FROM hokhau WHERE MaHoKhau = ?";
        return (HoKhauModel) query(sql, new HoKhauMapper(), maHK).get(0);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int tinhPhi(int maHK) {
        HoKhauModel hk = findByMa(maHK);
        return 12*6000*(hk.getSoNhanKhau());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HoKhauModel findByTen(String tenHK) {
        String sql = "SELECT * FROM hokhau WHERE TenHoKhau like ?";
        return (HoKhauModel) query(sql, new HoKhauMapper(), "%"+tenHK+"%").get(0);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
