package org.itstep.model;

public class Good {

	private String name;
	private String price;
	private String asin;
	private String intalPrice;
	private String imgUrl;
	private String goodUrl;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAsin() {
		return asin;
	}

	public void setAsin(String asin) {
		this.asin = asin;
	}

	public String getIntalPrice() {
		return intalPrice;
	}

	public void setIntalPrice(String intalPrice) {

		this.intalPrice = intalPrice;
	}

	public String geImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {

		this.imgUrl = imgUrl;
	}

	public String getGoodUrl() {
		return asin;
	}

	public void setGoodUrl(String goodUrl) {

		this.goodUrl = goodUrl;
	}

	public Good(String name, String price, String asin, String intalPrice, String imgUrl, String goodUrl) {
		this.name = name;
		this.price = price;
		this.asin = asin;
		this.intalPrice = intalPrice;
		this.imgUrl = imgUrl;
		this.goodUrl = goodUrl;

	}
}
