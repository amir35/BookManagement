package com.struts.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.struts.dao.LoginDAO;
import com.struts.DbUtil;
import com.struts.pojo.Login;




public class LoginAction {

 String userName;
 String password;
  
  public String execute() {
    
  String statusCode = "";
  System.out.println("execute() method called");
  boolean isUserValid = LoginDAO.isUserValid(new Login(userName, password));
  if (isUserValid) {
   statusCode = "success";
  } else {
   statusCode = "input";
  }
  return statusCode;
 }
 
 
 
 
 
 public String getUserName() {
  return userName;
 }
 public void setUserName(String userName) {
  this.userName = userName;
 }
 public String getPassword() {
  return password;
 }
 public void setPassword(String password) {
  this.password = password;
 }
 
}