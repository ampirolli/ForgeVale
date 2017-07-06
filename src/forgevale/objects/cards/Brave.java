package forgevale.objects.cards;

import forgevale.objects.Card;
import forgevale.objects.Player;

/**
 *
 * @author Ampirolli & Helka
 */
public class Brave extends Card{
    
    public Brave(){
        this.setName("Brave the Monster Hunter");
        this.setDescription("Orphaned at birth, Brave was taken in by an old married\n"
                            + "couple. Living hundreds of miles in the middle of no\n"
                            + "where, Brave continuesly finds himself at odds\n"
                            + "with terrifying beasts.\n"
                            + "\"In the middle of no where, it's either hunt, or be hunted.\" - Brave");
        this.setPassiveAbilityDescription("Hunting Trophies: Whenever Brave kills a minion, he gains +1/+1.");
        this.setAttack(3);
        this.setHealth(4);
        this.setManaCost(4);
        this.setActive(true);
    }
    
    @Override
    public void attacked(Card opponent){
        opponent.takesDamage(this);
        this.takesDamage(opponent);
        passiveAbility(opponent);
    
    }
    
    @Override
    public void passiveAbility(Card opponent){
        
        if(opponent.getHealth() <= 0){
            this.setAttack(this.getAttack() + 1);
            this.setHealth(this.getHealth() + 1);
        
        }
    
    }
    
}
