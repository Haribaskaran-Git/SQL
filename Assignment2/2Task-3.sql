use HMbank;
select * from accounts;
select * from customers;
select * from transactions;
-- 1. Write a SQL query to Find the average account balance for all customers.
select accountid ,customerid,avg(balance) from accounts group by accountid;


-- 2. Write a SQL query to Retrieve the top 10 highest account balances.
select accountid ,customerid ,balance from accounts group by accountid order by balance desc;

-- 3. Write a SQL query to Calculate Total Deposits for All Customers in specific date.
select a.customerid ,sum(t.amount), t.transactiontype , t.transactiondate from accounts a inner join transactions t
on a.accountid = t. accountid where t. transactiontype = 'Deposit' 
and t.transactiondate ='2024-04-05'
group by a.accountid;

-- 4. Write a SQL query to Find the Oldest and Newest Customers.
-- Oldest Customer
select firstname, lastname, DOB as oldest_customer_dob from Customers order by DOB ASC limit 1;

-- Newest Customer
select firstname, lastname, DOB as newest_customer_dob from Customers order by DOB DESC limit 1;


-- 5. Write a SQL query to Retrieve transaction details along with the account type.
select a.accountid , a.accounttype, t.amount ,t.transactiontype , t.transactiondate
from accounts a inner join transactions t on a.accountid
= t.accountid ;

-- 6. Write a SQL query to Get a list of customers along with their account details.
select * from customers c inner join accounts a on c.customerid = a.customerid ;

-- 7. Write a SQL query to Retrieve transaction details along with customer information for a specific account
select t.transactionid,t.transactiontype,t.amount,t.transactiondate,
c.customerid,c.firstname,c.lastname,c.email,c.phone_number,c.address
from Transactions t
inner join Accounts a ON t.accountid = a.accountid
inner join Customers c ON a.customerid = c.customerid
where a.accountid = 105;


-- 8. Write a SQL query to Identify customers who have more than one account.
select customerid , count(*) from Accounts group by customerid having count(*) > 1;


-- 9. Write a SQL query to Calculate the difference in transaction amounts between deposits and withdrawals.
select accountid, sum(case when transactiontype = 'deposit' then amount else 0 end) as totaldeposits,
sum(case when transactiontype = 'withdrawal' then amount else 0 end) as totalwithdrawals,
sum(case when transactiontype = 'deposit' then amount else -amount end) as netdifference from transactions 
group by accountid;


-- 10. Write a SQL query to Calculate the average daily balance for each account over a specified period.
select a.accountid , t.transactiondate , avg(a.balance)
from accounts a inner join transactions t
on a.accountid = t.accountid
where t.transactiondate between '2024-04-03' and '2024-04-07'
group by a.accountid ,t.transactiondate;


-- 11. Calculate the total balance for each account type.
select  accounttype, SUM(balance) as totalbalance
from Accounts
group by accounttype;



-- 12. Identify accounts with the highest number of transactions order by descending order.
select t.accountid ,count(*) from transactions t group by t.accountid
order by count(*) desc;


-- 13. List customers with high aggregate account balances, along with their account types.
select c.customerid,c.firstname,c.lastname,a.accounttype,
    SUM(a.balance) as aggregatebalance
from Customers c inner join Accounts a on c.customerid = a.customerid
group by c.customerid,c.firstname,c.lastname,a.accounttype
having aggregatebalance > '2000'
order by aggregatebalance DESC;


-- 14. Identify and list duplicate transactions based on transaction amount, date, and account.
select accountid ,count(*) from transactions group by accountid having count(*) <> 1;
