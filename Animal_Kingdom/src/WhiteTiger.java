import java.awt.*;
import java.lang.reflect.Method;

public class WhiteTiger extends Critter {
    int numberOfMoves = 0;


    public Action getMove(CritterInfo info) {
        Tiger tiger = new Tiger();
        numberOfMoves = numberOfMoves + 1;
        return tiger.getMove(info);
    }

    public Color getColor() {
        return Color.WHITE;
    }

    public String toString() {
        if(this.numberMoves() > 0){
            return "TGR";
        }
        else{
            return "tgr";
        }
    }

    public int numberMoves(){
        return this.numberOfMoves;
    }
}

