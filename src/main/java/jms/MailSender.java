package jms;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(activationConfig = {
        @ActivationConfigProperty(
                propertyName = "destination",
                propertyValue = "java:/jms/queue/Email"),
})
public class MailSender implements MessageListener {

    @Override
    public void onMessage(Message message) {

        try {
            MessageWrapper wrapper = message.getBody(MessageWrapper.class);

            System.out.println("Msg goes to " + wrapper.getToWhom());
            System.out.println("Msg : " + wrapper.getMessage());

        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
