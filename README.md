Animal Adoption Spring Boot Application

This repository contains a Spring Boot application designed to facilitate animal adoption. The application provides a set of RESTful APIs for performing CRUD (Create, Read, Update, Delete) operations on animal adoption records. It incorporates various features including Spring Security with user authentication and authorization, logging using SLF4J, Java 8 features like Lambda Expressions and Streams, and uses the H2 in-memory database for data storage.



Features

User Authentication and Authorization: Utilizes Spring Security to manage user authentication and authorization. User details are stored in the H2 database. Different user roles (e.g., Admin, User) are defined to control access to various parts of the application.

CRUD Operations: Provides RESTful APIs to perform CRUD operations on animal adoption records, allowing admin to create, read, update, and delete adoption information and users to view the animals ready to adopt.

Data Persistence: Utilizes Spring Data JPA to interact with the H2 database, allowing for efficient storage and retrieval of adoption records.

Logging: Implements logging using the SLF4J logging framework to capture application activities and errors.

Java 8 Features: Demonstrates the use of Java 8 features like Lambda Expressions and Streams for writing concise and expressive code.

H2 Console: Utilizes H2 in-memory database for data storage. The H2 console can be accessed for database management and querying.
