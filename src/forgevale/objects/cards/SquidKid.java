package forgevale.objects.cards;

import forgevale.objects.Card;
import forgevale.objects.Player;

/**
 *
 * @author Ampirolli & Helka
 */
public class SquidKid extends Card{
    
    public SquidKid(){
        this.setName("Squid Kid");
        this.setDescription("Deemed 'too unstable for society', Squid Kid was sentenced\n"
                          + "to life in prison for unethical experimentations. With the\n"
                          + "help of a local gang of rats, he escaped his confinement.\n"
                          + "Now armed with four mechanical appendages, Squid Kid vows to\n"
                          + "show the world what 'unstable' really is.");
        this.setPassiveAbilityDescription("Mehanical Appendages: Squid Kid deals\n"
                                        + "deals 2 damaged to cards adjacent to his target.");
        this.setAttack(4);
        this.setHealth(5);
        this.setManaCost(6);
        this.setActive(true);
    }
}
