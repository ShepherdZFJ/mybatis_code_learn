package com.shepherd.mybatis.sqlsession;

import com.shepherd.mybatis.cfg.Configuration;
import com.shepherd.mybatis.sqlsession.defaults.DefaultSqlSessionFactory;
import com.shepherd.mybatis.utils.XMLConfigBuilder;

import java.io.InputStream;

/**
 * @author fjZheng
 * @version 1.0
 * @date 2021/3/25 10:03
 */
public class SqlSessionFactoryBuilder {

    /**
     * 根据参数的字节输入流来构建一个SqlSessionFactory工厂
     * @param config
     * @return
     */
    public SqlSessionFactory build(InputStream config){
        Configuration cfg = XMLConfigBuilder.loadConfiguration(config);
        return  new DefaultSqlSessionFactory(cfg);
    }
}
