package com.gobha.service;

import java.util.List;

import com.gobha.common.model.EUTreeNode;

public interface ItemCatService {
	
	List<EUTreeNode> getCatList(long parentId);
	
}
