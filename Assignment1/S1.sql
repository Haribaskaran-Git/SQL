
Drop Table If Exists Customers;
create table Customers
(
	CustomerId int,
    FirstName varchar(30),
    LastName varchar(30),
    Email varchar(20),
    Phone varchar(10),
    Address varchar(40),
    primary key(CustomerId)
);
desc Customers;
select * from customers;
Drop Table If Exists products;
create table Products
(
	ProductId varchar(20),
    ProductName varchar(20),
    Description varchar(50),
    Price varchar(10),
    primary key(ProductId)
    
);
desc Products;
select * from Products;
Drop Table If Exists orders;
create table Orders(
	OrderId varchar(20),
    CustomerId varchar(20),
    OrderDate Datetime,
    totalAmount numeric(10,2),
    primary key(OrderId),
    Foreign key (CustomerId) references Customers(CustomerId)
    
);
desc Orders;
select * from Orders;

create table OrderDetails(
	OrderDetailID varchar(20),
	OrderID varchar(20),
	ProductID varchar(20),
	Quantity varchar(20),
    Foreign key(OrderID) references Orders(OrderID),
    Foreign key(ProductID) references Products(ProductID)
);

create table Inventory
(
	InventoryID varchar(20),
	ProductID varchar(20),
	QuantityInStock varchar(30),
	LastStockUpdate varchar(30),
    primary key(InventoryID),
    Foreign key(ProductID) references Products(ProductID)
);


insert into customers(CustomerId,FirstName ,LastName ,Email,Phone,Address)
values('1','Hari','Baskaran','hari@123','8833883321','Chennai'),
('2','Allan','Thomas','allan@123','9122383321','Pune'),
('3','Ganesh','raaj','raaj@123','8838889898','delhi'),
('4','eakesh','kumar','eakesh@123','9113883321','Chennai'),
('5','Raj','ganesh','raj@123','8819993321','Canada'),
('6','Haresh','kumar','haresh@123','9833880021','Chennai'),
('7','sai','rakesh','sai@123','7854883321','pune'),
('8','anandhan','Das','das@123','7833883001','delhi'),
('9','arun','Balaji','arun@123','9830083321','pune'),
('10','vikram','Sathya','vikram@123','7833803329','chennai');

insert into products(ProductID,ProductName,Description,Price)
VALUES ('141','Tablet', 'Versatile device for reading', '8000'),
       ('142','Laptop', 'Powerful laptop for work', '50000'),
       ('143','Headphones', 'Wireless headphones', '2000'),
       ('145','Coffee Maker', 'Brews delicious coffee', '15000'),
       ('147','Smart TV', 'Stream movies','25000'),
       ('148','Digital Camera', 'Capture stunning photos', '100000'),
       ('149','Smartphone', 'Latest smartphones', '30000'),
       ('150','Smartwatch', 'Stylish smartwatch', '4000'),
       ('151','Speakers', 'High-quality speakers', '1500'),
       ('152','Video Game', 'Popular video games', '500');

INSERT INTO Orders (OrderId,CustomerID, OrderDate, TotalAmount)
VALUES
  ('22','1','2024-04-20', '500'), 
  ('23','2','2024-04-22', '1500'), 
  ('24','3','2024-04-23', '4000'), 
  ('25','4', '2024-04-24', '30000'),
  ('26','5', '2024-04-24', '100000'),
  ('27','6','2024-04-24', '25000'), 
  ('28','7','2024-04-24', '15000'),
  ('29','8','2024-04-24', '2000'),
  ('30','9','2024-04-24', '50000'),
  ('31','10','2024-04-24','8000');  
       
INSERT INTO OrderDetails (OrderDetailID, OrderID, ProductID, Quantity)
VALUES
    ('OD12', '22', '141', '5'),
    ('OD13', '23', '142', '3'),
    ('OD14', '24', '143', '2'),
    ('OD15', '25', '145', '1'),
    ('OD16', '26', '147', '4'),
    ('OD17', '27', '148', '6'),
    ('OD18', '28', '149', '2'),
    ('OD19', '29', '150', '3'),
    ('OD20', '30', '151', '7'),
    ('OD21', '31', '152', '5');
    
INSERT INTO Inventory (InventoryID, ProductID, QuantityInStock, LastStockUpdate)
VALUES
    ('INV63', '141', '100', '2024-04-17'),
    ('INV64', '142', '75', '2024-04-21'),
    ('INV65', '143', '50', '2024-04-23'),
    ('INV66', '145', '120', '2024-04-14'),
    ('INV67', '147', '200', '2024-04-24'),
    ('INV68', '148', '90', '2024-04-15'),
    ('INV69', '149', '60', '2024-04-19'),
    ('INV70', '150', '150', '2024-04-16'),
    ('INV71', '151', '180', '2024-04-18'),
    ('INV72', '152', '220', '2024-04-15');
    


    
       
 

