import java.util.Scanner;

public class Average {
        public static void main ( String []args){
            Average1();
        }
        static  void Average1( ){
            Scanner input = new Scanner (  System.in);
            System.out.println( " Enter the total no.to find the Average:");
            int n = input.nextInt();
            System.out.println( " Enter the numbers:");
            float average=0;
            int totalmarks=0;
            for( int i =1;i<=n;i++){
                totalmarks += input.nextInt();

            }System.out.println("The TotalMarks:"+totalmarks);
            average = totalmarks/n;
            System.out.println( " The Average of the given numbers are:" +average);
        }
    }

