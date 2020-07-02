package com.alpe.cloud_gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.discovery.event.InstanceRegisteredEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudGatewayApplication {

    private final ApplicationEventPublisher publisher;

    public CloudGatewayApplication(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    @Scheduled(fixedDelay=20000)
    public void refreshRoutes(){
        publisher.publishEvent(new InstanceRegisteredEvent<Void>(this, null));
    }

    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayApplication.class, args);
    }

}
