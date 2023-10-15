/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Comparator;

/**
 *
 * @author AUGUST
 */
public class SapXepSVTheoTen implements Comparator<SinhVien>  {
    @Override
   public int compare(SinhVien sinhVien1, SinhVien sinhVien2) {
       return sinhVien1.getName().compareTo(sinhVien2.getName());
   }
}