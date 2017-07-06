package forgevale.objects.cards;

import forgevale.objects.Card;
import forgevale.objects.Player;

/**
 *
 * @author Ampirolli & Helka
 */
public class BigLizard extends Card {
    public BigLizard(){
        this.setName("Big Lizard");
        this.setDescription("No one really knows where Big Lizard came from. Some rumors\n"
                            + "say he has been around since the age of dinosaurs. Others\n"
                            + "claim he is the product of nuclear testing. But one thing\n"
                            + "is for sure, Big Lizard is here to stay.");
        this.setPassiveAbilityDescription("No Passive Ability");
        this.setAttack(7);
        this.setHealth(7);
        this.setManaCost(5);
        this.setActive(true);
    }
}
