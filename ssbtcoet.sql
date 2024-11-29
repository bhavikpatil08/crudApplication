CREATE DATABASE ssbtcoet;
use ssbtcoet;
create table Department (
    DepartmentId INT auto_increment primary KEY,
    DepartmentName varchar(50) NOT NULL
    );
    
insert into Department (DepartmentName) values
('computer'),
('Civil'),
('Mechanical');

select * from Department;

create table Subjects (
    SubjectId INT auto_increment primary key,
    SubjectName varchar(50) not null
    );
    
create table Teacher (
    TeacherId Int auto_increment primary key,
    TeacherName varchar(50),
    LastName varchar(20),
    email varchar(50),
    PhoneNumber varchar(15),
    DOB date);
    
select * from subjects;

insert into Subjects (SubjectName) values
('CPP'),
('Operating_System'),
('Computer Network');

insert into Teacher (TeacherName) values
('Dhanashri Tayade'),
('Navneet Patil'),
('G. K. Patnaik');

create table Student (
    StudentId Int auto_increment primary Key,
    StudentName varchar(50)
    );
    
alter table Student
add LastName varchar(20),
add email varchar(50),
add PhoneNumber varchar(15),
add DOB date,
add Branch varchar(50);

select * from Student;

insert into Student (StudentName, LastName, email, PhoneNumber, DOB, Branch) values
('Rohit','Sharma','venom1@gmail.com','437377837497','2005-09-02','Civil');

select * from Student;
select * from Teacher; 

alter table Teacher 
add LastName varchar(20),
add email varchar(50),
add PhoneNumber varchar(15),
add DOB date ;

insert into Teacher (TeacherName, LastName, email, PhoneNumber, DOB) values
('Dhanashri','Tayade', 'xyz@gmail.com', '848438383933', '1985-01-05'),
('Navneet', 'Patil', 'abc@gmail.com', '123456789123', '1977-03-05'),
( 'G.K.','Patnaik','fgh@gmail.com', '234567891234', '1982-09-07');

drop table Teacher;
