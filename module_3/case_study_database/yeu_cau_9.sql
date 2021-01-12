select month(hop_dong.Ngay_Lam_Dich_Vu) as thang, count(month(hop_dong.Ngay_Lam_Dich_Vu)) as so_luong
from hop_dong
where year(hop_dong.Ngay_Lam_Dich_Vu) = 2019
group by thang
order by thang;