package com.shepherd.service.impl;

import com.shepherd.entity.StudentScore;
import com.shepherd.mapper.StudentScoreMapper;
import com.shepherd.service.StudentScoreService;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @author fjzheng
 * @version 1.0
 * @date 2021/9/6 16:10
 */
@Service
public class StudentScoreServiceImpl implements StudentScoreService {

    @Resource
    private StudentScoreMapper studentScoreMapper;

    @Override
    public List<StudentScore> getStudentScoreList() {
        StudentScore studentScore = studentScoreMapper.findOne(studentScoreMapper.query().where.studentId().eq(1).end());
        return Arrays.asList(studentScore);
    }
}
