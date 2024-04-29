use techshop;
-- Write an SQL query to retrieve the names and emails of all customers.
Select Firstname , lastname , email from customers ;

-- Write an SQL query to list all orders with their order dates and corresponding customer
select * from orders;
select * from customers;
select customers.firstname, customers.lastname,orders.orderdate
from customers inner join orders
on customers.customerid = orders.customerid;


-- Write an SQL query to insert a new customer record into the "Customers" table. Include customer information such as name, email, and address
insert into customers(customerid,Firstname , lastname , email) values
('11','alwin','Thomas','alwin@123');   

-- Write an SQL query to update the prices of all electronic gadgets in the "Products" table by increasing them by 10%
select * from products;
SET SQL_SAFE_UPDATES = 0;
UPDATE Products
SET Price = Price * 1.1
WHERE ProductID > 0;

 

-- Write an SQL query to delete a specific order and its associated order details from the "Orders" and "OrderDetails" tables. Allow users to input the order ID as a parameter
DELETE FROM OrderDetails WHERE OrderID = '31';
DELETE FROM Orders WHERE OrderID = '31';
    
-- Write an SQL query to insert a new order into the "Orders" table. Include the customer ID, order date, and any other necessary information.
INSERT INTO Orders (OrderId,CustomerID, OrderDate, TotalAmount)
VALUES('32','4','2024-04-25', '50000');

-- Write an SQL query to update the contact information (e.g., email and address) of a specific customer in the "Customers" table. Allow users to input the customer ID and new contact information
select * from CUSTOMERS;
update CUSTOMERS 
set EMAIL= 'baskaran@123' , Address = 'Madurai'
where customerid=1;

-- Write an SQL query to recalculate and update the total cost of each order in the "Orders" table based on the prices and quantities in the "OrderDetails" table.
select * from orders;
update orders od inner join (select orderdetails.orderid,sum(products.price * orderdetails.quantity)BillAmount
from products inner join orderdetails
on products.productId = orderdetails.productId
group by orderdetails.orderId
order by orderdetails.orderId)Ad
on od.orderId = ad.orderId
set totalamount = Ad.billamount ;

-- Write an SQL query to delete all orders and their associated order details for a specific customer from the "Orders" and "OrderDetails" tables. Allow users to input the customer ID as a parameter
DELETE FROM OrderDetails WHERE OrderID = '31';
DELETE FROM Orders WHERE OrderID = '31';

-- Write an SQL query to insert a new electronic gadget product into the "Products" table, including product name, category, price, and any other relevant details.
insert into products(ProductID,ProductName,Description,Price)
VALUES ('153','SDCARD', 'Storing data', '700');

-- Write an SQL query to update the status of a specific order in the "Orders" table (e.g., from "Pending" to "Shipped"). Allow users to input the order ID and the new status.
select * from orders;
ALTER TABLE orders
ADD status varchar(40);
update orders
set status='unshipped'
where orderid >0;

-- Write an SQL query to calculate and update the number of orders placed by each customer in the "Customers" table based on the data in the "Orders" table.

ALTER TABLE Customers
ADD COLUMN NumberOfOrders INT;

UPDATE Customers
SET customers.NumberOfOrders = (
    SELECT COUNT(*) 
    FROM Orders
    WHERE orders.CustomerId = customers.CustomerId
);
select * from customers;

