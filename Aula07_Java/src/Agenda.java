public class Agenda {

    private Contato[] agenda = new Contato[3];
    private int i;

    public Agenda() {
        agenda = new Contato[3];
        i = 0;
    }

    public void addContato(Contato contato) {
        if (i >= agenda.length) {
            System.out.println("Limite da agenda atingido! ");
            return;
        }
        agenda[i] = new Contato();
        agenda[i] = contato;
        i++;
    }

    public void delContato() {

    }

    public void buscarContato() {

    }

}
