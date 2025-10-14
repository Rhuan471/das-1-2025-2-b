    Design Arquitetura de Sistemas
    # OBJETIVO
# OBJETIVO
// Desenvolvimento de Software: o curso promove uma formação que propicie ao egresso. atuar na especificação, desenvolvimento, manutenção e evolução de softwares. Isso inclui a capacidade de atuar nas diversas etapas do processo de desenvolvimento de softwares/sistemas de informação.
// Gestão de Qualidade de Software: o curso promove uma formação que propice ao egresso atuar na definição, verificação, validação e evolução de processos, técnicas e metodologias de desenvolvimento de softwares dentro da perspectiva da gestão da qualidade do processo e do produto de software.

# Abstração
// É uma representação simplificada de uma entidade, sendo aplicada em computação, ou seja, um processo de simplificar algo complexo, focando nos detalhes essenciais e ignorando os detalhes irrelevantes para um determinado propósito. É uma representação que esconde a complexidade interna de um sistema, permitindo que utilizadores ou outros sistemas interajam com ele através de uma interface mais simples e fácil de entender.
// Sua importânicia é:
- Reduz a complexidade: Torna o desenvolvimento e a manutenção de sistemas complexos mais gerenciáveis, ao dividir o sistema em partes menores e mais fáceis de entender. 
- Foco no essencial: Permite que os programadores se concentrem nos aspetos mais importantes de um sistema, sem se perderem nos detalhes técnicos. 
// APIs (Interfaces de Programação de Aplicações) e Tipos de Dados Abstratos são exemplos essenciais para o uso de abstrações para se aplicar nas entidades. repositórios, controladores e serviços.

// 1° Entity     - Dados
// 2° repository (CRUD) JPA spring data
// 3° services (PUT, POST, DELETE) USE CASES (lógica)
// 4° controller (API REST)

# Complexidade (Desvantagem da Abstração)
// As principais desvantagens da abstração da complexidade de um software incluem o aumento da complexidade do código (com múltiplas camadas de abstração), a redução do desempenho (devido à sobrecarga das camadas), o aumento do tempo de desenvolvimento e custos, a dificuldade na depuração e integração e, em alguns casos, a perda de clareza e a criação de excesso de código.
// Alguns outros exemplos dessa desvantagem da abstração é:
- Redução de Desempenho: A sobrecarga adicional para lidar com as abstrações e executar códigos que não são necessários em todos os cenários de uso pode tornar o software mais lento. 
- Sobrecarga de Desenvolvimento: Abstrações mal projetadas podem aumentar o tempo e o custo de desenvolvimento, atrasando a entrega do software. 
- Aumento da complexidade: Em vez de reduzir a complexidade, um excesso de camadas de abstração pode criar um sistema ainda mais complexo, especialmente em bases de código grandes.
- Falta de flexibilidade: Abstrações muito rígidas ou genéricas demais podem dificultar futuras modificações. Se a abstração não acomodar adequadamente um novo requisito, o desenvolvedor pode ser forçado a "quebrar" a abstração existente ou adicionar mais uma camada, aumentando ainda mais a complexidade.

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
//As suas vantagens são: Facilitar a impelmentação da uma classe fazendo modificações, a sua alocação de um único responsável por amnter uma classe e o reúso de teste de uma classe.

# Princípios de projeto de código
// As boas práticas nos princípios do projeto incluem definir objetivos claros, um escopo bem delimitado e um plano de trabalho detalhado, que abrange o cronograma, os recursos e o orçamento. Além disso, é essencial garantir uma comunicação eficaz, gerir riscos e mudanças, monitorar o progresso, montar uma equipa qualificada e promover a colaboração, focando sempre na entrega de valor ao cliente. 

# Padronização de código
// Ele pode tornar os padrões de códigos mais flexíveis e fáceis de entender, ganhando tempo e reduzindo a sua reprodução, usa o termo módulo no seu artigo, mas isso em uma época em que orientação a objetos ainda não havia surgido, pelo menos como conhecemos hoje. Já neste capítulo, escrito quase 50 anos após o trabalho de Parnas, optamos pelo termo classe, em vez de módulo. O motivo é que classes são a principal unidade de modularização de linguagens de programação modernas, como Java, C++ e Ruby. No entanto, o conteúdo do capítulo aplica-se a outras unidades de modularização, incluindo aquelas menores do que classes, como métodos e funções; e também a unidades maiores, como pacotes e componentes.

