public class Principal {

    public static void main(String[] args) {
        
        int op;
        String nomeEvento;
        String dataEvento;
        String localEvento;

        do {

            System.out.println("\nEvento - Menu Principal");
            System.out.println("1) Adicionar Evento.");
            System.out.println("2) Buscar Evento.");
            System.out.println("3) Listar todos os Eventos.");
            System.out.println("0) Sair.");
            System.out.println("Informe uma opção: ");
            op = Console.lerInt();

            switch (op) {

                case 1:
                    
                    System.out.println("\nDados do evento: ");
                    System.out.println("Nome do evento: ");
                    nomeEvento = Console.lerString();
                    System.out.println("Data do evento: ");
                    dataEvento = Console.lerString();
                    System.out.println("Local do evento: ");
                    localEvento = Console.lerString();

                    Evento evento = new Evento(nomeEvento, dataEvento, localEvento);

                    GerenciadorDeEventos.addEvento(evento);

                    break;

                case 2:

                    System.out.println("\nNome do evento para consulta: ");
                    nomeEvento = Console.lerString();

                    GerenciadorDeEventos.buscarEvento(nomeEvento);
                    
                    break;

                case 3:
                
                    System.out.println("\nListar todos os eventos: ");

                    GerenciadorDeEventos.listarEventos();

                    break;

                case 0:

                    System.out.println("\nO sistema foi finalizado...\n");
                    break;
            
                default:

                    System.out.println("\nOpção inválida. Digite novamente.");
                    break;
            }
            
        } while (op != 0);


    }


    /*                               EXERCÍCIO 01: Sistema de Gerenciamento de Eventos


    Uma empresa de eventos precisa de um sistema para gerenciar a lista de eventos futuros. 
    Cada evento possui um nome, uma data e um local. 
    O sistema deve permitir adicionar novos eventos, buscar eventos por nome e listar todos os eventos cadastrados.

    Objetivo do Exercício:
    Criar uma classe Evento que contenha os atributos nome, data e local. 
    Desenvolver uma classe GerenciadorDeEventos que utilize um ArrayList estático para armazenar objetos do tipo Evento. 
    Implementar métodos estáticos para adicionar eventos, buscar por nome e listar todos os eventos. */



    /*                              EXERCÍCIO 02: Sistema de Controle de Biblioteca


    Uma biblioteca deseja informatizar seu sistema de controle de empréstimos de livros. 
    Para cada livro, é necessário registrar o título, o autor e o status de disponibilidade (disponível ou emprestado). 
    O sistema deve permitir cadastrar novos livros com as informações sendo fornecidas pelo usuário, bem como buscar livros por título e listar todos os dados dos livros cadastrados. 
    Esse sistema deve permitir efetuar essas operações com os livros da biblioteca matriz e da filial, cada uma contendo seu próprio acervo de livros.

    Objetivo do Exercício: 
    Criar uma classe Livro com os atributos titulo, autor e disponibilidade. 
    Implementar uma classe ControleBiblioteca que gerencia uma lista de livros usando um ArrayList. 
    Os métodos incluirão adicionar livro, buscar por título e listar todos os livros. 
    Este sistema deve permitir criar mais de uma instância de ControleBiblioteca, uma representando a lista de livros da biblioteca matriz, e outra da filial. */




    /*                              EXERCÍCIO 03: Sistema de Cadastro de Clientes de uma Loja


    Uma loja online precisa de um sistema para gerenciar o cadastro de seus clientes. 
    Para cada cliente, é preciso armazenar o nome, o email e o endereço. 
    O sistema deve permitir a inclusão de novos clientes, a busca de clientes por email e a listagem de todos os clientes cadastrados.

    Objetivo do Exercício: 
    Desenvolver uma classe Cliente que contenha os atributos nome, email e endereço (SEM 'ç').
    Criar uma classe CadastroClientes que use um ArrayList estático para armazenar objetos do tipo Cliente. 
    Incluir métodos para adicionar clientes, buscar cliente específico por email, remover cliente com base no email, e listar todos os clientes cadastrados. */


}