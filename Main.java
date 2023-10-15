/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
//import static main.Main.SinhVienList;
/**
 *
 * @author AUGUST
 */
public class Main {
    static List<SinhVien>SinhVienList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
     int choose;
     
     do{
        Menu();
        choose = Integer.parseInt(sc.nextLine());
        switch(choose)
        {
            case 1:
                inputSinhVien();
                break;
            case 2:
                editSinhVien();
                break;
            case 3:
                deleteSinhVien();
                break;
            case 4:
                SapXepSVTheoTen();
                break;
            case 5:
                SapXepSVTheoGPA();
                break;
            case 6:
               ShowListSinhVien();
                break;
            case 0:
                System.out.println("thoat ");
                break;
            default:
                System.out.println("Nhap sai moi nhap lai ");
                break;
        }
       }while(choose !=6);
     }
     static void Menu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Them Sinh Vien.");
        System.out.println("2. Sua thong tin Sinh vien .");
        System.out.println("3. xoa sinh vien .");
        System.out.println("4. sap xep sinh vien theo gpa.");
        System.out.println("5. sap xep sinh vien theo name.");
        System.out.println("6. hien thi danh sach sinh vien.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Moi Nhap Lua Chon: ");
    }

    private static void inputSinhVien() {
        System.out.println("Nhap Vao So sinh vien Can them ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i<n ; i++)
        {
            System.out.println("Sinh Vien thu " + (i + 1)+  " "+"la ");
            SinhVien sv = new SinhVien();
            sv.NhapThongTin();
            SinhVienList.add(sv);
        }
    }
    private static void editSinhVien() {
        System.out.println("Nhap Vao ID sinh vien Can Sua  ");
        int ID = Integer.parseInt(sc.nextLine());
        for( SinhVien sinhVien : SinhVienList)
        {
            if(sinhVien.getID() == ID);
            {
                sinhVien.NhapThongTin();
                break;
            }
        }
    }
    private static void deleteSinhVien() {
        System.out.println("Nhap Vao ID sinh vien Can Xoa  ");
        int ID = Integer.parseInt(sc.nextLine());
        for( SinhVien sinhVien : SinhVienList)
        {
            if(sinhVien.getID() == ID);
            {
                SinhVienList.remove(sinhVien);
                break;
            }
        }
    }
//    private static void SortNameSinhVien() {
//        Collection.sort(SinhVienList, new Comparator<SinhVien>(){
//        @Override
//        public int compare (SinhVien o1, SinhVien o2)
//            {
//                return -o1.getName().compareToIgnoreCase(o2.getName());
//            }   
//        });
//    }
//    private  class GPASinhVien implements Comparator<SinhVien> {
//        Collection.sort(SinhVienList, new Comparator<SinhVien>(){
//        @Override
//        public int compare (SinhVien o1, SinhVien o2)
//            {
//                if(o1.getGPA()> o2.getGPA())
//                {
//                    return -1;
//                }
//                return 1;
//            }   
//        });
//    }
    public static SapXepSVTheoTen Comparator<SinhVien>  {
    @Override
   public int compare(SinhVien sinhVien1, SinhVien sinhVien2) {
       return sinhVien1.getName().compareTo(sinhVien2.getName()); 
   }
}
    private static void ShowListSinhVien() {
        for(SinhVien sinhVien :SinhVienList)
        {
            System.out.format("%5d | ", sinhVien.getID());
            System.out.format("%20s | ", sinhVien.getName());
            System.out.format("%5d | ", sinhVien.getAge());
            System.out.format("%20s | ", sinhVien.getAddress());
            System.out.format("%10.1f%n", sinhVien.getGPA());
//            sinhVien.HienThiThongTin();
        } 
    }
}
