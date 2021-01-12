use furama;

SELECT *
from khach_hang
where Dia_Chi in ("Quang Tri","Da Nang") 
and ( (YEAR(CURRENT_TIMESTAMP) - year(khach_hang.Ngay_Sinh) > 18) and YEAR(CURRENT_TIMESTAMP) - year(khach_hang.Ngay_Sinh) < 50);
