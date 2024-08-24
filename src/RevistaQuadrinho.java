public class RevistaQuadrinho extends Publicacao{
    //atributos
    private String genero;
    private int numeroEdicao;
    //métodos especiais
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getNumeroEdicao() {
        return numeroEdicao;
    }
    public void setNumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }
    //construtor
    public RevistaQuadrinho(String t, String a, int p, String g, int nE) {
        super(t, a, p);
        this.setCategoria("Quadrinho");
        this.setGenero(g);
        this.setNumeroEdicao(nE);
    }
    //implementação dos métodos abstratos
    @Override
    public void exibirInformacoes() {
        System.out.println("------- Informações -------");
        System.out.println("Categoria: "+this.getCategoria());
        System.out.println("Título: "+this.getTitulo());
        System.out.println("Autor: "+this.getAutor());
        System.out.println("Número de páginas: "+this.getPaginas());
        System.out.println("Gênero: "+this.getGenero());
        System.out.println("Número da edição: "+this.getNumeroEdicao());
        if (!this.getEmprestado())
            System.out.println("Dispinível para empréstimo");
        else
            System.out.println("Emprestado");
    }

    @Override
    public void emprestar() {
        if (!this.getEmprestado()) {
            this.setEmprestado(true);
            System.out.println("Você emprestou o quadrinho "+this.getTitulo());
        } else
            System.out.println("Você já emprestou esse quadrinho");
    }

    @Override
    public void devolver() {
        if (!this.getEmprestado())
            System.out.println("[ERRO] Você não emprestou o quadrinho para devolve-lo.");
        else {
            System.out.println("Você devolveo o quadrinho " + this.getTitulo());
            this.setEmprestado(false);
        }
    }
}
