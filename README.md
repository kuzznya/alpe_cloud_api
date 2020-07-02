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

Start all services: `bash start_all`  
Stop: `bash stop_all`

Logs are written to `/deploy` dir
