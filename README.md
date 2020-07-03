# ALPE Cloud API

Company: ALPE Consulting  
Language: Java  
Framework: Spring Boot, Spring Cloud

Project is based on microservice architecture

Services:
1. Eureka Discovery server
2. Config server
3. Spring Cloud Gateway
4. Test service

To simplify development, all configs are loaded from 
`resources/configs`

## Start

**Start all services:** `bash start_all`  
There are two API Gateway configurations:
1. `spring_gw` - Spring Cloud Gateway (running with WebFlux on Netty)  
  This is default config
2. `zuul_gw` - Netflix Zuul Gateway  
  Add `zuul` to start services with Zuul Gateway
  (`bash start_all zuul`)

Stop: `bash stop_all`

Logs are written to `/deploy` dir
