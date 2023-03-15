import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    
    Double a, b;
    System.out.println("Wprowadź dwie liczby: ");
    a = scanner.nextDouble();
    b = scanner.nextDouble();

    System.out.println("Jaką operację chcesz wykonać? Wpisz 1 (pole prostokąta) lub 2 (pole trójkąta prostokątnego): ");
    int wybor= scanner.nextInt();

    switch(wybor)
      {
        case 1:
          System.out.println("Pole prostokąta o podanych bokach wynosi " + a*b);
          break;

        case 2:
          System.out.println("Pole trójkąta prostokątnego o podanych bokach wynosi " + a*b/2);
      }
    
    
  }
}