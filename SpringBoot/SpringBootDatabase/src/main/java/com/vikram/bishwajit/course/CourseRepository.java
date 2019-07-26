package com.vikram.bishwajit.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vikram.bishwajit.topic.Topic;

public interface CourseRepository extends CrudRepository<Course, String> {
		public List<Course> findByName(String name);
		public List<Course> findByDescription(String description);
		public List<Course> findByTopic(Topic topic);
		public List<Course> findByTopicId(String topicId);
}
