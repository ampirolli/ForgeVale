package forgevale.objects;

import java.util.ArrayList;

/**
 *
 * @author ampirolli
 */
public class Board {
    public Player player1;
    public Player player2;
    Integer phase;
    boolean activePlayer = true;
    boolean prePhase = false;
    boolean mainPhase = false;
    
    public Board(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
        activePlayer = true;
        phase = 0;
        
    }
    
    public boolean isPrePhase() {
        return prePhase;
    }

    public void setPrePhase(boolean prePhase) {
        this.prePhase = prePhase;
    }
    
    public boolean isMainPhase() {
        return mainPhase;
    }

    public void setMainPhase(boolean mainPhase) {
        this.mainPhase = mainPhase;
    }
 
    public void drawPhase(Player player){
        player.drawCard();
    }
    
    public void manaPhase(Player player){
        player.accumulateMana();
    }
    
    public void attackAndSetPhase(Player player){
    
    }
    
    public Player getActivePlayer(){
    
        if(activePlayer == true){
            return this.player1;
        }else{
            return this.player2;
        }
    
    }
    
    public void switchActivePlayer(){
        
         if(activePlayer == true){
                activePlayer = false;
         }else{
            activePlayer = true;
         }
    
    }

    public void nextPhase(){
        phase++;
        
        switch(phase){
                
                case 1:
                    this.drawPhase(this.getActivePlayer());
                    this.manaPhase(this.getActivePlayer());
                    prePhase = false;
                    mainPhase = true;
                    break;
                    
                case 2:
                    this.attackAndSetPhase(this.getActivePlayer());
                    this.switchActivePlayer();
                    prePhase = true;
                    mainPhase = false;
                    phase = 0;
                    break;
                    
                default:
                    this.switchActivePlayer();
                    prePhase = true;
                    phase = 0;
                    break;
                   
        }
                        
    }
    
    
    
}
