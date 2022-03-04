package gameBoard;

import java.util.Random;
import java.util.Scanner;

public class ticTacToe {
    public static Scanner sc = new Scanner(System.in);
    public static Boolean startgame = false;
    public static Boolean turn = false;
    public static String X = "X";
    public static String O = "O";
    public static Boolean win = false;
    public static int neuralTurnNum = 0;
    public static Boolean moveTaken = false;
    public static Boolean tie = false;
    public static Boolean tieNotChecked = false;
    public static Boolean danger = false;

    public static String slot1 = "- ";
    public static String slot2 = "- ";
    public static String slot3 = "- ";
    public static String slot4 = "- ";
    public static String slot5 = "- ";
    public static String slot6 = "- ";
    public static String slot7 = "- ";
    public static String slot8 = "- ";
    public static String slot9 = "- ";

    public static void playGame() {
        System.out.println("Would you like to play?\n" +
                "Yes\n" +
                "No");
        String playgame = sc.nextLine();
        if (playgame.equalsIgnoreCase("Yes")) {
            startgame = true;
            printBoard();
            turn = true;
        }
        while (startgame) {
            if (turn == true) {
                printBoard();
                humanPlayer();
                checkWin();
                checkTie();
            } else {
                printBoard();
                danger = false;
                neuralNetwork();
                checkBotWin();
                checkTie();

            }
        }
    }

    //Make the board
    public static void printBoard() {
        System.out.println("-------------\n" +
                "| " + slot1 + "| " + slot2 + "| " + slot3 + "|   \n" +
                "-------------\n" +
                "| " + slot4 + "| " + slot5 + "| " + slot6 + "|   \n" +
                "-------------\n" +
                "| " + slot7 + "| " + slot8 + "| " + slot9 + "|  \n" + "-------------");
    }

    //Make the player able to make moves
    public static void humanPlayer() {
        System.out.println("Make your move(It uses a number based system)");
        String preMove = sc.nextLine();
        int move = Integer.parseInt(preMove);
        switch (move) {
            case 1:
                if (slot1 == "- ") {
                    slot1 = X;
                    turn = false;
                    checkWin();
                    printBoard();
                } else {
                    humanPlayer();
                }
                break;
            case 2:
                if (slot2 == "- ") {
                    slot2 = X;
                    turn = false;
                    checkWin();
                    printBoard();
                } else {
                    humanPlayer();
                }
                break;
            case 3:
                if (slot3 == "- ") {
                    slot3 = X;
                    turn = false;
                    checkWin();
                    printBoard();
                } else {
                    humanPlayer();
                }
                break;
            case 4:
                if (slot4 == "- ") {
                    slot4 = X;
                    turn = false;
                    checkWin();
                    printBoard();
                } else {
                    humanPlayer();
                }
                break;
            case 5:
                if (slot5 == "- ") {
                    slot5 = X;
                    turn = false;
                    checkWin();
                    printBoard();
                } else {
                    humanPlayer();
                }
                break;
            case 6:
                if (slot6 == "- ") {
                    slot6 = X;
                    turn = false;
                    checkWin();
                    printBoard();
                } else {
                    humanPlayer();
                }
                break;
            case 7:
                if (slot7 == "- ") {
                    slot7 = X;
                    turn = false;
                    checkWin();
                    printBoard();
                } else {
                    humanPlayer();
                }
                break;
            case 8:
                if (slot8 == "- ") {
                    slot8 = X;
                    turn = false;
                    checkWin();
                    printBoard();
                } else {
                    humanPlayer();
                }
                break;
            case 9:
                if (slot9 == "- ") {
                    slot9 = X;
                    turn = false;
                    checkWin();
                    printBoard();
                } else {
                    humanPlayer();
                }
                break;
            default:
                System.out.println("Not a valid move");
                humanPlayer();
        }
    }

    //Check for wins
    public static void checkWin() {

        //First column check
        if (slot1 == X) {
            if (slot2 == X) {
                if (slot3 == X) {
                    win = true;
                }
            }
        }
        //Second column check
        if (slot2 == X) {
            if (slot5 == X) {
                if (slot8 == X) {
                    win = true;
                }
            }
        }
        //Third column check
        if (slot3 == X) {
            if (slot6 == X) {
                if (slot9 == X) {
                    win = true;
                }
            }
        }
        //First row check
        if (slot1 == X) {
            if (slot2 == X) {
                if (slot3 == X) {
                    win = true;
                }
            }
        }
        //Second row check
        if (slot4 == X) {
            if (slot5 == X) {
                if (slot6 == X) {
                    win = true;
                }
            }
        }
        //Third row check
        if (slot7 == X) {
            if (slot8 == X) {
                if (slot9 == X) {
                    win = true;
                }
            }
        }
        //First diagnol check
        if (slot1 == X) {
            if (slot5 == X) {
                if (slot9 == X) {
                    win = true;
                }
            }
        }
        //Second diagnol check
        if (slot3 == X) {
            if (slot5 == X) {
                if (slot7 == X) {
                    win = true;
                }
            }
        }
        //What to do when won
        if (win == true) {
            System.out.println("You won, you won't be seeing this message too often!");
            startgame = false;
        }


    }

