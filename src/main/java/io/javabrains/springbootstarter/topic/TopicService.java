package io.javabrains.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = new ArrayList();

    public TopicService(@Value("${serviceName}") String name) {
        topics.add(new Topic("spring", "Spring Framework", "Spring Framework Description"));
        topics.add(new Topic("java", "Core Java", "Core Java Description"));
        topics.add( new Topic("javascript", "JavaScript", "JavaScript Description"));
        System.out.println("Initialized service: " + name);
    }

   private List<Topic> topics1 = new ArrayList<>(){

   };
//    topics1.add(new Topic("spring", "Spring Framework", "Spring Framework Description")); aici nu poti ca nu esti intr-o metoda...aici declari membrii ai clasei
    // daca vrrei aici faci asa block da

    public List<Topic> getAllTopics(){
        return topics;
    }
    public Topic getTopic(String id){
        return topics.stream().filter(t ->t.getId().equals(id)).findFirst().get();
    }

    static public void main(String[] args) {
        TopicService topicService = new TopicService("a name");
        topicService.getAllTopics();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }
}