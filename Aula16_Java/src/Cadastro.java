import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    private static List<Funcionario> listaFuncionarios = new ArrayList<>();

    public static void cadastrar(Funcionario funcionario){
        listaFuncionarios.add(funcionario);
    }

    public static List<Funcionario> getListaFuncionarios(){
        return listaFuncionarios;
    }

    public static Funcionario buscar(int matricula){
        

        // percorrer a lista de funcionarios

        for (Funcionario temp : listaFuncionarios) {

            // verificar se a matricula é igual a do parametro atual

            if (temp.getMatricula() == matricula){

                //se for verdade, retorna o funcionario atual 

                return temp;
            }

        }

        //se sair do laço, significa que não há funcionários com a matricula do parametro

        return null;

    }
    
}
