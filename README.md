    Design Arquitetura de Sistemas
    # OBJETIVO
// Desenvolvimento de Software: o curso promove uma formação que propicie ao egresso. atuar na especificação, desenvolvimento, manutenção e evolução de softwares. Isso inclui a capacidade de atuar nas diversas etapas do processo de desenvolvimento de softwares/sistemas de informação.
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
//estado -> var, 
//comportamento -> método
//escondendo uma informação, ou seja o comportamento de cliente,

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
// Trata-se de uma classe coesa, pois todos os seus métodos implementam operações importantes em uma estrutura de dados do tipo Pilha.
// Todos os métodos e atributos devem estar voltados para a implementação do mesmo serviço, quando uma única funcionalidade é implementada.
//As suas vantagens são: Facilitar a impelmentação da uma classe fazendo modificações, a sua alocação de um único responsável por manter uma classe e o reúso de teste de uma classe.

Exemplo:
//Numa função de estrutua de dados, é comum definir seu serviço de uma forma mais equilibrada, sendo que nela, é feito de algumas funçoes como:
- Pilha: Suponha agora a seguinte classe:
class Stack<T> {
  boolean empty() { ... }  define se está vazia ou tem algum elemento
  T pop() { ... }    elemento que vai ser tirado pela parte de cima
  push (T) { ... }    essa função faz puxar os elementos pra cima
  int size() { ... }
}

# Acoplamento
// class A {
  private B b;     <- VARIÁVEL
  public A(){
    b = new B();
    b.fazqq();     <- MÉTODO
  }
}

// OBJETIVO: Reduzir esses acoplamentos, mas não totalmente. Quando se cria duas classe, uma delas, no lugar dela se tornar um tipo primitivo, números, ela pode se tornar uma referência da outra classe.
// CURIOSIDADE: Elas podem ser utilizadas para Springboot, Service e APIs.

# SOLID
// Single Responsibility  Principle (Princípio da responsabilidade única)
// Open-Closed Principle (Princípio Aberto-Fechado)
// Liskov Substitution Principle (Princípio da substituição de Liskov)
// Interface Segregation Principle (Princípio da Segregação da Interface)
// Dependency Inversion Principle (Princípio da inversão da dependência)

//SOLID são os 5 pricípios de um projeto que fazem mais do que realizar programas orientadas a objetos, reduzindo ou postergar essa contínua degradação da qualidade interna de sistemas de software. Em resumo, o objetivo não é apenas entregar um projeto capaz de resolver um problema, mas também que facilite manutenções futuras.
//Considerações: cada parte de camada tem uma função, camada de apresentação, camada de negócio, cuida de regra de negócio. A principal regra sobre requisitos de software é que eles mudam com frequência. O mesmo acontece com tecnologias de implementação, como bibliotecas e frameworks.

# Princípio da Responsabilidade Única
// Seu foco é na parte do serviço utilizando a regra de negócio, fazendo algo perfeito. Ou seja, é um princípio de design de software que afirma que uma classe ou módulo deve ter apenas uma razão para mudar. Em outras palavras, cada classe deve ter apenas uma responsabilidade, uma única tarefa ou função que ela deve desempenhar.

# Prefira composição a herança
° Herança de classe: É quando o código é utilizado mais de uma vez.
° Herança de interfaces: 

// ----------> herança
// - - - - - > implementação
// ---------|> associação (mais indicado para usá-la quanto a herança)


# Princípio da Segregação de Interfaces
// O Princípio de Segregação de Interface (ISP) determina que os clientes não devem ser forçados a depender de métodos que não usam. Em vez disso , interfaces grandes devem ser divididas em interfaces menores e mais específicas, garantindo que os clientes implementem apenas a funcionalidade necessária. Isso promove a modularidade, reduz o acoplamento e melhora a manutenibilidade do código.

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
// A ideia é então trocar (ou inverter) as dependências: em vez de depender de classes para fazer implementações concretas, clientes devem depender de interfaces, pois a classe cliente (controladores) se estabelece prioritariamente com abstrações (interfaces de serviço). Portanto, um nome mais intuitivo para o princípio seria Prefira Interfaces a Classes.

//ClienteService
interface I { ... }
//ClienteServiceImpl
class C1 implements I {
  ...
}
//ClienteServiceImpl2
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
// Todo código que escrever deve chamar objetos que estão dentro da classe, ou no máximo, coisas que eu recebo por parâmetros.
// Nunca se recebe por coisas globais.
. De sua própria classe (caso 1)
. de objetos passados com parâmetros (caso 2)
. de objetos criados pelo próprio método (caso 3)
. de atributos da classe do método (caso 4)

