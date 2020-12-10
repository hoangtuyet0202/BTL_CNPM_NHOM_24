/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.TaiKhoanModel;

/**
 *
 * @author VITQUAY
 */
public interface ITaiKhoanDAO extends IGenericDAO<TaiKhoanModel> {

    TaiKhoanModel findByUserPass(String user, String pass);
}
