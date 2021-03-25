package com.shepherd.mybatis.sqlsession.defaults;

import com.shepherd.mybatis.cfg.Configuration;
import com.shepherd.mybatis.sqlsession.SqlSession;
import com.shepherd.mybatis.sqlsession.SqlSessionFactory;


/**
 * @author fjZheng
 * @version 1.0
 * @date 2021/3/25 10:03
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory{

    private Configuration cfg;

    public DefaultSqlSessionFactory(Configuration cfg){
        this.cfg = cfg;
    }

    /**
     * 用于创建一个新的操作数据库对象
     * @return
     */
    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(cfg);
    }
}
