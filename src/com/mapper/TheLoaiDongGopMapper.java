package com.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.TheLoaiDongGopModel;

public class TheLoaiDongGopMapper implements RowMapper<TheLoaiDongGopModel>{

    @Override
    public TheLoaiDongGopModel mapRow(ResultSet rs) {
        try {
			TheLoaiDongGopModel tl = new TheLoaiDongGopModel();
			tl.setMaTheLoaiDG(rs.getInt("MaTheLoaiDG"));
			tl.setTenLoaiDG(rs.getString("TenLoaiDG"));
			return tl;
		} catch (SQLException e) {
			return null;
		}
    }
    
}
