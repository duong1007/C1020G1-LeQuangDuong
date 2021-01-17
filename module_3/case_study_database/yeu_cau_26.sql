
delimiter //

create trigger Tr_2 before update on hop_dong
for each row 
begin
if datediff(hop_dong.ngay_ket_thuc,hop_dong.ngay_lam_dich_vu) < 2 then

set @result = "ngay ket thuc phai lon hon ngay lam hop dong it nhat 2 ngay" ;


else
set @result = "ok" ;

end if;

end ; 
//
delimiter ;