-- TASK 3
-- 1. Write an SQL query to calculate the total payments made by a specific student. You will need to join the "Payments" table with the "Students" table based on the student's ID

select sum(amount), p.studentid , s.firstname, s.lastname
from payments p inner join students s 
on p.studentid = s.studentid where s.studentid = 1; 

-- 2. Write an SQL query to retrieve a list of courses along with the count of students enrolled in each course. Use a JOIN operation between the "Courses" table and the "Enrollments" table

select c.courseid, c.coursename, count(e.studentid)
as enrolledstudents from courses c left join enrollments e 
on c.courseid = e.courseid group by c.courseid, c.coursename;

-- 3. Write an SQL query to find the names of students who have not enrolled in any course. Use a LEFT JOIN between the "Students" table and the "Enrollments" table to identify students without enrollments

select s.firstname, s.lastname from students s 
left join enrollments e on s.studenid = e.studentid
where e.studentid is null;

-- 4. Write an SQL query to retrieve the first name, last name of students, and the names of the courses they are enrolled in. Use JOIN operations between the "Students" table and the "Enrollments" and "Courses" tables

select s.firstname, s.lastname, c.coursename
from students s inner join enrollments e 
on s.studentid = e.studentid inner join courses c on e.courseid = c.courseid;

-- 5. Create a query to list the names of teachers and the courses they are assigned to. Join the "Teacher" table with the "Courses" table.

select t.firstname, t.lastname, c.coursename from teacher t inner join courses c 
on t.teacherid = c.teacherid;

-- 6. Retrieve a list of students and their enrollment dates for a specific course. You'll need to join the "Students" table with the "Enrollments" and "Courses" tables

select s.studentid, s.firstname,s.lastname, c.coursename , e.enrollmentdate from students s
inner join enrollments e on s.studentid = e.studentid 
inner join courses c on c.courseid = e.courseid 
where c.courseid = 8; 

-- 7. Find the names of students who have not made any payments. Use a LEFT JOIN between the "Students" table and the "Payments" table and filter for students with NULL payment records.

select s.firstname, s.lastname from students s 
left join payments p on s.studentid = p.studentid
where p.paymentid is null;

-- 8. Write a query to identify courses that have no enrollments. You'll need to use a LEFT JOIN between the "Courses" table and the "Enrollments" table and filter for courses with NULL enrollment records.

select c.courseid, c.coursename from courses c 
left join enrollments e on c.courseid = e.courseid
where e.courseid is null;

-- 9. Identify students who are enrolled in more than one course. Use a self-join on the "Enrollments" table to find students with multiple enrollment records.

select s.firstname, s.lastname
from students s
inner join ( select studentid from enrollments
    group by studentid having count(courseid) > 1
) as multicoursestudents on s.studentid = multicoursestudents.studentid;

-- 10. Find teachers who are not assigned to any courses. Use a LEFT JOIN between the "Teacher" table and the "Courses" table and filter for teachers with NULL course assignments.

select t.firstname, t.lastname from teacher t left join courses c on t.teacherid = c.teacherid where c.courseid is null;

