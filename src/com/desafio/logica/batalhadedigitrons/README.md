# Teste de lógica - Batalha de Digitrons

Neste repositório se encontra um desafio de lógica, onde esse desafio foi proposto pela plataforma Digital Innovation One, e aqui se encontra uma solução criada por mim.


## 📚Descrição do desafio:

Básico

Princípios Básicos

----------

### Desafio

Após os rivais Bruno e Guarte capturarem alguns Digitrons, eles resolveram batalhar entre eles. Então decidiram fazer isso de uma forma simples, com combates no modo 1x1 e vencendo quem tem o Digitron com maior valor de golpe, que é definido da seguinte forma:

![](https://lh5.googleusercontent.com/nkdwBgMEOcRXbA8jUNJczbqvzJFIIP5blxvJ80AKtzNDVHzdJqgLdvxDfsD_Xoo1kazAg7qSXG4wxFgNlQt63WxNnknAwks2o1CIfZpalwBj29CpmYPU5rc_7w_VGxfPF0eRcMPJ)

O Bônus será dado ao Digitron do treinador que estiver em um level de valor par.

Neste problema será dado a você o valor do bônus aplicado, os valores de ataque e defesa do Digitron de Bruno e Guarte e seus respectivos níveis, cabe a você informar o vencedor da batalha.

### Entrada

A entrada é composta por diversas instâncias. A primeira linha da entrada contém um inteiro T indicando o número de instâncias. Cada instância começa com um inteiro B (0 ≤ B ≤ 100), que indica o valor do bônus aplicado. Nas duas linhas seguintes terão três inteiros Ai, Di e Li (1 ≤ Ai, Di ≤ 100, 1 ≤ Li ≤ 50), representado o valor de ataque do Digitron, o valor de defesa e o level do treinador. A primeira linha representa o Digitron de Bruno e a segunda o de Guarte.

### Saída

Para instância na entrada você deverá imprimir o nome do treinador que vencerá a batalha, em caso de empate imprima: "Empate", mas sem as aspas.


|Exemplo de Entrada  | Exemplo de Saída |
|--|--|
| 3 | Guarte |
| 5 |  |
| 12 23 15 |  |
| 42 12 20 |  |
| 2 | Empate |
| 52 1 11 |  |
| 1 52 1 |  |
| 3 | Bruno |
| 95 12 22 |  |
| 5 51 21 |  |


##  🎲Para ver o arquivo rodando
É so fazer o downolad do arquivo, e compilar o mesmo. Isso pode ser feito por uma IDE da sua preferencia, ou pode ser feito pelo terminal.
- Para fazer desta forma, verifique se você ja tem o java instalado na sua máquina. Vá até o terminal e digite:
> java -version
- Verificou que o mesmo está funcionando, então vá até a pasta, através do terminal, onde está situado o arquivo. Chegando a pasta, devemos compilar o programa, então digite:
> javac nome-do-arquivo.java
- Agora, podemos executar o mesmo, então digite no terminal:
> java nome-do-arquivo
- Ná hora irá pedir uma entrada de dados, lembre-se da regra disposta na descrição do desafio, e pronto ;)