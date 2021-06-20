package com.struts.action;
import com.struts.dao.*;
import com.struts.pojo.*;



import com.opensymphony.xwork2.ActionSupport;



public class AddAction extends ActionSupport {
 String bookId;
 String bookName;
 String bookAuthor;
  Integer bookPrice;
  
  public String execute() {
  String statusCode = "";
  System.out.println("execute() method called");
  Book book = new Book(bookId, bookName, bookAuthor, bookPrice);
  int recordAdded = BookManagementDAO.addBook(book);
  if (recordAdded == 1) {
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
 public String getBookName() {
  return bookName;
 }
 public void setBookName(String bookName) {
  this.bookName = bookName;
 }
 public String getBookAuthor() {
  return bookAuthor;
 }
 public void setBookAuthor(String bookAuthor) {
  this.bookAuthor = bookAuthor;
 }
 public Integer getBookPrice() {
  return bookPrice;
 }
 public void setBookPrice(Integer bookPrice) {
  this.bookPrice = bookPrice;
 }
}