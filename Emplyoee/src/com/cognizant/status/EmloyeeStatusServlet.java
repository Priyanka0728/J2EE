package com.cognizant.status;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class EmloyeeStatusServlet
 */
@WebServlet("/EmloyeeStatusServlet")
public class EmloyeeStatusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmloyeeStatusServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeStatus employee= new EmployeeStatus();
	      employee.setId("969143");
	      employee.setName("John");
	      employee.setGender("Male");
	      employee.setDate("08/07/1987");
	      employee.setFullTime(null);
			request.setAttribute("employee",employee);
			RequestDispatcher r=request.getRequestDispatcher("EmployeeStatus.jsp");
		    r.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
