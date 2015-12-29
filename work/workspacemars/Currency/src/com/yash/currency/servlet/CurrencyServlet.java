package com.yash.currency.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.currency.ejb.CurrencyEjbLocal;


@WebServlet("/CurrencyServlet")
public class CurrencyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	public CurrencyEjbLocal currencyEjbLocal;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out= response.getWriter();
		
		String getCurrency = request.getParameter("currency");
		
		int currency = Integer.parseInt(getCurrency);
		
		System.out.println(currency);
		
		int convertedValue= currencyEjbLocal.convertCurrency(currency);
		
		out.print("The converted value is:"+convertedValue);
		
	}

}
