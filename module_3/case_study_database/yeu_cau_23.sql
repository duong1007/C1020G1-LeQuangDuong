
delimiter //

drop procedure if exists Sp_1; //
create procedure Sp_1(id int)
begin

delete from hop_dong_chi_tiet
where hop_dong_chi_tiet.ID_Hop_Dong in (select ID_Hop_Dong from hop_dong where ID_Khach_Hang = id);

delete from hop_dong
where hop_dong.ID_Khach_Hang = id;

delete from khach_hang
where khach_hang.ID_Khach_Hang = id;

end;
//
delimiter ;


call Sp_1(8);

