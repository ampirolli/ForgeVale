package forgevale.objects;



import forgevale.objects.collections.Deck;
import forgevale.objects.cards.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 *
 * @author ampirolli
 */
public class Test {
  
    public Test(){
    
    }
    
    public void TEST(){

        Player player1 = new Player("Pirolli");
        Player player2 = new Player("HelkDog");

        Deck deck1 = new Deck(); //creates a place holder deck
        Deck deck2 = new Deck();

        Card bigLizard = new BigLizard();
        Card boneATor = new BoneATor(); 
        Card brave = new Brave();
        Card beehemoth = new Beehemoth();
        Card eliminator = new Eliminator();
        Card kitPup = new KitPup();
        Card largePapa = new LargePapa();
        Card skinnyLips = new SkinnyLips();
        Card snowku = new Snowku();
        Card squidKid = new SquidKid();

        deck1.addCard(bigLizard, player1); //adds each card into the placeholder deck1
        deck1.addCard(boneATor,player1);
        deck1.addCard(brave,player1);
        deck1.addCard(beehemoth,player1);
        deck1.addCard(eliminator,player1);
        deck1.addCard(kitPup,player1);
        deck1.addCard(largePapa,player1);
        deck1.addCard(skinnyLips,player1);
        deck1.addCard(snowku,player1);
        deck1.addCard(squidKid,player1);
        
        deck2.addCard(bigLizard, player2); //adds each card into the placeholder deck2
        deck2.addCard(boneATor,player2);
        deck2.addCard(brave,player2);
        deck2.addCard(beehemoth,player2);
        deck2.addCard(eliminator,player2);
        deck2.addCard(kitPup,player2);
        deck2.addCard(largePapa,player2);
        deck2.addCard(skinnyLips,player2);
        deck2.addCard(snowku,player2);
        deck2.addCard(squidKid,player2);

        player1.setDeck(deck1);// sets the players deck to the deck we just created
        player2.setDeck(deck2);

        player1.shuffleDeck();//shuffles deck obvi
        player2.shuffleDeck();

        player1.drawCard();//draws card. if its the first time youre drawing a card, it will draw 5 instead
        player2.drawCard();

        for(Card card : player1.getHand().getCollection()){ //for each card in the players hand, display this:
            System.out.println(player1.getPlayerName() + ": " + card.getName());
            System.out.println("    - Mana cost: " + card.getManaCost());
            System.out.println("- Attack: " + card.getAttack() + "   - Health: " + card.getHealth() + "\n");

        }
        System.out.println("<----------------------------------------------------> \n");
        for(Card card : player2.getHand().getCollection()){
            System.out.println(player2.getPlayerName() + ": " + card.getName());
            System.out.println("    - Mana cost: " + card.getManaCost());
            System.out.println("- Attack: " + card.getAttack() + "   - Health: " + card.getHealth() + "\n");

        }
    }

}
