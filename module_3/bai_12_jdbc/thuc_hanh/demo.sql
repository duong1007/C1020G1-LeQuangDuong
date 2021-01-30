drop database if exists demo;

CREATE DATABASE demo;
USE demo;

create table users (
 id  int NOT NULL AUTO_INCREMENT,
 name varchar(120) NOT NULL,
 email varchar(220) NOT NULL,
 country varchar(120),
 PRIMARY KEY (id)
);

insert into users(name, email, country) values('Minh','minh@codegym.vn','Viet Nam');
insert into users(name, email, country) values('Kante','kante@che.uk','Kenia');

DELIMITER $$

CREATE PROCEDURE get_user_by_id(IN user_id INT)

BEGIN

    SELECT users.name, users.email, users.country

    FROM users

    where users.id = user_id;

    END$$

DELIMITER ;

DELIMITER $$

CREATE PROCEDURE insert_user(

IN user_name varchar(50),

IN user_email varchar(50),

IN user_country varchar(50)

)

BEGIN

    INSERT INTO users(name, email, country) VALUES(user_name, user_email, user_country);

    END$$

DELIMITER ;

create table Permission(

id int primary key,

name varchar(50)

);

insert into Permission(id,name) values(1,'add');

insert into Permission(id,name) values(2,'edit');

insert into Permission(id,name) values(3,'delete');

insert into Permission(id,name) values(4,'view');

 

create table User_Permission(

permission_id int,

user_id int

);