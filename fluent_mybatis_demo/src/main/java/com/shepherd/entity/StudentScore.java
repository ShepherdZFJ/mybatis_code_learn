package com.shepherd.entity;

import cn.org.atool.fluent.mybatis.annotation.FluentMybatis;
import cn.org.atool.fluent.mybatis.annotation.TableId;
import cn.org.atool.fluent.mybatis.base.IEntity;
import cn.org.atool.generator.annotation.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

/**
 * @author fjzheng
 * @version 1.0
 * @date 2021/9/6 15:50
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FluentMybatis
public class StudentScore implements IEntity {
        @TableId
        private Long id;
        private Long studentId;
        private Integer genderMan;
        private Integer schoolTerm;
        private String subject;
        private Integer score;
        private Date gmtCreate;
        private Date gmtModified;
        private Integer isDeleted;
}
