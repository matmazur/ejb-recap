package jms;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.JMSProducer;
import javax.jms.Queue;

@Stateless
public class MailService {

    @Inject
    private JMSContext context;

    @Resource (mappedName = "java:/jms/queue/Email")
    private Queue queue;

    public void sendEmail(MessageWrapper message){
        JMSProducer producer = context.createProducer();
        producer.send(queue, message);
    }
}
