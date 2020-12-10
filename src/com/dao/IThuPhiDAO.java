/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.ThuPhiModel;
import java.util.List;

public interface IThuPhiDAO extends IGenericDAO<ThuPhiModel> {

    List<ThuPhiModel> findAll();
    
    List<ThuPhiModel> findByDate(String d1, String d2);
    
    ThuPhiModel findByMa(int maTP);
    
    List<ThuPhiModel> findByMaHK(int maHK);

    void insert(ThuPhiModel newTP);

    void update(ThuPhiModel updateTP);

    void delete(int maTP);
}
