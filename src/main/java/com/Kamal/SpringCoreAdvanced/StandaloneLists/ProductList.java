package com.Kamal.SpringCoreAdvanced.StandaloneLists;

import java.util.List;

public class ProductList {

	private List<String> productNames;

	@Override
	public String toString() {

		return "productList[productNames:" +getProductNames() + "]";
	}

	public List<String> getProductNames() {
		return productNames;
	}

	public void setProductNames(List<String> productNames) {
		this.productNames = productNames;
	}

}
