<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Product</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
  <div align="center">
  <h2>Update Book</h2>
  <s:form action="updateAction" class="formTable">
   <s:textfield name="bookId" label="Book Id" class="formTextField" readonly="true"/>
   <s:textfield name="bookName" label="Book Name" class="formTextField"/>
   <s:textfield name="bookAuthor" label="Book Author" class="formTextField"/>
   <s:textfield name="bookPrice" label="Book Price" class="formTextField"/>
   <s:submit value="Update Book" class="actionBtn"/>
  </s:form>
 </div>


 

</body>
</html>