use hmbank;
select * from accounts;
select * from customers;
select * from transactions;

-- 1. Retrieve the customer(s) with the highest account balance.
select customerid , balance from accounts where balance = any (select max(balance) from accounts ); 


-- 2. Calculate the average account balance for customers who have more than one account.
select AVG(balance) as averagebalance
from Accounts where customerid in (
    select customerid from Accounts
    group by customerid
    having COUNT(*) > 1);

-- 3. Retrieve accounts with transactions whose amounts exceed the average transaction amount.
select distinct accountid from transactions 
where amount > (select avg(amount) from transactions);

-- 4. Identify customers who have no recorded transactions.
select customerid from accounts where customerid <> all(select customerid from customers );

-- 5. Calculate the total balance of accounts with no recorded transactions.
select customerid , sum(balance) from accounts a where not exists (select * from transactions t where a.accountid = t.accountid ) group by accountid;

-- 6. Retrieve transactions for accounts with the lowest balance.
select * from transactions where accountid in 
(select accountid from accounts where balance =(select min(balance) from accounts) );

-- 7. Identify customers who have accounts of multiple types.
select customerid from Accounts
group by customerid
having COUNT(DISTINCT accounttype) > 1;

-- 8. Calculate the percentage of each account type out of the total number of accounts.
select accounttype, COUNT(*) / (select COUNT(*) from Accounts) * 100 as percentage
from accounts
group by accounttype;


-- 9. Retrieve all transactions for a customer with a given customer_id.
select * from Transactions
where accountid IN (select accountid
    from Accounts
    where customerid = 7);


-- 10. Calculate the total balance for each account type, including a subquery within the SELECT clause.
select accounttype, (select SUM(balance) from Accounts where accounttype = a.accounttype) as totalbalance
from Accounts a
group by accounttype;

