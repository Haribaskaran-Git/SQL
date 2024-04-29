-- TASK 1
-- 1. Create the database named "SISDB"

drop database if exists sisdb;
create database sisdb;
use sisdb;

-- 2. Define the schema for the Students, Courses, Enrollments, Teacher, and Payments tables based  on the provided schema. Write SQL scripts to create the mentioned tables with appropriate data types, constraints, and relationships. 
-- 4. Create appropriate Primary Key and Foreign Key constraints for referential integrity.

drop table if exists students;
create table students (
    studentid int primary key,
    firstname varchar(50),
    lastname varchar(50),
    dateofbirth date,
    email varchar(100),
    phonenumber varchar(15));

-- create teacher table

drop table if exists teacher;
create table teacher (
    teacherid int primary key,
    firstname varchar(50),
    lastname varchar(50),
    email varchar(100));

-- create courses table
drop table if exists courses;
create table courses (
    courseid int primary key,
    coursename varchar(100),
    credits int,
    teacherid int,
    foreign key (teacherid) references teacher(teacherid));

-- create enrollments table
drop table if exists enrollments;
create table enrollments (
    enrollmentid int primary key,
    studentid int,
    courseid int,
    enrollmentdate date,
    foreign key (studentid) references students(studentid),
    foreign key (courseid) references courses(courseid));

-- create payments table
drop table if exists payments;
create table payments (
    paymentid int primary key,
    studentid int,
    amount numeric(10, 2),
    paymentdate date,
    foreign key (studentid) references students(studentid));

-- insert sample records into students table
-- 5. Insert at least 10 sample records into each of the following tables.

-- Students table
INSERT INTO students (studentid, firstname, lastname, dateofbirth, email, phonenumber)
VALUES
    (1, 'Aarav', 'Sharma', '2000-05-15', 'aarav.sharma@example.com', '1234567890'),
    (2, 'Aanya', 'Patel', '1999-08-22', 'aanya.patel@example.com', '9876543210'),
    (3, 'Aaradhya', 'Singh', '2001-03-10', 'aaradhya.singh@example.com', '4567890123'),
    (4, 'Aditya', 'Kumar', '2002-11-28', 'aditya.kumar@example.com', '7890123456'),
    (5, 'Advik', 'Jain', '2000-07-04', 'advik.jain@example.com', '2345678901'),
    (6, 'Ananya', 'Gupta', '2003-01-20', 'ananya.gupta@example.com', '3456789012'),
    (7, 'Aarav', 'Verma', '2002-09-12', 'aarav.verma@example.com', '4567890123'),
    (8, 'Aarav', 'Reddy', '2001-04-30', 'aarav.reddy@example.com', '5678901234'),
    (9, 'Aadhya', 'Srivastava', '2000-08-07', 'aadhya.srivastava@example.com', '6789012345'),
    (10, 'Aarush', 'Choudhary', '2001-12-18', 'aarush.choudhary@example.com', '7890123456');

-- Teacher table
INSERT INTO teacher (teacherid, firstname, lastname, email)
VALUES
    (1, 'Sneha', 'Pandey', 'sneha.pandey@example.com'),
    (2, 'Rahul', 'Desai', 'rahul.desai@example.com'),
    (3, 'Priya', 'Shah', 'priya.shah@example.com'),
    (4, 'Amit', 'Patil', 'amit.patil@example.com'),
    (5, 'Neha', 'Mehta', 'neha.mehta@example.com'),
    (6, 'Rajesh', 'Sharma', 'rajesh.sharma@example.com'),
    (7, 'Pooja', 'Joshi', 'pooja.joshi@example.com'),
    (8, 'Anil', 'Gupta', 'anil.gupta@example.com'),
    (9, 'Divya', 'Singh', 'divya.singh@example.com'),
    (10, 'Vivek', 'Shinde', 'vivek.shinde@example.com');

-- Courses table
INSERT INTO courses (courseid, coursename, credits, teacherid)
VALUES
    (1, 'Mathematics', 3, 1),
    (2, 'English Literature', 4, 2),
    (3, 'History', 3, 3),
    (4, 'Biology', 4, 4),
    (5, 'Computer Science', 3, 5),
    (6, 'Physics', 3, 6),
    (7, 'Chemistry', 4, 7),
    (8, 'Geography', 3, 8),
    (9, 'Economics', 4, 9),
    (10, 'Psychology', 3, 10);


-- Enrollments table
INSERT INTO enrollments (enrollmentid, studentid, courseid, enrollmentdate)
VALUES
    (1, 1, 1, '2024-01-15'),
    (2, 2, 2, '2024-01-16'),
    (3, 3, 3, '2024-01-17'),
    (4, 4, 4, '2024-01-18'),
    (5, 5, 5, '2024-01-19'),
    (6, 6, 6, '2024-01-20'),
    (7, 7, 7, '2024-01-21'),
    (8, 8, 8, '2024-01-22'),
    (9, 9, 9, '2024-01-23'),
    (10, 10, 10, '2024-01-24');

-- Payments table
INSERT INTO payments (paymentid, studentid, amount, paymentdate)
VALUES
    (1, 1, 100, '2024-02-01'),
    (2, 2, 150, '2024-02-05'),
    (3, 3, 200, '2024-02-10'),
    (4, 4, 120, '2024-02-15'),
    (5, 5, 180, '2024-02-20'),
    (6, 6, 90, '2024-02-25'),
    (7, 7, 110, '2024-03-01'),
    (8, 8, 130, '2024-03-05'),
    (9, 9, 140, '2024-03-10'),
    (10, 10, 160, '2024-03-15');
