package forgevale;

import forgevale.objects.Board;
import forgevale.objects.Card;
import forgevale.objects.Player;
import forgevale.objects.Test;
import forgevale.objects.cards.Snowku;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.Label;

/**
 *
 * @author ampirolli
 */
public class FXMLDocumentController implements Initializable {
    
    Board board;
    Integer phase = 0;
    Player activePlayer;
    boolean switchPlayer = true; //true = player 1 || faslse = player 2
    boolean prePhase = false;
    boolean mainPhase = false;
    
    @FXML
    private Label label;
    
    @FXML
    private Button p1Hand1, p1Hand2, p1Hand3, p1Hand4, p1Hand5, p1Hand6, p1Hand7, p1Hand8, p1Board1, p1Board2, p1Board3, p1Board4, p1Board5, p1Board6, p1Board7, p1Board8;
    
    @FXML
    private Button p2Hand1, p2Hand2, p2Hand3, p2Hand4, p2Hand5, p2Hand6, p2Hand7, p2Hand8, p2Board1, p2Board2, p2Board3, p2Board4, p2Board5, p2Board6, p2Board7, p2Board8;
    
    @FXML
    private Label p1Name, p1Health, p1Mana, p1Score;
    
    @FXML
    private Label p2Name, p2Health, p2Mana, p2Score;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    private void updatePlayers(){
        int i = 0;
        int cardCount = board.player1.getHand().getCollection().size();
        
        p1Hand1.setText("");
        p1Hand2.setText("");
        p1Hand3.setText("");
        p1Hand4.setText("");
        p1Hand5.setText("");
        p1Hand6.setText("");
        p1Hand7.setText("");
        p1Hand8.setText(""); 
        while(i <= cardCount){
           

            if(i == 1)
                p1Hand1.setText(board.player1.getHand().getCollection().get(0).getName().toString() 
                        +"\nHealth: " + board.player1.getHand().getCollection().get(0).getHealth().toString() 
                        +"\nAttack: " + board.player1.getHand().getCollection().get(0).getAttack().toString() 
                        +"\nMana: " + board.player1.getHand().getCollection().get(0).getManaCost().toString());
            if(i == 2)
                p1Hand2.setText(board.player1.getHand().getCollection().get(1).getName().toString()  
                        +"\nHealth: " + board.player1.getHand().getCollection().get(1).getHealth().toString() 
                        +"\nAttack: " + board.player1.getHand().getCollection().get(1).getAttack().toString() 
                        +"\nMana: " + board.player1.getHand().getCollection().get(1).getManaCost().toString());
            if(i == 3)
                p1Hand3.setText(board.player1.getHand().getCollection().get(2).getName().toString()  
                        +"\nHealth: " + board.player1.getHand().getCollection().get(2).getHealth().toString() 
                        +"\nAttack: " + board.player1.getHand().getCollection().get(2).getAttack().toString() 
                        +"\nMana: " + board.player1.getHand().getCollection().get(2).getManaCost().toString());
            if(i == 4)
                p1Hand4.setText(board.player1.getHand().getCollection().get(3).getName().toString()  
                        +"\nHealth: " + board.player1.getHand().getCollection().get(3).getHealth().toString() 
                        +"\nAttack: " + board.player1.getHand().getCollection().get(3).getAttack().toString() 
                        +"\nMana: " + board.player1.getHand().getCollection().get(3).getManaCost().toString());
            if(i == 5)
                p1Hand5.setText(board.player1.getHand().getCollection().get(4).getName().toString()  
                        +"\nHealth: " + board.player1.getHand().getCollection().get(4).getHealth().toString() 
                        +"\nAttack: " + board.player1.getHand().getCollection().get(4).getAttack().toString() 
                        +"\nMana: " + board.player1.getHand().getCollection().get(4).getManaCost().toString());
            if(i == 6)
                p1Hand6.setText(board.player1.getHand().getCollection().get(5).getName().toString()  
                        +"\nHealth: " + board.player1.getHand().getCollection().get(5).getHealth().toString() 
                        +"\nAttack: " + board.player1.getHand().getCollection().get(5).getAttack().toString() 
                        +"\nMana: " + board.player1.getHand().getCollection().get(5).getManaCost().toString());
            if(i == 7)
                p1Hand7.setText(board.player1.getHand().getCollection().get(6).getName().toString()  
                        +"\nHealth: " + board.player1.getHand().getCollection().get(6).getHealth().toString() 
                        +"\nAttack: " + board.player1.getHand().getCollection().get(6).getAttack().toString() 
                        +"\nMana: " + board.player1.getHand().getCollection().get(6).getManaCost().toString());
            if(i == 8)
                p1Hand8.setText(board.player1.getHand().getCollection().get(7).getName().toString()  
                        +"\nHealth: " + board.player1.getHand().getCollection().get(7).getHealth().toString() 
                        +"\nAttack: " + board.player1.getHand().getCollection().get(7).getAttack().toString() 
                        +"\nMana: " + board.player1.getHand().getCollection().get(7).getManaCost().toString());
            i++;
        }
            
        i = 0;
        cardCount = board.player2.getHand().getCollection().size();
        p2Hand1.setText("");
        p2Hand2.setText("");
        p2Hand3.setText("");
        p2Hand4.setText("");
        p2Hand5.setText("");
        p2Hand6.setText("");
        p2Hand7.setText("");
        p2Hand8.setText(""); 
        while(i <= cardCount){
            if(i == 1)
                p2Hand1.setText(board.player2.getHand().getCollection().get(0).getName().toString() 
                        +"\nHealth: " + board.player2.getHand().getCollection().get(0).getHealth().toString() 
                        +"\nAttack: " + board.player2.getHand().getCollection().get(0).getAttack().toString() 
                        +"\nMana: " + board.player2.getHand().getCollection().get(0).getManaCost().toString());
            if(i == 2)
                p2Hand2.setText(board.player2.getHand().getCollection().get(1).getName().toString() 
                        +"\nHealth: " + board.player2.getHand().getCollection().get(1).getHealth().toString() 
                        +"\nAttack: " + board.player2.getHand().getCollection().get(1).getAttack().toString() 
                        +"\nMana: " + board.player2.getHand().getCollection().get(1).getManaCost().toString());
            if(i == 3)
                p2Hand3.setText(board.player2.getHand().getCollection().get(2).getName().toString() 
                        +"\nHealth: " + board.player2.getHand().getCollection().get(2).getHealth().toString() 
                        +"\nAttack: " + board.player2.getHand().getCollection().get(2).getAttack().toString() 
                        +"\nMana: " + board.player2.getHand().getCollection().get(2).getManaCost().toString());
            if(i == 4)
                p2Hand4.setText(board.player2.getHand().getCollection().get(3).getName().toString()
                        +"\nHealth: " + board.player2.getHand().getCollection().get(3).getHealth().toString() 
                        +"\nAttack: " + board.player2.getHand().getCollection().get(3).getAttack().toString() 
                        +"\nMana: " + board.player2.getHand().getCollection().get(3).getManaCost().toString());
            if(i == 5)
                p2Hand5.setText(board.player2.getHand().getCollection().get(4).getName().toString() 
                        +"\nHealth: " + board.player2.getHand().getCollection().get(4).getHealth().toString() 
                        +"\nAttack: " + board.player2.getHand().getCollection().get(4).getAttack().toString() 
                        +"\nMana: " + board.player2.getHand().getCollection().get(4).getManaCost().toString());
            if(i == 6)
                p2Hand6.setText(board.player2.getHand().getCollection().get(5).getName().toString() 
                        +"\nHealth: " + board.player2.getHand().getCollection().get(5).getHealth().toString() 
                        +"\nAttack: " + board.player2.getHand().getCollection().get(5).getAttack().toString() 
                        +"\nMana: " + board.player2.getHand().getCollection().get(5).getManaCost().toString());
            if(i == 7)
                p2Hand7.setText(board.player2.getHand().getCollection().get(6).getName().toString() 
                        +"\nHealth: " + board.player2.getHand().getCollection().get(6).getHealth().toString() 
                        +"\nAttack: " + board.player2.getHand().getCollection().get(6).getAttack().toString() 
                        +"\nMana: " + board.player2.getHand().getCollection().get(6).getManaCost().toString());
            if(i == 8)
                p2Hand8.setText(board.player2.getHand().getCollection().get(7).getName().toString() 
                        +"\nHealth: " + board.player2.getHand().getCollection().get(7).getHealth().toString() 
                        +"\nAttack: " + board.player2.getHand().getCollection().get(7).getAttack().toString() 
                        +"\nMana: " + board.player2.getHand().getCollection().get(7).getManaCost().toString());
            i++;
        }
        i = 0;
        cardCount = board.player1.getActiveZone().getCollection().size();
        while(i <= cardCount){
            if(i == 1)
                p1Board1.setText(board.player1.getActiveZone().getCollection().get(0).getName().toString()
                        +"\nHealth: " + board.player1.getActiveZone().getCollection().get(0).getHealth().toString() 
                        +"\nAttack: " + board.player1.getActiveZone().getCollection().get(0).getAttack().toString());
            if(i == 2)
                p1Board2.setText(board.player1.getActiveZone().getCollection().get(1).getName().toString()
                        +"\nHealth: " + board.player1.getActiveZone().getCollection().get(1).getHealth().toString() 
                        +"\nAttack: " + board.player1.getActiveZone().getCollection().get(1).getAttack().toString());
            if(i == 3)
                p1Board3.setText(board.player1.getActiveZone().getCollection().get(2).getName().toString()
                        +"\nHealth: " + board.player1.getActiveZone().getCollection().get(2).getHealth().toString() 
                        +"\nAttack: " + board.player1.getActiveZone().getCollection().get(2).getAttack().toString());
            if(i == 4)
                p1Board4.setText(board.player1.getActiveZone().getCollection().get(3).getName().toString()
                        +"\nHealth: " + board.player1.getActiveZone().getCollection().get(3).getHealth().toString() 
                        +"\nAttack: " + board.player1.getActiveZone().getCollection().get(3).getAttack().toString());
            if(i == 5)
                p1Board5.setText(board.player1.getActiveZone().getCollection().get(4).getName().toString()
                        +"\nHealth: " + board.player1.getActiveZone().getCollection().get(4).getHealth().toString() 
                        +"\nAttack: " + board.player1.getActiveZone().getCollection().get(4).getAttack().toString());
            if(i == 6)
                p1Board6.setText(board.player1.getActiveZone().getCollection().get(5).getName().toString()
                        +"\nHealth: " + board.player1.getActiveZone().getCollection().get(5).getHealth().toString() 
                        +"\nAttack: " + board.player1.getActiveZone().getCollection().get(5).getAttack().toString());
            if(i == 7)
                p1Board7.setText(board.player1.getActiveZone().getCollection().get(6).getName().toString()
                        +"\nHealth: " + board.player1.getActiveZone().getCollection().get(6).getHealth().toString() 
                        +"\nAttack: " + board.player1.getActiveZone().getCollection().get(6).getAttack().toString());
            if(i == 8)
                p1Board8.setText(board.player1.getActiveZone().getCollection().get(7).getName().toString()
                        +"\nHealth: " + board.player1.getActiveZone().getCollection().get(7).getHealth().toString() 
                        +"\nAttack: " + board.player1.getActiveZone().getCollection().get(7).getAttack().toString());
            i++;
        }
        
        i = 0;
        cardCount = board.player2.getActiveZone().getCollection().size();
        while(i <= cardCount){
            if(i == 1)
                p2Board1.setText(board.player2.getActiveZone().getCollection().get(0).getName().toString()
                        +"\nHealth: " + board.player2.getActiveZone().getCollection().get(0).getHealth().toString() 
                        +"\nAttack: " + board.player2.getActiveZone().getCollection().get(0).getAttack().toString());
            if(i == 2)
                p2Board2.setText(board.player2.getActiveZone().getCollection().get(1).getName().toString()
                        +"\nHealth: " + board.player2.getActiveZone().getCollection().get(1).getHealth().toString() 
                        +"\nAttack: " + board.player2.getActiveZone().getCollection().get(1).getAttack().toString());
            if(i == 3)
                p2Board3.setText(board.player2.getActiveZone().getCollection().get(2).getName().toString()
                        +"\nHealth: " + board.player2.getActiveZone().getCollection().get(2).getHealth().toString() 
                        +"\nAttack: " + board.player2.getActiveZone().getCollection().get(2).getAttack().toString());
            if(i == 4)
                p2Board4.setText(board.player2.getActiveZone().getCollection().get(3).getName().toString()
                        +"\nHealth: " + board.player2.getActiveZone().getCollection().get(3).getHealth().toString() 
                        +"\nAttack: " + board.player2.getActiveZone().getCollection().get(3).getAttack().toString());
            if(i == 5)
                p2Board5.setText(board.player2.getActiveZone().getCollection().get(4).getName().toString()
                        +"\nHealth: " + board.player2.getActiveZone().getCollection().get(4).getHealth().toString() 
                        +"\nAttack: " + board.player2.getActiveZone().getCollection().get(4).getAttack().toString());
            if(i == 6)
                p2Board6.setText(board.player2.getActiveZone().getCollection().get(5).getName().toString()
                        +"\nHealth: " + board.player2.getActiveZone().getCollection().get(5).getHealth().toString() 
                        +"\nAttack: " + board.player2.getActiveZone().getCollection().get(5).getAttack().toString());
            if(i == 7)
                p2Board7.setText(board.player2.getActiveZone().getCollection().get(6).getName().toString()
                        +"\nHealth: " + board.player2.getActiveZone().getCollection().get(6).getHealth().toString() 
                        +"\nAttack: " + board.player2.getActiveZone().getCollection().get(6).getAttack().toString());
            if(i == 8)
                p2Board8.setText(board.player2.getActiveZone().getCollection().get(7).getName().toString()
                        +"\nHealth: " + board.player2.getActiveZone().getCollection().get(7).getHealth().toString() 
                        +"\nAttack: " + board.player2.getActiveZone().getCollection().get(7).getAttack().toString());
            i++;
        } 
        
    }
    
