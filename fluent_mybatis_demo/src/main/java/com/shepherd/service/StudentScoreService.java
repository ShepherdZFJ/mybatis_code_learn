package com.shepherd.service;

import com.shepherd.entity.StudentScore;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author fjzheng
 * @version 1.0
 * @date 2021/9/6 16:07
 */
@Service
public interface StudentScoreService {

    List<StudentScore> getStudentScoreList();
}
