import java.awt.*;

public class Giant extends Critter {
    int numberOfMoves = 0;

    public Action getMove(CritterInfo info) {
        if (info.frontThreat()) {
            numberOfMoves = numberOfMoves + 1;
            return Action.INFECT;
        } 
        else{
            if(info.getFront() == Neighbor.EMPTY){
                numberOfMoves = numberOfMoves + 1;
                return Action.HOP;
            }
            else{
                numberOfMoves = numberOfMoves + 1;
                return Action.RIGHT;
            }
        }
    }

    public Color getColor() {
        return Color.GRAY;
    }

    public String toString() {
        int divideBySix = this.numberMoves() / 6;
        int stepMove = divideBySix % 4;

        if(stepMove == 0){
            return "fum";
        }
        else if(stepMove == 1){
            return "fee";
        }
        else if(stepMove == 2){
            return "fie";
        }
        else{
            return "foe";
        }
    }

    public int numberMoves(){
        return this.numberOfMoves;
    }
}

