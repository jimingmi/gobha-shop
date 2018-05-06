package com.gobha.service;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

public interface PictureService {

	/**
	 * 上传图片至FTP服务器
	 * 
	 * @param multipartFile
	 * @return
	 * @throws Exception
	 */
	Map<String, Object> uploadPciture(MultipartFile uploadFile);

}
