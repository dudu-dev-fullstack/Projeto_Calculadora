# 🧮 Calculadora do DUDU

Calculadora simples em Java, feita para o terminal, que executa as quatro operações básicas (adição, subtração, multiplicação e divisão) em loop contínuo até o usuário decidir encerrar.

## 📋 Sobre o projeto

O programa recebe dois números do usuário e um menu de opções com a operação desejada. Após exibir o resultado, pergunta se o usuário quer continuar — se sim, pede novos números; se não, encerra a execução.

Projeto desenvolvido como exercício de fixação de lógica de programação, com foco em:
- Estruturas de repetição (`while`)
- Estruturas condicionais (`if` / `else if`)
- Leitura de dados via `Scanner`
- Controle de fluxo de menu interativo

## ▶️ Como executar

**Pré-requisitos:** JDK instalado (Java 8 ou superior).

```bash
# Compilar
javac Main.java

# Executar
java Main
```

## 💻 Exemplo de uso

```
Seja bem-vindo a calculadora do DUDU!
Digite o primeiro numero: 
10
Digite o segundo numero: 
5
Digite qual opcao deseja: 
Opcao 1: Adicao
Opcao 2: Subtracao
Opcao 3: Multiplicacao
Opcao 4: Divisao
1
Voce escolheu adicao
O resultado da operacao foi: 15
Deseja continuar?
1- Sim 2- Nao
2
```

## ⚙️ Funcionalidades

| Opção | Operação |
|-------|----------|
| 1 | Adição |
| 2 | Subtração |
| 3 | Multiplicação |
| 4 | Divisão |

## 🚧 Melhorias futuras

- [ ] Validar opções inválidas no menu (ex: digitar `5` ou letras)
- [ ] Tratar divisão por zero com uma mensagem de erro
- [ ] Usar `switch` no lugar de `if/else if` encadeado
- [ ] Extrair cada operação para métodos separados
- [ ] Suportar números decimais (`double` em vez de `int`)

## 🛠️ Tecnologias

- Java

## 👤 Autor

**Eduardo Arruda Domingos**
Estudante de Engenharia de Software — FIAP
[GitHub](https://github.com/dudu-dev-fullstack) · [LinkedIn](https://linkedin.com/in/eduardo-arruda-domingos-39274b300)
