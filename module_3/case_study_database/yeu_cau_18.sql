

use furama;

create temporary table temp as
select hop_dong.ID_Khach_Hang, hop_dong.ID_Hop_Dong
from hop_dong
where (hop_dong.Ngay_Lam_Dich_Vu between "2016-01-01" and "2016-12-31") 
and hop_dong.ID_Khach_Hang not in (select hop_dong.ID_Khach_Hang
from hop_dong
where hop_dong.Ngay_Lam_Dich_Vu between "2017-01-01" and curdate());

delete from hop_dong_chi_tiet
where hop_dong_chi_tiet.ID_Hop_Dong in (select temp.ID_Hop_Dong from temp);

delete hop_dong, khach_hang from khach_hang
left join hop_dong on hop_dong.ID_Khach_Hang = khach_hang.ID_Khach_Hang
where khach_hang.ID_Khach_Hang in (select temp.ID_Khach_Hang from temp);




