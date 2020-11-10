package SuperFunction;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import UTil_Jdbc.UserInfo;
@WebServlet("/DeleteUser")
public class DeleteUserServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String userName=req.getParameter("username");
    String userID=req.getParameter("userID");
    String sql="delete from user where userName=? and userID=?";
    UserInfo.deleteUser(sql, userName, userID);
    UserInfo.close();
	
}
}
