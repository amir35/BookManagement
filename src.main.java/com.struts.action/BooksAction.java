package com.struts.action;

import java.util.ArrayList;
import java.util.List;

import com.struts.dao.BookManagementDAO;
import com.struts.pojo.Book;


public class BooksAction {

  List<Book> books ;
  
  public void initializeBooks()
 {
  books = BookManagementDAO.getAllBooks(); 
  }
  
  public String execute() {
  System.out.println("WELCOME execute() method called");
  initializeBooks();
  return "success";
 }
 
 public List<Book> getBooks() {
  return books;
 }
 public void setBooks(List<Book> books) {
  this.books = books;
 }

 
}