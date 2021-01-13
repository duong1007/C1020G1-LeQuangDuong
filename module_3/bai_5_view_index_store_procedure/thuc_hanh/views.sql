CREATE VIEW customer_views AS

SELECT customerNumber, customerName, phone

FROM  customers;

-- Kết quả, ta sẽ có 1 bảng ảo customer_views, và sau đó chúng ta hoàn toàn có thể lấy dữ liệu từ bảng ảo này bằng lệnh:

select * from customer_views;


CREATE OR REPLACE VIEW customer_views AS

SELECT customerNumber, customerName, contactFirstName, contactLastName, phone

FROM customers

WHERE city = 'Nantes';

DROP VIEW customer_views;