package edu.mobidev.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class GetStudentServlet
 */
@WebServlet("/GetStudent")
public class GetStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// You would normally retrieve the student from the database
		// but here we would create our own student object for the sake of having an example
		Student currentStudent = new Student("Juan", "dela Cruz", 1);
		
		// Convert your object or list to a JSON string
		Gson g = new Gson();
		String studentJson = g.toJson(currentStudent); // try printing this out to see the JSON string of studentList
		
		// Send the JSON string to the client who requested it
		response.getWriter().print(studentJson);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
