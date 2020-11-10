package StorageFunction;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import UTil_Jdbc.UserInfo;
@WebServlet("/Storage_ChangePassword")
public class Storage_ChangePasswordServlet extends HttpServlet{
      @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String name=req.getParameter("username");
         String oldPassword=req.getParameter("oldPassword");
         String newPassword=req.getParameter("newPassword");
         String sql="update user set userPassword=? where userName=? and userPassword=?";
         UserInfo.updateUser(sql, name, oldPassword, newPassword);
         UserInfo.close();

    }
}
