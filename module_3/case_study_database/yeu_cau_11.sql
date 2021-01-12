select distinct khach_hang.Ho_Ten, loai_khach.Ten_Loai_Khach, dich_vu_di_kem.Ten_Dich_Vu_Di_Kem
from dich_vu_di_kem
inner join hop_dong_chi_tiet on hop_dong_chi_tiet.ID_Dich_Vu_Di_Kem = dich_vu_di_kem.ID_Dich_Vu_Di_Kem
inner join hop_dong on hop_dong.ID_Hop_Dong = hop_dong_chi_tiet.ID_Hop_Dong
inner join khach_hang on khach_hang.ID_Khach_Hang = hop_dong.ID_Khach_Hang
inner join loai_khach on loai_khach.ID_Loai_Khach = khach_hang.ID_Loai_Khach
where  loai_khach.Ten_Loai_Khach = "Diamond" and (khach_hang.Dia_Chi = "Vinh" or khach_hang.Dia_Chi = "Quang Ngai");