public class Janelinha2 extends JFrame{
    private JTable tabelinha;
    
    public Janelinha2() {
        setTitle("Tabela");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        var modelo = new ModeloTabela();

        tabelinha = new JTable(modelo);
        add(new JScrollPane(tabelinha));
        setVisible(true);
    }
    public static void main(String[] args) {
        new Janelinha2();
    }

}

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

# Ocultamento de Informações
// Na orientação de objetos, fazer com esse conceito seja implementado para poder possibilitar o desenvolvimento do software. 

# Observer
// Publisher: Ele produz interesse em serem avisados pelo CONCRETE SUBSCRIBER, executando um método (código). Para isso, ele precisa ter um padrão de comunicação, que é a classe INTERFACE.
// Interface: com o método "Update", tendo (context) que é uma informação, ele se atualiza, recebendo informações da comunicação.

# Características da Arquitetura
// Requisitos Não funcionais
// Concrete Subscriber implementa -------> interface



# Expectativa de um Arquiteto
// Para tomar "Atitude da arquitetura", Orientação é a palavra de ordem em primeira expectativa.
// framework reativo para o desenvolvimento web front-end.

# Analisar Continuamente a Arquitetura


# Diferença entre Arquitetura e Design
// Arquitetura: Foca nas estruturas do softwares no seu estilos monolitos e microsserviços, é responsável por coisas como analisar os requisitos comerciais para extrair e definir as características da arquitetura (os “atributos”), selecionar quais padrões e estilos da arquitetura se encaixariam no domínio do problema e criar componentes (blocos de construção do sistema). um arquiteto de software deve ter uma grande amplitude técnica para pensar.
// Design: O desenvolvedor foca em ter a prioridade em dar o seu melhor no seu conhecimento prático e experiência, Descrevendo os princípios de design de software em um nível granular. Falar sobre os princípios SOLID, e outros padrões de design (Design Patterns) que um desenvolvedor usa para criar classes bem estruturadas, coesas e fracamente acopladas. No código-fonte, . O desenvolvedor escreve o código limpo, legível e manutenível. Mencionar boas práticas de codificação, como convenções de nomenclatura, comentários claros e refatoração.
// A formação do conhecimento de um Arquiteto em Modelo T (ou T-shaped Architect) é uma abordagem que combina profundidade em uma área específica com uma ampla gama de conhecimentos em outras disciplinas. A analogia vem da letra 'T', onde a perna vertical representa a profundidade e a barra horizontal representa a amplitude. A Perna Vertical é a área onde o arquiteto se aprofunda e se torna um especialista. É o seu diferencial, o pilar de sua expertise. A Barra Horizontal: Conhecimento Amplo (Generalização)
//Essa é a gama de conhecimentos que permite ao arquiteto se comunicar com diferentes equipes, entender o panorama completo e tomar decisões arquiteturais holísticas. O conhecimento aqui é mais sobre "o que" e "por que", e não necessariamente sobre "como" implementar em detalhes. Ou seja, todo o contexto nem sabe ao todo, ele pode ser feito a parte.

# Analisando os Trade-offs
// Trade-off são compensasões, na arquitetura ele pode ter sua resposta como "depende", isso quer dizer que ele tem depedências da situação, não existindo resposta certa e nem errada, que é o Trade-offs. Ele pode aumentar a sua complexidade, porque ele não tem uma solução precisa. Ou seja, ele não resolve todos os problemas necessários do mundo.
// Mecanismo de tópico: Diferent do Observer, ele serve para poder compartilhar suas mensagens em outras máquinas.
// Na figura 2.7: Nesta arquitetura mais simples, a vantagem como essa é quando se insere o lance, mais de um sistema pode selecionar o lance. Qunado a performance do banco de dados se limita ao excesso de uso no sistema.
// Na figura 2.8: Mecanismo de tópico, no tópico (broker) se inscreve como assinantes (subscribers), e o publisher envia uma mensagem e cada um recebe a mesma mensagem. Assim como se implementa uma design patterns dentro do processo de um sistema operacional. Um exemplo desse tópico é apache Kafka, AWS SNS, Azure, ServiceBus, são uma plataforma distribuída de streaming de eventos de código aberto, concebida para lidar com grandes volumes de dados em tempo real, atuando como uma fonte de dados durável e confiável para a construção de pipelines e aplicações de streaming de alta performance.
// Na figura 2.9: nessa figura, quem dá o lance, é um sender, o item do lance é a ordem de armazenamento, e Aanalisar lance é quem recebe.
