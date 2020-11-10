package SuperFunction;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import UTil_Jdbc.GoodsInfo;
import data.Goods;

@WebServlet("/OutStorage")
public class OutStorageServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ResultSet rs;
		ResultSet rs1;
		List<Goods> list = new ArrayList<>();
		String sql1 = "select MAX(goodsOutStorageDate) from outstoragegoods";
		rs = GoodsInfo.selectStorageGoods01(sql1);
		Date date = null;
		float moneySum = 0;
		try {
			if (rs.next()) {
				date = rs.getDate(1);
			}
			Date date01 = new Date(date.getTime());
			String sql2 = "select * from outstoragegoods where goodsOutStorageDate=? order by goodsID ";
			rs1 = GoodsInfo.selectStorageGoods(sql2, date01);
			while (rs1.next()) {
				Goods goods = new Goods(rs1.getString(1), rs1.getInt(2), rs1.getFloat(3), rs1.getInt(4), rs1.getString(5),
						rs1.getString(6), rs1.getDate(7));
				list.add(goods);
				moneySum=moneySum+(rs1.getInt(3)*rs1.getFloat(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GoodsInfo.close();

		req.setAttribute("list42", list);
		req.setAttribute("money", moneySum);
		req.setAttribute("Goods", 02);
		req.getRequestDispatcher("OutStorageGoods.jsp").forward(req, resp);

	}
}
