import java.util.Scanner;

public class desafioJava {
    public static void main(String[] args) {
        simCity(null, null, 0);

    }

    public static void simCity(String nome, String profissao, double impostoTotal) {
        Scanner menu = new Scanner(System.in);
        Scanner nomeProfissao = new Scanner(System.in);

        System.out.println("Digite a quantidade de Mês desejada");
        int qtddMes = menu.nextInt();
        double valorSalario[] = new double[qtddMes];

        while (true) {
            System.out.println("Digite a opção desejada:");

            System.out.print("|-----------------------------------------------------|\n");
            System.out.print("| Opção 1 - Novo Cadastro - Nome e Profissão          |\n");
            System.out.print("| Opção 2 - Mostrar informações cadastradas           |\n");
            System.out.print("| Opção 3 - Inserir salários                          |\n");
            System.out.print("| Opcão 4 - Visualizar Salários cadastrados           |\n");
            System.out.print("| Opção 5 - Calcular imposto de cada mês              |\n");
            System.out.print("| Opção 6 - Sair                                      |\n");
            System.out.print("|-----------------------------------------------------|\n");
            System.out.print("Digite uma opção desejada:");

            int opcao = menu.nextInt();

            if (opcao == 1) {
                for (int i = 1; i <= 1; i++) {
                    System.out.println("Informe o seu nome: ");
                    nome = nomeProfissao.nextLine();

                    System.out.println("Informe sua profissão: ");
                    profissao = nomeProfissao.nextLine();

                }

            }

            if (opcao == 2) {

                System.out.println();
                System.out.println("Nome: " + nome);
                System.out.println("Profissão: " + profissao);

            }

            else if (opcao == 3) {
                for (int j = 0; j < qtddMes; j++) {
                    System.out.println("Informe o seu salario");
                    valorSalario[j] = menu.nextDouble();
                    System.out.println();

                }

            } else if (opcao == 4) {
                for (int j = 0; j < qtddMes; j++) {
                    System.out.println(valorSalario[j]);

                }
            }

            else if (opcao == 5) {

                for (int j = 0; j < qtddMes; j++) {

                    if (valorSalario[j] <= 2000.00) {
                        System.out.printf("\nValor de imposto a pagar no " + (j + 1) + "º mês = Isento");
                    } else if (valorSalario[j] >= 2001.00 && valorSalario[j] <= 3000.00) {
                        impostoTotal = (valorSalario[j] * 0.08);
                        System.out
                                .printf("\nValor de imposto a pagar no " + (j + 1) + "º mês = %.2f\n ", impostoTotal);

                    } else if (valorSalario[j] >= 3001.00 && valorSalario[j] <= 4500.00) {
                        impostoTotal = (valorSalario[j] * 0.18);
                        System.out
                                .printf("\nValor de imposto a pagar no " + (j + 1) + "º mês = %.2f\n ", impostoTotal);
                    } else if (valorSalario[j] > 4500.00) {
                        impostoTotal = (valorSalario[j] * 0.28);
                        System.out
                                .printf("\nValor de imposto a pagar no " + (j + 1) + "º mês = %.2f\n ", impostoTotal);

                    }
                }

            } else if (opcao == 6) {
                System.exit(0);
            }

        }

    }
}
