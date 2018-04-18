package com.gobha.service;

import com.gobha.common.model.EUDataGridResult;
import com.gobha.model.TbItem;

public interface ItemService {

	TbItem getItemById(Long itemId);

	EUDataGridResult getItemList(int page, int rows);

}
