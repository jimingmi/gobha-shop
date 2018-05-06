package com.gobha.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gobha.common.model.EUTreeNode;
import com.gobha.mapper.TbItemCatMapper;
import com.gobha.model.TbItemCat;
import com.gobha.model.TbItemCatExample;
import com.gobha.model.TbItemCatExample.Criteria;
import com.gobha.service.ItemCatService;

/**
 * 商品分类管理Service
 * 
 * @author gobhazeng
 *
 * @date 2018年5月6日 下午3:57:42
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {

	@Autowired
	private TbItemCatMapper itemCatMapper;

	/**
	 * 获取商品节点列表
	 */
	@Override
	public List<EUTreeNode> getCatList(long parentId) {

		// 创建查询条件
		TbItemCatExample example = new TbItemCatExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		// 根据条件查询
		List<TbItemCat> list = itemCatMapper.selectByExample(example);
		List<EUTreeNode> resultList = new ArrayList<>();
		// 把列表转换成treeNodelist
		for (TbItemCat tbItemCat : list) {
			EUTreeNode node = new EUTreeNode();
			node.setId(tbItemCat.getId());
			node.setText(tbItemCat.getName());
			node.setState(tbItemCat.getIsParent() ? "closed" : "open");
			resultList.add(node);
		}
		// 返回结果
		return resultList;
	}

}
