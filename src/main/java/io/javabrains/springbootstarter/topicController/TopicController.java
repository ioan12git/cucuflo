package io.javabrains.springbootstarter.topicController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Qualifier("topicService")
    @Autowired
    private Service topicService_1;

    @Qualifier("topicService2")
    @Autowired
    private Service topicService_2;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
      return topicService_1.getAllTopics();
    }
    @RequestMapping("/topic2")
    public List<Topic> getAllTopics2(){
        return topicService_2.getAllTopics();
    }
    @PostMapping("/topicsp")
    public void addTopic(@RequestBody Topic topic){
        topicService_1.addTopic(topic);
    }



}
