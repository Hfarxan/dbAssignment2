Bookstore Managment Application

Description: This Java console application functions as a system for managing a bookstore, enabling users to execute various operations related to books, authors, customers, orders. The application interfaces with a PostgreSQL database for storing and retrieving information.

Functionalities:

Book Management:
Create a new book with details such as title, genre, price, stock quantity, and author ID.
View a list of all books.
Display comprehensive information about a specific book, including its associated orders.

Author Management:
Create a new author, providing details like name, birth date, and country.
View a list of all authors.
Update author information.
Delete an author.

Customer Management:
Create a new customer with first name, last name, email, and phone details.
View a list of all customers.
Update customer information.
Delete a customer.

Order Management:
Delete an order, along with its associated order details.
Update order details for a specific order.

Metadata Information:
Display information about tables in the database, including primary and foreign keys.
Provide detailed column information for a specific table.

Setup:
Clone the repository: git clone https://github.com/Hfarxan/dbAssignment2.git cd yourproject
Setup the PostgreSQL database and configure the connection details in DbFunctions class.
Run the application: java -jar yourproject.jar

Usage:
Create, view, update, and delete books, authors, customers, and orders.
Place new orders and manage order details.
Display metadata information about tables and columns in the database.
