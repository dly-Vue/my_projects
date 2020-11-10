package StorageFunction;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import UTil_Jdbc.UserInfo;

@WebServlet("/Storage_ChangePerson")
public class Storage_ChangePersonServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	String userName=req.getParameter("userName");
	String userPassword=req.getParameter("userPassword");
	String userID=req.getParameter("userID");
	String userIphone=req.getParameter("userIphone");
	String userAddress=req.getParameter("userAddress");
	String sql="update user set userName=?,userID=?,userIphone=?,userAddress=? where userName=? and userPassword=?";
	UserInfo.updatePerson(sql, userName, userID, userIphone, userAddress, userName, userPassword);
	UserInfo.close();
}
}
