package com.rkl.util;

import java.io.*;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-05-13 17:19
 * @Description:
 */
public class SerializableUtil {

	public static byte[] getByte(Object object) {
		byte[] bytes = null;
		try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(bos);) {
			oos.writeObject(object);
			bytes = bos.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bytes;
	}

	public static Object getObject(byte[] bytes) {
		Object object = null;
		try (ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
				ObjectInputStream ois = new ObjectInputStream(bis);) {
			object = ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return object;
	}

}
