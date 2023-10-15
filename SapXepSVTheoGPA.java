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
public class SapXepSVTheoGPA implements Comparator<SinhVien>  {
    @Override
    public int compare(SinhVien sinhVien1, SinhVien sinhVien2) {
        if (sinhVien1.getGPA() > sinhVien2.getGPA()) {
            return 1;
        }
        return -1;
    }
}
