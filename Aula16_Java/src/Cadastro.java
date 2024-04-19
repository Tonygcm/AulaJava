import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    private static List<Funcionario> listaFuncionario = new ArrayList<>();

    public static void cadastrar(Funcionario funcionario){
        listaFuncionario.add(funcionario);
    }

    public static List<Funcionario> getListaFuncionarios(){
        return listaFuncionario;
    }
    
}
