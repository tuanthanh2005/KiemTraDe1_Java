/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KiemTra.De1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLySach {
    private List<Sach> danhSach;

    public QuanLySach() {
        danhSach = new ArrayList<>();
        // Khởi tạo danh sách sách
        danhSach.add(new Sach("K011", "Lap trinh java", 95000, 2017));
        danhSach.add(new Sach("K012", "Co so du lieu", 85000, 2001));
        danhSach.add(new Sach("K013", "Nhap mon Lap trinh", 72000, 2013));
        danhSach.add(new Sach("K014", "Lap trinh Python", 39000, 2018));
        danhSach.add(new Sach("K015", "Lap trinh C#", 82000, 2015));
    }

    public void xuatToanBoSach() {
       double tongTriGia = 0;
        for (Sach sach : danhSach) {
            System.out.println(sach);
            tongTriGia += sach.getGiaBia();
        }
        System.out.println("Tong tri gia cua cac CD: " + tongTriGia);
    }

   public void laySachTruoc2025() {
        for ( Sach sach : danhSach) {
            if (sach.getNamXuatBan() < 2025) {
                System.out.println(sach);
            }
        }
   }

    public void timSachTheoTen() {
      
        for (Sach sach : danhSach) {
            if (sach.getTenSach().toLowerCase().contains("Lap trinh")) {
                System.out.println(sach);
            }
        }
    }

    public void sapXepSachTheoGia() {
        danhSach.sort(Comparator.comparingInt(Sach::getGiaBia));
        xuatToanBoSach();  // In danh sách sau khi đã sắp xếp
    }

    public void xoaSachTheoMa(String maSach) {
        danhSach.removeIf(sach -> sach.getMaSach().equals(maSach));
    }

    public void suaGiaSach(String maSach, int giaMoi) {
        for (Sach sach : danhSach) {
            if (sach.getMaSach().equals(maSach)) {
                sach.setGiaBia(giaMoi);
                break;
            }
        }
    }

    public int tinhTongTriGia() {
       double tong = 0;
        for (Sach sach : danhSach) {
            tong += sach.getGiaBia();
        }
        return (int) tong;
    }
}

  