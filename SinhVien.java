/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author AUGUST
 */
public class SinhVien {

    private int ID;
    private String Name;
    private int Age;
    private String Address;
    private float GPA;
    public SinhVien(){}// khoi tao ham khong tham so    
    
    public SinhVien(int ID, String Name, int Age, String Address, float GPA )
    {
        this.ID = ID ; 
        this.Name = Name;
        this.Age = Age;
        this.Address = Address;
        this.GPA = GPA;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }
    public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\tNhap iD Sinh Vien: ");
        this.ID = sc.nextInt();
        sc.nextLine();
        System.out.print("\tNhap Name Sinh Vien: ");
        this.Name = sc.nextLine();
        System.out.print("\tNhap Diem GPA cua SInh Vien: ");
        this.GPA = sc.nextFloat();
        System.out.print("\tNhap Address Sinh Vien: ");
        this.Address = sc.nextLine();
        sc.nextLine();
        System.out.print("\tNhap Age SInh Vien: ");
        this.Age = sc.nextInt();
    }
//    public void HienThiThongTin() {
//        System.out.println("\tId: " + ID);
//        System.out.println("\tTen: " + Name);
//        System.out.println("\tDiem trung binh: " + GPA);
//        System.out.println("\tAddress: " + Address);
//        System.out.println("\tTuoi: " + Age);
//    }
    public int NhapID()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\tNhap iD Sinh Vien: ");
        while(true)
        {
            try {
                int ID = Integer.parseInt((sc.nextLine()));
                return ID;
            }
            catch(NumberFormatException ex)
            {
                System.out.print("khong hop le moi Nhap lai iD Sinh Vien: ");
            }
        }
    }
    public int NhapAge()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\tNhap tuoi Sinh Vien: ");
        while(true)
        {
            try {
                int Age = Integer.parseInt((sc.nextLine()));
                if(Age <0 && Age>100)
                {
                    return Age;
                }
            }
            catch(NumberFormatException ex)
            {
                System.out.print("khong hop le moi Nhap lai Tuoi Sinh Vien: ");
            }
        }
    }
    public float NhapGPA()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\tNhap GPA Sinh Vien: ");
        while(true)
        {
            try {
                float GPA = Float.parseFloat((sc.nextLine()));
                if(GPA <0.0 && GPA>10.0)
                {
                    return GPA;
                }
            }
            catch(NumberFormatException ex)
            {
                System.out.print("khong hop le moi Nhap lai GPA Sinh Vien: ");
            }
        }
    }
        public void HienThiThongTin() {
        System.out.println("\tId: " + ID);
        System.out.println("\tTen: " + Name);
        System.out.println("\tDiem trung binh: " + GPA);
        System.out.println("\tAddress: " + Address);
        System.out.println("\tTuoi: " + Age);
    }
}