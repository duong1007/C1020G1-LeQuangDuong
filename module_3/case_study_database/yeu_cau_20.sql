select nhan_vien.ID_nhan_vien as ID, nhan_vien.Ho_Ten, nhan_vien.Email, nhan_vien.SDT, nhan_vien.Ngay_Sinh, nhan_vien.Dia_Chi
from nhan_vien
union
select khach_hang.ID_Khach_Hang, khach_hang.Ho_Ten, khach_hang.Email, khach_hang.SDT, khach_hang.Ngay_Sinh, khach_hang.Dia_Chi
from khach_hang;
