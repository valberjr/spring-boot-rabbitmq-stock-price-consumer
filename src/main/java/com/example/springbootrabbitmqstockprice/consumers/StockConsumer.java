package com.example.springbootrabbitmqstockprice.consumers;

import com.example.springbootrabbitmqstockprice.constants.RabbitMQConstants;
import com.example.springbootrabbitmqstockprice.dtos.StockDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class StockConsumer {

    @RabbitListener(queues = RabbitMQConstants.QUEUE_STOCK)
    private void consumer(StockDto stockDto) {
        System.out.println(stockDto.productCode);
        System.out.println(stockDto.quantity);
        System.out.println("--------------------------------");
    }
}