    private void updateScoreBoard(){
        
        p1Health.setText("Health: " + board.player1.getPlayerHealth().toString());
        p1Mana.setText("Mana: " + board.player1.getPlayerMana().toString());
        p1Score.setText("Score: " + board.player1.getPlayerScore().toString());
        
        p2Health.setText("Health: " + board.player2.getPlayerHealth().toString());
        p2Mana.setText("Mana: " + board.player2.getPlayerMana().toString());
        p2Score.setText("Score: " + board.player2.getPlayerScore().toString());
    
        
        
    }
    
    @FXML
    private void handleNextPhase(ActionEvent event){
        board.nextPhase();
        updatePlayers();
        updateScoreBoard();
                        
    }
    
    @FXML
    private void setPrompt(ActionEvent event){
    
        ButtonType set = new ButtonType("set", ButtonBar.ButtonData.OK_DONE);
        ButtonType cancel = new ButtonType("cancel", ButtonBar.ButtonData.CANCEL_CLOSE);
        Alert alert = new Alert(AlertType.WARNING,"", set, cancel);
        alert.setTitle("Set Card");
        alert.setHeaderText("You are about to set this card...");
        alert.setContentText("are you sure you want to set this card?");
        Optional<ButtonType> result = alert.showAndWait();
        

        if (result.isPresent() && result.get() == set) {
            
            if(event.getSource() == p1Hand1)
                board.player1.setCard(board.player1.getHand().getCollection().get(0));  
            if(event.getSource() == p1Hand2)
                board.player1.setCard(board.player1.getHand().getCollection().get(1));          
            if(event.getSource() == p1Hand3)
                board.player1.setCard(board.player1.getHand().getCollection().get(2));         
            if(event.getSource() == p1Hand4)
                board.player1.setCard(board.player1.getHand().getCollection().get(3));         
            if(event.getSource() == p1Hand5)
                board.player1.setCard(board.player1.getHand().getCollection().get(4));         
            if(event.getSource() == p1Hand6)
                board.player1.setCard(board.player1.getHand().getCollection().get(5));         
            if(event.getSource() == p1Hand7)
                board.player1.setCard(board.player1.getHand().getCollection().get(6));
            if(event.getSource() == p1Hand8)
                board.player1.setCard(board.player1.getHand().getCollection().get(7));
            

            if(event.getSource() == p2Hand1)
                board.player2.setCard(board.player2.getHand().getCollection().get(0)); 
            if(event.getSource() == p2Hand2)
                board.player2.setCard(board.player2.getHand().getCollection().get(1));
            if(event.getSource() == p2Hand3)
                board.player2.setCard(board.player2.getHand().getCollection().get(2));
            if(event.getSource() == p2Hand4)
                board.player2.setCard(board.player2.getHand().getCollection().get(3));
            if(event.getSource() == p2Hand5)
                board.player2.setCard(board.player2.getHand().getCollection().get(4));
            if(event.getSource() == p2Hand6)
                board.player2.setCard(board.player2.getHand().getCollection().get(5));
            if(event.getSource() == p2Hand7)
                board.player2.setCard(board.player2.getHand().getCollection().get(6));
            if(event.getSource() == p2Hand8)
                board.player2.setCard(board.player2.getHand().getCollection().get(7));

        }
        
        updatePlayers();
        updateScoreBoard();
    }
    
