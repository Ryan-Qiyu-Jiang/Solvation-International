import javax.swing.*;

public class GameGUI extends JPanel {
  
  public GameGUI (){
  }
  
  public void highScores(){
    
  }
  
  public void options(){
    
  }
  
  public void help(){
    //game.pauseGame();
  }
  
  public void quitGame(){
    int choice = saveOptions();
    
    if(choice==0){
      saveGame();
      System.exit(0);
    }
    
    if(choice==1){
      System.exit(0);
    }
  }
  
  public void playGame(){
    
  }
  
  public void newGame(){
    
  }
  
  public void openGame(){
    
  }
  
  public void  selectCharacter(){
    
  }
  
  public void selectDiff(){
    
  }
  
  public void saveGame(){
    
  }
  
  private int saveOptions(){
    return 1;
  }
}