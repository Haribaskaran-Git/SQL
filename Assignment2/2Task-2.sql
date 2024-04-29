use HMBank;
select * from accounts;
select * from customers;
select * from transactions;

-- 1. Write a SQL query to retrieve the name, account type and email of all customers.
select customers.firstname , customers.lastname,customers.email,accounts.accounttype from customers 
inner join accounts on customers.customerid = accounts.customerid;

-- 2. Write a SQL query to list all transaction corresponding customer.
select accounts.accountid,accounts.customerid,transactions.transactionid,transactions.transactiondate
,transactions.transactiontype,transactions.amount from accounts 
inner join transactions on accounts.accountid = transactions.accountid;

-- 3. Write a SQL query to increase the balance of a specific account by a certain amount.
update accounts set balance =balance+200 where customerid = 2;

-- 4. Write a SQL query to Combine first and last names of customers as a full_name.
select CONCAT(firstname, ' ', lastname) AS fullname from Customers;

-- 5. Write a SQL query to remove accounts with a balance of zero where the account type is savings.
delete from Accounts where balance = '0.00' and accounttype = 'Savings';

-- 6. Write a SQL query to Find customers living in a specific city.
select CONCAT(firstname, ' ', lastname) , address from customers where address = 'chennai';

-- 7. Write a SQL query to Get the account balance for a specific account.
select accountid , balance from accounts where  accountid = 105;

-- 8. Write a SQL query to List all current accounts with a balance greater than $1,000.
select accountid , balance from accounts where balance > 1000;

-- 9. Write a SQL query to Retrieve all transactions for a specific account.
select t.transactionid, t.accountid, t.transactiontype, t.amount, t.transactiondate
from Transactions t inner join Accounts a on t.accountid = a.accountid
where a.accountid = 105;


-- 10. Write a SQL query to Calculate the interest accrued on savings accounts based on a given interest rate.
select accountid, balance * 0.05 as interestaccrued  from accounts  
where accounttype = 'savings';


-- 11. Write a SQL query to Identify accounts where the balance is less than a specified overdraft limit.
select accountid , balance from accounts where balance < 1000;

-- 12. Write a SQL query to Find customers not living in a specific city.
select * from  Customers where address <> 'chennai';
