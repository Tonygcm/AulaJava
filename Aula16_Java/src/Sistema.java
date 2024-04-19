public class Sistema {
    
    private static void exibirMenu(){

        System.out.println("\nFUNCIONARIO SYSTEM");
        System.out.println("1) Cadastrar Programador");
        System.out.println("2) Cadastrar Gerente");
        System.out.println("3) Procurar Funcionário");
        System.out.println("4) Listar Todos");
        System.out.println("0) Sair");
        System.out.println("Informe uma opção: ");
        
    }

    private static void verificarOpcao(int op) {

            int matricula;
            String nome;
            String linguagens;
            String nomeProjeto;

            switch (op) {

                case 1:

                    System.out.println("\nNovo Programador: ");
                    System.out.println("Matrícula: ");
                    matricula = Console.lerInt();

                    System.out.println("Nome: ");
                    nome = Console.lerString();

                    System.out.println("linguagens que domina: ");
                    linguagens = Console.lerString();

                    Programador p = new Programador(matricula, nome, linguagens);

                    Cadastro.cadastrar(p);

                    System.out.println("\nProgramador cadastrado com sucesso!");

                    break;

                case 2:

                    System.out.println("\nNovo Gerente: ");
                    System.out.println("Matrícula: ");
                    matricula = Console.lerInt();

                    System.out.println("Nome: ");
                    nome = Console.lerString();

                    System.out.println("Nome do projeto que gerencia: ");
                    nomeProjeto = Console.lerString();

                    Gerente g = new Gerente(matricula, nome, nomeProjeto);

                    Cadastro.cadastrar(g);

                    System.out.println("\nGerente cadastrado com sucesso!");

                    break;

                case 3:

                    System.out.println("Digite a matrícula do funcionário: ");
                    matricula = Console.lerInt();

                    //este método retornará um objeto do tipo funcionário
        
                    Funcionario f = Cadastro.buscar(matricula);

                    if(f != null){
                        System.out.println("\nFuncionario Localizado: ");
                        System.out.println(f.toString());
                        return;
                    }
                    
                    System.out.println("\nFuncionário de matrícula " + matricula + ", não foi encontrado.");
                    


                    break;
            
                case 4:

                    System.out.println("Lista de todos os funcionários: ");
                    
                    if(Cadastro.getListaFuncionarios().size() == 0){
                        System.out.println("\nNão há funcionários cadastrados...");
                        return;
                    }

                    for (Funcionario temp : Cadastro.getListaFuncionarios()){

                        System.out.println(temp.toString());
                    }

                    break;
            
                case 0:

                    System.out.println("\nO sistema foi finalizado...\n");

                    break;          
            
                default:

                    System.out.println("\nOpção inválida. Digite novamente.");

                    break;

            }
            
    
    
    }

    public static void executar(){

        int op;

        do {
            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);

        } while (op != 0);
    }

}