# Ocultamento de Informação
// Projetamos o sistema, fizemos as abstrações, escondemos as informações (complexidade) através da API e expomos apenas a Interface para o consumidor final. Na POO esse ocultamento ocorre nas Classes (ex: quando colocamos Private nela). Vantagens do Ocultamento de Informações:

- Desenvolvimento em paralelo.
- Flexibilidade a mudanças.
- Facilidade de entendimento.

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
//Considerações: cada parte de camada tem uma função, camada de apresentação, camada de negócio, cuida de regra de negócio.
//Considerações: cada parte de camada tem uma função, camada de apresentação, camada de negócio, cuida de regra de negócio. A principal regra sobre requisitos de software é que eles mudam com frequência. O mesmo acontece com tecnologias de implementação, como bibliotecas e frameworks.

# Princípio da Responsabilidade Única
// Seu foco é na parte do serviço utilizando a regra de negócio, fazendo algo perfeito. Ou seja, é um princípio de design de software que afirma que uma classe ou módulo deve ter apenas uma razão para mudar. Em outras palavras, cada classe deve ter apenas uma responsabilidade, uma única tarefa ou função que ela deve desempenhar.

# Prefira composição a herança
- Herança de classe: É quando o código é utilizado mais de uma vez. O princípio, porém, não proíbe o uso de herança. Mas ele recomenda: se existirem duas soluções de projeto, uma baseada em herança e outra em composição, a solução por meio de composição, normalmente, é a melhor. Só para deixar claro, existe uma relação de composição entre duas classes A e B quando a classe A possui um atributo do tipo B.
- Herança de interfaces: Acreditava-se que o conceito seria talvez uma bala de prata capaz de resolver os problemas de reúso de software. Argumentava-se que hierarquias de classes profundas, com vários níveis, seriam um indicativo de um bom projeto, no qual foi possível atingir elevados índices de reúso. Um mecanismo onde uma classe (a subclasse ou classe filha) adquire propriedades e comportamentos de outra classe (a superclasse ou classe mãe).

// ----------> herança (é um relacionamento "é um" (IS-A), onde uma classe (filha) herda características de outra classe (mãe), como entre Cão e um Gato é um Animal.)
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

- De sua própria classe (caso 1)
- de objetos passados com parâmetros (caso 2)
- de objetos criados pelo próprio método (caso 3)
- de atributos da classe do método (caso 4)

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
// O Princípio de Substituição de Liskov (LSP) é um conceito da programação orientada a objetos que estabelece que, se uma classe B é uma subtipo de uma classe A, então os objetos de B devem poder ser substituídos por objetos de A sem que isso afete a execução correta do programa, mantendo o comportamento esperado. Isso significa que a subclasse não deve "quebrar" ou alterar o comportamento da superclasse, e deve ser totalmente compatível com ela. 
Para explicar o Princípio de Substituição de Liskov vamos nos basear no seguinte exemplo:

void f(A a) {
  ...
  a.g();
  ...
}
O método f pode ser chamado passando-se como parâmetros objetos de subclasses B1, B2, …, Bn da classe base A, como mostrado a seguir:

f(new B1());  // f pode receber objetos da subclasse B1 
...
f(new B2());  // e de qualquer subclasse de A, como B2
...
f(new B3());  // e B3

# Ocultamento de Informações
// Na orientação de objetos, fazer com esse conceito seja implementado para poder possibilitar o desenvolvimento do software. 

# Observer
// Publisher: Ele produz interesse em serem avisados pelo CONCRETE SUBSCRIBER, executando um método (código). Para isso, ele precisa ter um padrão de comunicação, que é a classe INTERFACE.
// Interface: com o método "Update", tendo (context) que é uma informação, ele se atualiza, recebendo informações da comunicação.

# Características da Arquitetura
// As características da arquitetura não funcional definem os atributos de qualidade e as restrições operacionais de um sistema, focando no como ele deve operar, e não no que ele faz. Essas características incluem desempenho (velocidade e tempo de resposta), segurança (proteção contra acesso não autorizado), confiabilidade (disponibilidade e tolerância a falhas), escalabilidade (capacidade de lidar com o crescimento), usabilidade (facilidade de uso), manutenibilidade (facilidade de manutenção e modificação) e portabilidade (capacidade de rodar em diferentes ambientes).
// Concrete Subscriber implementa -------> interface

