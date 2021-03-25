package com.shepherd.mybatis.cfg;

/**
 * @author fjZheng
 * @version 1.0
 * @date 2021/3/25 10:03
 */
public class Mapper {

    private String queryString;//SQL
    private String resultType;//实体类的全限定类名

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }
}
