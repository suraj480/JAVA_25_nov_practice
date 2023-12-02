# database connection

Driver - Database Vendors

1. Load and register the Driver - specific to RDBMS
   Driver.registerDriver(Driver);
   Class.forName(String drivername);

2. Request for a Connection

Connection con =DriverManager.getConnection(url, username, password);

3. Prepare SQL and Submit to the database server

Statement
Static sql queries
ddl
PreparedStatement
paramegerized queries (dml. SELECT .....FROM EMP WHERE EMPNO-444 5. Handle exceptions

4. Process the query results
   ResultSet

5. Handle exception
6. Handle transactions
7. Close the connection
