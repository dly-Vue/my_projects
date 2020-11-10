package UTil_Jdbc;

import java.awt.HeadlessException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

@WebServlet("/demo02")
public class Demo02Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = req.getParameter("userName");
		String password = req.getParameter("password");
		String profession = req.getParameter("profession");
		System.out.println(username + " " + password + " " + profession);
		ResultSet rs;
		ResultSet rs1;
		int n = 0, num = 0;
		String iphone = null, address = null, id = null;
		if (profession.equals("≤÷ø‚π‹¿Ì‘±")) {
			n = 1;
		} else {
			n = 2;
		}
		String name = null;
		String sql = "select userName from user where userName=? and userPassword=?";
		rs = UserInfo.selectUser(sql, username, password);
		try {
			if (rs.next()) {
				name = rs.getString(1);
				String sql2 = "select * from user where userName=? and userPassword=? and userSign=?";
				rs1 = UserInfo.selectUser01(sql2, username, password, n);
				if (rs1.next()) {
					id = rs1.getString(3);
					num = rs1.getInt(4);
					iphone = rs1.getString(5);
					address = rs1.getString(6);

				}
				if (num == 1) {
					HttpSession session1 = req.getSession();
					session1.setAttribute("name01", name);
					req.getRequestDispatcher("Storage.jsp").forward(req, resp);
				}
				if (num == 2) {

					HttpSession session1 = req.getSession();
					session1.setAttribute("name01", name);
					req.getRequestDispatcher("Super.jsp").forward(req, resp);
				}

			} else {
				resp.sendRedirect("Login.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		UserInfo.close();
	}
}
