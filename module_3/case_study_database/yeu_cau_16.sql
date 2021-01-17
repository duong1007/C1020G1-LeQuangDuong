delete from nhan_vien 
where ID_Nhan_Vien not in (
						  select hop_dong.ID_Nhan_Vien 
						  from hop_dong
						  where hop_dong.Ngay_Lam_Dich_Vu between "2017-01-01" and "2019-12-31"
						  group by hop_dong.ID_Nhan_Vien
						  having count(hop_dong.ID_Nhan_Vien) > 0);
                      
select *
from nhan_vien;