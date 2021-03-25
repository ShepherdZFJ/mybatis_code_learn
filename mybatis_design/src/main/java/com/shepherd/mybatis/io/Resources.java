package com.shepherd.mybatis.io;

import java.io.InputStream;

/**
 * @author fjZheng
 * @version 1.0
 * @date 2021/3/25 10:03
 */
public class Resources {

    /**
     * 根据传入的参数，获取一个字节输入流
     * @param filePath
     * @return
     */
    public static InputStream getResourceAsStream(String filePath){
        return Resources.class.getClassLoader().getResourceAsStream(filePath);
    }
}
