import java.util.Scanner;

public class QuizTwelve {
    public void factorial(int num){
        int i;
        double result = 1.0;
        i = num;
        while(i>0){
            result*=i;
            i--;
        }
        System.out.println("Factorial of "+num+" is: "+result);
    }
    //factorial without recursion
    public static void main(String[] args){
        int number;

        Scanner request = new Scanner(System.in);
        System.out.println("enter the number:");
        number = request.nextInt();
        QuizTwelve fact = new QuizTwelve();
        fact.factorial(number);
    }
}
