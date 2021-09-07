package com.shepherd;

import com.shepherd.dao.base.StudentScoreBaseDao;
import com.shepherd.entity.StudentScore;
import com.shepherd.mapper.StudentScoreMapper;
import com.shepherd.service.StudentScoreService;
import com.shepherd.wrapper.StudentScoreQuery;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest(classes = FluentMybatisDemoApplication.class)

class FluentMybatisDemoApplicationTests {
    @Resource
    private StudentScoreService studentScoreService;
    @Resource
    private StudentScoreMapper studentScoreMapper;


    @Test
    void contextLoads() {
    }


    @Test
    public void insert() {
        final StudentScore studentScore = StudentScore.builder()
                .studentId(1l)
                .subject("美术")
                .score(60)
                .schoolTerm(2020)
                .build();
        studentScoreMapper.insert(studentScore);

    }

    @Test
    public void findOne(){
        StudentScoreQuery query = new StudentScoreQuery().where.studentId().eq(2).end();
        final StudentScore studentScore = studentScoreMapper.findOne(query);
        System.out.println("==========studentScore:" + studentScore);
    }

    @Test
    public void findAll() {
        final List<StudentScore> studentScores = studentScoreMapper.listEntity(new StudentScoreQuery());
        System.out.println(studentScores);

    }

    @Test
    public void selectId() {
        final StudentScoreQuery query = studentScoreMapper.query().selectId();
        final List<StudentScore> studentScores = studentScoreMapper.listEntity(query);
        System.out.println(studentScores);
    }


    @Test
    public void selectApply() {
        //final StudentScoreQuery query = studentScoreMapper.query().select.apply("id", "subject", "score").end().where.studentId().eq(2).end();
        final StudentScoreQuery query = studentScoreMapper.query().select("id", "subject", "score").where.studentId().eq(2).end();
        final List<StudentScore> studentScores = studentScoreMapper.listEntity(query);
        System.out.println(studentScores);
    }


}
