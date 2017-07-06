package forgevale.objects.cards;

import forgevale.objects.Card;
import forgevale.objects.Player;

/**
 *
 * @author Ampirolli & Helka
 */
public class Snowku extends Card{
    public Snowku(){
        this.setName("Snowku");
        this.setDescription("After Bone-A-Tor destroyed Snowku's village and\n"
                          + "everyone that inhabited it, Snowku has pledged to\n"
                          + "hunt him down and avenge his family. There's just one\n"
                          + "problem, he's green as grass.");
        this.setPassiveAbilityDescription("Intense Training: At the end of each\n"
                                        + "turn, Snowku gains +1/+1.");
        this.setAttack(1);
        this.setHealth(1);
        this.setManaCost(3);
        this.setActive(true);
    }
}
