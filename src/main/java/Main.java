import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Bem Vindo ao Posto Barão");
    System.out.println(" ");
    System.out.println("Escolha o combustível para seu veiculo");
    System.out.println(" ");
    System.out.println("1 - Alcool");
    System.out.println("2 - Gasolina");
    System.out.println("3 - Diesel");
    int Alcool = 0;
    int Gasolina = 1;
    int Diesel = 2;
    int Fim = 3;
    int Combustivel = sc.nextInt();
    while (Combustivel > 0 && Combustivel < 4) {
      if (Combustivel != 1 && Combustivel != 2 && Combustivel != 3) {
        System.out.println(" ");
        System.out.println("Codigo Inválido ");
        System.out.println("Faça Novamente");
        Combustivel = sc.nextInt();
      }
      if (Combustivel == 1) {
        Alcool = Alcool + 1;
        System.out.println(" ");
        System.out.println("Alguma coisa a mais?");
        Combustivel = sc.nextInt();
      }
      if (Combustivel == 2) {
        Gasolina = Gasolina + 1;
        System.out.println(" ");
        System.out.println("Alguma coisa a mais?");
        Combustivel = sc.nextInt();
      }
      if (Combustivel == 3) {
        Diesel = Diesel + 1;
        System.out.println(" ");
        System.out.println("Alguma coisa a mais?");
        Combustivel = sc.nextInt();
      }
      while (Combustivel != 1 && Combustivel != 2 && Combustivel != 3) {
        System.out.println(" ");
        System.out.println(" Código Inválido ");
        System.out.println("Tente Novamente");
        Combustivel = sc.nextInt();
      }
    }
    int soma = Alcool + Gasolina + Diesel;
    if (Combustivel == 4) {
      System.out.println(" ");
      System.out.println("Agradecemos a Preferencia");

    }

    sc.close();
  }
}