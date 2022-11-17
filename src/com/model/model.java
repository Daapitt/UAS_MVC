/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.controller.controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import com.koneksi.koneksi;
import com.view.view;


/**
 *
 * @author LAB 1 PC 39
 */
public class model implements controller{
     
    @Override
    public void simpan(view view) throws SQLException {
     try {
           Connection con = koneksi.getkoneksi();
           String sql = "Insert Into data_diri VALUES(?,?,?)";
           PreparedStatement prepare = con.prepareStatement(sql);
           prepare.setString(1, view.txtnama.getText());
           prepare.setString(2, view.txtalamat.getText());
           prepare.setString(3, view.txtnotelp.getText());
           prepare.executeUpdate();
           JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
           prepare.close();
           } catch (Exception e) {
               System.out.println(e);
           } finally {
                   
       }    
    }

    @Override
    public void hapus(view view) throws SQLException {
       
    }

    @Override
    public void update(view view) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
