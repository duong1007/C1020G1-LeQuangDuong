drop trigger Tr_1;

delimiter //

create trigger Tr_1 after delete on hop_dong
for each row select count(hop_dong.ID_Hop_Dong) as so_hop_dong_con_lai into @r from hop_dong; 
//
delimiter ;

delete from hop_dong
where hop_dong.ID_Hop_Dong = 14;

select @r;


