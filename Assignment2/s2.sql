create database HMBank;
use HMBank;
Drop Table If Exists Customers;
create table Customers(
customerid int,
firstname varchar(255),
lastname varchar(255),
DOB datetime,
email varchar(255),
phone_number varchar(10),
address varchar(255), 
primary key(customerid));

create table Accounts(
accountid int ,
customerid int,
accounttype varchar(255),
balance varchar(255),
primary key (accountid),
foreign key(customerid) references customers(customerid));

create table Transactions(
transactionid int,
accountid int,
transactiontype varchar(255),
amount varchar(255),
transactiondate datetime,
primary key(transactionid),
foreign key(accountid)references Accounts(accountid) );


INSERT INTO Customers (customerid, firstname, lastname, DOB, email, phone_number, address)
VALUES
(1, 'hari', 'baskaran', '1990-05-15', 'hari@abc.com', '1234567890', 'chennai'),
(2, 'allan', 'thomas', '1985-09-20', 'allan@abc.com', '9876543210', 'pune'),
(3, 'ganesh', 'raaj', '1988-07-10', 'ganesh@abc.com', '4567890123', 'delhi'),
(4, 'eakesh', 'kumar', '1995-03-25', 'eakesh@abc.com', '7890123456', 'chennai'),
(5, 'raj', 'ganesh', '1992-11-12', 'raj@abc.com', '2345678901', 'canada'),
(6, 'haresh', 'kumar', '1983-01-30', 'haresh@abc.com', '8901234567', 'chennai'),
(7, 'sai', 'rakesh', '1980-08-05', 'sai@abc.com', '3456789012', 'pune'),
(8, 'anandhan', 'das', '1987-12-18', 'das@abc.com', '6789012345', 'delhi'),
(9, 'arun', 'balaji', '1993-06-08', 'arun@abc.com', '0123456789', 'goa'),
(10, 'vikram', 'sathya', '1982-04-17', 'vikram@abc.com', '4567890123', 'chennai');


INSERT INTO Accounts (accountid, customerid, accounttype, balance)
VALUES
(101, 1, 'Savings', '1000'),
(102, 2, 'Current', '2500'),
(103, 3, 'zerobalance', '500'),
(104, 4, 'Current', '3500'),
(105, 5, 'Savings', '2000'),
(106, 6, 'Current', '1800'),
(107, 7, 'zerobalance', '3000'),
(108, 8, 'Current', '4000'),
(109, 9, 'Savings', '1500'),
(110, 10, 'zerobalance', '2700');


INSERT INTO Transactions (transactionid, accountid, transactiontype, amount, transactiondate)
VALUES
(201, 101, 'Deposit', '500', '2024-04-01 08:15:00'),
(202, 102, 'Withdrawal', '200', '2024-04-02 12:30:00'),
(203, 103, 'Deposit', '300', '2024-04-03 09:45:00'),
(204, 104, 'Transfer', '100', '2024-04-04 14:20:00'),
(205, 105, 'Deposit', '700', '2024-04-05 11:10:00'),
(206, 106, 'Withdrawal', '300', '2024-04-06 13:55:00'),
(207, 107, 'Deposit', '900', '2024-04-07 10:25:00'),
(208, 108, 'Transfer', '400', '2024-04-08 15:45:00'),
(209, 109, 'Deposit', '200', '2024-04-09 09:30:00'),
(210, 110, 'Transfer', '150', '2024-04-10 14:00:00');

update accounts set balance = '5000'
where accountid = 103;

