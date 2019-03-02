## Spring Integration Leadership Election Demo App

### Description

Purpose of this application is to showcase how to use spring integration leadership initiator using
jdbc lock registry. This example is using MySQL as db but should also work with Oracle and Postgres.

Please create a specific tables needed to to acquire lock. Scripts are avilable at the following
location

https://github.com/spring-projects/spring-integration/tree/master/spring-integration-jdbc/src/main/resources/org/springframework/integration/jdbc

### How to run 

1. Checkout this project
2. Run multiple instance of ```LeaderElectionDemoApplication``` class with different port
3. Verify in the log that only one instance is running as leader.