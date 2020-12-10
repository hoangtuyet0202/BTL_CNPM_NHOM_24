/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.impl;

import com.dao.IThuPhiDAO;
import com.mapper.ThuPhiMapper;
import com.model.ThuPhiModel;
import java.util.List;

public class ThuPhiDAO extends AbstractDAO<ThuPhiModel> implements IThuPhiDAO {

    @Override
    public List<ThuPhiModel> findAll() {
        String sql = "SELECT * from ThuPhi";
		List<ThuPhiModel> res = query(sql, new ThuPhiMapper());
        return res;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(ThuPhiModel newTP) {
        String sql = "INSERT INTO thuphi(MaThuPhi, MaHoKhau, NgayThuPhi, SoTien) VALUES (?,?,?,?)";
        insert(sql,newTP.getMaThuPhi(), newTP.getMaHoKhau(), newTP.getNgayThuPhi(), newTP.getSoTien());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(ThuPhiModel updateTP) {
        String sql = "UPDATE thuphi SET MaHoKhau = ?, NgayThuPhi = ?, SoTien = ? WHERE MaThuPhi = ?";
    	update(sql, updateTP.getMaHoKhau(), updateTP.getNgayThuPhi(), updateTP.getSoTien(), updateTP.getMaThuPhi());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int maTP) {
        String sql = "DELETE FROM thuphi WHERE MaThuPhi = ?";
    	update(sql, maTP);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ThuPhiModel> findByDate(String d1, String d2) {
        String sql;
        if(d1.equals(d2)) {
            sql = "SELECT * FROM thuphi WHERE NgayThuPhi >= ?";
            return query(sql, new ThuPhiMapper(), d1);
        }
        else {
            sql = "SELECT * FROM thuphi WHERE NgayThuPhi BETWEEN ? AND ?";
            return query(sql, new ThuPhiMapper(), d1, d2);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ThuPhiModel findByMa(int maTP) {
        String sql = "SELECT * FROM thuphi WHERE MaThuPhi = ?";
        return (ThuPhiModel) query(sql, new ThuPhiMapper(), maTP).get(0);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ThuPhiModel> findByMaHK(int maHK) {
        String sql = "SELECT * FROM thuphi WHERE MaHoKhau = ?";
        return query(sql, new ThuPhiMapper(), maHK);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
