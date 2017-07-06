package forgevale.objects.cards;

import forgevale.objects.Card;
import forgevale.objects.Player;

/**
 *
 * @author Ampirolli & Helka
 */
public class Beehemoth extends Card{
    
    public Beehemoth(){
        this.setName("The Beehemoth");
        this.setDescription("Float like a butterfly, sting like a Beehemoth.");
        this.setPassiveAbilityDescription("Deadly Sting: Any minion damaged by The Beehemoth\n"
                                          + "is immediately destroyed.");
        this.setAttack(1);
        this.setHealth(1);
        this.setManaCost(3);
        this.setActive(true);
    }
    
    
    @Override
    public void attacked(Card opponent) {
        passiveAbility(opponent);
        opponent.takesDamage(this);
        this.takesDamage(opponent);
    }
    
    @Override
    public void passiveAbility(Card opponent){
        this.setAttack(opponent.getHealth());
    }
}
