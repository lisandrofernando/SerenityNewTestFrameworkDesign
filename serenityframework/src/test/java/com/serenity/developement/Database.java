package com.serenity.developement;

import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.serenity.developement.helpers.DatabaseHelper;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit.runners.SerenityRunner;

@RunWith(SerenityRunner.class)
public class Database {
    
      @Managed
    WebDriver driver;


    @Steps
    DatabaseHelper data;

    @Test
    public void dataBaseTset() throws SQLException{

        //select c.Name , e.year, c.employees, c.Branch from company as c inner join established as e on c.Name=e.Name;

        data.setDatabaseConnexion("select * from EmployeeInfo", "name", "id");
        data.setDatabaseConnexion("select c.Name , e.year, c.employees, c.Branch from company as c inner join established as e on c.Name=e.Name", "Name", "Branch");

    }

}
