package com.gobha.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gobha.common.model.EUDataGridResult;
import com.gobha.mapper.TbItemMapper;
import com.gobha.model.TbItem;
import com.gobha.model.TbItemExample;
import com.gobha.model.TbItemExample.Criteria;
import com.gobha.service.ItemService;

/**
 * 商品管理Service
 * 
 * @author gobhazeng
 *
 * @date 2018年4月7日 下午4:53:26
 */
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper tbItemMapper;

	/**
	 * 通过id获取商品信息
	 */
	@Override
	public TbItem getItemById(Long itemId) {
		TbItemExample example = new TbItemExample();
		// 设置查询条件
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(itemId);
		List<TbItem> list = tbItemMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * 获取商品详情页 支持分页
	 */
	@Override
	public EUDataGridResult getItemList(int page, int rows) {
		TbItemExample example = new TbItemExample();
		// 分页处理
		PageHelper.startPage(page, rows);
		List<TbItem> list = tbItemMapper.selectByExample(example);
		// 创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		// 取记录总条数
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

}
