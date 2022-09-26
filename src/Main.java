import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;

        System.out.println("Please input the day of week: ");
        input = scan.nextInt();


        switch (input){
            case 1: {
                System.out.println("Today is a Monday! ");
            }
            case 2: {
                System.out.println("Today is a Tuesday! ");
                break;
            }
            case 3: {
                System.out.println("Today is a Wednesday! ");
                break;
            }
            case 4: {
                System.out.println("Today is a Thursday! ");
                break;
            }
            case 5: {
                    System.out.println("Today is a Friday! ");
                break;
            }
            case 6: {
                System.out.println("Today is a Saturday! ");
                break;
                }
            case 7: {
                System.out.println("Today is a Sunday! ");
                break;
            }
            default: if(input>7 || input<0){
                System.out.print("Input is not valid. ");
                break;

            }
        }

    }
}