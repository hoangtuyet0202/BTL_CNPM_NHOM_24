package com.laptrinhjavaweb.dao.impl;

import java.util.List;

import com.laptrinhjavaweb.dao.ICategoryDAO;
import com.laptrinhjavaweb.mapper.CategoryMapper;
import com.laptrinhjavaweb.model.CategoryModel;

public class DongGopDAO extends AbstractDAO<DongGopModel> implements IDongGopDAO {

	@Override
	public List<DongGopModel> findAll() {
		String sql = "SELECT * FROM category";
		return query(sql, new CategoryMapper());
	}
	
	@Override
	public List<DongGopModel> findByTheLoai(int maTL){
		String sql = "SELECT maTL FROM category";
		return query(sql, new CategoryMapper());
	}

	@Override
        public void insert(DongGopModel newDG) {
        String sql = "INSERT INTO (maDongGop, maHoKhau, soTienDG, maTheLoaiDG, ngayDG) VALUES (?,?,?,?,?)";
        insert(sql,newDG.getMaDongGop(), newDG.getMaHoKhau(), newDG.getSoTienDG(), newDG.getMaTheLoaiDG(), newDG.getNgayDG);        
        }
	
        @Override
        public void update(DongGopModel newDG) {
    	String sql = "UPDATE DongGop SET maDongGop = ?, maHoKhau  = ?, soTienDG = ?, maTheLoaiDG = ?,  ngayDG = ? WHERE maDongGop = ?";
    	update(sql, updateDG.getMaDongGop(), updateDG.getMaHoKhau(), updateDG.getSoTienDG(), updateDG.getMaTheLoaiDG(), updateDG.getNgayDG());
    }
  
}