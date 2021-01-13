
-- select *
-- from (
	select a.Ten_Dich_Vu_Di_Kem, max(a.sum)
    from
	(select dich_vu_di_kem.Ten_Dich_Vu_Di_Kem, sum(hop_dong_chi_tiet.So_Luong) sum
	from dich_vu_di_kem
	inner join hop_dong_chi_tiet on hop_dong_chi_tiet.ID_Dich_Vu_Di_Kem = dich_vu_di_kem.ID_Dich_Vu_Di_Kem
	group by hop_dong_chi_tiet.ID_Dich_Vu_Di_Kem) a;
-- where s.sum in (SELECT MAX(s.sum) f);


SELECT
    dich_vu_di_kem.id_dich_vu_di_kem,
    dich_vu_di_kem.ten_dich_vu_di_kem,
    dich_vu_di_kem.gia,
    dich_vu_di_kem.don_vi,
    dich_vu_di_kem.trang_thai_kha_dung,
    SUM(hop_dong_chi_tiet.so_luong) so_lan_su_dung
FROM
    hop_dong_chi_tiet
INNER JOIN
    dich_vu_di_kem ON dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem
GROUP BY dich_vu_di_kem.id_dich_vu_di_kem
HAVING so_lan_su_dung IN (SELECT
        MAX(temp.tong)
    FROM
        (SELECT
            SUM(hop_dong_chi_tiet.so_luong) AS tong
        FROM
            hop_dong_chi_tiet
        GROUP BY id_dich_vu_di_kem) AS temp);

