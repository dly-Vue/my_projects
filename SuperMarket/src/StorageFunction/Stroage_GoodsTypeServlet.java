package StorageFunction;

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
import javax.servlet.http.HttpSession;

import UTil_Jdbc.GoodsInfo;
import data.TypeNumber;

@WebServlet("/Stroage_GoodsType")
public class Stroage_GoodsTypeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sql = "select goodsType,SUM(goodsNumber) from goods group by goodsType";
		ResultSet rs=null;
		List<TypeNumber> list = new ArrayList<>();
		rs = GoodsInfo.selectStorageGoods01(sql);                                                                                             
		try {
			while (rs.next()) {
				System.out.println(rs.getString(1));
				TypeNumber type = new TypeNumber(rs.getString(1), rs.getInt(2));
				
				list.add(type);	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    GoodsInfo.close();
		HttpSession session1=req.getSession();
		session1.setAttribute("lists1", list);
		req.getRequestDispatcher("Storage_GoodsTable.jsp").forward(req, resp);
	}
}
