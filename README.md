# Kuponim project / income register microservice

Spring-boot based microservice to track income of the coupons system - system that allows companies to issue coupons for a certain services or goods, and customers to buy the coupons.

## Installation

1. Clone this repository to your local folder
2. Import as Maven project
3. Install Maven dependencies
4. Start MySQL service and create database called "kuponimincome"
5. In the application.properties configure datasource according to your MySQL configuration
6. In the application.properties change property spring.jpa.hibernate.ddl-auto to "create" and start application. This will create all the necessary database data structure
7. In the application.properties change property spring.jpa.hibernate.ddl-auto back to "update" and start application

## Usage

1. Perform some create / update / purchase coupons operations in Kuponim client application (with Kuponim server running)
2. Check the system income records by entering "localhost:8088/incomes" in your browser



