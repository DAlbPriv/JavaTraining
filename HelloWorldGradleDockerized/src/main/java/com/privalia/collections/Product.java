package com.privalia.collections;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

		private int idProduct;
		private String name;
		private Map<Long,Category> categoryList;
}
