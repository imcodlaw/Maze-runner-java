import java.util.*;
public class MazeRunner {
    public static Maze myMap = new Maze();
    public static void main(String[] args){
        intro();
        userMove();
    }
    public static void intro(){
        System.out.println("Welcome to Maze Runner!");
        System.out.println("Here is your current position:");
        myMap.printMap();
        System.out.println("---------------------------------------");
    }
    public static void userMove(){
        System.out.print("Where would you like to move? (R, L,ki U, D) ");
        Scanner input = new Scanner(System.in);
        String um = input.nextLine();
        if("R".equals(um) == true){
            System.out.println("Kamu gerak ke kanan");
            if(myMap.canIMoveRight() == true){
                myMap.moveRight();
                myMap.printMap();
                userMove();
            }
            else{
                System.out.println("Sorry you've hit a wall");
            }
        }
        else if("L".equals(um)){
            System.out.println("Kamu gerak ke kiri");
            if(myMap.canIMoveLeft() == true){
                myMap.moveLeft();
                myMap.printMap();
                userMove();
            }
            else{
                System.out.println("Sorry you've hit a wall");
            }
        }
        else if("U".equals(um)){
            System.out.println("Kamu gerak ke atas");
            if(myMap.canIMoveUp() == true){
                myMap.moveUp();
                myMap.printMap();
                userMove();
            }
            else{
                System.out.println("Sorry you've hit a wall");
            }
        }
        else if("D".equals(um)){
            System.out.println("Kamu gerak ke bawah");
            if(myMap.canIMoveDown() == true){
                myMap.moveDown();
                myMap.printMap();
                userMove();
            }
            else{
                System.out.println("Sorry you've hit a wall");
            }
        }
        else{
            System.out.println("Please input R, L, U, or D");
            userMove();
        }
    }
}
/**
 asdsadsad
 sadsads
 **/