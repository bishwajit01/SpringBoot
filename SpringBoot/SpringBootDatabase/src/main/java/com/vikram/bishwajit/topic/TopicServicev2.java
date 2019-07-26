package com.vikram.bishwajit.topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicServicev2 {
	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getAllTopic() {
		List<Topic> listTopic = new ArrayList<Topic>();
		topicRepository.findAll().forEach(listTopic::add);
		return listTopic;
	}

	public Optional<Topic> getTopic(String id) {
		return topicRepository.findById(id);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic, String id) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}

}
