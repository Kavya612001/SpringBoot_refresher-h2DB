package com.learn.springbootbasic.LearnBasic.Repository;

import com.learn.springbootbasic.LearnBasic.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