    @FXML
    private void attackPrompt(ActionEvent event){
    
        //event.getSource();
        Integer i;
        Integer cardCount;
        
        List<String> choices = new ArrayList<>();

        if (board.getActivePlayer() == board.player1){
        
            i = 0;
            cardCount = board.player2.getActiveZone().getCollection().size();
            
            while(i <= cardCount){
                if(i == 1)
                    choices.add(board.player2.getActiveZone().getCollection().get(0).getName());
                if(i == 2)
                    choices.add(board.player2.getActiveZone().getCollection().get(1).getName());
                if(i == 3)
                    choices.add(board.player2.getActiveZone().getCollection().get(2).getName());
                if(i == 4)
                    choices.add(board.player2.getActiveZone().getCollection().get(3).getName());
                if(i == 5)
                    choices.add(board.player2.getActiveZone().getCollection().get(4).getName());
                if(i == 6)
                    choices.add(board.player2.getActiveZone().getCollection().get(5).getName());
                if(i == 7)
                    choices.add(board.player2.getActiveZone().getCollection().get(6).getName());
                if(i == 8)
                    choices.add(board.player2.getActiveZone().getCollection().get(7).getName());
                    
                
   
                i++;
            }
            

            
        }else if(board.getActivePlayer() == board.player2){
            
            i = 0;
            cardCount = board.player1.getActiveZone().getCollection().size();
            
            while(i <= cardCount){
                if(i == 1)
                    choices.add(board.player1.getActiveZone().getCollection().get(0).getName());
                if(i == 2)
                    choices.add(board.player1.getActiveZone().getCollection().get(1).getName());
                if(i == 3)
                    choices.add(board.player1.getActiveZone().getCollection().get(2).getName());
                if(i == 4)
                    choices.add(board.player1.getActiveZone().getCollection().get(3).getName());
                if(i == 5)
                    choices.add(board.player1.getActiveZone().getCollection().get(4).getName());
                if(i == 6)
                    choices.add(board.player1.getActiveZone().getCollection().get(5).getName());
                if(i == 7)
                    choices.add(board.player1.getActiveZone().getCollection().get(6).getName());
                if(i == 8)
                    choices.add(board.player1.getActiveZone().getCollection().get(7).getName());
                    
   
                i++;

            }
            
            
            ChoiceDialog<String> dialog = new ChoiceDialog<>(choices.get(0), choices);
            dialog.setHeaderText("You are about to attack with this card");
            dialog.setContentText("Choose wich enemy minion youd like to attack with this card.");
            
            Optional<String> result = dialog.showAndWait();
            if (result.isPresent()){
                if (choices.size() == 1){

                }
                if (choices.size() == 2){

                }
                if (choices.size() == 3){

                }
                if (choices.size() == 4){

                }
                if (choices.size() == 5){

                }
                if (choices.size() == 6){

                }
                if (choices.size() == 7){

                }
                if (choices.size() == 8){

                }

                if (choices.size() == 1){

                }
            }else{
            
            }
            
            
        }
       
        
        updatePlayers();
        updateScoreBoard();
    }
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Test test = new Test();
        board = new Board(test.getPlayer1(), test.getPlayer2());
        p1Name.setText(board.player1.getPlayerName());
        p2Name.setText(board.player2.getPlayerName());
    }    
    
}
