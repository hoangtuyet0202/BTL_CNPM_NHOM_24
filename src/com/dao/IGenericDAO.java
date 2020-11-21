/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.mapper.RowMapper;
import java.util.List;

/**
 *
 * @author VITQUAY
 */
public interface IGenericDAO<T> {
    <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);

    void update(String sql, Object... parameters);

    void insert(String sql, Object... parameters);
}
