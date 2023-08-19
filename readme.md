# Projeto Calculadora LabSeq- Dellent Exercicio 2023

Este projeto consiste em uma calculadora que calcula os valores da sequência LabSeq através do valor fornecido usando uma  web GUI.

## Requisitos e Ferramentas

- [Java](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Node.js](https://nodejs.org/)
- [Angular CLI](https://angular.io/cli)
- [VS Code](https://code.visualstudio.com/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/)

## Configuração

1. Faça download do projeto através do repositorio do github:
	https://github.com/edgarsousacosta22/Dellent_exercicio_labseq
Se tiver o IDE instalado
2. Abra o Projeto Quarkus no IDE
3.Execute o servidor Quarkus no IDE (já deve conseguir abrir e testar pelo http://localhost:8080/labseq/n)
4. Projeto Angular através da linha de comandos abra o projeto na pasta do projeto angular "cd labseqDellent_Angular" e posteriormente execute o  seguinte comando "ng serve"
5. Abra o navegador e entre no servidor http://localhost:4200
6. Insira um número para calcular o valor da sequência LabSeq.

Nota: Caso não consiga usar diretamente o projeto pela interface use http://localhost:8080/labseq/n substituindo o n pelo número desejado, caso use um número negativo ira surgir uma mensagem avisar que não é possivel.

Documentação da API
Abra a documentação da API em: http://localhost:8080/q/swagger-ui/


Guias usados para este projeto:
https://quarkus.io/guides/openapi-swaggerui
