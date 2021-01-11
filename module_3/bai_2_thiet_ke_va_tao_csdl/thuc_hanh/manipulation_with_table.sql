create database design_and_create_database;

CREATE TABLE contacts
( contact_id INT NOT NULL AUTO_INCREMENT,
  birthday DATE,
  CONSTRAINT contacts_pk PRIMARY KEY (contact_id)
);

CREATE TABLE suppliers
( supplier_id INT NOT NULL AUTO_INCREMENT,
  supplier_name VARCHAR(50) NOT NULL,
  account_rep VARCHAR(30) NOT NULL DEFAULT 'TBD',
  CONSTRAINT suppliers_pk PRIMARY KEY (supplier_id)
);

DROP TABLE suppliers;

ALTER TABLE contacts
  ADD last_name varchar(40) NOT NULL
    AFTER contact_id,
  ADD first_name varchar(35) NULL
    AFTER last_name,
  Add contact_type varchar (35) Null
    After first_name;
    
ALTER TABLE contacts
  MODIFY last_name varchar(50) NULL;

ALTER TABLE contacts
  DROP COLUMN contact_type;
  
ALTER TABLE contacts
  CHANGE COLUMN contact_type ctype
  varchar(20) NOT NULL;
  
  ALTER TABLE contacts
  RENAME TO people;