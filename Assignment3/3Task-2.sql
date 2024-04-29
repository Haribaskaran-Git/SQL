-- TASK 2
-- 1. Write an SQL query to insert a new student into the "Students" table with the following details

insert into students (studentid, firstname, lastname, dateofbirth, email, phonenumber) 
values (11, 'John', 'Doe', '1995-08-15', 'john.doe@example.com', '1234567890');

-- 2. Write an SQL query to enroll a student in a course. Choose an existing student and course and insert a record into the "Enrollments" table with the enrollment date.

insert into enrollments (enrollmentid, studentid, courseid, enrollmentdate) 
values (11, 7, 8, '2024-04-23');

-- 3. Update the email address of a specific teacher in the "Teacher" table. Choose any teacher and modify their email address.

update teacher set email = 'abc@example.com' where  teacherid = 7;
select * from teacher;

-- 4. Write an SQL query to delete a specific enrollment record from the "Enrollments" table. Select an enrollment record based on the student and course.

delete from enrollments where studentid = 7 and courseid = 8;

-- 5. Update the "Courses" table to assign a specific teacher to a course. Choose any course and teacher from the respective tables.

update courses set teacherid = 5 where courseid = 6;

-- 6. Delete a specific student from the "Students" table and remove all their enrollment records from the "Enrollments" table. Be sure to maintain referential integrity.

delete from Payments where studentid = 3;
delete from Enrollments where studentid = 3;
delete from Students where studentid = 3;

-- 7. Update the payment amount for a specific payment record in the "Payments" table. Choose any payment record and modify the payment amount.

update payments set amount = 1000 where paymentid = 2;