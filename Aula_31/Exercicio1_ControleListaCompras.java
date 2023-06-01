package Exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControleListaCompras {
    public static void main(String[] args) {
        List<Alimento> listaCompras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean encerrar = false;
        while (!encerrar) {
            try {
                System.out.println("Selecione o tipo de alimento a ser incluído na lista:");
                System.out.println("1. Verdura");
                System.out.println("2. Legume");
                System.out.println("3. Grãos");
                System.out.println("4. Outros");
                System.out.println("0. Encerrar");
                int opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        incluirVerdura(scanner, listaCompras);
                        break;
                    case 2:
                        incluirLegume(scanner, listaCompras);
                        break;
                    case 3:
                        incluirGraos(scanner, listaCompras);
                        break;
                    case 4:
                        incluirOutros(scanner, listaCompras);
                        break;
                    case 0:
                        encerrar = true;
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }

                System.out.println();
            } catch (NumberFormatException exception) {
                System.out.println("Entrada inválida. " + exception.getMessage());
                System.out.println();
            } catch (IllegalArgumentException | UnsupportedOperationException exception) {
                System.out.println(exception.getMessage());
                System.out.println();
            }
        }

        System.out.println("Lista de compras:");
        for (Alimento alimento : listaCompras) {
            System.out.println(alimento.getNome() + " - " + alimento.getQuantidade());
        }

        System.out.println();
        System.out.println("A quantidade de alimentos do tipo verdura a ser comprada é: " + contarTipoAlimento(listaCompras, "VERDURA"));
        System.out.println("A quantidade de alimentos do tipo legume a ser comprada é: " + contarTipoAlimento(listaCompras, "LEGUME"));
        System.out.println("A quantidade de alimentos do tipo grãos a ser comprada é: " + contarTipoAlimento(listaCompras, "GRÃOS"));
        System.out.println("A quantidade de alimentos do tipo outros a ser comprada é: " + contarTipoAlimento(listaCompras, "OUTROS"));
    }

    private static void incluirVerdura(Scanner scanner, List<Alimento> listaCompras) {
        System.out.println("Informe a quantidade de verdura (em gramas):");
        double quantidade = Double.parseDouble(scanner.nextLine());
        if (quantidade % 1 == 0) {
            throw new NumberFormatException("Para verdura, a quantidade deve ser informada com ponto.");
        }

        System.out.println("Informe o nome da verdura:");
        String nome = scanner.nextLine();
        if (nome.isEmpty()) {
            throw new UnsupportedOperationException("Não é permitido inserir nome vazio.");
        }
        listaCompras.add(new Alimento(nome, quantidade, "VERDURA"));
    }

    private static void incluirLegume(Scanner scanner, List<Alimento> listaCompras) {
        System.out.println("Informe a quantidade de legume (em unidades):");
        int quantidade = Integer.parseInt(scanner.nextLine());
        if (quantidade <= 0) {
            throw new UnsupportedOperationException("Não é possível inserir número negativo ou zero.");
        }

        System.out.println("Informe o nome do legume:");
        String nome = scanner.nextLine();
        if (nome.isEmpty()) {
            throw new UnsupportedOperationException("Não é permitido inserir nome vazio.");
        }

        listaCompras.add(new Alimento(nome, quantidade, "LEGUME"));
    }

    private static void incluirGraos(Scanner scanner, List<Alimento> listaCompras) {
        System.out.println("Informe a quantidade de grãos (em gramas):");
        double quantidade = Double.parseDouble(scanner.nextLine());
        if (quantidade % 1 == 0) {
            throw new NumberFormatException("Para grãos, a quantidade deve ser informada com ponto.");
        }

        System.out.println("Informe o nome do grão:");
        String nome = scanner.nextLine();
        if (nome.isEmpty()) {
            throw new UnsupportedOperationException("Não é permitido inserir nome vazio.");
        }

        listaCompras.add(new Alimento(nome, quantidade, "GRÃOS"));
    }

    private static void incluirOutros(Scanner scanner, List<Alimento> listaCompras) {
        System.out.println("Informe a quantidade de outros (em unidades):");
        int quantidade = Integer.parseInt(scanner.nextLine());
        if (quantidade <= 0) {
            throw new UnsupportedOperationException("Não é possível inserir número negativo ou zero.");
        }

        System.out.println("Informe o nome do alimento:");
        String nome = scanner.nextLine();
        if (nome.isEmpty()) {
            throw new UnsupportedOperationException("Não é permitido inserir nome vazio.");
        }

        listaCompras.add(new Alimento(nome, quantidade, "OUTROS"));
    }

    private static int contarTipoAlimento(List<Alimento> listaCompras, String tipo) {
        int contador = 0;
        for (Alimento alimento : listaCompras) {
            if (alimento.getTipo().equals(tipo)) {
                contador++;
            }
        }
        return contador;
    }
}

