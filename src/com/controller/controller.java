/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import java.sql.SQLException;
import  com.view.view;


/**
 *
 * @author LAB 1 PC 39
 */
public interface controller {
    public void simpan(view view) throws SQLException;
    public void hapus(view view) throws SQLException;
    public void update(view view) throws SQLException;
    
    
}

    

