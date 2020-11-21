/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.HoKhauModel;
import java.util.List;

/**
 *
 * @author VITQUAY
 */
public interface IHoKhauDAO extends IGenericDAO<HoKhauModel> {

    List<HoKhauModel> findAll();

    void insert(HoKhauModel newHK);

    void update(HoKhauModel updateHK);

    void delete(int maHK);
}
