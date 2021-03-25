package com.shepherd.mybatis.sqlsession;

/**
 * @author fjZheng
 * @version 1.0
 * @date 2021/3/25 10:03
 */
public interface SqlSessionFactory {

    /**
     * 用于打开一个新的SqlSession对象
     * @return
     */
    SqlSession openSession();
}
