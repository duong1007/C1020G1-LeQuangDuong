CREATE DATABASE furama;

use furama;

create table hop_dong (
id_hop_dong int,
id_nhan_vien int,
id_khach_hang int,
id_dich_vu int,
ngay_lam_dich_vu date,
ngay_Ket_Thuc date,
Tien_Dat_Coc int,
Tong_Tien int
);


create table Nhan_Vien (
ID_Nhan_Vien int,
Ho_Ten int,
ID_Vi_Tri int,
ID_Trinh_Do int,
ID_Bo_Phan int,
Ngay_Sinh date,
So_CMTND varchar(45),
Luong int,
SDT varchar(45),
Email varchar(45),
Dia_Chi varchar(45)
);

create table Vi_Tri (
ID_Vi_Tri int,
Ten_Vi_Tri varchar(45)
);

create table Trinh_Do (
ID_Trinh_Do int,
Trinh_Do varchar(45)
);

create table Trinh_Do (
ID_Bo_Phan int,
Ten_Bo_Phan varchar(45)
);

create table Hop_Dong_Chi_Tiet (
ID_Hop_Dong_Chi_Tiet int,
ID_Hop_Dong int,
ID_Dich_Vu_Di_Kem int,
So_Luong int
);

create table Dich_Vu_Di_Kem (
ID_Dich_Vu_Di_Kem int,
Ten_Dich_Vu_Di_Kem varchar(45),
Gia int,
Don_Vi int,
Trang_Thai_Kha_Dung varchar(45)
);


create table Khach_Hang (
ID_Khach_Hang int,
ID_Loai_Khach int,
Ho_Ten varchar(45),
Ngay_Sinh date,
So_CMTND varchar(45),
SDT varchar(45),
Email varchar(45),
Dia_Chi varchar(45)
);

create table Loai_Khach (
ID_Loai_Khach int,
Ten_Loai_Khach varchar(45)
);

create table Khach_Hang (
ID_Dich_Vu int,
Ten_Dich_Vu varchar(45),
ID_Loai_Dich_Vu int,
Dien_Tich int,
So_Tang int,
So_Nguoi_Toi_Da int,
Chi_Phi_Thue int,
ID_Kieu_Thue varchar(45),
Trang_Thai varchar(45)
);

create table Kieu_Thue (
ID_Kieu_Thue int,
Ten_Kieu_Thue varchar(45),
Gia int
);

create table Loai_Dich_Vu (
ID_Loai_Dich_Vu int,
Ten_Loai_Dich_Vu varchar(45)
);