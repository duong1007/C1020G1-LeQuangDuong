select *
from
(select nhan_vien.ID_Nhan_Vien, nhan_vien.Ho_Ten, trinh_do.Trinh_Do, bo_phan.Ten_Bo_Phan, nhan_vien.SDT, nhan_vien.Dia_Chi, count(hop_dong.ID_Nhan_Vien) count
from nhan_vien
left join hop_dong on hop_dong.ID_Nhan_Vien = nhan_vien.ID_Nhan_Vien
left join trinh_do on nhan_vien.ID_Trinh_Do = trinh_do.ID_Trinh_Do
left join bo_phan on nhan_vien.ID_Bo_Phan = bo_phan.ID_Bo_Phan
where hop_dong.Ngay_Lam_Dich_Vu between "2018-01-01" and "2019-12-31"
group by nhan_vien.ID_Nhan_Vien) a
where count < 3 or count = 3;
