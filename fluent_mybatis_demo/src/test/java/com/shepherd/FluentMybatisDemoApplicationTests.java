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
import java.util.Map;

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
    public void findById() {
        final StudentScore studentScore = studentScoreMapper.findById(1);
        System.out.println(studentScore);
    }

    @Test
    public void findOne(){
        StudentScoreQuery query = new StudentScoreQuery().where.studentId().eq(2).end();
        final StudentScore studentScore = studentScoreMapper.findOne(query);
        System.out.println("==========studentScore:" + studentScore);
    }

    @Test
    public void findAll() {
        final StudentScoreQuery studentScoreQuery = new StudentScoreQuery().limit(1, 2);
        final List<StudentScore> studentScores = studentScoreMapper.listEntity(studentScoreQuery);
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
        print(studentScores);
    }


    @Test
    public void summaryScore() {
        final StudentScoreQuery query = new StudentScoreQuery().select
                .schoolTerm()
                .subject()
                .count.score("count")
                .max.score("max_score")
                .min.score("min_score")
                .avg.score("avg_score")
                .end()
                .where.schoolTerm().ge(2000)
                .and.subject().in(new String[]{"数学", "语文", "英语"})
                .and.score().ge(60)
                .and.isDeleted().eq(0)
                .end()
                .groupBy.schoolTerm().subject()
                .end()
                .having.count.score().gt(1)
                .end()
                .orderBy.schoolTerm().asc().subject().desc()
                .end();
        //studentScoreMapper.listPoJos()
        final List<Map<String, Object>> maps = studentScoreMapper.listMaps(query);
         maps.forEach(map ->{
             System.out.println(map);
         });


    }

    private void print(List<StudentScore> list) {
        System.out.println();
        list.forEach(studentScore -> {
            System.out.println(studentScore);
        });
        System.out.println();
    }


}
