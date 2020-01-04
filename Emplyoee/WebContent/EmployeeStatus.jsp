<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Employee Details</h2>
  <form>
     <table>
      <tr>
          <th>ID :</th>
          <td><c:out value="${employee.id}"></c:out></td>
      </tr>
      <tr>
          <th>Name :</th>
          <td><input type="text" name="name" value="${employee.name}" ></td>
       </tr>
       
        <tr>
          <th>Gender :</th>
          <c:if test="${(employee.gender).equals('Male')}">
          <td> <input type="radio" name="name" id="rd1" value="Male" checked="checked">Male
           <input type="radio" name="name" id="rd2" value="Female">Female</td></c:if>
           
       </tr>
       
       <tr>
       <th>Date of Birth</th>
       <td> <input type="text" name="date" value="${employee.date}"></td>
       </tr>
       
       <tr>
       <th>FullTime Employee</th>
       <c:if test="${employee.fullTime).equals('ticked')}">
       <td><input type="text" name="fulltime" value="${employee.fullTime}" checked="checked"></td></c:if>
     </table>
  </form>
</body>
</html>