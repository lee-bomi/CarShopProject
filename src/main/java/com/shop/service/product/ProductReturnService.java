package com.shop.service.product;

import java.util.List;

import com.shop.vo.Return_Tbl;

public interface ProductReturnService {


	public List<Return_Tbl> retrun_(); // 교환/반품 페이지
	public List<Return_Tbl> order_date(String order_date); // 날짜 별

}
