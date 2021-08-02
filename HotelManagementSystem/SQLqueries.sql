create database HMS;

use HMS;
show tables;


create table CustomerDetails(Name varchar(20),IDproof varchar(20),Address varchar(20),Phoneno varchar(20));

select * from CustomerDetails;


create table Foodmenu(ItemName varchar(20),Price double);

insert into Foodmenu values('DOSA',40),('NAAN',30),('CHAPPATHI',25),('FRIED_RICE',70),('NOODLES',70),('RICE',60),('MASALA',50),('COOLDRINKS',35);

select * from Foodmenu;

create table BookingDetails(Booking_No int,Roomtype varchar(20),NoofDays int,CheckIn long,CheckOut long);
select * from BookingDetails;