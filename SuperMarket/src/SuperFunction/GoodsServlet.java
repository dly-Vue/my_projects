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

@WebServlet("/Goods01")
public class GoodsServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Goods> list = new ArrayList<>();
		ResultSet rs;
		float moneySum=0;
		String sql = "select * from goods order by goodsID";
		rs = GoodsInfo.select(sql);
		try {
			while (rs.next()) {
				Goods goods = new Goods(rs.getString(1), rs.getInt(2), rs.getFloat(3), rs.getInt(4), rs.getString(5));
				list.add(goods);
				moneySum=moneySum+(rs.getFloat(3)*rs.getInt(4));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GoodsInfo.close();
		req.setAttribute("list41", list);
		req.setAttribute("Goods", 01);
		req.setAttribute("money", moneySum);
		req.getRequestDispatcher("TotalGoods.jsp").forward(req, resp);
	}
}
