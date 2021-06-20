package com.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.dao.BookManagementDAO;
import com.struts.pojo.Book;


public class UpdateAction extends ActionSupport{
 String bookId;
 String bookName;
 String bookAuthor;
  Integer bookPrice;
  
  public String execute() {
  String statusCode = "";
  System.out.println("execute() method called");
  Book book = new Book(bookId, bookName, bookAuthor, bookPrice);
  int recordUpdated = BookManagementDAO.updateBook(book);
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