package com.gobha.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.gobha.common.utils.JsonUtils;
import com.gobha.service.PictureService;

/**
 * 图片上传Controller
 * 
 * @author gobhazeng
 *
 * @date 2018年5月6日 下午4:31:31
 */
@Controller
public class PictureController {

	@Autowired
	private PictureService pictureService;

	/**
	 * 上传图片至图片服务器
	 * 
	 * @param multipartFile
	 * @return
	 */
	@RequestMapping("/pic/upload")
	@ResponseBody
	public String uploadPicture(MultipartFile uploadFile) {
		Map<String, Object> reslutMap = pictureService.uploadPciture(uploadFile);
		// 确保兼容性，转换为JSON格式字符串
		String json = JsonUtils.objectToJson(reslutMap);
		return json;
	}

}
