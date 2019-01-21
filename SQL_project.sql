create database Library
use Library

create table Items
(
	Title nvarchar(100) primary key not null,
	ItemType nvarchar(100),
	Author nvarchar(100),
	Subjects nvarchar(100),
	NumberOfCopies int,
	Statuss nvarchar(100),
	username nvarchar(100),
)
create table Users
(
	Name nvarchar(100) primary key not null,
	UserType nvarchar(100),
	Passwordd nvarchar(100),
	Phone nvarchar(100),
	Addres nvarchar(100),
	Email nvarchar(100),
)

create table Loans
(
	Title nvarchar(100) primary key not null,
	UserName nvarchar(100),
	IssueDate nvarchar(100),
	ReturnDate nvarchar(100),
)

select * from Items 
select * from Users
select * from loans

truncate table Items
truncate table Users
truncate table loans


go
create procedure addItem @Title nvarchar(100),@ItemType nvarchar(100),@Author nvarchar(100),@Subjects nvarchar(100),@NumberOfCopies int,@status nvarchar(100),@username nvarchar(100)
as begin
insert into [items]
values
(@Title,@ItemType,@Author,@Subjects,@NumberOfCopies,@status,@username)
end

go
create procedure addUser @Name nvarchar(100),@UserType nvarchar(100),@pas nvarchar(100),@Phone nvarchar(100),@Address nvarchar(100),@Email nvarchar(100)
as begin
insert into [Users]
values
(@Name,@UserType,@pas,@Phone,@Address,@Email)
end

go
create procedure checkLogin @Name nvarchar(100)
as begin
select * from Users where Name= @Name
end


go
create procedure checkout @Title nvarchar(100),@UserName nvarchar(100),@IssueDate nvarchar(100),@ReturnDate nvarchar(100)
as begin
insert into [Loans]
values
(@Title,@UserName,@IssueDate,@ReturnDate)
end

exec addUser 'Aamir Raheem','Librarian','1234','0900-78601','Fast-NU,Lahore','aamir@gmail.com'
exec addUser 'Farwa Batool','CheckoutClerk','1234','0900-78601','Fast-NU,Lahore','farwa.batool.@gmail.com'
