package io.javabrains.springbootstarter.topicController;

import java.util.List;

public interface Service {
   // List<Topic> list ;

    public List<Topic> getAllTopics();

    public Topic getTopic(String id);

    public void addTopic(Topic topic);
}
