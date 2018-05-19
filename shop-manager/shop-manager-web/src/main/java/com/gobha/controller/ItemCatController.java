package com.gobha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gobha.common.model.EUTreeNode;
import com.gobha.service.ItemCatService;

/**
 * 商品分类管理controller
 * 
 * @author gobhazeng
 * @date 2018年4月18日 下午11:23:31
 */
@Controller
@RequestMapping("/item/cat")
public class ItemCatController {

    @Autowired
    private ItemCatService itemCatService;

    /**
     * 获取商品节点列表
     * 
     * @param parentId
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    private List<EUTreeNode> getCatList(@RequestParam(value = "id", defaultValue = "0") Long parentId) {
        List<EUTreeNode> list = itemCatService.getCatList(parentId);
        return list;
    }

}
