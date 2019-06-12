package com.akl.utils;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Path;
import java.util.HashMap;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-05-08 17:50
 * @Description: 创建二维码
 */
public class CreateQRcode {
	public static void main(String[] args) {
		int width = 300;
		int height = 300;
		String format = "png";
		String content = "你好hello world ！#，、133";
		try {
			content = new String(content.getBytes("UTF-8"), "ISO-8859-1");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		//定义二维码的参数
		HashMap map = new HashMap();
		//设置编码
		map.put(EncodeHintType.CHARACTER_SET, "utf-8");
		//设置纠错等级
		map.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
		map.put(EncodeHintType.MARGIN, 2);

		try {
			//生成二维码
			BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height);
			Path file = new File("c:\\test.png").toPath();
			MatrixToImageWriter.writeToPath(bitMatrix, format, file);
		} catch (WriterException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
