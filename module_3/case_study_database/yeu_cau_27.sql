-- phần a
delimiter // 

create function func_1()
returns int

begin 
declare result int;

set result = (select count(sum)
			  from (select sum(hop_dong.Tong_Tien) sum 
				    from hop_dong 
				    group by hop_dong.ID_Dich_Vu 
				    having sum > 20000) sum_tabe);
      
      
return result;

end ;

// 
delimiter ;
SET GLOBAL log_bin_trust_function_creators = 1;

SELECT FUNC_1();

-- phần b

delimiter // 

create function func_2(id int)
returns int

begin 
declare result int;

set result = (SELECT 
    MAX(datediff)
FROM
    (SELECT 
        DATEDIFF(hop_dong.ngay_ket_thuc, hop_dong.ngay_lam_dich_vu) datediff
    FROM
        hop_dong
    WHERE
        ID_Khach_Hang = id
    GROUP BY hop_dong.ID_Hop_Dong) sum_day);
      
      
return result;

end ;

// 
delimiter ;

select func_2(1);