    //Check for bot wins
    public static void checkBotWin() {

        //First column check
        if (slot1 == O) {
            if (slot2 == O) {
                if (slot3 == O) {
                    win = true;
                }
            }
        }
        //Second column check
        if (slot2 == O) {
            if (slot5 == O) {
                if (slot8 == O) {
                    win = true;
                }
            }
        }
        //Third column check
        if (slot3 == O) {
            if (slot6 == O) {
                if (slot9 == O) {
                    win = true;
                }
            }
        }
        //First row check
        if (slot1 == O) {
            if (slot2 == O) {
                if (slot3 == O) {
                    win = true;
                }
            }
        }
        //Second row check
        if (slot4 == O) {
            if (slot5 == O) {
                if (slot6 == O) {
                    win = true;
                }
            }
        }
        //Third row check
        if (slot7 == O) {
            if (slot8 == O) {
                if (slot9 == O) {
                    win = true;
                }
            }
        }
        //First diagnol check
        if (slot1 == O) {
            if (slot5 == O) {
                if (slot9 == O) {
                    win = true;
                }
            }
        }
        //Second diagnol check
        if (slot3 == O) {
            if (slot5 == O) {
                if (slot7 == O) {
                    win = true;
                }
            }
        }
        //What to do when won
        if (win == true) {
            System.out.println("You lost!");
            startgame = false;
        }


    }

