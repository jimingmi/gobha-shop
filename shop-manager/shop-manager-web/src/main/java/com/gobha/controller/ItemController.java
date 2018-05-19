package com.gobha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gobha.common.model.EUDataGridResult;
import com.gobha.model.TbItem;
import com.gobha.service.ItemService;

/**
 * 商品管理Controller
 * 
 * @author gobhazeng
 * @date 2018年4月7日 下午4:54:36
 */
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    /**
     * 根据商品id获取商品详情
     * 
     * @param itemId
     * @return
     */
    @RequestMapping(value = "/item/{itemId}", method = RequestMethod.GET)
    @ResponseBody
    public TbItem getItemById(@PathVariable Long itemId) {
        TbItem tbItem = itemService.getItemById(itemId);
        return tbItem;
    }

    /**
     * 获取商品详情页 支持分页
     * 
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping(value = "/item/list", method = RequestMethod.GET)
    @ResponseBody
    public EUDataGridResult getItemList(@RequestParam Integer page, @RequestParam Integer rows) {
        EUDataGridResult result = itemService.getItemList(page, rows);
        return result;
    }

}
