package data;

public class TypeNumber {
     String goodsType;
     int sum;
     
	public TypeNumber() {
		super();
	}

	public TypeNumber(String goodsType, int sum) {
		super();
		this.goodsType = goodsType;
		this.sum = sum;
	}

	public String getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "TypeNumber [goodsType=" + goodsType + ", sum=" + sum + "]";
	}
	
     
}
