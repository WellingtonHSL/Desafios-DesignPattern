# Projeto: Padrões de Projeto em Java (Interpreter, Factory, Adapter)

Este projeto implementa três padrões de projeto clássicos em Java: **Interpreter**, **Factory Method** e **Adapter**, integrados em uma única aplicação com um menu interativo para navegação entre os desafios.

## Descrição

O objetivo deste projeto é demonstrar a aplicação prática dos padrões de design **Interpreter**, **Factory Method** e **Adapter**. A aplicação permite que o usuário escolha qual padrão de design deseja explorar, com cada um apresentando um exemplo funcional e interativo.

### Padrões Implementados

1. **Interpreter Pattern (Desafio 1)**:  
   O padrão Interpreter permite que você defina uma gramática para interpretar comandos e realizar ações, como converter texto para maiúsculas ou repetir um texto várias vezes.

2. **Factory Method Pattern (Desafio 2)**:  
   A fábrica de mensagens personalizadas permite criar diferentes tipos de mensagens com base em uma chave, como mensagens de boas-vindas, agradecimento ou despedida, formatadas com o nome do usuário.

3. **Adapter Pattern (Desafio 3)**:  
   O padrão Adapter é utilizado para integrar uma biblioteca externa de cálculo de descontos, permitindo aplicar descontos percentuais de forma simples e modular.

## Funcionalidades

- **Menu interativo**: O usuário pode escolher qual desafio deseja executar.
- **Entrada de dados**: Dependendo do padrão escolhido, o usuário fornecerá entradas diferentes (ex.: texto, valores numéricos, etc.).
- **Navegação fácil**: Ao digitar "voltar", o usuário retorna ao menu principal para escolher outro desafio.

## Como Usar

1. **Clone o repositório**:
    ```bash
    git clone https://github.com/WellingtonHSL/Desafios-DesignPattern.git
    ```

2. **Compile e execute o projeto**:
   - Abra o projeto no IntelliJ.
   - Execute a classe `Main` para iniciar a aplicação.

3. **Interaja com o menu**:
    - O menu permitirá que você escolha entre os três padrões de projeto ou finalizar a aplicação.
    - Quando solicitado, forneça a entrada conforme o padrão selecionado.
    - Ao digitar "voltar", você será levado de volta ao menu principal.

## Exemplos de Uso

### Desafio 1: Interpreter Pattern

- **Comando**: `caixa_alta("olá mundo")`
- **Saída**: `OLÁ MUNDO`

- **Comando**: `repetir(3, "oi")`
- **Saída**: `oioioi`

### Desafio 2: Factory Method Pattern

- **Entrada**: `boasvindas + none`
- **Saída**: `Bem-vindo, [nome]!`

### Desafio 3: Adapter Pattern

- **Entrada**: `valor = 200, percentual = 10`
- **Saída**: `Valor com desconto: R$180,00`

## Pacotes e Classes

### Pacote **adapter**

- `DescontoAdapter`: Adapta a interface do `SistemaDescontoExterno` para ser compatível com a interface `CalculadoraDesconto`.
- `SistemaDescontoExterno`: Simula uma biblioteca externa de desconto.
- `MainAdapter`: Contém o código para interagir com o usuário e aplicar o desconto.

### Pacote **factory**

- `Mensagem`: Interface para mensagens personalizadas.
- `MensagemBoasVindas`, `MensagemDespedida`, `MensagemAgradecimento`: Implementações da interface `Mensagem` para diferentes tipos de mensagem.
- `MensagemFactory`: Fábrica responsável por criar instâncias de mensagens baseadas no tipo fornecido.
- `MainFactory`: Contém o código para interagir com o usuário e exibir as mensagens personalizadas.

### Pacote **interpreter**

- `Expressao`: Interface para todas as expressões que podem ser interpretadas.
- `CaixaAltaExpressao`, `RepetirExpressao`: Implementações da interface `Expressao` para os comandos específicos.
- `Interpretador`: Classe responsável por interpretar os comandos e retornar a expressão correspondente.
- `MainInterpreter`: Contém o código para interagir com o usuário e aplicar as expressões.

### Pacote **principal**

- `Main`: Classe principal que exibe o menu interativo e gerencia a navegação entre os desafios.
