package com.gobha.service;

import java.util.List;

import com.gobha.common.model.EUTreeNode;

public interface ItemCatService {

	/**
	 * 获取商品节点列表
	 * 
	 * @param parentId
	 * @return
	 */
	List<EUTreeNode> getCatList(long parentId);

}
