package com.tdn.customercontroller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.tdn.customerDAO.CustomerDAOImp;
import com.tdn.customermangement.Customer;

@WebServlet("/customer")
public class CustomerServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	CustomerDAOImp customerimp = new CustomerDAOImp();
    public CustomerServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
       // String str = request.getServletPath();
		String action = request.getParameter("action");
        try {
            switch (action) {
                case "listUser":
                	listUser(request, response);

                   //showNewForm(request, response);
                    break;
                case "/inseart":
                    insertcustomer(request, response);
                    break;
                case "/delete":
                  //  deleteUser(request, response);
                    break;
                case "/edit":
                  //  showEditForm(request, response);
                  break;
                case "/update":
                   // updateUser(request, response);
                    break;
                default	:
                  break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }
	private void insertcustomer(HttpServletRequest request, HttpServletResponse response)  throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
        String address = request.getParameter("address");
        String mobilenumber= request.getParameter("mobilenumber");
        Customer newcustomer = new Customer(id, name, address, mobilenumber);
      //  customerimp.insertcustomer(newcustomer);
        response.sendRedirect("customerlist");
		
	}

	private void listUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
		
		  List < Customer > customers =customerimp.getallcustomer();
		  
	        request.setAttribute("listUser", customers);
	       // System.out.println(customers);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("list-all.jsp");
	        dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
