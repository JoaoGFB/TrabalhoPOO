import java.util.Scanner;

public class TrabalhoPOO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int comando, emprestimo;
        Livro[] l = new Livro[3];
        l[0] = new Livro("Dom Quixote", "Miguel de Cervantes", 1033);
        l[1] = new Livro("Guerra e Paz", "Leon Tolstói", 1544);
        l[2] = new Livro("O Grande Gatsby", "F. Scott Fitzgerald", 368);

        RevistaQuadrinho[] q = new RevistaQuadrinho[3];
        q[0] = new RevistaQuadrinho("Batman: The Dark Night Returns", "Frank Miller", 224, "Super-Herói", 1);
        q[1] = new RevistaQuadrinho("Homem-Aranha: A Última Caçada de Kraven", "J.M DeMatteis", 168, "Super-Herói", 6);
        q[2] = new RevistaQuadrinho("Sandman", "Neil Gaiman", 616, "DarkFantasy", 75);
        do {
            do {
                System.out.println("Selecione uma publicação abaixo: ");
                System.out.println("1- Dom Quixote");
                System.out.println("2- Guerra e Paz");
                System.out.println("3- O Grande Gatsby");
                System.out.println("4- Batman: The Dark Night Returns");
                System.out.println("5- Homem-Aranha: A Última Caçada de Kraven");
                System.out.println("6- Sandman");
                System.out.println("7- Encerrar Execução");
                comando = scanner.nextInt();
            } while (comando < 1 || comando > 7);
            switch (comando) {
                case 1:
                    l[0].exibirInformacoes();
                    do {
                        System.out.println("Digite 1 para emprestar ou 0 para devolver: ");
                        emprestimo = scanner.nextInt();
                    } while (emprestimo != 0 && emprestimo != 1);
                    if (emprestimo == 0)
                        l[0].devolver();
                    else
                        l[0].emprestar();
                    break;
                case 2:
                    l[1].exibirInformacoes();
                    do {
                        System.out.println("Digite 1 para emprestar ou 0 para devolver: ");
                        emprestimo = scanner.nextInt();
                    } while (emprestimo != 0 && emprestimo != 1);
                    if (emprestimo == 0)
                        l[1].devolver();
                    else
                        l[1].emprestar();
                    break;
                case 3:
                    l[2].exibirInformacoes();
                    do {
                        System.out.println("Digite 1 para emprestar ou 0 para devolver: ");
                        emprestimo = scanner.nextInt();
                    } while (emprestimo != 0 && emprestimo != 1);
                    if (emprestimo == 0)
                        l[2].devolver();
                    else
                        l[2].emprestar();
                    break;
                case 4:
                    q[0].exibirInformacoes();
                    do {
                        System.out.println("Digite 1 para emprestar ou 0 para devolver: ");
                        emprestimo = scanner.nextInt();
                    } while (emprestimo != 0 && emprestimo != 1);
                    if (emprestimo == 0)
                        q[0].devolver();
                    else
                        q[0].emprestar();
                    break;
                case 5:
                    q[1].exibirInformacoes();
                    do {
                        System.out.println("Digite 1 para emprestar ou 0 para devolver: ");
                        emprestimo = scanner.nextInt();
                    } while (emprestimo != 0 && emprestimo != 1);
                    if (emprestimo == 0)
                        q[1].devolver();
                    else
                        q[1].emprestar();
                    break;
                case 6:
                    q[2].exibirInformacoes();
                    do {
                        System.out.println("Digite 1 para emprestar ou 0 para devolver: ");
                        emprestimo = scanner.nextInt();
                    } while (emprestimo != 0 && emprestimo != 1);
                    if (emprestimo == 0)
                        q[2].devolver();
                    else
                        q[2].emprestar();
                    break;
                case 7:
                    System.out.println("Execução Encerrada");
                    break;
            }
        } while (comando != 4);
    }
}
