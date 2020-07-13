import java.util.Scanner;
public class Abastecimento {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("Digite o combustível a abastecer:");
            opcao = scanner.nextInt();
            switch (opcao) {
                case (1):
                    alcool += 1;
                    break;
                case (2):
                    gasolina += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
                case (4):
                    System.out.println("Muito obrigado!\nVolte sempre!");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        System.out.println("Álcool: " + alcool + ";\nGasolina: " + gasolina + ";\nDiesel: " + diesel + ".");
    }
}
