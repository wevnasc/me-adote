# Me Adote 

## Microservices
Este projeto utiliza o conceito de Microservices para demonstra sua aplicação em um projeto real.

O projeto e constituido por cinco serviços:

- **me-adote-config:** Serviço que centraliza todas as configurações
   utilizadas pelos demais serviços.
   
- **me-adote-discovery:** Este faz a descoberta dos serviços que estão em
   execução e a quantidade de instâncias que estão sendo utilizadas por
   serviço.

- **me-adote-gateway:** Barramento ou porta de entrada para que os demais serviços sejam acessados

- **me-adote-pets:** Regras de negocio relacionadas ao animas a serem adotados

- **me-adote-owners:** Regras de negocio relacionadas aos donos dos animas

### Bibliotecas

 - Spring Boot 
 - Zull 
 - Eureka

