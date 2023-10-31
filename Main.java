import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome to Hogwarts! Let the sorting hat choose your house!");
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Answer each of the following questions with a 'yes' or 'no'.");
        String yes = "yes";
        String no = "no";
        String house;
        System.out.println("Do you value bravery and adventure? ");
        String answer = scan.nextLine();
        if(answer.toLowerCase().equals(yes)){
             house = "Gryffindor";
        }
        else if(answer.toLowerCase().equals(no)){
            System.out.println("Do you value wisdom, knowledge, and learning?");
            answer = scan.nextLine();
            if(answer.toLowerCase().equals(yes)){
                house = "Ravenclaw";
            }
            else{
                System.out.println("Do you value ambition, strategy, and cleverness");
                answer = scan.nextLine();
                if(answer.toLowerCase().equals(yes)){
                    house = "Slytherin";
                }
                else{
                    house = "Hufflepuff";
                }
            }

        }
        else{
            house = "Hufflepuff";
        }
        System.out.println("Name: " + name);
        System.out.println("Congratulations! Your house is " + house + "!!");
    }
}