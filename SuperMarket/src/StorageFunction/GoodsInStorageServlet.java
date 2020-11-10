package StorageFunction;

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

@WebServlet("/GoodsInStorage")
public class GoodsInStorageServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String goodsName = req.getParameter("goodsName");
		String goodsID01 = req.getParameter("goodsID");
		String goodsPrice01 = req.getParameter("goodsPrice");
		String goodsNumber01 = req.getParameter("goodsNumber");
		String goodsType = req.getParameter("goodsType");
		List<Goods> list = new ArrayList<>();
		int goodsID = Integer.parseInt(goodsID01);
		int goodsNumber = Integer.parseInt(goodsNumber01);
		float goodsPrice = Float.parseFloat(goodsPrice01);
		Date newdate = new Date();
		String goodsPerson = "π‹¿Ì‘±";
		int Number = 0;
		ResultSet rs;
		ResultSet rs1;
		ResultSet rs2;
		ResultSet rs3;
		ResultSet rs4;
		ResultSet rs5;
		String sql1 = "select * from instoragegoods where goodsName=? and goodsID=?";
		System.out.println("1");
		rs = GoodsInfo.selectGoods(sql1, goodsName, goodsID);
		try {
			if (rs.next()) {
				String sql2 = "update instoragegoods set goodsPrice=?,goodsNumber=?,goodsType=?,goodsInStorageDate=?,goodsPerson=? where goodsName=? and goodsID=?";
				GoodsInfo.updateGoods(sql2, goodsPrice, goodsNumber, goodsType, newdate, goodsPerson, goodsName,
						goodsID);
				System.out.println("2");
			} else {
				String sql3 = "insert into instoragegoods(goodsName,goodsID,goodsNumber,goodsInStorageDate,goodsPerson,goodsType,goodsPrice) values(?,?,?,?,?,?,?)";
				GoodsInfo.saveInStorageGoods(sql3, goodsName, goodsID, goodsNumber, newdate, goodsPerson, goodsType,
						goodsPrice);
				System.out.println("3");
			}
			String sql50 = "select * from goods where goodsName=?";
			rs5 = GoodsInfo.selectType(sql50, goodsName);
			if (rs5.next()) {
				String sql4 = "select goodsNumber from goods where goodsName=? and goodsID=?";
				rs2 = GoodsInfo.selectGoods(sql4, goodsName, goodsID);
				if (rs2.next()) {
					Number = rs2.getInt(1);
				}
				System.out.println(Number);
				String sql5 = "update goods set goodsNumber=? where goodsName=? and goodsID=?";
				GoodsInfo.updateNumber(sql5, (Number + goodsNumber), goodsName, goodsID);
				System.out.println("5");
			} else {
				String sql51 = "insert into goods(goodsName,goodsID,goodsPrice,goodsNumber,goodsType) values(?,?,?,?,?)";
				GoodsInfo.saveGoods(sql51, goodsName, goodsID, goodsPrice, goodsNumber, goodsType);
			}

			String sql6 = "select MAX(goodsInStorageDate) from instoragegoods";
			rs3 = GoodsInfo.selectStorageGoods01(sql6);
			Date date = null;
			if (rs3.next()) {
				date = rs3.getDate(1);
			}
			System.out.println(date);
			Date date1 = new Date(date.getTime());
			String sql7 = "select * from instoragegoods where goodsInStorageDate=? order by goodsID ";
			rs4 = GoodsInfo.selectStorageGoods(sql7, date1);
			while (rs4.next()) {
				Goods goods = new Goods(rs4.getString(1), rs4.getInt(2), rs4.getFloat(3), rs4.getInt(4),
						rs4.getString(5), rs4.getString(6), rs4.getDate(7));
				list.add(goods);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(list);
		GoodsInfo.close();
		req.setAttribute("list53", list);
		req.setAttribute("Goods", 53);
		req.getRequestDispatcher("Storage_GoodsInStorage.jsp").forward(req, resp);

	}
}