    //check tie
    public static void checkTie() {
int tieChecker = 1;
tieNotChecked=true;
while(tieNotChecked){
    tieNotChecked=false;
    if(slot1 != "- "){
        if(slot2 != "- "){
            if(slot3 != "- "){
                if(slot4 != "- "){
                    if(slot5 != "- "){
                        if(slot6 != "- "){
                            if(slot7 != "- "){
                                if(slot8 != "- "){
                                    if(slot9 != "- "){
                                        tie = true;
                                        System.out.println("You tied.");
                                        startgame= false;
                                        tieChecker =0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

}

    //Add neural network to make it unbeatable

    public static void neuralNetwork() {
Boolean danger = false;

        //Danger zones
//Protect first row

        if (slot1 == X) {
            if (slot2 == X) {
                if (slot3 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    turn = true;
                    slot3 = O;
                }
            }
            if (slot3 == X) {
                if (slot2 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    turn = true;
                    danger=true;
                    slot2 = O;
                }

            }
        }
        if (slot2 == X) {
            if (slot1 == X) {
                if (slot3 != O) {
                    turn = true;
                    if (slot3 != O) {
                        moveTaken = true;
                        neuralTurnNum++;
                        slot3 = O;
                        danger=true;
                        turn = true;
                    }

                }

            }
            if (slot3 == X) {
                if (slot1 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    slot1 = O;
                    danger=true;
                    turn = true;
                }
            }
        }
        if (slot3 == X) {
            if (slot1 == X) {
                if (slot2 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    danger=true;
                    slot2 = O;
                    turn = true;
                }
            }
            if (slot2 == X) {
                if (slot1 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    slot1 = O;
                    turn = true;
                    danger=true;
                }
            }
        }
//Protects second row
        if (slot4 == X) {
            if (slot5 == X) {
                if (slot6 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    slot6 = O;
                    danger=true;
                    turn = true;
                }
            }
            if (slot6 == X) {
                if (slot5 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    slot5 = O;
                    danger=true;
                    turn = true;
                }
            }
        }
        if (slot5 == X) {
            if (slot6 == X) {
                if (slot4 != O) {

                    moveTaken = true;
                    danger=true;
                    neuralTurnNum++;
                    slot4 = O;
                    turn = true;
                }
            }
            if (slot4 == X) {
                if (slot6 != O) {
                    moveTaken = true;
                    danger=true;
                    neuralTurnNum++;
                    slot6 = O;
                    turn = true;
                }
            }
        }
        if (slot6 == X) {
            if (slot4 == X) {
                if (slot5 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    slot5 = O;
                    danger=true;
                    turn = true;
                }
            }
            if (slot5 == X) {
                if (slot4 != O) {
                    moveTaken = true;
                    danger=true;
                    neuralTurnNum++;
                    slot4 = O;
                    turn = true;
                }
            }
        }
        //Protects 3rd row
        if (slot7 == X) {
            if (slot8 == X) {
                if (slot9 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    slot9 = O;
                    turn = true;
                    danger=true;
                }
            }
            if (slot9 == X) {
                if (slot8 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    slot8 = O;
                    danger=true;
                    turn = true;
                }
            }
        }
        if (slot8 == X) {
            if (slot7 == X) {
                if (slot9 != O) {
                    moveTaken = true;
                    danger=true;
                    neuralTurnNum++;
                    slot9 = O;
                    turn = true;
                }
            }
            if (slot9 == X) {
                if (slot7 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    danger=true;
                    slot7 = O;
                    turn = true;
                }
            }
        }
        if (slot9 == X) {
            if (slot8 == X) {
                if (slot7 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    danger=true;
                    slot7 = O;
                    turn = true;
                }
            }
            if (slot7 == X) {
                if (slot8 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    danger=true;
                    slot8 = O;
                    turn = true;
                }
            }
        }
        //Rows protected fully
        //Column Protection
        //Protection first column
        if (slot1 == X) {
            if (slot7 == X) {
                if (slot4 != O) {
                    moveTaken = true;
                    danger=true;
                    neuralTurnNum++;
                    slot4 = O;
                    turn = true;
                }
            }
            if (slot4 == X) {
                if (slot7 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    slot7 = O;
                    danger=true;
                    turn = true;
                }
            }
        }
        if (slot4 == X) {
            if (slot1 == X) {
                if (slot7 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    slot7 = O;
                    danger=true;
                    turn = true;
                }
            }
            if (slot7 == X) {
                if (slot1 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    danger=true;
                    slot1 = O;
                    turn = true;
                }
            }
        }
        if (slot7 == X) {
            if (slot1 == X) {
                if (slot4 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    danger=true;
                    slot4 = O;
                    turn = true;
                }
            }
            if (slot4 == X) {
                if (slot1 != O) {
                    danger=true;
                    moveTaken = true;
                    neuralTurnNum++;
                    slot1 = O;
                    turn = true;
                }
            }
        }
        //Protects second column
        if (slot2 == X) {
            if (slot5 == X) {
                if (slot8 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    slot8 = O;
                    danger=true;
                    turn = true;
                }
            }
            if (slot8 == X) {
                if (slot5 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    danger=true;
                    slot5 = O;
                    turn = true;
                }
            }
        }
        if (slot5 == X) {
            if (slot2 == X) {
                if (slot8 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    slot8 = O;
                    danger=true;
                    turn = true;
                }
            }
            if (slot8 == X) {
                if (slot2 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    slot2 = O;
                    turn = true;
                    danger=true;
                }
            }
        }
        if (slot8 == X) {
            if (slot2 == X) {
                if (slot5 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    slot5 = O;
                    danger=true;
                    turn = true;
                }
            }
            if (slot5 == X) {
                if (slot2 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    slot2 = O;
                    danger=true;
                    turn = true;
                }
            }
        }
        //Protects 3d column
        if (slot3 == X) {
            if (slot6 == X) {
                if (slot9 != O) {
                    moveTaken = true;
                    danger=true;
                    neuralTurnNum++;
                    slot9 = O;
                    turn = true;
                }
            }
            if (slot9 == X) {
                if (slot6 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    danger=true;
                    slot6 = O;
                    turn = true;
                }
            }
        }
        if (slot6 == X) {
            if (slot3 == X) {
                if (slot9 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    danger=true;
                    slot9 = O;
                    turn = true;
                }
            }
            if (slot9 == X) {
                if (slot3 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    slot3 = O;
                    danger=true;
                    turn = true;
                }
            }
        }
        if (slot9 == X) {
            if (slot3 == X) {
                if (slot6 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    slot6 = O;
                    danger=true;
                    turn = true;
                }
            }
            if (slot6 == X) {
                if (slot3 != O) {
                    neuralTurnNum++;
                    slot3 = O;
                    danger=true;
                    moveTaken = true;
                    turn = true;
                }
            }
        }
        //Columns protected fully
        //Diagnol protection
        //Protection first diagnol
        if (slot1 == X) {
            if (slot5 == X) {
                if (slot9 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    danger=true;
                    slot9 = O;
                    turn = true;
                }
            }
            if (slot9 == X) {
                if (slot5 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    slot5 = O;
                    danger=true;
                    turn = true;
                }
            }
        }
        if (slot5 == X) {
            if (slot1 == X) {
                if (slot9 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    slot9 = O;
                    danger=true;

                    turn = true;
                }
            }
            if (slot9 == X) {
                if (slot1 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    danger=true;
                    slot1 = O;
                    turn = true;
                }
            }
        }
        if (slot9 == X) {
            if (slot5 == X) {
                if (slot1 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    danger=true;
                    slot1 = O;
                    turn = true;
                }
            }
            if (slot1 == X) {
                if (slot5 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    danger=true;
                    slot5 = O;
                    turn = true;
                }
            }
        }
        //Second diagnol protection
        if (slot3 == X) {
            if (slot5 == X) {
                if (slot7 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    danger=true;
                    slot7 = O;
                    turn = true;
                }
            }
            if (slot7 == X) {
                if (slot5 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    danger=true;
                    slot5 = O;
                    turn = true;
                }
            }
        }
        if (slot5 == X) {
            if (slot3 == X) {
                if (slot7 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    slot7 = O;
                    turn = true;
                    danger=true;
                }
            }
            if (slot7 == X) {
                if (slot3 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    slot3 = O;
                    turn = true;
                    danger=true;
                }
            }
        }
        //Protect diagnol 2
        if (slot3 == X) {
            if (slot5 == X) {
                if (slot7 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    danger=true;
                    slot7 = O;
                    turn = true;
                }
            }
            if (slot7 == X) {
                if (slot5 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    slot5 = O;
                    danger=true;
                    turn = true;
                }
            }
        }
        if (slot5 == X) {
            if (slot7 == X) {
                if (slot3 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    slot3 = O;
                    turn = true;
                    danger=true;
                }
            }
            if (slot3 == X) {
                if (slot7 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    slot7 = O;
                    danger=true;
                    turn = true;
                }
            }
        }
        if (slot7 == X) {
            if (slot3 == X) {
                if (slot5 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    danger=true;
                    slot5 = O;
                    turn = true;
                }
            }
            if (slot5 == X) {
                if (slot3 != O) {
                    moveTaken = true;
                    neuralTurnNum++;
                    slot3 = O;
                    turn = true;
                }
            }
        }
        //Last diagnol protected
        if (neuralTurnNum == 0) {
            if (slot5 != X) {
                danger=true;
                slot5 = O;
                turn = true;
                neuralTurnNum++;
                printBoard();
            } else {
                danger=true;
                slot8 = O;
                turn = true;
                neuralTurnNum++;
                printBoard();

            }
        }
   if(!danger){
       nomoremove();
   }
    }

    public static void nomoremove() {
        Random rn = new Random();
        int neuralMove = rn.nextInt(9)+ 1;
        System.out.println(neuralMove);
        printBoard();
        if (!moveTaken) {
            switch (neuralMove) {
                case 1:
                    if (slot1 == "- ") {
                        if (slot1 != X) {
                            slot1 = O;
                            printBoard();
                            turn = true;
                        } else {
                            nomoremove();
                        }
                    }
                    break;
                case 2:
                    if (slot2 == "- ") {
                        if (slot2 != X) {
                            slot2 = O;
                            printBoard();
                            turn = true;
                        } else {

                        }
                        nomoremove();
                    }
                    break;
                case 3:
                    if (slot3 == "- ") {
                        if (slot3 != X) {
                            slot3 = O;
                            printBoard();
                            turn = true;
                        } else {
                            nomoremove();
                        }
                    }
                    break;
                case 4:
                    if (slot4 == "- ") {
                        if (slot4 != X) {
                            slot4 = O;
                            printBoard();
                            turn = true;
                        } else {
                            nomoremove();
                        }
                    }
                    break;
                case 5:
                    if (slot5 == "- ") {
                        if (slot5 != X) {
                            slot5 = O;
                            printBoard();
                            turn = true;
                        } else {
                            nomoremove();
                        }
                    }

                    break;
                case 6:
                    if (slot6 == "- ") {
                        if (slot6 != X) {
                            slot6 = O;
                            printBoard();
                            turn = true;
                        }
                    } else {
                        nomoremove();
                    }
                    break;
                case 7:
                    if (slot7 == "- ") {
                        if (slot7 != X) {
                            slot7 = O;
                            printBoard();
                            turn = true;
                        }
                    } else {
                        nomoremove();
                    }
                    break;
                case 8:
                    if (slot8 == "- ") {
                        if (slot8 != X) {
                            slot8 = O;
                            printBoard();
                            turn = true;
                        } else {
                            nomoremove();
                        }
                    }
                    break;
                case 9:
                    if (slot9 == "- ") {
                        if (slot9 != X) {
                            slot9 = O;
                            printBoard();
                            turn = true;
                        } else {
                            nomoremove();
                        }
                    }
                    break;
                default:
                    nomoremove();
            }


        }
    }
}
