/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.impl;

import com.dao.IDongGopDAO;
import com.model.DongGopModel;
import java.util.List;

/**
 *
 * @author VITQUAY
 */
public class DongGopDAO extends AbstractDAO<DongGopModel> implements IDongGopDAO{

    @Override
    public List<DongGopModel> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DongGopModel> findByTheLoai(int maTL) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(DongGopModel newDG) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(DongGopModel updateDG) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
