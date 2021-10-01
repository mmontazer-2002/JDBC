package JDBC.DataAccess;

import JDBC.Moduls.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeAccess {
    private Connection connection = null;

    public EmployeeAccess( ) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee" , "root" , "library*");
    }

    public void save (Employee employee) throws SQLException {
        if (connection != null){
            Statement statement = connection.createStatement();
            String sqlQuery = String.format("INSERT INTO employee (employeeID,firstName , lastName , personalNumber , dateOfBirth ,workUnitID) VALUES (" );
            int i = statement.executeUpdate(statement);
        }
    }

    public void update(int id , String firstname, String lastname){
        //todo
    }










}
