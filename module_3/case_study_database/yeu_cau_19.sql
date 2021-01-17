insert into hop_dong
values 
(13,1,9,4,"2016-12-10","2016-12-20",34234,23423423),
(14,1,9,4,"2016-10-10","2016-12-20",34234,23423423);


update dich_vu_di_kem 
set dich_vu_di_kem.Gia = dich_vu_di_kem.Gia*2
where dich_vu_di_kem.ID_Dich_Vu_Di_Kem in (select dich_vu_di_kem.Ten_Dich_Vu_Di_Kem
										   from dich_vu_di_kem
										   inner join hop_dong_chi_tiet on hop_dong_chi_tiet.ID_Dich_Vu_Di_Kem = dich_vu_di_kem.ID_Dich_Vu_Di_Kem
										   inner join hop_dong on hop_dong.id_hop_dong = hop_dong_chi_tiet.ID_Hop_Dong
										   where year(hop_dong.Ngay_Lam_Dich_Vu) = 2019
										   group by hop_dong_chi_tiet.ID_Dich_Vu_Di_Kem
										   having sum(hop_dong_chi_tiet.So_Luong) > 10);

