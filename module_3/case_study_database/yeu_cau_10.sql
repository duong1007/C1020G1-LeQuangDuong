select hop_dong.ID_Hop_Dong, hop_dong.Ngay_Lam_Dich_Vu, hop_dong.Ngay_Ket_Thuc, hop_dong.Tien_Dat_Coc, count(hop_dong_chi_tiet.ID_Hop_Dong) so_luong_dich_vu_di_kem
from hop_dong
left join hop_dong_chi_tiet on hop_dong.ID_Hop_Dong = hop_dong_chi_tiet.ID_Hop_Dong
group by hop_dong.ID_Hop_Dong;
