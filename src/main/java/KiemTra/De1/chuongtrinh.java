/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KiemTra.De1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class chuongtrinh {
    public static void main(String[] args) {
        QuanLySach qlcd = new QuanLySach();
        Scanner scanner = new Scanner(System.in);
        int luachon;

        do {
              System.out.println("==== Menu Quản Lý Sách ====");
            System.out.println("1. Xuất toàn bộ sách và tổng trị giá");
            System.out.println("2. Lấy các sách xuất bản trước năm 2015");
            System.out.println("3. Tìm các sách có ký tự đầu của tên sách là 'Lap trinh'");
            System.out.println("4. Sắp xếp sách theo giá tăng dần");
            System.out.println("5. Xóa sách theo mã sách");
            System.out.println("6. Sửa giá bìa sách theo mã sách");
            System.out.println("7. Tính tổng trị giá của các sách");
            System.out.println("8. Thoát");
            System.out.print("Chọn chức năng (1-8): ");
            luachon = scanner.nextInt();
            scanner.nextLine();  

            switch (luachon) {
                case 1:
                    qlcd.xuatToanBoSach();
                    break;
                case 2:
                    qlcd.laySachTruoc2025();
                    break;
                case 3:
                    qlcd.timSachTheoTen();
                    break;
                case 4:
                    qlcd.sapXepSachTheoGia();
                    System.out.println("Da sap xep theo gia tang.");
                    break;
                case 5:
                    System.out.print("Nhap ma so sach can xoa: ");
                    String masoXoa = scanner.nextLine();
                    qlcd.xoaSachTheoMa(masoXoa);
                    System.out.println("Da xoa sach co ma so: " + masoXoa);
                    break;
                case 6:
                    System.out.print("Nhap ma so sach can sua gia: ");
                    String masoSua = scanner.nextLine();
                    System.out.print("Nhap gia moi: ");
                    double giaMoi = scanner.nextDouble();
                    qlcd.suaGiaSach(masoSua, (int) giaMoi);
                    System.out.println("Da sua gia sach co ma so: " + masoSua);
                    break;
                case 7:
                    double tongTriGia = qlcd.tinhTongTriGia();
                    System.out.println("Tong tri gia cua cac sach: " + tongTriGia);
                    break;
                case 8:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        } while (luachon != 8);
    }
}