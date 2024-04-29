-- TASK 4
-- 1. Write an SQL query to calculate the average number of students enrolled in each course. Use aggregate functions and subqueries to achieve this.

select avg(enrollmentcount) as averageenrollmentcount
from (select count(studentid) as enrollmentcount 
from enrollments group by courseid) as enrollmentcounts;

-- 2. Identify the student(s) who made the highest payment. Use a subquery to find the maximum payment amount and then retrieve the student(s) associated with that amount.

select studentid from payments where amount = (select max(amount) from payments);

-- 3. Retrieve a list of courses with the highest number of enrollments. Use subqueries to find the course(s) with the maximum enrollment count.

select courseid from (select courseid, count(studentid) as enrollmentcount from enrollments group by courseid) as courseenrollments
inner join (select max(enrollmentcount) as maxenrollmentcount from (select count(studentid) as enrollmentcount from enrollments
group by courseid) as innerquery) as maxenrollmentsubquery
on courseenrollments.enrollmentcount = maxenrollmentsubquery.maxenrollmentcount limit 1;

-- 4. Calculate the total payments made to courses taught by each teacher. Use subqueries to sum payments for each teacher's courses.

select t.teacherid, sum(p.amount) as totalpayments
from teacher t inner join courses c on t.teacherid = c.teacherid inner join enrollments e on c.courseid = e.courseid
inner join payments p on e.studentid = p.studentid group by t.teacherid;

-- 5. Identify students who are enrolled in all available courses. Use subqueries to compare a student's enrollments with the total number of courses.

select studentid from (select studentid, count(distinct courseid) as enrolledcourses from enrollments group by studentid) as studentenrollments
where enrolledcourses = (select count(distinct courseid) from courses);

-- 6. Retrieve the names of teachers who have not been assigned to any courses. Use subqueries to find teachers with no course assignments.

select t.firstname, t.lastname from teacher t left join courses c on t.teacherid = c.teacherid 
where c.courseid is null;

-- 7. Calculate the average age of all students. Use subqueries to calculate the age of each student based on their date of birth.

select avg(datediff(curdate(), dateofbirth) / 365) as averageage from students;

-- 8. Identify courses with no enrollments. Use subqueries to find courses without enrollment records.

select courseid from courses where courseid not in (select distinct 
courseid from enrollments);

-- 9. Calculate the total payments made by each student for each course they are enrolled in. Use subqueries and aggregate functions to sum payments.

select sum(amount), p.studentid , s.firstname, s.lastname
from payments p inner join students s on p.studentid = s.studentid group by s.studentid;

-- 10. Identify students who have made more than one payment. Use subqueries and aggregate functions to count payments per student and filter for those with counts greater than one.

select studentid from payments group by studentid having count(paymentid) > 1;

-- 11. Write an SQL query to calculate the total payments made by each student. Join the "Students" table with the "Payments" table and use GROUP BY to calculate the sum of payments for each student.

select sum(amount), p.studentid , s.firstname, s.lastname
from payments p inner join students s on p.studentid = s.studentid group by s.studentid;

-- 12. Retrieve a list of course names along with the count of students enrolled in each course. Use JOIN operations between the "Courses" table and the "Enrollments" table and GROUP BY to count enrollments.

select c.coursename, count(e.studentid) as enrolledstudents from courses c left join enrollments e 
on c.courseid = e.courseid
group by c.courseid, c.coursename;

-- 13. Calculate the average payment amount made by students. Use JOIN operations between the "Students" table and the "Payments" table and GROUP BY to calculate the averag

select s.studentid, s.firstname, s.lastname, avg(p.amount) as averagepaymentamount
from students s inner join payments p on s.studentid = p.studentid 
group by s.studentid, s.firstname, s.lastname;