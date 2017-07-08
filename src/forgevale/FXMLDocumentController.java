package forgevale;

import forgevale.objects.Board;
import forgevale.objects.Player;
import forgevale.objects.Test;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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
    
    private void updatePlayer1(){
    
        
        
    }
    
    private void updatePlayer2(){
    
        
        
    }
    
    private void updateScoreBoard(){
    
        
        
    }
    
    @FXML
    private void handleNextPhase(ActionEvent event){
        phase++;
        
        switch(phase){
                
                case 1:
                    board.drawPhase(board.getActivePlayer());
                    board.manaPhase(board.getActivePlayer());
                    break;
                    
                case 2:
                    board.attackAndSetPhase(board.getActivePlayer());
                    break;
                    
                default:
                    board.switchActivePlayer();
                    phase = 0;
                    break;
                    
                   
                    
                    
           
        }
                    
        
        
        
    }
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Test test = new Test();
        board = new Board(test.getPlayer1(), test.getPlayer2());
    }    
    
}
