package UTil_Jdbc;

import java.awt.HeadlessException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

@WebServlet("/demo01")
public class Demo01Servlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("userName");
		String password1 = req.getParameter("aPassword");
		String password2 = req.getParameter("bPassword");
		String profession = req.getParameter("profession");
		ResultSet rs;
		System.out.println(username + " " + password1 + " " + profession);
		System.out.println(password1.equals(password2));
		// �ж��Ƿ�������ȷ
		if (!password1.equals(password2)) {
			JOptionPane.showMessageDialog(null, "�����������벻һ��������������");

		} else {
			// �����ݲ������ݿ�
			try {
				String sql = "select userName from user where userName=? and userPassword=?";
				rs = UserInfo.selectUser(sql, username, password1);
				if (rs.next()) {
					JOptionPane.showMessageDialog(null, "�û��Ѵ��ڣ�������ע��");
				} else {
					int n = 0;
					if (profession.equals("�ֿ����Ա")) {
						n = 1;
					} else {
						n = 2;
					}
					String sql1 = "insert into user(userName,userPassword,userSign) values(?,?,?)";
					UserInfo.saveUser(sql1, username, password1, n);

				}
			} catch (HeadlessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		UserInfo.close();
		resp.sendRedirect("Register.jsp");
	}
}
