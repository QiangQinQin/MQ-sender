package org.example;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.example.ProducerService;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=App.class)
public class TestSender {

    @Autowired
    private ProducerService producerService;
 
    @Test
    public void senderTest(){
        producerService.send(new ActiveMQQueue(JmsConfig.QUEUE),"这是queue的信息来源");
//        producerService.send(new ActiveMQTopic(JmsConfig.TOPIC),"这是Topic的信息来源");
    }
}