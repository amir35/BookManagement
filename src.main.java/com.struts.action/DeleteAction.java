package com.struts.action;

import com.struts.dao.BookManagementDAO;

public class DeleteAction {

  String bookId;
  
  public String execute() {
  String statusCode = "";
  System.out.println("Delete execute() method called");
  System.out.println("Book Id = "+bookId);
  int recordUpdated = BookManagementDAO.deleteBook(bookId);
  if (recordUpdated == 1) {
   statusCode = "success";
  } else {
   statusCode = "error";
  }
  return statusCode;
 }
 
 public String getBookId() {
  return bookId;
 }
 public void setBookId(String bookId) {
  this.bookId = bookId;
 }
 
}