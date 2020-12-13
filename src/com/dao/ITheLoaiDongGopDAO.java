/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.TheLoaiDongGopModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public interface ITheLoaiDongGopDAO extends IGenericDAO<TheLoaiDongGopModel> {

    List<TheLoaiDongGopModel> findAll();

    void insert(TheLoaiDongGopModel newTL);

    void update(TheLoaiDongGopModel updateTL);

    void delete(int maTL);
    
    TheLoaiDongGopModel findByMa(int maTL);
    
    Vector findTL(ArrayList<TheLoaiDongGopModel> listTL);
}