# DevOps
// DevOps é um conjunto de práticas, ferramentas e uma filosofia cultural que automatizam e integram os processos entre o desenvolvimento de software e as equipes de TI. Ele enfatiza o empoderamento da equipe, a comunicação e a colaboração entre equipes e a automação da tecnologia.
//Ao adotar práticas de DevOps:

- Reduz o tempo de ciclo trabalhando em lotes menores.
- Usa mais automação.
- Protege seu pipeline de lançamento.
- Melhora sua telemetria.
- Implanta com mais frequência.

# Expectativa de um Arquiteto
// Para tomar "Atitude da arquitetura", Orientação é a palavra de ordem em primeira expectativa.
// Definir o papel de um arquiteto de software se mostra tão difícil quanto definir a arquitetura de software. Pode variar desde um programador especializado até definir a direção técnica estratégica para a empresa. Em vez de perder tempo com a busca inútil de definir a função, recomendamos focar as expectativas de um arquiteto.
// Framework reativo para o desenvolvimento web front-end.
// Nessas oito expectativas principais de um arquiteto que são: 
- Tomar decisões de arquitetura;
- Analisar continuamente a arquitetura;
- Manter-se atualizado com as últimas tendências;
- Assegurar a conformidade com as decisões;
- Exposição e experiência diversificadas;
- Ter conhecimento sobre o domínio do negócio;
-Ter habilidades interpessoais;
- Entender e lidar bem com questões políticas.

# Na Decisão de Arquitetura
// Orientação é a palavra de ordem nessa primeira expectativa. Um arquiteto deve orientar, não especificar as escolhas da tecnologia. Por exemplo, um arquiteto pode tomar a decisão de usar React.js para um desenvolvimento front-end. Nesse caso, ele está tomando uma decisão técnica, não uma decisão arquitetural ou um princípio do design que ajudará a equipe de desenvolvimento a fazer escolhas. Um arquiteto deve instruir as equipes de desenvolvimento para usarem um framework reativo para o desenvolvimento web front-end, orientando a equipe ao fazer a escolha entre Angular, Elm, React.js, Vue ou qualquer outro framework web reativo.

# Analisar Continuamente a Arquitetura
// Um arquiteto deve analisar continuamente a arquitetura e o ambiente de tecnologia atual, para então recomendar soluções de melhorias. Essa expectativa de um arquiteto se refere à vitalidade da arquitetura, que avalia se uma arquitetura é viável hoje tendo sido definida há três anos ou mais, dadas as mudanças no negócio e na tecnologia. Conforme nossa experiência, poucos arquitetos focam suas energias em analisar continuamente as arquiteturas existentes. Como resultado, a maioria deles enfrenta elementos de decadência estrutural, o que ocorre quando os desenvolvedores fazem mudanças no código ou no design que impactam as características arquiteturais requeridas, como desempenho, disponibilidade e escalabilidade.

# Manter Atualização com as últimas tendências
// Um arquiteto deve ficar atualizado com as últimas tendências da tecnologia e do setor. Os desenvolvedores devem ficar atualizados com as últimas tecnologias usadas diariamente para manterem a si mesmos (e seu trabalho!) relevantes. Um arquiteto tem um requisito ainda mais crítico de se manter atual com as últimas tendências técnicas e do setor. As decisões que um arquiteto toma tendem a ser de longo prazo e difíceis de mudar. Entender e seguir as principais tendências contribui para que ele se prepare para o futuro e tome a decisão certa.
// Seguir as tendências e se manter atualizado com elas é difícil, sobretudo para um arquiteto de software. No Capítulo 24, examinaremos as várias técnicas e recursos sobre como fazer isso.

# Domínio de Negócios
// Um arquiteto deve ter certo nível de especialização no domínio do negócio. Os arquitetos de software eficientes entendem não apenas de tecnologia, mas do domínio do negócio no espaço do problema. Sem conhecimento do domínio do negócio, fica difícil entender o problema comercial, as metas e os requisitos, complicando planejar uma arquitetura eficiente para atender aos requisitos da empresa. Imagine ser arquiteto em uma grande instituição financeira e não entender os termos financeiros comuns, como índice direcional médio, contratos aleatórios, aumento das taxas ou mesmo dívida não prioritária. Sem esse conhecimento, um arquiteto não consegue se comunicar com os stakeholders e com os usuários do negócio, perdendo rápido a credibilidade.

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

