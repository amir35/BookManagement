package com.struts.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.struts.DbUtil;
import com.struts.pojo.Login;


public class LoginDAO {
  public static boolean isUserValid(Login userDetails)
 {
  boolean validStatus = false;
  try
  {
   Connection conn = DbUtil.getConnection();
   Statement st= conn.createStatement();
   ResultSet rs= st.executeQuery("SELECT * FROM user WHERE user_name = '"+userDetails.getUserName()+"' AND password = '"+userDetails.getPassword()+"'");
   while(rs.next())
   {
    validStatus = true;
   }
   
   DbUtil.closeConnection(conn);
   
  }
  catch(Exception e)
  {
   e.printStackTrace();
  }
  return validStatus;
 }
}