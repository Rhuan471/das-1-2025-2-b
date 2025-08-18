    Design Arquitetura de Sistemas
    # OBJETIVO
// Desenvolvimento de Software: o curso promove uma formação que propicie ao egresso. atuar na especificação, desenvlvimento, manutenção e evolução de softwares. Isso inclui a capacidade de atuar nas diversas eetapas do processo de desenvolvimento de softwares/sistemas de informação.
// Gestão de Qualidade de Software: o curso promove uma formação que propice ao egresso atuar na definição, verificação, validação e evolução de processos, técnicas e metodologias de desenvolvimento de softwares dentro da perspectiva da gestão da quqlidade do processo e do produto de software.

# Abstração
// é uma representação simplificada de uma entidade, sendo aplicada em computação

// 1° Entity     - Dados
// 2° repository (CRUD) JPA spring data
// 3° services (PUT, POST, DELETE) USE CASES (lógica)
// controller (API REST)


# Arquiteto de Framework
// Um "Arquiteto de Framework" é um profissional responsável por projetar, desenvolver e gerenciar frameworks (estruturas) de software, que são conjuntos de ferramentas e práticas reutilizáveis para acelerar o desenvolvimento de aplicações. Essa função envolve a criação de bases sólidas para sistemas complexos, garantindo padrões, consistência e eficiência no desenvolvimento. 
Responsabilidades de um Arquiteto de Framework:
Projetar e desenvolver frameworks:
Definir a arquitetura, componentes, interfaces e padrões de um framework.
Garantir a qualidade e consistência:
Assegurar que o framework seja robusto, escalável e aderente às melhores práticas de desenvolvimento.
Documentar o framework:
Criar documentação clara e abrangente para facilitar o uso e manutenção do framework.
Orientar desenvolvedores:
Fornecer suporte e orientação aos desenvolvedores que utilizam o framework.
Manter e evoluir o framework:
Monitorar o desempenho, identificar necessidades de melhoria e realizar atualizações no framework. 
Tipos de frameworks:
Frameworks de arquitetura de software:
Fornecem estrutura para a organização de componentes de software, definindo como eles interagem e se comunicam. Exemplos incluem arquiteturas de microsserviços, arquiteturas orientadas a eventos, entre outras. 
Frameworks de front-end:
Facilitam o desenvolvimento de interfaces de usuário, como React, Angular e Vue.js. 
Frameworks de back-end:
Ajudam a construir a lógica e funcionalidades de aplicações, como Spring, Django e .NET. 
Frameworks de arquitetura empresarial:
Ajudam a alinhar a arquitetura de TI com os objetivos de negócio, como TOGAF e Zachman Framework. 
Importância do Arquiteto de Framework:
Aceleração do desenvolvimento:
O uso de frameworks permite que os desenvolvedores reutilizem código e componentes, reduzindo o tempo de desenvolvimento.
Melhora da qualidade e consistência:
Frameworks promovem a padronização e a adoção de melhores práticas, resultando em sistemas mais robustos e com menos erros.
Facilidade de manutenção:
Uma boa arquitetura de framework facilita a manutenção e evolução do sistema ao longo do tempo.
Escalabilidade e desempenho:
Frameworks bem projetados podem lidar com o crescimento da aplicação e garantir um bom desempenho. 
Em resumo, um Arquiteto de Framework desempenha um papel crucial no desenvolvimento de software moderno, garantindo que as aplicações sejam construídas de forma eficiente, robusta e escalável. 

# classe
// estado -> var, 
// comportamento -> método
// escondendo o comportamento de cliente

# Desenvovilmento em paralelo
// Uma ou mais pessoas podem ser trabalhadas no mesmo projeto

// @Autowired está focada na Flexibilidade a mudanças

# Getters e Setters 🔗

Métodos get e set — muitas vezes chamados apenas de getters e setters — são muito usados em linguagens orientadas a objetos, como Java e C++. A recomendação para uso desses métodos é a seguinte: todos os dados de uma classe devem ser privados e o acesso a eles — se necessário — deve ocorrer por meio de getters (acesso de leitura) e setters (acesso de escrita).

Veja um exemplo a seguir, no qual métodos get e set são usados para acessar o atributo matricula de uma classe Aluno.

class Aluno {

  private int matricula;
  ...
  public int getMatricula() {
    return matricula;
  }

  public setMatricula(int matricula) {
    this.matricula = matricula;
   }
  
}

# Coesão
// Se tratando em uma função de estrutua de dados, é comum definir seu serviço de uma forma mais equilibrada, sendo que nela, é feito de algumas funçoes como:
- Pilha: Suponha agora a seguinte classe:

