import java.util.*;
public class MazeRunner {
    public static Maze myMap = new Maze();
    public static void main(String[] args){
        intro();
        userMove();
    }
    public static void intro(){
        System.out.println("Welcome to  Maze Runner!");
        System.out.println("Here is your current position:");
        myMap.printMap();
    }
    public static void userMove(){
        System.out.println("Where would you like to move? (R, L, U, D)");
        Scanner input = new Scanner(System.in);
        String um = input.next();
        String total = "";

        if("R".equals(um) || "r".equals(um)){
            if(myMap.canIMoveRight() == true){
                myMap.moveRight();
                total = total + um;
                myMap.printMap();
                userMove();

            }
            else if(myMap.isThereAPit("R")){
                navigatePit();
                total = total + um;
                myMap.printMap();
                userMove();
            }
            else{
                System.out.println("Sorry you've hit a wall");
                System.out.println("Try again? (Y or N)");
                Scanner input2 = new Scanner(System.in);
                String input_ta = input2.next();
                if("Y".equals(input_ta) || "y".equals(input_ta)){
                    userMove();
                }
                else{
                    System.out.println("GG!");
                }
            }
        }
        else if("L".equals(um) || "l".equals(um)){
            if(myMap.canIMoveLeft() == true){
                myMap.moveLeft();
                total = total + um;
                myMap.printMap();
                userMove();
            }
            else if(myMap.isThereAPit("L")){
                navigatePit();
                total = total + um;
                myMap.printMap();
                userMove();
            }
            else{
                System.out.println("Sorry you've hit a wall");
                System.out.println("Try again? (Y or N)");
                Scanner input2 = new Scanner(System.in);
                String input_ta = input2.next();
                if("Y".equals(input_ta) || "y".equals(input_ta)){
                    userMove();
                }
                else{
                    System.out.println("GG!");
                }

                System.out.println("total langkah = " + total.length() + " langkah");
            }
        }
        else if("U".equals(um) || "u".equals(um)){
            if(myMap.canIMoveUp() == true){
                myMap.moveUp();
                total = total + um;
                myMap.printMap();
                userMove();
            }
            else if(myMap.isThereAPit("U")){
                navigatePit();
                total = total + um;
                myMap.printMap();
                userMove();
            }
            else{
                System.out.println("Sorry you've hit a wall");
                System.out.println("Try again? (Y or N)");
                Scanner input2 = new Scanner(System.in);
                String input_ta = input2.next();
                if("Y".equals(input_ta) || "y".equals(input_ta)){
                    userMove();
                }
                else{
                    System.out.println("GG!");
                }
            }
        }
        else if("D".equals(um) || "d".equals(um)){
            if(myMap.canIMoveDown() == true){
                myMap.moveDown();
                total = total + um;
                myMap.printMap();
                userMove();
            }
            else if(myMap.isThereAPit("D")){
                navigatePit();
                total = total + um;
                myMap.printMap();
                userMove();
            }
            else {
                System.out.println("Sorry you've hit a wall");
                System.out.println("Try again? (Y or N)");
                Scanner input2 = new Scanner(System.in);
                String input_ta = input2.next();
                if("Y".equals(input_ta) || "y".equals(input_ta)){
                    userMove();
                }
                else{
                    System.out.println("GG!");
                }
            }
        }
        else{
            userMove();
        }
    }
    public static void navigatePit(){
        if(myMap.isThereAPit("R")){
            System.out.println("Watch out! There's a pit ahead, jump it? (Y or N)");
            Scanner input = new Scanner(System.in);
            String jump = input.next();
            if("y".equals(jump) || "Y".equals(jump)){
                myMap.jumpOverPit("R");
            }
            else{
                userMove();
            }
        }
        else if(myMap.isThereAPit("L")){
            System.out.println("Watch out! There's a pit ahead, jump it? (Y or N)");
            Scanner input = new Scanner(System.in);
            String jump = input.next();
            if("y".equals(jump) || "Y".equals(jump)){
                myMap.jumpOverPit("L");
            }
            else{
                userMove();
            }
        }
        else if(myMap.isThereAPit("U")){
            System.out.println("Watch out! There's a pit ahead, jump it? (Y or N)");
            Scanner input = new Scanner(System.in);
            String jump = input.next();
            if("y".equals(jump) || "Y".equals(jump)){
                myMap.jumpOverPit("U");
            }
            else{
                userMove();
            }
        }
        else if(myMap.isThereAPit("D")){
            System.out.println("Watch out! There's a pit ahead, jump it? (Y or N)");
            Scanner input = new Scanner(System.in);
            String jump = input.next();
            if("y".equals(jump) || "Y".equals(jump)){
                myMap.jumpOverPit("D");
            }
            else{
                userMove();
            }
        }
    }
}
