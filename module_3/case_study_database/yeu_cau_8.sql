select distinct khach_hang.Ho_Ten
from khach_hang;

select khach_hang.Ho_Ten
from khach_hang
group by khach_hang.Ho_Ten;

select khach_hang.Ho_Ten, count(khach_hang.Ho_Ten)
from khach_hang
group by khach_hang.Ho_Ten;

select khach_hang.Ho_Ten
from khach_hang
union 
select khach_hang.Ho_Ten
from khach_hang;

select distinctrow khach_hang.Ho_Ten
from khach_hang;