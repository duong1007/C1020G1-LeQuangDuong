
delimiter //
drop trigger if exists Tr_2 //
create trigger Tr_2 before update on hop_dong
for each row 
begin
if datediff(new.ngay_ket_thuc,old.ngay_lam_dich_vu) < 2 then

signal sqlstate "45000" set message_text = "ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày";

end if;

end ; 
//
delimiter ;