import java.awt.*;

public class Bear extends Critter {
    int numberOfMoves = 0;
    boolean polar = false;

    public Bear(boolean polar){
        this.polar = polar;
    }

    public Color getColor() {

        if(this.polar){
            return Color.WHITE;
        }
        else{
            return Color.BLACK;
        }
    }

    public String toString() {
        if(this.numberMoves() % 2 == 0){
            return "\\";
        }
        else{
            return "/";
        }
    }

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
                return Action.LEFT;
            }
        }
    }

    public int numberMoves(){
        return this.numberOfMoves;
    }
}

