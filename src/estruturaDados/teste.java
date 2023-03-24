package estruturaDados;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Fila<String> fila = new Fila<>();

        Fila<String> preferencial = new Fila<>();

        int menu = 0;
        System.out.println();
        System.out.print("\n Olá, digite seu nome: ");
        String user = ler.nextLine();

        do {
            System.out.println();
            System.out.println(user + " digite a opção desejada: ");
            System.out.println(" 1) adicionar paciente");
            System.out.println(" 2) adicionar paciente preferencial");
            System.out.println(" 3) remover paciente");
            System.out.println(" 4) Tamanho da fila");
            System.out.println(" 5) ver o primeiro da fila");
            System.out.println("6) sair do atendimento");
            System.out.print(" digite a opção desejada: ");
            int escolha = ler.nextInt();

            System.out.println();

            switch (escolha) {
                case 1:
                    System.out.print("\n nome do paciente a ser adicionado: ");
                    ler.nextLine();
                    String nomePaciente = ler.nextLine();
                    fila.enfileirar(nomePaciente);
                    break;
                case 2:
                    System.out.print("\n Nome do paciente preferencial a ser adicionado: ");
                    ler.nextLine();
                    String nomePreferencial = ler.nextLine();
                    preferencial.enfileirar(nomePreferencial);

                    break;

                case 3:
                    if (!preferencial.estaVazia()) {
                        System.out.print(preferencial.desinfileirar() + " foi removido da fila");
                    } else if (!fila.estaVazia()) {
                        System.out.print(fila.desinfileirar() + " foi removido da fila:");
                    }
                    break;

                case 4:
                    System.out.println("tamanho da fila é: " + (fila.getTamanho() + preferencial.getTamanho()));
                    break;
                case 5:
                    if (!preferencial.estaVazia()) {
                        System.out.print("O Primeiro da fila é: " + preferencial.espiar());
                    } else {
                        System.out.print("O Primeiro da fila é " + fila.espiar());
                    }
                    break;
                case 6:
                    System.out.println("foi um prazer te atender!");
                    menu = 6;
                    break;
                default:
                    System.out.println("opção invalida!");
                    break;
            }
        } while (menu != 6);
        ler.close();
    }
}
