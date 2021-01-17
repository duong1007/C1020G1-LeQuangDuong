drop view V_nhan_vien;

create view V_nhan_vien as
select *
from Nhan_vien
where dia_chi = "hai chau" and id_nhan_vien in ( select id_nhan_vien from hop_dong where hop_dong.ngay_lam_dich_vu = "2019/12/12");

select * from V_nhan_vien;
 
