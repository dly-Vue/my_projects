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

import UTil_Jdbc.GoodsInfo;
import UTil_Jdbc.UserInfo;
import data.Goods;
import data.User;
@WebServlet("/User")
public class UserServlet extends HttpServlet {
  @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  List<User> list = new ArrayList<>();
      ResultSet rs;
      String sql = "select * from user where userSign=?";
	   rs = UserInfo.selectUser02(sql,1);
	   try {
		  while(rs.next()) {
			User us=new User(rs.getString(1),rs.getString(3),rs.getString(5),rs.getString(6));
			list.add(us);
		   }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   UserInfo.close();
	   req.setAttribute("list31",list);
	   req.setAttribute("user", 01);
	   req.getRequestDispatcher("StoragePersonInfo.jsp").forward(req, resp);
}
}
