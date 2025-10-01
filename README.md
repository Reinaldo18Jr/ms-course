# Microsserviços Java

Curso que conheci a arquitetura de microsserviços, onde cada projeto Java roda independente em servidores Eureka. Simula um sistema de recursos humanos em que o cliente loga por uma API gateway Zuul, que por sua vez, comunica com microsserviço de autenticação, verificando as credenciais do usuário e gerando um token. Com esse token que é único para cada cliente, poderá ser liberado o acesso a requisições para os microsserviços de folha de pagamento e lista de trabalhadores (dependendo do nível de acesso de cada usuário). Foi desenvolvido um microsserviço de configuração, para comunicar com um repositório privado de dados particulares. Também ensinou a criar balançeamento de carga das requisições, podendo encaminhar elas em diferentes instâncias de microsserviços.

## Tecnologias

* Java 11
* Spring Boot 2.3.4
* Spring Cloud
* Eureka
* Zuul
* JWT
* Ribbon
* Hystrix
* Maven
