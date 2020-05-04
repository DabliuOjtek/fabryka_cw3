import java.util.Scanner;

public class ConfigTag {
     Scanner sc = new Scanner(System.in);
     String phrase = null;
     int choice = 0;
     boolean condition = true;

     public String setText(){
          System.out.print("Wprowadz text: ");
          phrase = sc.nextLine();
          return phrase;
     }

     public final int getChoice(){
          System.out.println("\n" + "Wybierz opcje otagowania: ");
          System.out.println("1: <p> " + "\n2: <strong>" + "\n3: <em>" + "\n4: <mark>");

          while(condition == true){
               System.out.println("Wybor: ");
               choice = sc.nextInt();
               if(choice >=1 && choice <=4){
                    condition = false;

               }else {
                    System.out.println("Nie ma takiej opcji, ponow swoj wybor!");
               }
          }
          return choice;
     }
}
