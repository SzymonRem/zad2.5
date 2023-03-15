import java.util.Scanner;
import java.util.Random;
class Main {
  public static void main(String[] args) {
    double pole=0;
    System.out.println("1.Pole prostokąta\n 2.Pole trójkąta prostokątnego");
    System.out.println("3.10 liczb losowych\n 4.10 liczb losowych");
    Scanner scan = new Scanner(System.in);
    int wybor=scan.nextInt();
     System.out.println("Podaj a");
    double a =scan.nextDouble();
     System.out.println("Podaj b");
    int b =scan.nextInt();
     System.out.println("Podaj h");
    double h =scan.nextDouble();
    switch(wybor){
      case 1:
        pole= a*b;
        System.out.println("Pole prostokąta\n" + pole);
      case 2:
        pole =(a*h)/2;
         System.out.println("Pole trojkata prostokatnego\n" + pole);
      case 3:
        Random rand = new Random();
        double srednia=0;
          for(int i=0;i<=10;i++);
        {
          double liczba = rand.nextDouble(101);
          srednia +=liczba;
        }
        System.out.println("Srednia wynosi\n"+ srednia);
      case 4:
        
        
    }
   
      
    
  }
}