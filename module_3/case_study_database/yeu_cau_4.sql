use furama;

select khach_hang.Ho_Ten, count(hop_dong.ID_Hop_Dong) so_lan
from khach_hang
inner join hop_dong on khach_hang.ID_Khach_Hang = hop_dong.ID_Khach_Hang
inner join loai_khach on khach_hang.ID_Loai_Khach = loai_khach.ID_Loai_Khach
where loai_khach.Ten_Loai_Khach = "Diamond"
group by khach_hang.ID_Khach_Hang
order by so_lan;
-- không ông diamon nào có hợp đồng