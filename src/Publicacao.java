abstract class Publicacao {
    private String categoria;
    private String titulo;
    private String autor;
    private int paginas;
    private boolean emprestado;
    //métodos abstratos
    public abstract void exibirInformacoes();
    public abstract void emprestar();
    public abstract void devolver();
    //métodos especiais
    //construtor
    public Publicacao(String t, String a, int p) {
        this.setTitulo(t);
        this.setAutor(a);
        this.setPaginas(p);
        this.setEmprestado(false);
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public boolean getEmprestado() {
        return emprestado;
    }
    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
