import java.util.Scanner;

public class Factorial_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Factorial Number:");

        int no = sc.nextInt();
        int fact = 1;

//        for (int i = 1; i<=no; i++){
//            fact = fact*i;
//        }
//        System.out.println("Factorial of  " + no + " Factorial: " + fact);
//    }
//}


for (int i = no; i>=1; i--){
        fact = fact*i;
        }
        System.out.println("Factorial of  " + no + " Factorial is : " + fact);
        }
        }