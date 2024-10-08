public class Livro extends Publicacao {
    //construtor
    public Livro(String t, String a, int p) {
        super(t, a, p);
        this.setCategoria("Livro");
    }
    //implementação dos métodos abstratos
    @Override
    public void exibirInformacoes() {
        System.out.println("------- Informações -------");
        System.out.println("Categoria: "+this.getCategoria());
        System.out.println("Título: "+this.getTitulo());
        System.out.println("Autor: "+this.getAutor());
        System.out.println("Número de Páginas: "+this.getPaginas());
        if (!this.getEmprestado())
            System.out.println("Dispinível para empréstimo");
        else
            System.out.println("Emprestado");
    }
    @Override
    public void emprestar() {
        if (!this.getEmprestado()) {
            this.setEmprestado(true);
            System.out.println("Você emprestou o livro "+this.getTitulo());
        } else
            System.out.println("Você já emprestou esse livro");
    }
    @Override
    public void devolver() {
        if (!this.getEmprestado())
            System.out.println("[ERRO] Você não emprestou o livro para devolve-lo.");
        else {
            System.out.println("Você devolveo o livro " + this.getTitulo());
            this.setEmprestado(false);
        }
    }
}
