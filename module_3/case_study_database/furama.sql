drop database if exists furama;

CREATE DATABASE furama;

use furama;

create table Vi_Tri (
ID_Vi_Tri int primary key,
Ten_Vi_Tri varchar(45)
);

create table Trinh_Do (
ID_Trinh_Do int primary key,
Trinh_Do varchar(45) not null
);

create table Bo_Phan (
ID_Bo_Phan int primary key,
Ten_Bo_Phan varchar(45) not null
);

create table Nhan_Vien (
ID_Nhan_Vien int primary key auto_increment,
Ho_Ten varchar(50) not null,
ID_Vi_Tri int not null,
ID_Trinh_Do int not null,
ID_Bo_Phan int not null,
Ngay_Sinh date not null,
So_CMTND varchar(45) not null unique,
Luong int not null,
SDT varchar(45) not null,
Email varchar(45) not null unique,
Dia_Chi varchar(45) not null,

foreign key (ID_Vi_Tri) references Vi_Tri (ID_Vi_Tri),
foreign key (ID_Trinh_Do) references Trinh_Do (ID_Trinh_Do),
foreign key (ID_Bo_Phan) references Bo_Phan (ID_Bo_Phan)
);

create table Loai_Khach (
ID_Loai_Khach int primary key,
Ten_Loai_Khach varchar(45)
);

create table Khach_Hang (
ID_Khach_Hang int primary key auto_increment,
ID_Loai_Khach int,
Ho_Ten varchar(45) not null,
Ngay_Sinh date not null,
So_CMTND varchar(45) not null,
SDT varchar(45) not null,
Email varchar(45) not null,
Dia_Chi varchar(45) not null,

foreign key (ID_Loai_Khach) references Loai_Khach (ID_Loai_Khach)

);

create table Kieu_Thue (
ID_Kieu_Thue int primary key ,
Ten_Kieu_Thue varchar(45),
Gia int
);

create table Loai_Dich_Vu (
ID_Loai_Dich_Vu int primary key,
Ten_Loai_Dich_Vu varchar(45)
);

create table Dich_Vu (
ID_Dich_Vu int primary key,
Ten_Dich_Vu varchar(45) not null,
ID_Loai_Dich_Vu int,
Dien_Tich int not null,
So_Tang int not null,
So_Nguoi_Toi_Da int not null,
Chi_Phi_Thue int not null,
ID_Kieu_Thue int not null,
Trang_Thai varchar(45) not null,

foreign key (ID_Kieu_Thue) references Kieu_Thue (ID_Kieu_Thue),
foreign key (ID_Loai_Dich_Vu) references Loai_Dich_Vu (ID_Loai_Dich_Vu)

);

create table Dich_Vu_Di_Kem (
ID_Dich_Vu_Di_Kem int primary key,
Ten_Dich_Vu_Di_Kem varchar(45),
Gia int not null,
Don_Vi int not null,
Trang_Thai_Kha_Dung varchar(45) not null
);


create table Hop_Dong (
ID_Hop_Dong int primary key auto_increment,
ID_Nhan_Vien int,
ID_Khach_Hang int,
ID_Dich_Vu int,
Ngay_Lam_Dich_Vu date not null,
Ngay_Ket_Thuc date not null,
Tien_Dat_Coc int not null,
Tong_Tien int not null,

foreign key (ID_Nhan_Vien) references Nhan_Vien (ID_Nhan_Vien),
foreign key (ID_Khach_Hang) references Khach_Hang (ID_Khach_Hang),
foreign key (ID_Dich_Vu) references Dich_vu (ID_Dich_Vu)
);

create table Hop_Dong_Chi_Tiet (
ID_Hop_Dong_Chi_Tiet int primary key,
ID_Hop_Dong int,
ID_Dich_Vu_Di_Kem int,
So_Luong int not null,

foreign key (ID_Hop_Dong) references Hop_Dong (ID_Hop_Dong),
foreign key (ID_Dich_Vu_Di_Kem) references Dich_Vu_Di_Kem (ID_Dich_Vu_Di_Kem)
);
