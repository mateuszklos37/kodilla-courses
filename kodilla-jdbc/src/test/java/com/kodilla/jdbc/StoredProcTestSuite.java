package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StoredProcTestSuite {
    @Test
    public void testUpdateVipLevels() throws SQLException {
        //Given
        DBManager dbManager = DBManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        //When
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement.execute(sqlProcedureCall);
        //Then
        String checkTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL = \"NOT SET\"";
        ResultSet rs = statement.executeQuery(checkTable);
        int howMany =-1;
        if(rs.next()){
            howMany = rs.getInt("HOW_MANY");
        }
        Assert.assertEquals(0, howMany);
    }
//    @Test
//    public void testUpdateBestseller() throws SQLException {
//        //Given
//        DBManager dbManager = DBManager.getInstance();
//        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER=\"0\"";
//        Statement statement = dbManager.getConnection().createStatement();
//        statement.executeUpdate(sqlUpdate);
//        //When
//        String sqlProcedureCall = "CALL UpdateBestsellers()";
//        statement.execute(sqlProcedureCall);
//        //Then
//        String checkTable = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER = \"0\"";
//        ResultSet rs = statement.executeQuery(checkTable);
//        int howMany =-1;
//        if(rs.next()){
//            howMany = rs.getInt("HOW_MANY");
//        }
//        Assert.assertEquals(1, howMany);
//    }
}
