package com.clients.servlets;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clients.Customer;
import com.dataStorage.DbAccess;

@WebServlet("/AccountServlet")
public class AccountServlet extends  HttpServlet{

	
	public AccountServlet(){
	
	}
	
	
	protected void  doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException{
		String requestedUrl =  request.getRequestURI();
//		String a = requestedUrl.substring("/account/".length());
		String customerIdStr =
				
				 (request.getParameter("customerId")!= null ? request.getParameter("customerId"):requestedUrl.substring("/account/".length())) ;
				 
				/*(
				
				(  
				!requestedUrl.substring("/account".length()).equalsIgnoreCase("") 
				) ?requestedUrl.substring("/account".length() ) : request.getParameter("customerId") ) ;
*/		int customerId = Integer.parseInt(customerIdStr);
//		int customerId = Integer.parseInt(!request.getParameter("customerId").toString().equalsIgnoreCase("")?request.getParameter("customerId").toString().trim():"0");

		Customer custom = DbAccess.getInstance().getCustomer(customerId);
	System.out.println("customerId"+customerId);
//	response.sendRedirect("http://localhost:8081/index.jsp")	;
	if(custom!= null)
	{
		response.setCharacterEncoding("UTF-8"); 
			response.getWriter().print("<table>\r\n"
					+ "         <tr>\r\n"
					+ "         <td>surName: </td>\r\n"
					+ "         <td>"+ custom.getSurName() +"</td>\r\n"
					+ "         </tr>\r\n"
					+ "         <td>Name : </td>\r\n"
					+ "         <td>"+ custom.getName() +"</td>\r\n"
					+ "         </tr>\r\n"
					+ "         <td>Customer Id: </td>\r\n"
					+ "         <td>"+ custom.getCustomerId() +"</td>\r\n"
					+ "         <td>initial credit: </td>\r\n"
					+ "         <td>"+ custom.getInitialCredit() +"</td>\r\n"
					+ "         </tr>\r\n"
					+ "         \r\n"
					+ "         </table>");
			
	}
	else {
		response.setCharacterEncoding("UTF-8"); 
		response.getWriter().print("<table>\r\n"
				+ "         <tr>\r\n"
				+ "         <td>Clients does not Exist .Please to create one.</td>\r\n"
				+ "         </tr>\r\n"
				+ "         \r\n"
				+ "         </table>");
	}
//	RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		


		String name = request.getParameter("name");
		String surName = request.getParameter("surName");
		BigDecimal initialCredit = new BigDecimal( request.getParameter("initialCredit").toString());
		int customerId = Integer.parseInt(request.getParameter("customerId"));
		
		DbAccess.getInstance().putCustomer(new Customer(customerId, name, surName, initialCredit));
	response.sendRedirect("http://localhost:8081/showInfo.jsp?customerId="+customerId+"&name="+name+"&surName="+surName+"&initialCredit="+initialCredit)	;

	}

	
	
}
