
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("NUMBER GUESSING GAME - RANGE(1,100)");
        Scanner sc = new Scanner(System.in);
        int randomNumber = 75;
        int playerChance = 10;
        System.out.println("You have got "+playerChance+" chances to guess the Number !");
        System.out.print("Enter Your Guess : ");
        while(true) {
            int playersGuess = sc.nextInt();
            if(playerChance == 0) {
                System.out.println("Game Over !! The Hidden Number is :"+ randomNumber);
                break;
            }
            if(playersGuess == randomNumber) {
                System.out.println("Congrats ! Your Guess is Right !");
                break;
            }
            else {
                if(playersGuess > 100) {
                    System.err.println("Out of Range !");
                }
                else if(playersGuess % 10 == randomNumber/Math.pow(10,randomNumber+"".length()-1)) {
                     System.out.println("Clue : Last Digit -> First Digit ");
                }
                else if(Math.pow(10,playersGuess+"".length()-1) == randomNumber % 10) {
                    System.out.println("Clue: First Digit -> Last Digit");
                }
                else if(((randomNumber+"").charAt(0)) == (playersGuess+"").charAt(0)) {
                    System.out.println("Come on You neared it !");
                }
                else if(randomNumber%10 == playersGuess%10) {
                    System.out.println("You found the last digit !");
                }
                else if(randomNumber > playersGuess) {
                    System.out.println("It is greater than this Number you know !");
                    --playerChance;
                }
                else if(randomNumber < playersGuess) {
                    System.out.println("It is lesser than this Number you know !");
                    --playerChance;
                }
                if(playerChance != 0)
                    System.out.print("Try Again : ");
            }
        }
    }
}