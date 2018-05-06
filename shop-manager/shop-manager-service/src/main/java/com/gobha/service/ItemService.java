package com.gobha.service;

import com.gobha.common.model.EUDataGridResult;
import com.gobha.model.TbItem;

public interface ItemService {

	/**
	 * 根据商品id获取商品详情
	 * 
	 * @param itemId
	 * @return
	 */
	TbItem getItemById(Long itemId);

	/**
	 * 获取商品详情页 支持分页
	 * 
	 * @param page
	 * @param rows
	 * @return
	 */
	EUDataGridResult getItemList(int page, int rows);

}
