CREATE DATABASE furama;

use furama;

create table HopDong (
IDHopDong int,
IDNhanVien int,
IDKhachHang int,
IDDichVu int,
NgayLamDichVu date,
NgayKetThuc date,
TienDatCoc int,
TongTien int
);


create table NhanVien (
IDNhanVien int,
HoTen int,
IDViTri int,
IDTrinhDo int,
IDBoPhan int,
NgaySinh date,
SoCMTND varchar(45),
Luong varchar(45),
SDT varchar(45),
Email varchar(45),
DiaChi varchar(45)
);

create table ViTri (
IDViTri int,
TenViTri varchar(45)
);

create table TrinhDo (
IDTrinhDo int,
TrinhDo varchar(45)
);

create table TrinhDo (
IDBoPhan int,
TenBoPhan varchar(45)
);

create table HopDongChiTiet (
IDHopDongChiTiet int,
IDHopDong int,
IDDichVuDiKem int,
SoLuong int
);

create table DichVuDiKem (
IDDichVuDiKem int,
TenDichVuDiKem varchar(45),
Gia int,
DonVi int,
TrangThaiKhaDung varchar(45)
);


create table KhachHang (
IDKhachHang int,
IDLoaiKhach int,
HoTen varchar(45),
NgaySinh date,
SoCMTND varchar(45),
SDT varchar(45),
Email varchar(45),
DiaChi varchar(45)
);

create table LoaiKhach (
IDLoaiKhach int,
TenLoaiKhach varchar(45)
);

create table KhachHang (
IDDichVu int,
TenDichVu varchar(45),
IDLoaiDichVu int,
DienTich int,
SoTang int,
SoNguoiToiDa varchar(45),
ChiPhiThue varchar(45),
IDKieuThue varchar(45),
TrangThai varchar(45)
);

create table KieuThue (
IDKieuThue int,
TenKieuThue varchar(45),
Gia int
);

create table LoaiDichVu (
IDLoaiDichVu int,
TenLoaiDichVu varchar(45)
);