class Stack<T> {
  boolean empty() { ... }  define se está vazia ou tem algum elemento
  T pop() { ... }    elemento que vai ser tirado pela parte de cima
  push (T) { ... }    essa função faz puxar os elementos pra cima
  int size() { ... }     
}
Trata-se de uma classe coesa, pois todos os seus métodos implementam operações importantes em uma estrutura de dados do tipo Pilha.

# Acoplamento
// class A {
  private B b;     <- VARIÁVEL
  public A(){
    b = new B();
    b.fazqq();     <- MÉTODO
  }
}

// Maximize a coesão das classes e minimize o acoplamento entre elas. Abstração

// OBJETIVO: Reduzir esses acoplamentos, mas não totalmente.

# SOLID
// Single Responsibility  Principle (Princípio da responsabilidade única)
// Open-Closed Principle (Princípio Aberto-Fechado)
// Liskov Substitution Principle (Princípio da substituição de Liskov)
// Interface Segregation Principle (Princípio da Segregação da Interface)
// Dependency Inversion Principle (Princípio da inversão da dependência)

# Princípio da Responsabilidade Única
// Seu foco é na parte do serviço utilizando a regra de negócio, fazendo algo perfeito. Ou seja, é um princípio de design de software que afirma que uma classe ou módulo deve ter apenas uma razão para mudar. Em outras palavras, cada classe deve ter apenas uma responsabilidade, uma única tarefa ou função que ela deve desempenhar.

// - - - - - > implementação
// ---------|> associação (mais indicado para usá-la quanto a herança)
// ----------> herança

# Princípio da Segregação de Interfaces
// O Princípio de Segregação de Interface (ISP) determina queos clientes não devem ser forçados a depender de métodos que não usamEm vez disso , interfaces grandes devem ser divididas em interfaces menores e mais específicas, garantindo que os clientes implementem apenas a funcionalidade necessária. Isso promove a modularidade, reduz o acoplamento e melhora a manutenibilidade do código.

interface Funcionario {

  double getSalario();

  double getFGTS();// apenas funcionários CLT

  int getSIAPE();// apenas funcionários públicos

  ...
}

Uma alternativa — que atende ao Princípio de Segregação de Interfaces — consiste em criar interfaces específicas (FuncionarioCLT e FuncionarioPublico) que estendem a interface genérica (Funcionario).

interface Funcionario {
  double getSalario();
  ...
}

interface FuncionarioCLT extends Funcionario {
  double getFGTS();
  ...
}

interface FuncionarioPublico extends Funcionario {
  int getSIAPE();
  ...
}

# Princípio de Inversão de Dependências
// Classe cliente (controladores) se estabelece prioritariamente com abstrações (interfaces de serviço)
//  A ideia é então trocar (ou inverter) as dependências: em vez de depender de classes concretas, clientes devem depender de interfaces. Portanto, um nome mais intuitivo para o princípio seria Prefira Interfaces a Classes.

interface I { ... }

class C1 implements I {
  ...
}
class C2 implements I {
  ...
}
class Cliente {

  I i;

  Cliente (I i) {
    this.i = i;
    ...
  } ...
}
class Main {

  void main () {
    C1 c1 = new C1();
    new Cliente(c1);
    ...
    C2 c2 = new C2();
    new Cliente(c2);
    ...
  }
}

# Princípio de Demeter
// Também chamado de Princípio do Menor Conhecimento, defende que a implementação de um método deve invocar apenas os seguintes outros métodos:
. De sua própria classe (caso 1)
. de objetos passados com parâmetros (caso 2)
. de objetos criados pelo próprio método (caso 3)
. de atributos da classe do método (caso 4)

# Princípio de Substituição de Liskov
// O Princípio de Substituição de Liskov explicita regras para redefinição de métodos de classes base em classes filhas. O nome do princípio é uma referência a Barbara Liskov, professora do MIT e ganhadora da edição de 2008 do Prêmio Turing. Dentre outros trabalhos, Liskov desenvolveu pesquisas sobre sistemas de tipos para linguagens orientadas a objetos. Em um desses trabalhos, ela enunciou o princípio que depois ganhou seu nome.

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class Janelinha3 extends JFrame{

    private JPanel painel;

    public Janelinha3() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        painel = new JPanel();
        painel.setBackground(Color.ORANGE);
        painel.setPreferredSize(new Dimension(200,200));
        setLayout(new FlowLayout());

        painel.setBorder(new LineBorder(Color.BLACK));
        painel.setBorder(new TitledBorder("TITULO"));

        add(painel);

        setVisible(true);
        
    }
    public static void main(String[] args) {
        new Janelinha3();
    }
}