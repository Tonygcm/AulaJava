public class Agenda {

    private Contato[] agenda = new Contato[3];
    private int p;

    public Agenda() {

        agenda = new Contato[3];
        p = 0;

    }

    public void addContato(Contato contato) {

        if (p >= agenda.length) {
            System.out.println("Limite da agenda atingido! ");
            return;
        }
        agenda[p] = new Contato();
        agenda[p] = contato;
        p++;

        System.out.println("\nContato " + contato.getNome() + "(" + contato.getTelefone() + ") foi salvo na agenda!\n");

    }

    public void limparAgenda() {

        for (int i = 0; i < agenda.length; i++) {
            agenda[i] = new Contato();
        }

        p = 0;

        System.out.println("\nAgenda foi limpa. Sem contatos cadastrados. \n");

    }

    public void buscarContato(String nome) {

        boolean encontrou = false;
        for (int i = 0; i < p; i++) {
            if (agenda[i].getNome().equals(nome)) {
                System.out.println("\nContato localizado: \n" + agenda[i].toString());
                encontrou = true;
            }
        }

        if (!encontrou) { // encontrou == false
            System.out.println("\nContato: " + nome + ", não foi localizado. ");
        }
    }

    public void delContato(Contato contato) {

        /*
         * agenda[i] = new Contato();
         * agenda[i] = contato;
         * i--;
         */

    }

}
