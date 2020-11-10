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

import UTil_Jdbc.GoodsInfo;
import data.Goods;

@WebServlet("/FoundGoods")
public class FoundGoodsServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Name = req.getParameter("Name");
		String type1 = req.getParameter("Type");
		List<Goods> list = new ArrayList<>();
		ResultSet rs;
		String sql = null;
		if (type1.equals("商品名")) {
			sql = "select * from goods where goodsName=? order by goodsID";

		}
		if (type1.equals("商品类型")) {
			sql = "select * from goods where goodsType=? order by goodsID";
		}
		rs = GoodsInfo.selectType(sql, Name);
		try {
			while (rs.next()) {
				Goods goods = new Goods(rs.getString(1), rs.getInt(2), rs.getFloat(3), rs.getInt(4), rs.getString(5));
				list.add(goods);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GoodsInfo.close();
		req.setAttribute("list51", list);
		req.setAttribute("Goods", 51);
		req.getRequestDispatcher("Storage_FoundGoods.jsp").forward(req, resp);
	}
}
