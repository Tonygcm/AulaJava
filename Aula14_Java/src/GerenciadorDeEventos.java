import java.util.ArrayList;
import java.util.List;

/*Implementar métodos estáticos para adicionar eventos, buscar por nome e listar todos os eventos. */ 

public class GerenciadorDeEventos {

    private static List<Evento> listaEventos = new ArrayList<>();


    public static void addEvento(Evento evento){
        listaEventos.add(evento);
        System.out.println("O evento " + evento.getNome() + ", foi adicionado para a data " + evento.getData() + ", neste local: " + evento.getLocal());
    }

    public static void buscarEvento(String nomeEvento){
        for (Evento eventoTemp : listaEventos) {
            if (eventoTemp.getNome().equals(nomeEvento)){
                eventoTemp.mostrarEvento();
                System.out.println("\nO evento " + nomeEvento + ", já está agendado.");
                return;
            }
        }
        System.out.println("\nO evento de nome: " + nomeEvento + ", não existe no sistema.");
    }

    public static void listarEventos(){
        if(listaEventos.size() == 0){
            System.out.println("\nNão há eventos agendados.");
            return;
        }
        System.out.println("\n Eventos agendados: ");

        for (Evento eventoTemp : listaEventos){
            eventoTemp.mostrarEvento();
        }
    }


    
}
