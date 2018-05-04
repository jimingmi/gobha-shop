package com.gobha.test;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

public class FTPTest {

	@Test
	public void testFTPClient() throws Exception {
		// 创建一个FTPClient对象
		FTPClient ftpClient = new FTPClient();
		// 创建FTP连接
		ftpClient.connect("192.168.186.130", 21);
		// 登录FTP服务器，使用用户名密码
		ftpClient.login("ftpuser", "123456a");
		// 上传文件
		//第一个参数：服务器端文档名
		//第二个参数：上传文档的InputStream 
		FileInputStream inputStream = new FileInputStream(new File("C:\\Users\\jimin\\Desktop\\123.png"));
		//设置上传的路径
		ftpClient.changeWorkingDirectory("/ftpuser/www/image");
		//修改上传文件的格式
		ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
		ftpClient.storeFile("123.png", inputStream);
		// 关闭连接
		ftpClient.logout();
	}

}
