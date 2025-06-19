import java.util.Scanner;

public class TaxCalculator {
  public static void main(String args[]) {
    
    int tax = 0 ;

    Scanner scanner = new Scanner(System.in); 
    System.out.println("Enter your MONTHLY SALARY seperated by commas(",")");
    String x = scanner.nextLine();
    
    String[] y = x.split(",");
    int[] c = new int[y.length];
    
    for(int i = 0 ; i < y.length ; i++){
        c[i] = Integer.parseInt(y[i].trim());
    }

    int cumulative = 0;
    for(int i = 0;i < c.length ; i++ ){
        cumulative += c[i];
    }

  
    if(cumulative > 2_800_000){
        tax = (int)(cumulative * 0.15)- 360_000 ;
    }else if(cumulative > 1_800_000){
                tax = (int)(cumulative * 0.06)- 108_000 ;
    }
     System.out.println("Your tax = " + tax);

  }
}
