import java.util.Scanner;

public class TrabalhoPOO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int comando, emprestimo;
        Livro[] l = new Livro[3];
        l[0] = new Livro("Dom Quixote", "Miguel de Cervantes", 1033);
        l[1] = new Livro("Guerra e Paz", "Leon Tolstói", 1544);
        l[2] = new Livro("O Grande Gatsby", "F. Scott Fitzgerald", 368);
        do {
            do {
                System.out.println("Selecione um livro abaixo: ");
                System.out.println("1- Dom Quixote");
                System.out.println("2- Guerra e Paz");
                System.out.println("3- O Grande Gatsby");
                System.out.println("4- Encerrar Execução");
                comando = scanner.nextInt();
            } while (comando < 1 || comando > 4);
            switch (comando) {
                case 1:
                    l[0].informacoes();
                    do {
                        System.out.println("Digite 1 para emprestar o livro ou 0 para devolve-lo: ");
                        emprestimo = scanner.nextInt();
                    } while (emprestimo < 0 || emprestimo > 1);
                    if (emprestimo == 0)
                        l[0].devolver();
                    else
                        l[0].emprestar();
                    break;
                case 2:
                    l[1].informacoes();
                    do {
                        System.out.println("Digite 1 para emprestar o livro ou 0 para devolve-lo: ");
                        emprestimo = scanner.nextInt();
                    } while (emprestimo < 0 || emprestimo > 1);
                    if (emprestimo == 0)
                        l[1].devolver();
                    else
                        l[1].emprestar();
                    break;
                case 3:
                    l[2].informacoes();
                    do {
                        System.out.println("Digite 1 para emprestar o livro ou 0 para devolve-lo: ");
                        emprestimo = scanner.nextInt();
                    } while (emprestimo < 0 || emprestimo > 1);
                    if (emprestimo == 0)
                        l[2].devolver();
                    else
                        l[2].emprestar();
                    break;
                case 4:
                    System.out.println("Execução Encerrada");
                    break;
            }
        } while (comando != 4);
    }
}
