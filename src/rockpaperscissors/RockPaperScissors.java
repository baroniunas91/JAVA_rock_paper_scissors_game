/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

import java.util.Scanner;

/**
 *
 * @author Edgaras
 */
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int ucRockCount = 0;
        int ucPaperCount = 0;
        int ucScissorsCount = 0;
        
        int ccRockCount = 0;
        int ccPaperCount = 0;
        int ccScissorsCount = 0;
        
        int userWinCount = 0;
        int computerWinCount = 0;
        int tieCount = 0;
        
        while (true) {
            System.out.println("0 - End");
            System.out.println("1 - Rock");
            System.out.println("2 - Paper");
            System.out.println("3 - Scissors");
            System.out.println("Enter your choise:");
            int uc = sc.nextInt();
            int cc = (int)(Math.random()*3+1);
            if (uc == 0 && count == 0) {
                System.out.println("You didn't play a game!");
                break;
            }
            if (uc == 0 && count > 0) {
                int yourProcent = (userWinCount * 100 / count);
                int computerProcent = (computerWinCount * 100 / count);
                int tieProcent = (tieCount * 100 / count);
                
                System.out.println("STATISTICS:");
                System.out.print("Played ");
                System.out.print(count);
                System.out.println(" times");
                
                System.out.print("You win ");
                System.out.print(userWinCount);
                System.out.print(" times ");
                System.out.print(yourProcent);
                System.out.println("%");
                
                System.out.print("Computer win ");
                System.out.print(computerWinCount);
                System.out.print(" times ");
                System.out.print(computerProcent);
                System.out.println("%");
                
                System.out.print("Tie ");
                System.out.print(tieCount);
                System.out.print(" times ");
                System.out.print(tieProcent);
                System.out.println("%");
                
                System.out.print("Your chiose - rock: ");
                System.out.print(ucRockCount);
                System.out.println(" times");
                
                System.out.print("Your chiose - paper: ");
                System.out.print(ucPaperCount);
                System.out.println(" times");
                
                System.out.print("Your chiose - scissors: ");
                System.out.print(ucScissorsCount);
                System.out.println(" times");
                
                System.out.print("Computer chiose - rock: ");
                System.out.print(ccRockCount);
                System.out.println(" times");
                
                System.out.print("Computer chiose - paper: ");
                System.out.print(ccPaperCount);
                System.out.println(" times");
                
                System.out.print("Computer chiose - scissors: ");
                System.out.print(ccScissorsCount);
                System.out.println(" times");
                
                break;
            }
            if(uc == 1 && cc != 1) {
                ucRockCount += 1;
                if (cc == 2) {
                    ccPaperCount += 1;
                    computerWinCount += 1;
                    System.out.println("Your choise - rock");
                    System.out.println("Computer choise - paper");
                    System.out.println("COMPUTER WIN!!!");
                }
                if (cc == 3) {
                    ccScissorsCount += 1;
                    userWinCount += 1;
                    System.out.println("Your choise - rock");
                    System.out.println("Computer choise - scissors");
                    System.out.println("YOU WIN!!!");
                }
            }
            else if(uc == 2 && cc != 2) {
                ucPaperCount += 1;
                if (cc == 1) {
                    ccRockCount += 1;
                    userWinCount += 1;
                    System.out.println("Your choise - paper");
                    System.out.println("Computer choise - rock");
                    System.out.println("YOU WIN!!!");
                }
                if (cc == 3) {
                    ccScissorsCount += 1;
                    computerWinCount += 1;
                    System.out.println("Your choise - paper");
                    System.out.println("Computer choise - scissors");
                    System.out.println("COMPUTER WIN!!!");
                }
            }
            else if(uc == 3 && cc != 3) {
                ucScissorsCount += 1;
                if (cc == 1) {
                    ccRockCount += 1;
                    computerWinCount += 1;
                    System.out.println("Your choise - scissors");
                    System.out.println("Computer choise - rock");
                    System.out.println("COMPUTER WIN!!!");
                }
                if (cc == 2) {
                    ccPaperCount += 1;
                    userWinCount += 1;
                    System.out.println("Your choise - scissors");
                    System.out.println("Computer choise - paper");
                    System.out.println("YOU WIN!!!");
                }
            }
            else if(uc == cc) {
                if(uc == 1 && cc == 1) {
                    ucRockCount += 1;
                    ccRockCount += 1;
                    tieCount +=1;
                    System.out.println("Your choise - rock");
                    System.out.println("Computer choise - rock");
                    System.out.println("TIE!!!");
                }
                else if(uc == 2 && cc == 2) {
                    ucPaperCount += 1;
                    ccPaperCount += 1;
                    tieCount +=1;
                    System.out.println("Your choise - paper");
                    System.out.println("Computer choise - paper");
                    System.out.println("TIE!!!");
                }
                else if(uc == 3 && cc == 3) {
                    ucScissorsCount += 1;
                    ccScissorsCount += 1;
                    tieCount +=1;
                    System.out.println("Your choise - scissors");
                    System.out.println("Computer choise - scissors");
                    System.out.println("TIE!!!");
                }
            }
            else if(uc < 0 || uc > 3) {
                System.out.println("ERROR: wrong selected number!!!");
            }
            count += 1;
        }       
    }
    
}
