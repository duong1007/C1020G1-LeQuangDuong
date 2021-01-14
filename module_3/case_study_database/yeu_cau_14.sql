use furama;

select *
from
	(select hop_dong.ID_hop_dong, loai_dich_vu.Ten_Loai_Dich_Vu, dich_vu_di_kem.Ten_Dich_Vu_Di_Kem,hop_dong_chi_tiet.So_Luong, sum(hop_dong_chi_tiet.So_Luong) sum
	from dich_vu_di_kem
	inner join hop_dong_chi_tiet on hop_dong_chi_tiet.ID_Dich_Vu_Di_Kem = dich_vu_di_kem.ID_Dich_Vu_Di_Kem
	left join hop_dong on hop_dong.id_hop_dong= hop_dong_chi_tiet.ID_Hop_Dong
 	left join dich_vu on dich_vu.ID_Dich_Vu = hop_dong.ID_Dich_Vu
 	left join loai_dich_vu on dich_vu.ID_Loai_Dich_Vu = loai_dich_vu.ID_Loai_Dich_Vu
	group by hop_dong_chi_tiet.ID_Dich_Vu_Di_Kem) a
    
where sum = 1;