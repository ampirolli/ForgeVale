package forgevale;

import forgevale.objects.Board;
import forgevale.objects.Player;
import forgevale.objects.Test;
import java.net.URL;
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
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    private void updatePlayers(){
        int i = 0;
        int cardCount = board.player1.getHand().getCollection().size();
        while(i <= cardCount){
            if(i == 1)
                p1Hand1.setText(board.player1.getHand().getCollection().get(0).getName().toString());
            if(i == 2)
                p1Hand2.setText(board.player1.getHand().getCollection().get(1).getName().toString());
            if(i == 3)
                p1Hand3.setText(board.player1.getHand().getCollection().get(2).getName().toString());
            if(i == 4)
                p1Hand4.setText(board.player1.getHand().getCollection().get(3).getName().toString());
            if(i == 5)
                p1Hand5.setText(board.player1.getHand().getCollection().get(4).getName().toString());
            if(i == 6)
                p1Hand6.setText(board.player1.getHand().getCollection().get(5).getName().toString());
            if(i == 7)
                p1Hand7.setText(board.player1.getHand().getCollection().get(6).getName().toString());
            if(i == 8)
                p1Hand8.setText(board.player1.getHand().getCollection().get(7).getName().toString());
            i++;
        }
            
        i = 0;
        cardCount = board.player2.getHand().getCollection().size();
        while(i <= cardCount){
            if(i == 1)
                p2Hand1.setText(board.player2.getHand().getCollection().get(0).getName().toString());
            if(i == 2)
                p2Hand2.setText(board.player2.getHand().getCollection().get(1).getName().toString());
            if(i == 3)
                p2Hand3.setText(board.player2.getHand().getCollection().get(2).getName().toString());
            if(i == 4)
                p2Hand4.setText(board.player2.getHand().getCollection().get(3).getName().toString());
            if(i == 5)
                p2Hand5.setText(board.player2.getHand().getCollection().get(4).getName().toString());
            if(i == 6)
                p2Hand6.setText(board.player2.getHand().getCollection().get(5).getName().toString());
            if(i == 7)
                p2Hand7.setText(board.player2.getHand().getCollection().get(6).getName().toString());
            if(i == 8)
                p2Hand8.setText(board.player2.getHand().getCollection().get(7).getName().toString());
            i++;
        }    
        
    }
    
    private void updateScoreBoard(){
    
        
        
    }
    
    @FXML
    private void handleNextPhase(ActionEvent event){
        updatePlayers();
                        
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

        }
    }
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Test test = new Test();
        board = new Board(test.getPlayer1(), test.getPlayer2());
    }    
    
}
