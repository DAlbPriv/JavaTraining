package com.privalia.collections;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {
	private int idCategory;
	private String name;
	private Map<Long,Product> productList;
}
