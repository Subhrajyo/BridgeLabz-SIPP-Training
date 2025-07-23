package com.market;

import java.util.List;

public class showCatalog {
	public static void showCatalog(List<? extends Product> items) {
	    for (Product item : items) {
	        System.out.println(item);
	    }
	}
}
