package SuperFunction;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import UTil_Jdbc.UserInfo;
import data.User;
@WebServlet("/Person")
public class PersonServlet extends HttpServlet{
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	String userName=req.getParameter("userName");

	List<User> list=new ArrayList<> ();
	ResultSet rs; 
	String sql="select * from user where userName=?";
	rs=UserInfo.selectUs(sql, userName);
	try {
		if(rs.next()) {
			User user=new User(rs.getString(1),rs.getString(3),rs.getString(5),rs.getString(6));
			list.add(user);
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	UserInfo.close();
	req.setAttribute("lists20", list);
	req.setAttribute("Demo01", 40);
	req.getRequestDispatcher("PersonInfo.jsp").forward(req, resp);

 }
}
