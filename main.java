import java.util.Scanner;
public class main {
    public static void main(String[] args){
     Scanner masukan = new Scanner (System.in);
     int bilangan1;
       System.out.print("masukan bilangan : ");
      bilangan1 = masukan.nextInt();
      if(bilangan1 % 2 == 0){
           System.out.println("bilngan genap");
         
       }else{
           System.out.println("bilangan ganjil");
            

       }
    }
}
