select hop_dong.ID_Hop_Dong, nhan_vien.Ho_Ten, khach_hang.Ho_Ten, khach_hang.SDT, dich_vu.Ten_Dich_Vu, count(hop_dong_chi_tiet.ID_Hop_Dong) so_luong_dich_vu_di_kem, hop_dong.Tien_Dat_Coc
from dich_vu
inner join hop_dong on hop_dong.ID_Dich_Vu = dich_vu.ID_Dich_Vu
inner join nhan_vien on hop_dong.ID_Nhan_Vien = nhan_vien.ID_Nhan_Vien
inner join khach_hang on hop_dong.ID_Khach_Hang = khach_hang.ID_Khach_Hang
left join hop_dong_chi_tiet on hop_dong.ID_Hop_Dong = hop_dong_chi_tiet.ID_Hop_Dong
where hop_dong.Ngay_Lam_Dich_Vu in ( 
select hop_dong.Ngay_Lam_Dich_Vu
from hop_dong
where hop_dong.Ngay_Lam_Dich_Vu between "2019-09-01" and "2019-12-31") 
and
hop_dong.Ngay_Lam_Dich_Vu not in ( 
select hop_dong.Ngay_Lam_Dich_Vu
from hop_dong
where hop_dong.Ngay_Lam_Dich_Vu between "2019-01-01" and "2019-06-30")

group by hop_dong.ID_Hop_Dong;

select *
from hop_dong;