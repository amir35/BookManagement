<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
  <div align="center">
  <h2>Welcome</h2>
  <a href="addBook.jsp">
   <button class="actionBtn">Add New Book</button>
  </a>
 </div>

 <table width="750" class="bookTable" align="center">
  <thead>  
   <tr>
    <th>Book ID</th>
    <th>Book Name</th>
    <th>Book Category</th>
    <th>Book Price</th>
    <th colspan="2">Actions</th>
   </tr>
  </thead>
 
  <s:iterator value="books" var="book">
   <tr>
    <td>
     <s:property value="#book.bookId"/>
    </td>
    <td>
     <s:property value="#book.bookName"/>
    </td>
    <td>
     <s:property value="#book.bookAuthor"/>
    </td>
    <td>
     <s:property value="#book.bookPrice"/>
    </td>
    <td>
     <a
     href="updateDataAction?bookId=<s:property value="#book.bookId"/>">
      <button class="actionBtn">Update</button>
     </a> 
    </td>
   </tr>
  </s:iterator>
</body>
</html>