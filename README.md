# DIO_Bootcamp
## Anotações
## Os projetos estão sendo atualizados na branch Master
### Detalhes que fazem diferença
- Quando atribuímos o valor de uma variável Double utilizando uma fração entre dois números inteiros, devemos converter um dos quocientes da fração para double para obter um resultado double. Ex: Double d = (1/2);/*o resultado desta fração seria 0.5, mas a divisão de dois números inteiros retorna um valor inteiro, nesse caso o valor seria "arreddondado" para 0*/ Solução: Double d = (1d/2);/*Agora sim, teremos a variável recebendo o valor 0.5*/ utilizando o System.out.println() esse valor será arredondado para 1.