# Tópicos e Filas
- Tópicos: Um publisher envia uma mensagem para o Tópico (Broker) e todos os subscribers recebem a mesma mensagem. Ou seja, toda vez que alguém publica uma mensagem no tópico, todo mundo que está inscrito, todos os computadores ou sistemas recebem a mesma mensagem.
- Fila: Um publisher (sender) envia uma mensagem para a Fila (caixinha de correio) e cada subscriber (receivers) deve ir até a Fila para receber a mensagem. A Fila armazena a mensagem e fica disponível para regaste o tempo todo.

- Diferença entre Tópico e Fila:
// No Tópico temos menor acoplamento, porém o publisher precisa atender as necessidades de todos os subscribers.
//Já na Fila, o acoplamento é maior, porém o publisher (sender) consegue dividir a mensagem para atender apenas a necessidade especificas dos subscribers (receivers).

# Expectativas de um arquiteto de software
// As expectativas sobre um arquiteto de software incluem o design de sistemas robustos, escaláveis e seguros que atendam aos requisitos funcionais e não funcionais do negócio.
- Projetar a Estrutura do Sistema: Definir a arquitetura e a estrutura de alto nível de um sistema de software, escolhendo os componentes tecnológicos e o seu modo de interação. 
- Assegurar Qualidade e Desempenho: Focar em atributos de qualidade como escalabilidade, disponibilidade, confiabilidade, manutenibilidade, portabilidade e segurança do sistema.

 2° Bimestre  
# Definição das Características da Arquitetura
// Na figura 4.1, ilustra que uma solução de software não consiste apenas nos requisitos do domínio (o que o sistema deve fazer), mas também em características cruciais da arquitetura. Estas características representam fatores que o arquiteto deve considerar para garantir o sucesso do sistema, contudo, um bom planejamento de softare exige que planejamento de software tenha planos mais em mente do que requisitos funcionais e se integre as características da arquitetura (como Segurança e Desempenho) como elementos essenciais do design. sendo elas: Auditoria: Capacidade de rastrear eventos e ações.
- Desempenho: A velocidade e a eficiência com que o sistema opera.
- Segurança: Proteção dos dados e do sistema contra acesso não autorizado.
- Requisitos: As funcionalidades de negócio (o que o sistema deve fazer).
- Dados: A gestão e a estrutura da informação.
- Legalidade: Conformidade com regulamentos e leis.
- Escalabilidade: A capacidade do sistema de lidar com um aumento na carga de trabalho.

// Os Três Critérios
Cada lado e vértice do triângulo representa um critério essencial:
Especifica uma consideração do design fora do domínio (Explícita):
Isto significa que a característica não é uma simples funcionalidade de negócio (requisito do domínio). Em vez disso, é uma preocupação que vai além do "o quê" o sistema faz (funcionalidade) e foca no "como" ele deve ser construído (design).
Exemplo: O requisito do domínio é "o cliente pode fazer um pedido." A característica da arquitetura é que esse processo deve ter Alta Disponibilidade.
Influencia um aspecto estrutural do design (Implícita):
Esta é a parte técnica. A característica deve ter um impacto direto e significativo na forma como o software é estruturado, organizado em módulos, e nas tecnologias e padrões escolhidos.
Essa influência é frequentemente implícita, pois molda as decisões de design de fundo, mesmo que o usuário final não perceba diretamente.
Exemplo: Para garantir o Desempenho, o arquiteto pode ter que usar um cache distribuído ou mudar a estrutura do banco de dados, o que é uma decisão estrutural.
Crítica ou importante para o sucesso da aplicação:
Este é o fundamento do triângulo. A característica deve ser vital para que o projeto seja considerado um sucesso pela equipe, pelo negócio ou pelos usuários. Sem ela, o sistema falharia em atender aos padrões de qualidade esperados.
Exemplo: Se o sistema não tiver Segurança adequada, ele será um fracasso, mesmo que todas as funcionalidades estejam corretas.

# Trade-offs e Arquitetura Menos Pior
// As aplicações suportam apenas algumas características da arquitetura que listamos por vários motivos. Primeiro, cada característica com suporte requer um esforço de design e, talvez, um suporte estrutural. Segundo, o maior problema está no fato de que cada característica costuma ter um impacto nas outras. Por exemplo, se um arquiteto deseja melhorar a segurança, é quase certo que terá um impacto negativo no desempenho: a aplicação deve aplicar mais criptografia em tempo real, indireção para ocultar segredos e outras atividades que diminuem potencialmente o desempenho.

