package blog.yrol.consumer;

import blog.yrol.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    private Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);

    @RabbitListener(queues = "${rabbitmq.queue.email.name}")
    public void consumer(OrderEvent orderEvent) {
        LOGGER.info(String.format("Order event received from email service => %s", orderEvent.toString()));

        // Send email to the customer as the next step
    }
}