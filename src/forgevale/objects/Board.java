package forgevale.objects;

import java.util.ArrayList;

/**
 *
 * @author ampirolli
 */
public class Board {
    Player player1;
    Player player2;
    
    public Board(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;        
        
    }
 
    public void drawPhase(Player player){
        player.drawCard();
    }
    
    public void manaPhase(Player player){
        player.accumulateMana();
    }
    
    public void attackAndSetPhase(Player player){
    
    }
    
    
}
