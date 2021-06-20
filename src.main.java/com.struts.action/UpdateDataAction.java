package com.struts.action;

import com.struts.dao.BookManagementDAO;
import com.struts.pojo.Book;



public class UpdateDataAction {
 String bookId;
 String bookName;
 String bookAuthor;
  Integer bookPrice;
  
  public String execute() {
  System.out.println("execute() method called");
  Book book = BookManagementDAO.getBookById(bookId);
  bookId = book.getBookId();
  bookName = book.getBookName();
  bookAuthor = book.getBookAuthor();
  bookPrice = book.getBookPrice();
  return "success";
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