- Uma metáfora ajudará a mostrar a interconectividade. Aparentemente, os pilotos sempre tentam aprender a pilotar helicópteros porque ele requer um controle para cada mão e pé, e mudar um deles impacta os outros. Assim, pilotar um helicóptero é um exercício de equilíbrio, que descreve bem o processo de trade-off ao escolher as características da arquitetura. Para cada característica em que o arquiteto projeta um suporte, possivelmente teremos uma complicação do design em geral.

# Circuit Breaker
// O padrão Circuit Breaker (Disjuntor) é uma técnica de design para aumentar a estabilidade e a resiliência de um aplicativo distribuído, especialmente ao lidar com falhas em serviços e recursos remotos.
// Como Funciona e Por Que Usar:
- Bloqueio de Acesso: O disjuntor detecta falhas e, em seguida, bloqueia temporariamente novas tentativas de acesso ao serviço defeituoso.
- Prevenção de Tentativas Falhas: Essa ação impede que o aplicativo tente repetidamente (e sem sucesso) se conectar a um serviço com problemas.
- Recuperação Eficaz: Ao bloquear o acesso, ele permite que o sistema e o serviço remoto tenham tempo para se recuperar com mais eficácia.

# CQRS Pattern
// A Segregação de Responsabilidade de Consulta de Comando CQRS (Command Query Responsibility Segregation) é um padrão de design que segrega as operações de leitura e gravação de um repositório de dados em modelos de dados separados. Essa abordagem permite que cada modelo seja otimizado de forma independente e pode melhorar o desempenho, a escalabilidade e a segurança de uma aplicação.
// Os fundamentos do padrão CQRS são a separação das responsabilidades de gravação (comandos) e leitura (consultas), o que permite otimizar cada uma delas independentemente. Isso significa que o sistema terá modelos, dados e lógica de negócios distintos para processar comandos (que modificam o estado) e para executar consultas (que apenas retornam dados). Essa separação melhora o desempenho, a escalabilidade e a complexidade de sistemas com alta disputa de dados. 
// Comandos (Gravação)
- Responsabilidade: Manipulam a lógica de negócios e mudam o estado do sistema. 
- Natureza: São transações que representam uma intenção, como "Reservar quarto de hotel". 
- Processamento: Geralmente são assíncronos, ou seja, a alteração pode ocorrer posteriormente. 
- Dados: Podem ser armazenados em um modelo de dados normalizado para transações de gravação. 
- Estratégia: Podem ser implementados usando Event Sourcing, onde o estado é armazenado como uma sequência de eventos. 
// Consultas (Leitura)
- Responsabilidade: Recuperam dados de forma eficiente e não modificam o estado do sistema. 
- Natureza: Retornam objetos de transferência de dados (DTOs) em um formato específico para a aplicação ou interface de usuário. 
- Processamento: São geralmente síncronas e otimizadas para a leitura, podendo ter um desempenho muito alto. 
- Dados: Podem ser armazenados em um modelo de dados otimizado para leitura, possivelmente desnormalizado, para minimizar a necessidade de joins. 
- Estratégia: O modelo de consulta pode ser construído a partir de eventos, utilizando uma abordagem de "consistência eventual".

# Referências
- [Livro Eng Soft Moderna CAP 5](https://engsoftmoderna.info/cap5.html)
- [Livro Eng Soft Moderna CAP 7](https://engsoftmoderna.info/cap7.html)
- [Livro Fundamentos da Arquitetura de Software](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/2[%3Bvnd.vst.idref%3Dcover]!/4/2/2%4051:77)
- [Livro Código Limpo](https://integrada.minhabiblioteca.com.br/reader/books/9788550816043/pageid/0)
- [Livro Padrões de Projeto](https://integrada.minhabiblioteca.com.br/reader/books/9788577800469/pageid/0)
- [Site DESIGN PATTERNS](https://refactoring.guru/pt-br/design-patterns)
- [Introdução a DevOps](https://learn.microsoft.com/pt-br/training/modules/introduction-to-devops/2-what-is-devops?ns-enrollment-type=learningpath&ns-enrollment-id=learn.wwl.az-400-work-git-for-enterprise-devops )
- [Livro Fundamentos da Arquitetura de Software](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/26[%3Bvnd.vst.idref%3Dcap4.xhtml]!/4/2/136/5:25[ica%2Cr%20m]).
