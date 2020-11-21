/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.DongGopModel;
import java.util.List;

/**
 *
 * @author VITQUAY
 */
public interface IDongGopDAO extends IGenericDAO<DongGopModel> {

    List<DongGopModel> findAll();

    List<DongGopModel> findByTheLoai(int maTL);

    void insert(DongGopModel newDG);

    void update(DongGopModel updateDG);
}
