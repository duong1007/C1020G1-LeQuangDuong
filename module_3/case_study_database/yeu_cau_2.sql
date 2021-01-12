use furama;

select * from nhan_vien
where (ho_ten like "K%" or ho_ten like "H%"or ho_ten like "T%") 
and length(ho_ten) < 15;