use furama;

insert into kieu_thue 
values 
(1,"year",1000),
(2,"month",500),
(3,"day",100),
(4,"hour",50);

insert into loai_dich_vu 
values 
(1,"ssvip"),
(2,"svip"),
(3,"vip");

insert into dich_vu_di_kem 
values 
(1,"massage",50,1,"on"),
(2,"karaoke",20,2,"on"),
(3,"food",10,3,"on"),
(4,"water",5,4,"on"),
(5,"motor",8,5,"on");

insert into dich_vu 
values 
(1,"Villa",1,500,3,20,10000,3,"on"),
(2,"Villa",2,300,3,20,8000,3,"on"),
(3,"House",1,300,2,10,6000,2,"on"),
(4,"House",2,200,2,10,5000,2,"on"),
(5,"Room",1,100,1,5,4000,1,"on"),
(6,"Room",2,100,1,5,2000,1,"on");

insert into trinh_do 
values 
(1,"Trung Cap"),
(2,"Cao Dang"),
(3,"Dai Hoc"),
(4,"Sau Dai Hoc");


insert into vi_tri 
values 
(1,"Le Tan"),
(2,"Phuc Vu"),
(3,"Chuyen Vien"),
(4,"Giam Sat"),
(5,"Quan Ly"),
(6,"Giam Doc");


insert into Bo_phan 
values 
(1,"Sale – Marketing"),
(2,"Hanh Chinh"),
(3,"Phuc Vu"),
(4,"Quan Ly");

insert into Loai_khach 
values 
(1,"Diamond"),
(2,"Platinium"),
(3,"Gold"),
(4,"Silver"),
(5,"Member");

insert into nhan_vien 
values 
(1,"Duong",6,4,4,"1998-07-10",035224373,30000000,031955881,"maybiluyena@gmail.com","da nang"),
(2,"Thu",5,4,4,"1998-01-29",3434323442,10000000,4553434,"maybiluyen@gmail.com","da nang"),
(3,"Trung",4,4,2,"1998-12-10",564564564,5000000,33453454,"maybiluye@gmail.com","da nang"),
(4,"Do",3,4,2,"1998-09-30",533454534,5000000,5654645634,"maybilu@gmail.com","da nang"),
(5,"Kiet",2,3,3,"1998-02-10",786756758,2000000,5467456546,"maybil@gmail.com","da nang"),
(6,"Kien",2,3,3,"1998-12-16",435564564,2000000,45643453,"may@gmail.com","da nang");


insert into khach_hang 
values 
(null,5,"Phuong","1963-07-10",563563654,031955881,"maybiluyena@gmail.com","da nang"),
(null,4,"Hong","1972-01-29",356756565,4553434,"maybiluyena@gmail.com","da nang"),
(null,3,"Thao","1954-03-10",674567467,33453454,"maybiluyena@gmail.com","da nang"),
(null,2,"Huong","1984-09-02",989897878,5654645634,"maybiluyena@gmail.com","da nang"),
(null,1,"Hung","2008-12-05",5634565664,5467456546,"maybiluyena@gmail.com","da nang");


insert into hop_dong
values 
(1,1,1,1,"2020-10-10","2021-10-10",555555,55555555),
(2,1,2,2,"2020-09-10","2020-12-10",444444,44444444),
(3,1,3,3,"2020-10-10","2020-12-13",333333,33333333),
(4,1,4,4,"2020-10-10","2021-10-15",222222,22222222);

insert into hop_dong_chi_tiet
values 
(1,1,1,4),
(2,2,1,2),
(3,3,2,1),
(4,4,3,1);

insert into khach_hang 
values 
(null,5,"Phuong","1963-07-10",563455665,031955881,"maybiluyena@gmail.com","da nang"),
(null,4,"Hong","1972-01-29",5463456,4575675674,"maybiluyena@gmail.com","da nang"),
(null,3,"Thao","1954-03-10",5645667675,3347667,"maybiluyena@gmail.com","da nang"),
(null,2,"Huong","1984-09-02",123444355,65464645634,"maybiluyena@gmail.com","da nang"),
(null,1,"Hung","2008-12-05",09989789,5467566546,"maybiluyena@gmail.com","da nang");

insert into hop_dong
values 
(null,1,9,4,"2018-12-10","2021-10-10",34234,23423423),
(null,1,10,6,"2018-03-10","2020-12-10",675464,45745665),
(null,1,9,3,"2019-06-20","2020-12-13",4564,3987665),
(null,1,8,1,"2019-06-10","2021-10-15",5664,4567656);

insert into hop_dong_chi_tiet
values 
(5,7,2,1),
(6,5,3,1),
(7,4,1,4),
(8,1,4,2),
(9,8,4,1),
(10,3,5,1),
(11,8,1,4),
(12,6,2,2);