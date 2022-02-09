package io.javabrains.springbootstarter.topicController;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService2 implements io.javabrains.springbootstarter.topicController.Service {

    private List<Topic> topics2 = new ArrayList(Arrays.asList(
            new Topic("spring2", "Spring Framework", "Spring Framework Description"),
            new Topic("java2", "Core Java", "Core Java Description"),
            new Topic("javascript2", "JavaScript", "JavaScript Description" )));

//    public TopicService(@Value("${serviceName}") String name) {
//        topics.add(new Topic("spring", "Spring Framework", "Spring Framework Description"));
//        topics.add(new Topic("java", "Core Java", "Core Java Description"));
//        topics.add( new Topic("javascript", "JavaScript", "JavaScript Description"));
//        System.out.println("Initialized service: " + name);
//    }


    public List<Topic> getAllTopics(){
        return topics2;
    }



    public Topic getTopic(String id){
        return topics2.stream().filter(t ->t.getId().equals(id)).findFirst().get();
    }

//    static public void main(String[] args) {
//        TopicService topicService = new TopicService("a name");
//        topicService.getAllTopics();
//    }

    public void addTopic(Topic topic) {
        topics2.add(topic);
    }
}