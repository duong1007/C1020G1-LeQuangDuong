select dich_vu.ID_Dich_Vu, dich_vu.Ten_Dich_Vu, dich_vu.Dien_Tich, dich_vu.So_Nguoi_Toi_Da, dich_vu.Chi_Phi_Thue, loai_dich_vu.Ten_Loai_Dich_Vu
from dich_vu
inner join loai_dich_vu on dich_vu.ID_Loai_Dich_Vu = loai_dich_vu.ID_Loai_Dich_Vu
where 
exists ( select hop_dong.Ngay_Lam_Dich_Vu
 from hop_dong 
 where hop_dong.Ngay_Lam_Dich_Vu between "2018-01-01" and "2018-12-31" )
and 
not exists ( select hop_dong.Ngay_Lam_Dich_Vu
 from hop_dong 
 where hop_dong.Ngay_Lam_Dich_Vu between "2019-01-01" and "2019-12-31" );
 