public class Livro {

    String titulo;
    String autor;
    int ano;

    public Livro(){
    }

    public Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public void mostrarInfo(){
        System.out.println("Título: " + titulo + "\nAutor: " + autor + "\nAno de publicação: " + ano);
    }

}
