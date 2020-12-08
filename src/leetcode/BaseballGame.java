package leetcode;

import java.util.Stack;

/**
 * leetcode 682. Baseball Game
 * https://leetcode.com/problems/baseball-game/
 **/

public class BaseballGame {
  public int calPoints(String[] ops) {
        Stack<Integer> validOps = new Stack();
        int score=0, opScore = 0, temp = 0;
        for(String operation:ops){

            switch (operation){
                case "C":
                {

                    if(validOps.isEmpty())
                        return 0;
                    else
                    {
                        opScore = validOps.pop();
                        score -=opScore;
                    }
                    System.out.println(operation);
                    break;
                }
                case "D":
                {
                    if(validOps.isEmpty())
                        return 0;
                    opScore = validOps.peek()*2;
                    validOps.push(opScore);
                    score +=opScore;
                    System.out.println(operation);
                    break;
                }
                case "+":
                {
                    if(validOps.size()<2)
                        return 0;
                    else
                    {
                        temp = validOps.pop();
                        opScore = validOps.peek();
                        opScore +=temp;
                        validOps.push(temp);
                        score+=opScore;
                        validOps.push(opScore);

                    }
                    System.out.println(operation);
                    break;
                }
                default:
                {
                    try {
                        opScore = Integer.parseInt(operation);
                    }catch (Exception ex){
                        System.out.println("Invalid input");
                        return 0;
                    }
                    validOps.push(opScore);
                    score += opScore;
                    System.out.println(operation);
                }
            }
        }
        System.out.println("Score:"+score);
        return score;
    }
}
