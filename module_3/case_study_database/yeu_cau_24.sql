
DELIMITER //

create procedure add_hop_dong (
ID_Hop_Dongn int ,
ID_Nhan_Vienn int,
ID_Khach_Hangn int,
ID_Dich_Vun int,
Ngay_Lam_Dich_Vun date ,
Ngay_Ket_Thucn date ,
Tien_Dat_Cocn int ,
Tong_Tienn int)

begin 

if ID_Hop_Dongn in (select ID_Hop_Dong from hop_dong ) then

select "id hop dong is exists";

elseif ID_Nhan_Vienn not in (select ID_Nhan_Vien from nhan_vien) then
 
select "id nhan vien is not exists";

elseif ID_Khach_Hangn not in (select ID_Khach_Hang from khach_hang ) then

select "id khach hang is not exists";

elseif ID_Dich_Vun not in (select id_dich_vu from dich_vu) then

select "id dich vu is not exists";

else

insert into hop_dong 
values (ID_Hop_Dongn,ID_Nhan_Vienn,ID_Khach_Hangn,ID_Dich_Vun,Ngay_Lam_Dich_Vun,Ngay_Ket_Thucn,Tien_Dat_Cocn,Tong_Tienn);

end if;

end;

// DELIMITER ;


call add_hop_dong (null,500,4,4,"2020-10-10","2021-10-15",222222,22222222);

select * from hop_dong;

drop procedure add_hop_dong_test;
