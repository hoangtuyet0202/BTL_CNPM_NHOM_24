/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapper;

import com.model.DongGopModel;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author VITQUAY
 */
public class DongGopMapper implements RowMapper {

    @Override
    public DongGopModel mapRow(ResultSet resultSet) {
        try {
            DongGopModel DG = new DongGopModel();
            DG.setMaDongGop(resultSet.getInt("MaDongGop"));
            DG.setMaHoKhau(resultSet.getInt("MaHoKhau"));
            DG.setSoTienDG(resultSet.getInt("SoTienDG"));
            DG.setMaTheLoaiDG(resultSet.getInt("MaTheLoaiDG"));
            DG.setNgayDG(resultSet.getDate("NgayDongGop"));
            DG.setGhiChu(resultSet.getString("GhiChu"));
            return DG;
        } catch (SQLException e) {
            return null;

            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
}
