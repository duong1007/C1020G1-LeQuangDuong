use furama;


create temporary table temp as
select khach_hang.ID_Khach_Hang
from khach_hang
left join loai_khach on khach_hang.ID_Loai_Khach = loai_khach.ID_Loai_Khach
left join hop_dong on khach_hang.ID_Khach_Hang = hop_dong.ID_Khach_Hang
left join dich_vu on hop_dong.ID_Dich_Vu = dich_vu.ID_Dich_Vu
left join hop_dong_chi_tiet on hop_dong.ID_Hop_Dong = hop_dong_chi_tiet.ID_Hop_Dong
left join dich_vu_di_kem on hop_dong_chi_tiet.ID_Dich_Vu_Di_Kem = dich_vu_di_kem.ID_Dich_Vu_Di_Kem
group by khach_hang.ID_Khach_Hang
having sum(dich_vu.Chi_Phi_Thue + hop_dong_chi_tiet.So_Luong * dich_vu_di_kem.Gia) > 10000;

select * from temp;

update khach_hang
set khach_hang.ID_Loai_Khach = 1
where khach_hang.ID_Loai_Khach = 2 and exists (select id_khach_hang from temp);

drop temporary table temp;