package com.struts.dao;
import com.struts.pojo.*;
import com.struts.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookManagementDAO {

  public static List<Book> getAllBooks(){
  List<Book> bookList = new ArrayList<Book>();
 try
  {
   Connection conn = DbUtil.getConnection();
   Statement st= conn.createStatement();
   ResultSet rs= st.executeQuery("SELECT * FROM book");
   while(rs.next())
   {
    Book book = new Book(rs.getString("book_id"),rs.getString("book_name"),rs.getString("book_author"),rs.getInt("book_price"));
    bookList.add(book);
   }
   
   DbUtil.closeConnection(conn);
   
  }
  catch(Exception e)
  {
   e.printStackTrace();
  }
  
  return bookList;
  }

  public static Book getBookById(String bookId)
 {
  Book book = null;
  try
  {
   Connection conn = DbUtil.getConnection();
   PreparedStatement ps= conn.prepareStatement("SELECT * FROM book WHERE book_id = ?");
   ps.setString(1, bookId);
   ResultSet rs = ps.executeQuery();
   while(rs.next())
   {
    book = new Book(rs.getString("book_id"),rs.getString("book_name"),rs.getString("Book_author"),rs.getInt("book_price"));
   }
  }
  catch(Exception e)
  {
   e.printStackTrace();
  }
  
  return book;
 } 
 
 
 public static int addBook(Book book)
 {
  int status = 0;
  try
  {
   Connection conn = DbUtil.getConnection();
   PreparedStatement ps= conn.prepareStatement("INSERT INTO book VALUES(?,?,?,?)");
   ps.setString(1, book.getBookId());
   ps.setString(2, book.getBookName());
   ps.setString(3, book.getBookAuthor());
   ps.setInt(4, book.getBookPrice());
   status = ps.executeUpdate();
  }
  catch(Exception e)
  {
   e.printStackTrace();
  }
  return status;
 }
 
 public static int updateBook(Book book)
 {
  int status = 0;
  try
  {
   Connection conn = DbUtil.getConnection();
   PreparedStatement ps= conn.prepareStatement("UPDATE book SET book_name=?, book_author=?, book_price=? WHERE book_id=?");
   ps.setString(1, book.getBookName());
   ps.setString(2, book.getBookAuthor());
   ps.setInt(3, book.getBookPrice());
   ps.setString(4, book.getBookId());
   status = ps.executeUpdate();
  }
  catch(Exception e)
  {
   e.printStackTrace();
  }
  return status;
  }
  public static int deleteBook(String bookId)
 {
  int status = 0;
  try
  {
   Connection conn = DbUtil.getConnection();
   PreparedStatement ps= conn.prepareStatement("DELETE FROM book where book_id = ?");
   ps.setString(1, bookId);
   status = ps.executeUpdate();
  }
  catch(Exception e)
  {
   e.printStackTrace();
  }
  return status;
 }
 
}