package com.clients.servlets;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clients.Customer;
import com.clients.Transactions;
import com.dataStorage.*;

@WebServlet("/TransactionServlet")
public class TransactionServlet extends  HttpServlet{

	public TransactionServlet() {
		// TODO Auto-generated constructor stub
	}
		
		
		protected void  doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException{
			String requestedUrl =  request.getRequestURI();
			String customerIdStr =
					
					 (request.getParameter("customerId")!= null ? request.getParameter("customerId"):requestedUrl.substring("/transaction".length())) ;
					 
		int customerId = Integer.parseInt(customerIdStr);

			Customer custom = DbAccess.getInstance().getCustomer(customerId);
			Transactions transactions = TransactionDBStorage.getInstance().getTransactions(customerId);
		System.out.println("customerId"+customerId);
//		response.sendRedirect("http://localhost:8081/index.jsp")	;
		if(custom!= null )
		{
			response.setCharacterEncoding("UTF-8"); 
				response.getWriter().print("<table>\r\n"
						+ "         <tr>\r\n"
						+ "         <td>Customer Id: </td>\r\n"
						+ "         <td>"+ custom.getCustomerId() +"</td>\r\n"
						+ "         </tr>\r\n"
						+ "         <tr>\r\n"
						+ "         <td>Customer surName: </td>\r\n"
						+ "         <td>"+ custom.getSurName() +"</td>\r\n"
						+ "         </tr>\r\n"
						+ "         <td>customer Name : </td>\r\n"
						+ "         <td>"+ custom.getName() +"</td>\r\n"
						+ "         </tr>\r\n"
						+ "         <tr>\r\n"
						+ "         <td>Transaction Id = </td>\r\n  "
						+ "         <td>"+transactions.getTransactionId() +"</td>\r\n <br>"
						+ "         </tr>\r\n"
						+ "         <td>Initial credit: </td>\r\n"
						+ "         <td>"+ custom.getInitialCredit() +"</td>\r\n <br>"
						+ "         <tr>\r\n"
						+ "         <td>Balance = </td>\r\n"
						+ "         <td>"+transactions.getBalance() +"</td>\r\n<br>"
						+ "         </tr>\r\n"
						+ "         <tr>\r\n"
						+ "         <td>Amount = </td>\r\n<br>"
						+ "         <td>"+transactions.getAmount() +"</td>\r\n"
						+ "         </tr>\r\n"
						+ "         <tr>\r\n"
						+ "         \r\n"
						+ "         </table>");
				
		}
		else {
			response.setCharacterEncoding("UTF-8"); 
			response.getWriter().print("<table>\r\n"
					+ "         <tr>\r\n"
					+ "         <td>No Transaction found for this customer.</td>\r\n"
					+ "         </tr>\r\n"
					+ "         \r\n"
					+ "         </table>");
		}
//		RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
		}
		
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			// doGet(request, response);
			 request.getRequestURI();
String id = request.getParameter("customerId");

			String name = request.getParameter("name");
			String surName = request.getParameter("surName");
	BigDecimal initialCredit = new BigDecimal( request.getParameter("initialCredit").toString());
			int customerId = Integer.parseInt(request.getParameter("customerId"));
			
			DbAccess.getInstance().putCustomer(new Customer(customerId, name, surName, initialCredit));
		response.sendRedirect("http://localhost:8081/showInfo.jsp?customerId="+customerId+"&name="+name+"&surName="+surName+"&initialCredit="+initialCredit)	;

		}

		
		


}
