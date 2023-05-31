public class Exemplo_Throw {

    public static void saque(double valor) {
        if(valor > 400) {
//            IllegalArgumentException erro = new IllegalArgumentException();
            throw new IllegalArgumentException("Erro o valor desejado é maior do que o disponivel em conta");
        }else {
            System.out.println("Valor retirado da conta: R$"+valor);
        }
    }

    public static void main(String[] args) {
        saque(500);
    }
}
