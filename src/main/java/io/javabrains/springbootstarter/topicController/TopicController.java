package io.javabrains.springbootstarter.topicController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private Service topicService;

    @Autowired
    private Service topicService2;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
      return topicService.getAllTopics();
    }
    @RequestMapping("/topic2")
    public List<Topic> getAllTopics2(){
        return topicService2.getAllTopics();
    }
    @PostMapping("/topicsp")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }



}
