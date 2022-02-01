package io.javabrains.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping ("/topics")
    public List<Topic> getAllTopics(){
      return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(String id){
        return topicService.getTopic(id);
    }

}
