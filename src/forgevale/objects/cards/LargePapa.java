package forgevale.objects.cards;

import forgevale.objects.Card;
import forgevale.objects.Player;

/**
 *
 * @author Ampirolli & Helka
 */
public class LargePapa extends Card{
    
    
    public LargePapa() {
        this.setName("Large Papa");
        this.setDescription("Large Papa's are heavily spliced human beings who have had their\n"
                            + "bodies directly grafted into heavily armored suits.\n"
                            + "Sworn to protect assigned clients, they will do so - until death.");
        this.setPassiveAbilityDescription("Guardian's Duty: When Large Papa is played, he\n"
                                        + "summons a 1/1 Little Sister. If either Large Papa\n"
                                        + "or Little Sister dies, so does the other.\n"
                                        + "Defender: This minion cannot directly attack and\n"
                                        + "forces the opposing player to direct attacks towards them");
        this.setAttack(3);
        this.setHealth(6);
        this.setManaCost(4);
        this.setActive(true);
    }
    
    @Override
    public void attacked(Card opponent){
        
        this.passiveAbility();
        opponent.takesDamage(this);
        this.takesDamage(opponent);
        this.passiveAbility();
        
    }
    
    @Override
    public void damagedBy(Card opponent){
        
        this.passiveAbility();
        this.setHealth(this.getHealth() - opponent.getAttack());
        this.passiveAbility();
        
        
    
    }
    
    
    
    @Override
    public void passiveAbility(){
        if (this.getHealth() < 6) {
            this.setAttack(5);
        } else {
            this. setAttack(1);
        }
    }
    
}
