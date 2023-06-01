package Exercicio2;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversorDeMoedas {
    private static final BigDecimal COTACAO_DOLAR_AMERICANO = new BigDecimal("5.25");
    private static final BigDecimal COTACAO_DOLAR_CANADENSE = new BigDecimal("4.15");
    private static final BigDecimal COTACAO_EURO = new BigDecimal("6.15");
    private static final BigDecimal COTACAO_LIBRA_ESTERLINA = new BigDecimal("7.50");

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao conversor de moedas!");
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            try {
                System.out.println("Qual moeda você deseja converter?");
                System.out.println("Opções: Dólar americano, Dólar canadense, Euro, Libra Esterlina");
                String moeda = scanner.nextLine();

                BigDecimal cotacao;
                switch (moeda.toLowerCase()) {
                    case "dólar americano":
                        cotacao = COTACAO_DOLAR_AMERICANO;
                        break;
                    case "dólar canadense":
                        cotacao = COTACAO_DOLAR_CANADENSE;
                        break;
                    case "euro":
                        cotacao = COTACAO_EURO;
                        break;
                    case "libra esterlina":
                        cotacao = COTACAO_LIBRA_ESTERLINA;
                        break;
                    default:
                        throw new IllegalArgumentException("Tipo de moeda inválido");
                }

                System.out.println("O programa só converte para Real (R$).");

                System.out.println("Digite o valor a ser convertido:");
                String valorInput = scanner.nextLine();
                if (valorInput.isEmpty()) {
                    throw new NumberFormatException("Para moeda, o valor monetário deve ser um número decimal");
                }
                BigDecimal valor = new BigDecimal(valorInput);

                if (valor.compareTo(BigDecimal.ZERO) <= 0) {
                    System.out.println("Valor inválido, por favor, tente novamente.");
                    continue;
                }

                BigDecimal valorConvertido = valor.multiply(cotacao);

                DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
                System.out.println("A " + moeda + " na cotação de hoje está em " + cotacao +
                        ", o valor que pediu para converter de " + valor + " em reais é R$" +
                        decimalFormat.format(valorConvertido));

                System.out.println("Deseja fazer outra conversão? (s/n)");
                String resposta = scanner.nextLine();
                if (!resposta.equalsIgnoreCase("s")) {
                    continuar = false;
                }
            } catch (NumberFormatException exception) {
                System.out.println("Erro: " + exception.getMessage());
            } catch (IllegalArgumentException exception2) {
                System.out.println("Erro: " + exception2.getMessage());
            }
        }

        scanner.close();
        System.out.println("Obrigado por usar o conversor de moedas!");
    }
}
