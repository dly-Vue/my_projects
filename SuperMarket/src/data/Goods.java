package data;

import java.sql.Date;

public class Goods {
	String goodsName;
	int goodsID;
	float goodsPrice;
	int goodsNumber;
	String goodsType;
	String goodsPerson;
	Date goodsDate;

	public Goods() {
		super();
	}

	public Goods(String goodsName, int goodsID, float goodsPrice, int goodsNumber, String goodsType) {
		super();
		this.goodsName = goodsName;
		this.goodsID = goodsID;
		this.goodsPrice = goodsPrice;
		this.goodsNumber = goodsNumber;
		this.goodsType = goodsType;
	}

	public Goods(String goodsName, int goodsID, float goodsPrice, int goodsNumber, String goodsType, String goodsPerson,
			Date goodsDate) {
		super();
		this.goodsName = goodsName;
		this.goodsID = goodsID;
		this.goodsPrice = goodsPrice;
		this.goodsNumber = goodsNumber;
		this.goodsType = goodsType;
		this.goodsPerson = goodsPerson;
		this.goodsDate = goodsDate;
	}


	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public int getGoodsID() {
		return goodsID;
	}

	public void setGoodsID(int goodsID) {
		this.goodsID = goodsID;
	}

	public float getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(float goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public int getGoodsNumber() {
		return goodsNumber;
	}

	public void setGoodsNumber(int goodsNumber) {
		this.goodsNumber = goodsNumber;
	}

	public String getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public String getGoodsPerson() {
		return goodsPerson;
	}

	public void setGoodsPerson(String goodsPerson) {
		this.goodsPerson = goodsPerson;
	}

	public Date getGoodsDate() {
		return goodsDate;
	}

	public void setGoodsDate(Date goodsDate) {
		this.goodsDate = goodsDate;
	}

	@Override
	public String toString() {
		return "Goods [goodsName=" + goodsName + ", goodsID=" + goodsID + ", goodsPrice=" + goodsPrice
				+ ", goodsNumber=" + goodsNumber + ", goodsType=" + goodsType + ", goodsPerson=" + goodsPerson
				+ ", goodsDate=" + goodsDate + "]";
	}

}
