/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.impl;

import com.dao.IDongGopDAO;
import com.mapper.DongGopMapper;
import com.model.DongGopModel;
import java.util.List;

/**
 *
 * @author VITQUAY
 */
public class DongGopDAO extends AbstractDAO<DongGopModel> implements IDongGopDAO{

    String sql;
    @Override
    public List<DongGopModel> findAll() {
        sql = "SELECT * FROM donggop";
        return query(sql, new DongGopMapper());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DongGopModel findByDG(int maDG) {
        sql = "SELECT * FROM donggop WHERE MaDongGop = ?";
        return (DongGopModel) query(sql, new DongGopMapper(), maDG).get(0);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(DongGopModel newDG) {
        sql = "INSERT INTO donggop(MaDongGop, MaHoKhau, SoTienDG, MaTheLoaiDG, NgayDongGop, GhiChu) VALUES (?,?,?,?,?,?)";
        insert(sql, newDG.getMaDongGop(), newDG.getMaHoKhau(), newDG.getSoTienDG(), newDG.getMaTheLoaiDG(), newDG.getNgayDG(), newDG.getGhiChu());

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(DongGopModel updateDG) {
        sql = "UPDATE donggop SET MaHoKhau = ?, SoTienDG = ?, MaTheLoaiDG= ?, NgayDongGop= ?, GhiChu= ? WHERE MaDongGop = ?";
        update(sql, updateDG.getMaHoKhau(), updateDG.getSoTienDG(), updateDG.getMaTheLoaiDG(), updateDG.getNgayDG(), updateDG.getGhiChu(), updateDG.getMaDongGop());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DongGopModel> findByTheLoai(int maTL) {
        sql = "SELECT * FROM donggop WHERE MaTheLoaiDG = ?";
        return query(sql, new DongGopMapper(), maTL);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int maDG) {
        sql = "DELETE FROM donggop WHERE MaDongGop = ?";
        update(sql, maDG);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DongGopModel> findByMaHK(int maHK) {
        sql = "SELECT * FROM donggop WHERE MaHoKhau = ?";
        return query(sql, new DongGopMapper(), maHK);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
