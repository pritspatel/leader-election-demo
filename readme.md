## Spring Integration Leadership Election Demo App

### Description

Purpose of this application is to showcase how to use spring integration leadership initiator using
jdbc lock registry. This example is using MySQL as db but should also work with Oracle and Postgres.

Please create a specific tables needed store lock information. Scripts are avilable at the following
location for different db.

NOTE : THIS DEMO ASSUMES YOU HAVE MYSQL DB RUNNING ON LOCALHOST WITH USER 'dev' and password 'dev123'.
PLEASE UPDATE THE DB CONNECTION DETAILS BASED ON YOUR DB INFORMATION IN ```application.properties``` FILE.

https://github.com/spring-projects/spring-integration/tree/master/spring-integration-jdbc/src/main/resources/org/springframework/integration/jdbc

Docker Compose Tutorial to setup mysql db

https://medium.com/@chrischuck35/how-to-create-a-mysql-instance-with-docker-compose-1598f3cc1bee

### How to run 

1. Clone this project
2. Run multiple instance of ```LeaderElectionDemoApplication``` class with different port
3. Verify in the log that only one instance is running as leader.