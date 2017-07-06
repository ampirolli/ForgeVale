package forgevale.objects.cards;

import forgevale.objects.Card;
import forgevale.objects.Player;

/**
 *
 * @author Ampirolli & Helka
 */
public class Eliminator extends Card{
    
    public Eliminator(){
        this.setName("The Eliminator");
        this.setDescription("The Eliminator is a mechanical monstrosity sent from the\n"
                          + "future to destroy all of humanity. The Eliminator is close\n"
                          + "to indestructible; able to warp time before death.");
        this.setPassiveAbilityDescription("Time Travel: When The Eliminator dies,\n"
                                        + "return it to your hand. It now costs 1 less mana");
        this.setAttack(6);
        this.setHealth(3);
        this.setManaCost(6);
        this.setActive(true);
    }
}
