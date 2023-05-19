# Bookstore Inventory Management System

This project is an inventory management system for a bookstore, developed using the Spring Framework in Java. It allows users to manage book categories, publishers, and books, as well as perform searches based on various criteria.

## Features

The inventory management system includes the following features:

- **Book Category Management**: Users can view, add, edit, and remove book categories.
- **Book Publisher Management**: Users can manage publishers, including adding, editing, and removing publisher details.
- **Book Management**: Users can manage books, including adding, editing, and removing book information. Books can be categorized and associated with publishers.
- **Search Functionality**: Users can perform searches for books based on author, title, category, publisher, or book ID.

## Technologies Used

The project utilizes the following technologies and frameworks:

- Java
- Spring Framework
- Spring MVC (Model-View-Controller)
- Thymeleaf Templating Engine
- HTML/CSS
- MySQL Database (assumed, not explicitly provided)

## Getting Started

To run the application locally, follow these steps:

1. Set up a MySQL database and update the database configuration in the application.properties file.
2. Import the project into your preferred IDE (such as Eclipse or IntelliJ) as a Maven project.
3. Build the project to resolve dependencies.
4. Run the project on a local server (such as Tomcat) from your IDE.
5. Access the application through a web browser using the provided URL.

## Project Structure

The project is structured as follows:

- `com.magic.controller`: Contains controller classes for handling various requests and managing the application's web pages.
- `com.magic.entities`: Defines the entity classes representing the book, book category, and book publisher.
- `com.magic.service`: Provides service classes for interacting with the database and performing business logic.

## Usage

After running the application and accessing the provided URL, you will be able to perform various actions within the inventory management system:

- Manage book categories by adding, editing, or removing categories.
- Manage book publishers by adding, editing, or removing publisher details.
- Manage books by adding, editing, or removing book information. Books can be associated with categories and publishers.
- Search for books based on author, title, category, publisher, or book ID.

Note: The provided code assumes the existence of a MySQL database and the necessary configuration. Make sure to set up the database and update the configuration accordingly.


