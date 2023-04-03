import java.util.*;
import java.util.List;
import java.awt.*;

public class Tiger extends Critter {
    int numberOfMoves = 0;

    public Color getColor() {
        if(this.numberMoves() % 3 == 0){
            Random rand = new Random();
            List<Color> givenList = Arrays.asList(Color.RED, Color.GREEN, Color.BLUE);
            Color selectedColor = givenList.get(rand.nextInt(givenList.size()));
            return selectedColor;
        }
        else{
            Random rand = new Random();
            List<Color> givenList = Arrays.asList(Color.RED, Color.GREEN, Color.BLUE);
            Color selectedColor = givenList.get(rand.nextInt(givenList.size()));
            return selectedColor;
        }
    }

    public String toString() {
        return "TGR";
    }

    public Action getMove(CritterInfo info) {
        if (info.frontThreat()) {
            numberOfMoves = numberOfMoves + 1;
            return Action.INFECT;
        } 
        else if(info.getFront() == Neighbor.WALL){
            numberOfMoves = numberOfMoves + 1;
            return Action.LEFT;
        }
        else if(info.getRight() == Neighbor.WALL){
            numberOfMoves = numberOfMoves + 1;
            return Action.LEFT;
        }
        else if(info.getFront() == Neighbor.SAME){
            numberOfMoves = numberOfMoves + 1;
            return Action.RIGHT;
        }
        else{
            numberOfMoves = numberOfMoves + 1;
            return Action.HOP;
        }
    }

    public int numberMoves(){
        return this.numberOfMoves;
    }
}

