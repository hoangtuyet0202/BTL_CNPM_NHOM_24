/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.ThuPhiModel;
import java.util.List;

/**
 *
 * @author VITQUAY
 */
public interface IThuPhiDAO extends IGenericDAO<ThuPhiModel> {

    List<ThuPhiModel> findAll();

    void insert(ThuPhiModel newTP);

    void update(ThuPhiModel updateTP);

    void delete(int maTP);
}
