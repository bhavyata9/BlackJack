/*
 * This program contains the code for the
 * game Black Jack. The Black Jack game made 
 * by this program does not fully echo the real game
 * of Black Jack. It is made for two players 
 * (the dealer and the player) but there is no 
 * option for betting money. 
 * @author: Bhavya Shah
 * @DateModified: January 15th, 2014
 * Course - ICS3U1
 * Teacher - Mr. Cardoso
 */

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import sun.audio.*;
import java.io.*;


class BlackJack implements ActionListener // for buttons
{
  /** 
   * This method displays a card on the screen for the player
   * INPUT (parameters): int location (for the location of the image)
   * int String suits (for the card)
   * OUTOUT (return): returns a Jlabel (an image of the card)
   */  
  public JLabel cards(int location,String suits)
  {
    int xValue = (80*location) + 5;
    if (suits == "spades1")
    {     
      ImageIcon Image = new ImageIcon ("Ace.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "hearts1")
    {
      ImageIcon Image = new ImageIcon ("Aceh.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "clubs1")
    {
      ImageIcon Image = new ImageIcon ("Acec.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits ==  "diamonds1") 
    {
      ImageIcon Image = new ImageIcon ("Aced.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "spades2")
    {     
      ImageIcon Image = new ImageIcon ("two.jpg");
      JLabel player1Card = new JLabel(Image);      
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "hearts2")
    {        
      ImageIcon Image = new ImageIcon ("twoh.jpg");
      JLabel player1Card = new JLabel(Image);      
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);      
      return player1Card;      
    }
    else if (suits == "clubs2")
    {        
      ImageIcon Image = new ImageIcon ("twoc.jpg");
      JLabel player1Card = new JLabel(Image);      
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);      
      return player1Card;      
    }
    else if (suits == "diamonds2") 
    {        
      ImageIcon Image = new ImageIcon ("twod.jpg");
      JLabel player1Card = new JLabel(Image);      
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);      
      return player1Card;      
    }    
    else if (suits == "spades3")
    {     
      ImageIcon Image = new ImageIcon ("three.jpg");
      JLabel player1Card = new JLabel(Image);     
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "hearts3")
    {
      ImageIcon Image = new ImageIcon ("threeh.jpg");
      JLabel player1Card = new JLabel(Image);     
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "clubs3")
    {
      ImageIcon Image = new ImageIcon ("threec.jpg");
      JLabel player1Card = new JLabel(Image);     
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "diamonds3") 
    {
      ImageIcon Image = new ImageIcon ("threed.jpg");
      JLabel player1Card = new JLabel(Image);     
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);      
      return player1Card;
    }    
    else if (suits == "spades4")
    {      
      ImageIcon Image = new ImageIcon ("four.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    
    else if (suits == "hearts4")
    {
      ImageIcon Image = new ImageIcon ("fourh.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else  if (suits == "clubs4")
    {
      ImageIcon Image = new ImageIcon ("fourc.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "diamonds4")
    {
      ImageIcon Image = new ImageIcon ("fourd.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);      
      return player1Card;
    }    
    else if (suits == "spades5")     
    {
      ImageIcon Image = new ImageIcon ("five.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "hearts5")
    {
      ImageIcon Image = new ImageIcon ("fiveh.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "clubs5")
    {
      ImageIcon Image = new ImageIcon ("fivec.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "diamonds5")
    {
      ImageIcon Image = new ImageIcon ("fived.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);     
      return player1Card;
    }   
    else if (suits == "spades6")   
    {
      ImageIcon Image = new ImageIcon ("six.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "hearts6")
    {
      ImageIcon Image = new ImageIcon ("sixh.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "clubs6")
    {
      ImageIcon Image = new ImageIcon ("sixc.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "diamonds6") 
    {
      ImageIcon Image = new ImageIcon ("sixd.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);     
      return player1Card;
    }   
    else if (suits == "spades7")
    {
      ImageIcon Image = new ImageIcon ("seven.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "hearts7")
    {
      ImageIcon Image = new ImageIcon ("sevenh.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "clubs7")
    {
      ImageIcon Image = new ImageIcon ("sevenc.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "diamonds7")
    {
      ImageIcon Image = new ImageIcon ("sevend.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);     
      return player1Card;
    }    
    else  if (suits == "spades8")     
    {
      ImageIcon Image = new ImageIcon ("eight.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "hearts8")
    {
      ImageIcon Image = new ImageIcon ("eighth.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "clubs8")
    {
      ImageIcon Image = new ImageIcon ("eightc.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "diamonds8")
    {
      ImageIcon Image = new ImageIcon ("eightd.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);     
      return player1Card;     
    }    
    else if (suits == "spades9")      
    {
      ImageIcon Image = new ImageIcon ("nine.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "hearts9")
    {
      ImageIcon Image = new ImageIcon ("nineh.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "clubs9")
    {
      ImageIcon Image = new ImageIcon ("ninec.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "diamonds9") 
    {
      ImageIcon Image = new ImageIcon ("nined.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);     
      return player1Card;
    }      
    else if (suits == "spades10")        
    {
      ImageIcon Image = new ImageIcon ("ten.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "hearts10")
    {
      ImageIcon Image = new ImageIcon ("tenh.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "clubs10")
    {
      ImageIcon Image = new ImageIcon ("tenc.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "diamonds10")
    {
      ImageIcon Image = new ImageIcon ("tend.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);     
      return player1Card;
    }      
    else if (suits == "spades11")    
    {
      ImageIcon Image = new ImageIcon ("jack.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "hearts11")
    {
      ImageIcon Image = new ImageIcon ("jackh.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "clubs11")
    {
      ImageIcon Image = new ImageIcon ("jackc.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "diamonds11")
    {
      ImageIcon Image = new ImageIcon ("jackd.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);     
      return player1Card;
    }      
    if (suits == "spades12")
    {
      ImageIcon Image = new ImageIcon ("queen.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "hearts12")
    {
      ImageIcon Image = new ImageIcon ("queenh.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "clubs12")
    {
      ImageIcon Image = new ImageIcon ("queenc.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "diamonds12") 
    {
      ImageIcon Image = new ImageIcon ("queend.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);     
      return player1Card;
    }      
    else if (suits == "spades13")        
    {
      ImageIcon Image = new ImageIcon ("king.jpg");          
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "hearts13")
    {
      ImageIcon Image = new ImageIcon ("kingh.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "clubs13")
    {
      ImageIcon Image = new ImageIcon ("kingc.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "diamonds13")
    {
      ImageIcon Image = new ImageIcon ("kingd.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,0);
      player1Card.setSize (100,150);     
      return player1Card;
    }           
    return player1Card; 
  }
  /** 
   * This method displays a card on the screen for the dealer
   * INPUT (parameters): int location (for the location of the image)
   * int String suits (for the card)
   * OUTOUT (return): returns a Jlabel (an image of the card)
   */  
  public JLabel cards1(int location,String suits)
  {
    int xValue = (80*location) + 5;
    if (suits == "spades1")
    {     
      ImageIcon Image = new ImageIcon ("Ace.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "hearts1")
    {
      ImageIcon Image = new ImageIcon ("Aceh.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "clubs1")
    {
      ImageIcon Image = new ImageIcon ("Acec.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits ==  "diamonds1") 
    {
      ImageIcon Image = new ImageIcon ("Aced.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "spades2")
    {     
      ImageIcon Image = new ImageIcon ("two.jpg");
      JLabel player1Card = new JLabel(Image);      
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "hearts2")
    {        
      ImageIcon Image = new ImageIcon ("twoh.jpg");
      JLabel player1Card = new JLabel(Image);      
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);      
      return player1Card;      
    }
    else if (suits == "clubs2")
    {        
      ImageIcon Image = new ImageIcon ("twoc.jpg");
      JLabel player1Card = new JLabel(Image);      
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);      
      return player1Card;      
    }
    else if (suits == "diamonds2") 
    {        
      ImageIcon Image = new ImageIcon ("twod.jpg");
      JLabel player1Card = new JLabel(Image);      
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);      
      return player1Card;      
    }    
    else if (suits == "spades3")
    {     
      ImageIcon Image = new ImageIcon ("three.jpg");
      JLabel player1Card = new JLabel(Image);     
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "hearts3")
    {
      ImageIcon Image = new ImageIcon ("threeh.jpg");
      JLabel player1Card = new JLabel(Image);     
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "clubs3")
    {
      ImageIcon Image = new ImageIcon ("threec.jpg");
      JLabel player1Card = new JLabel(Image);     
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "diamonds3") 
    {
      ImageIcon Image = new ImageIcon ("threed.jpg");
      JLabel player1Card = new JLabel(Image);     
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);      
      return player1Card;
    }    
    else if (suits == "spades4")
    {      
      ImageIcon Image = new ImageIcon ("four.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    
    else if (suits == "hearts4")
    {
      ImageIcon Image = new ImageIcon ("fourh.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else  if (suits == "clubs4")
    {
      ImageIcon Image = new ImageIcon ("fourc.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "diamonds4")
    {
      ImageIcon Image = new ImageIcon ("fourd.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);      
      return player1Card;
    }    
    else if (suits == "spades5")     
    {
      ImageIcon Image = new ImageIcon ("five.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "hearts5")
    {
      ImageIcon Image = new ImageIcon ("fiveh.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "clubs5")
    {
      ImageIcon Image = new ImageIcon ("fivec.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "diamonds5")
    {
      ImageIcon Image = new ImageIcon ("fived.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);     
      return player1Card;
    }   
    else if (suits == "spades6")   
    {
      ImageIcon Image = new ImageIcon ("six.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "hearts6")
    {
      ImageIcon Image = new ImageIcon ("sixh.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "clubs6")
    {
      ImageIcon Image = new ImageIcon ("sixc.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "diamonds6") 
    {
      ImageIcon Image = new ImageIcon ("sixd.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);     
      return player1Card;
    }   
    else if (suits == "spades7")
    {
      ImageIcon Image = new ImageIcon ("seven.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "hearts7")
    {
      ImageIcon Image = new ImageIcon ("sevenh.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "clubs7")
    {
      ImageIcon Image = new ImageIcon ("sevenc.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "diamonds7")
    {
      ImageIcon Image = new ImageIcon ("sevend.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);     
      return player1Card;
    }    
    else  if (suits == "spades8")     
    {
      ImageIcon Image = new ImageIcon ("eight.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "hearts8")
    {
      ImageIcon Image = new ImageIcon ("eighth.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "clubs8")
    {
      ImageIcon Image = new ImageIcon ("eightc.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "diamonds8")
    {
      ImageIcon Image = new ImageIcon ("eightd.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);     
      return player1Card;     
    }    
    else if (suits == "spades9")      
    {
      ImageIcon Image = new ImageIcon ("nine.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "hearts9")
    {
      ImageIcon Image = new ImageIcon ("nineh.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "clubs9")
    {
      ImageIcon Image = new ImageIcon ("ninec.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "diamonds9") 
    {
      ImageIcon Image = new ImageIcon ("nined.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);     
      return player1Card;
    }      
    else if (suits == "spades10")        
    {
      ImageIcon Image = new ImageIcon ("ten.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "hearts10")
    {
      ImageIcon Image = new ImageIcon ("tenh.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "clubs10")
    {
      ImageIcon Image = new ImageIcon ("tenc.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "diamonds10")
    {
      ImageIcon Image = new ImageIcon ("tend.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);     
      return player1Card;
    }      
    else if (suits == "spades11")    
    {
      ImageIcon Image = new ImageIcon ("jack.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "hearts11")
    {
      ImageIcon Image = new ImageIcon ("jackh.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "clubs11")
    {
      ImageIcon Image = new ImageIcon ("jackc.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "diamonds11")
    {
      ImageIcon Image = new ImageIcon ("jackd.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);     
      return player1Card;
    }      
    if (suits == "spades12")
    {
      ImageIcon Image = new ImageIcon ("queen.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "hearts12")
    {
      ImageIcon Image = new ImageIcon ("queenh.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "clubs12")
    {
      ImageIcon Image = new ImageIcon ("queenc.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "diamonds12") 
    {
      ImageIcon Image = new ImageIcon ("queend.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);     
      return player1Card;
    }      
    else if (suits == "spades13")        
    {
      ImageIcon Image = new ImageIcon ("king.jpg");          
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);      
      return player1Card;
    }
    else if (suits == "hearts13")
    {
      ImageIcon Image = new ImageIcon ("kingh.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "clubs13")
    {
      ImageIcon Image = new ImageIcon ("kingc.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);     
      return player1Card;
    }
    else if (suits == "diamonds13")
    {
      ImageIcon Image = new ImageIcon ("kingd.jpg");
      JLabel player1Card = new JLabel(Image);
      player1Card.setLocation (xValue,400);
      player1Card.setSize (100,150);     
      return player1Card;
    }           
    return player1Card; 
  }  
  /** 
   * This method generates a random number from 1-51 (to select a random 
   * value from the card array)
   * INPUT (parameters): none
   * OUTOUT (return): returns a number from 0-51 randomly generated
   */  
  public static int createRandomNum ()
  {
    int number1 = (int)(Math.random()*51);
    return number1;
  }   
  /** 
   * This method calculates the score of both the player 
   * and the dealer
   * INPUT (parameters): the random number calculated by the method above
   * OUTOUT (return): returns the score as an integer
   */   
  public static int returnScore (int randomNum)
  {
    int score = 0;
    if (randomNum == 0 ||randomNum == 13 ||randomNum == 26 ||randomNum == 39)
      score = 11;
    else if (randomNum == 1 ||randomNum == 14 ||randomNum == 27 ||randomNum == 40)
      score = 2;
    else if (randomNum == 2 ||randomNum == 15 ||randomNum == 28 ||randomNum == 41)
      score = 3;
    else if (randomNum == 3 ||randomNum == 16 ||randomNum == 29 ||randomNum == 42)
      score = 4;
    else if (randomNum == 4 ||randomNum == 17 ||randomNum == 30 ||randomNum == 43)
      score = 5;
    else if (randomNum == 5 ||randomNum == 18 ||randomNum == 31 ||randomNum == 44)
      score = 6;
    else if (randomNum == 6 ||randomNum == 19 ||randomNum == 32 ||randomNum == 45)
      score = 7;
    else if (randomNum == 7 ||randomNum == 20 ||randomNum == 33 ||randomNum == 46)
      score = 8;
    else if (randomNum == 8 ||randomNum == 21 ||randomNum == 34 ||randomNum == 47)
      score = 9;
    else if (randomNum == 9 ||randomNum == 22 ||randomNum == 35 ||randomNum == 48)
      score = 10;
    else if (randomNum == 10 ||randomNum == 23 ||randomNum == 36 ||randomNum == 49)
      score = 10;
    else if (randomNum == 11 ||randomNum == 24 ||randomNum == 37 ||randomNum == 50)
      score = 10;
    else if (randomNum == 12 ||randomNum == 25 ||randomNum == 38 ||randomNum == 51)
      score = 10;
    return score;    
  }  
  /** 
   * This method calculates the winner 
   * INPUT (parameters): int playerOneScore and int playerTwoScore
   * OUTOUT (return): returns the winner as a string i.e "The Dealer Wins!"
   */  
  public static String winnerCalculation (int playerOneScore, int playerTwoScore)
  {
    String winner = "";
    if ((playerOneScore > 21 && playerTwoScore > 21)|| (playerOneScore == playerTwoScore))
      winner = "No Real Winner";
    else if (playerOneScore > 21)  
      winner = " Dealer wins!";
    else if (playerTwoScore > 21)
      winner = " Player wins! ";            
    else if (playerOneScore == 21)
      winner = " Player Wins! " ;
    else if (playerTwoScore == 21)
      winner = " Dealer Wins! " ;    
    else if (playerOneScore < 21 && playerTwoScore < 21)
    {
      if (playerOneScore> playerTwoScore)  // Player One's score is higher than Player Two's score (but both are still under 21)
        winner = " Player Wins! ";
      else
        winner = " Dealer Wins! ";
    }    
    return winner; 
  }
  
  /** 
   * The instructions method
   * This method prints out the instructions of the game
   * before the JFrame is displayed
   * INPUT (parameters): none
   * OUTOUT (return): none
   */  
  
  public static void printInstructions()
  {
    System.out.println("\n\nInstructions for Black Jack:");
    System.out.println("\nBlackjack is played with one standard 52-card deck, with each denomination assigned a point value.");
    System.out.println("The cards 2 through 10 are worth their face value. Kings, queens, and jacks are each worth 10, and aces are used as 11.");
    System.out.println("The object of the game is for the player to draw cards totaling as close to 21 as possible, without going over, than the dealer's cards.");
    System.out.println("Hit: If you hit, you take another card in the hope of getting closer to 21.");
    System.out.println("If the player's total score exceeds 21 after hitting, the player is said to \"bust\" and loses. ");
    System.out.println("Stand: If you stand, you elect to draw no more cards in the hope that the current total will beat the dealer. ");
    System.out.println("\n\n Please enter 1 to start the game.");   
  }
  
  int playerOneScore = 0, playerTwoScore = 0, finalScore;
  int counter = 0,counter1 = 0,startNum;
  boolean pressedStand, pressedStand2,isAllowed,startGame; 
  JPanel titlePanel,gamePanel;
  JLabel welcomeLabel,titlePics,commandLabel,player1Card,scoreLabel,playerTitle,dealerTitle,turnLabel,currentCard,score1,score2;
  JButton newGameButton,endGameButton,hitButton,hitButton2,standButton,standButton2;
  String[] cardArray = {"spades1","spades2","spades3","spades4","spades5","spades6","spades7","spades8","spades9","spades10","spades11","spades12","spades13",
    "hearts1","hearts2","hearts3","hearts4","hearts5","hearts6","hearts7","hearts8","hearts9","hearts10","hearts11","hearts12","hearts13",
    "diamonds1","diamonds2","diamonds3","diamonds4","diamonds5","diamonds6","diamonds7","diamonds8","diamonds9","diamonds10","diamonds11","diamonds12","diamonds13",
    "clubs1","clubs2","clubs3","clubs4","clubs5","clubs6","clubs7","clubs8","clubs9","clubs10","clubs11","clubs12","clubs13"};
  
  /** 
   * This method creates the content pane that will be a part of the frame,
   * including the JLabels, JPanels and the JButtons
   * INPUT (parameters): none
   * OUTOUT (return): the main JPanel object that includes everything
   */    
  public JPanel createContentPane ()
  {
    
    JPanel totalGUI = new JPanel();      // the main panel
    totalGUI.setBackground(Color.BLACK);
    totalGUI.setLayout(null);
    
    printInstructions();
    startNum = In.getInt();
    if (startNum == 1)        
      startGame = true;
    else
      startGame = false;
    while (!startGame)
    {
      System.out.println("Please enter 1 to start the game");
      startNum = In.getInt();
      if (startNum == 1)        
        startGame = true;
      else
        startGame = false;            
    }
    if (startGame)    
    {    
      titlePanel = new JPanel();  // a panel where the title will be displayed   
      titlePanel.setLayout(null);
      titlePanel.setLocation(0, 0);
      titlePanel.setSize(1600, 150);
      Color titlePanelColor = new Color (238,130,238);
      titlePanel.setBackground(titlePanelColor);
      totalGUI.add(titlePanel);                         // this panel is added to the main panel    
      
      gamePanel = new JPanel();   // game panel (where the cards will be displayed)
      gamePanel.setLayout(null);
      gamePanel.setLocation(0, 150);            
      gamePanel.setSize (950,650);    
      gamePanel.setBackground(Color.BLACK);
      totalGUI.add(gamePanel);                
      
      newGameButton = new JButton("Start");  // a button to start the game 
      newGameButton.setLocation(800, 155);
      newGameButton.setSize(120, 30);
      newGameButton.addActionListener(this);
      gamePanel.add(newGameButton);   // this button is added to the game panel
      
      endGameButton = new JButton("End Game");  // a button to end the game 
      endGameButton.setLocation(800, 195);
      endGameButton.setSize(120, 30);
      endGameButton.addActionListener(this);
      gamePanel.add(endGameButton);   
      
      hitButton = new JButton("Hit! (Player)");   // a hit button for the player 
      hitButton.setLocation(800, 235);
      hitButton.setSize(120, 30);
      hitButton.addActionListener(this); 
      gamePanel.add(hitButton);   
      
      hitButton2 = new JButton("Hit! (Dealer)");  // a hit button for the dealer 
      hitButton2.setLocation(800, 275);
      hitButton2.setSize(120, 30);
      hitButton2.addActionListener(this);
      gamePanel.add(hitButton2);    
      
      standButton = new JButton("Stand (Player)");  // a stand button for the player
      standButton.setLocation(800, 315);
      standButton.setSize(120, 30);
      standButton.addActionListener(this);
      gamePanel.add(standButton);    
      
      standButton2 = new JButton("Stand (Dealer)"); // a stand button for the dealer
      standButton2.setLocation(800, 355);
      standButton2.setSize(120, 30);
      standButton2.addActionListener(this);
      gamePanel.add(standButton2);   
      
      
      playerTitle = new JLabel ("Player"); // label that displays the word "Player" on the screen                          
      playerTitle.setFont (new Font ("Comic Sans MS" , Font.BOLD, 20));
      Color playerTitleColor = new Color (0,250,154);
      playerTitle.setForeground (playerTitleColor);
      playerTitle.setLocation (550,150);
      playerTitle.setSize (100,30);
      gamePanel.add (playerTitle);     
      
      dealerTitle = new JLabel ("Dealer");  // label that displays the word "Dealer" on the screen     
      dealerTitle.setFont (new Font ("Comic Sans MS" , Font.BOLD, 20));
      Color dealerTitleColor = new Color (0,250,154);
      dealerTitle.setForeground (dealerTitleColor);
      dealerTitle.setLocation (550,350);
      dealerTitle.setSize (100,30);
      gamePanel.add (dealerTitle);   
      
      
      scoreLabel = new JLabel ("");          // label that displays the score 
      scoreLabel.setFont(new Font ("Comic Sans MS", Font.BOLD, 30));
      Color scoreLabelColor = new Color (255,20,147);
      scoreLabel.setForeground(scoreLabelColor);
      scoreLabel.setLocation (200,130);
      scoreLabel.setSize(400,300);
      gamePanel.add(scoreLabel);  
      
      
      turnLabel = new JLabel ("");  // label that informs the users whose turn it is 
      turnLabel.setFont(new Font ("Comic Sans MS", Font.BOLD, 20));
      Color turnLabelColor = new Color (255,127,80);
      turnLabel.setForeground(turnLabelColor);
      turnLabel.setLocation (250,200);
      turnLabel.setSize(300,100);
      gamePanel.add(turnLabel);  
      
      score1 = new JLabel ("");  
      score1.setFont(new Font ("Comic Sans MS", Font.BOLD, 20));
      Color score1Color = new Color (255,127,80);
      score1.setForeground(score1Color);
      score1.setLocation (660,135);
      score1.setSize(100,60);
      gamePanel.add(score1);
      
      score2 = new JLabel ("");  
      score2.setFont(new Font ("Comic Sans MS", Font.BOLD, 20));
      Color score2Color = new Color (255,127,80);
      score2.setForeground(score2Color);
      score2.setLocation (660,335);
      score2.setSize(100,60);
      gamePanel.add(score2);     
      
      ImageIcon titleIcon1 = new ImageIcon ("BlackJack.jpg");
      titlePics = new JLabel(titleIcon1);  // an image for decor 
      titlePics.setLocation (0,0);
      titlePics.setSize (150,150);
      titlePanel.add(titlePics); // image added to title label 
      
      welcomeLabel =  new JLabel("Welcome To Casino Royale!");
      welcomeLabel.setFont(new Font ("Monotype Corsiva", Font.BOLD, 40));
      Color titleColor = new Color (0,255,255);  // title 
      welcomeLabel.setForeground(titleColor);
      welcomeLabel.setLocation (245,0);
      welcomeLabel.setSize(700,100);
      titlePanel.add(welcomeLabel); 
      
      commandLabel = new JLabel ("Please press \"Start\" to start a game of Black Jack!");
      commandLabel.setFont(new Font ("Comic Sans MS", Font.BOLD, 16));
      Color commandColor = new Color (0,0,0);
      commandLabel.setForeground(commandColor);  // instruction to user on how to start the game 
      commandLabel.setLocation (250,101);
      commandLabel.setSize(700,44);
      titlePanel.add(commandLabel); 
      
      ImageIcon titleIcon3 = new ImageIcon ("Swirl.jpg");
      titlePics = new JLabel(titleIcon3);  // an image for decor 
      titlePics.setLocation (783,0);
      titlePics.setSize (150,150);
      titlePanel.add(titlePics);  
      
      totalGUI.setOpaque(true);
      return totalGUI;              // return the final JPanel 
      
    }
    return totalGUI; 
  }
  
  /** 
   * This method responds with a JLabel when the user presses a button.    
   * INPUT (parameters): none
   * OUTOUT (return): none
   */ 
  
  public void actionPerformed(ActionEvent e) 
  {
    if(e.getSource() == newGameButton) // if the start button is pressed 
    {
      music();
      turnLabel.setText ("Anyone can go first");  // deals the first card for the player and the dealer and informs the user that anyone can go first       
      
      int cardNumber = createRandomNum();   //stores the number generated by the createRandomNum method in a variable
      String suit = cardArray[cardNumber];  // stores the element in the cardNumber index of the card array in the varaible suit
      
      
      currentCard = cards(counter,suit); // sends counter and suit to the cards method and stores the JLabel it returns in a variable
      gamePanel.add (currentCard);      // adds the JLabel to the game panel 
      gamePanel.repaint();             // repaints the game panel
      
      playerOneScore = playerOneScore + returnScore(cardNumber); // increments player one score depending on their card
      score1.setText("" + playerOneScore);
      cardArray[cardNumber] = "";   // since one card froma deck is gone, one index in the card array is now empty
      
      cardNumber = createRandomNum();  
      suit = cardArray[cardNumber]; // card for dealer
      
      if (suit=="")   // if the card is already dealt      
        isAllowed = false;      
      else       
        isAllowed = true;
      
      
      while (isAllowed == false)  // till it generates a card that is not dealt already
      {
        cardNumber = createRandomNum();
        suit = cardArray[cardNumber];
        
        if (suit=="")        
          isAllowed = false;        
        else         
          isAllowed = true;
        
      }      
      if (isAllowed)  // when a new card is chosen 
      {        
        cardArray[cardNumber] = ""; 
        currentCard = cards1(counter1,suit);
        gamePanel.add (currentCard);
        playerTwoScore = playerTwoScore + returnScore(cardNumber);  
        score2.setText("" + playerTwoScore);
        gamePanel.repaint();
      }
      newGameButton.removeActionListener(this);
    }
    else if(e.getSource() == hitButton)   // if the player presses the hit button 
    {
      if (pressedStand2 == false)  // if dealer has not pressed stand 
        turnLabel.setText ("Dealer's Turn"); // it is dealers turn 
      else
        turnLabel.setText ("Player's turn again");      
      
      int cardNumber = createRandomNum();
      String suit = cardArray[cardNumber];      
      counter += 2; /* increments the counter variable value so the new card is not placed on top of the previous card
       (moves the x value of the location of the image)*/
      
      if (suit=="")  // checks if the card has been dealt already or not     
        isAllowed = false;      
      else       
        isAllowed = true;
      
      
      while (isAllowed == false)
      {
        cardNumber =createRandomNum();
        suit = cardArray[cardNumber];
        
        if (suit=="")        
          isAllowed = false;        
        else       
          isAllowed = true;         
      }      
      if (isAllowed)
      {        
        cardArray[cardNumber] = "";     
        currentCard = cards(counter,suit);
        gamePanel.add (currentCard);        // generates another card for the player 
        playerOneScore = playerOneScore + returnScore(cardNumber);  // calcualtes players score 
        score1.setText("" + playerOneScore);
        if (playerOneScore > 21)
          scoreLabel.setText (winnerCalculation(playerOneScore,playerTwoScore) + " " + playerOneScore + " - " + playerTwoScore);
        gamePanel.repaint();        
      }
    } 
    
    else if(e.getSource() == hitButton2)      // if dealer presses hit button              
    {
      if (pressedStand == false)               // if the player has not pressed stand             
        turnLabel.setText ("Player's Turn");   // it is the player's turn 
      else if  (pressedStand == true)       
        turnLabel.setText ("Dealer's turn again");        
      
      int cardNumber = createRandomNum();
      String suit = cardArray[cardNumber];
      counter1 += 2;  /* increments the counter1 variable value (changes the x value of the location
       of the card for the dealer's side of the JFrame)*/    
      
      if (suit=="")      
        isAllowed = false;      
      else       
        isAllowed = true;
      
      while (isAllowed == false)
      {
        cardNumber =createRandomNum();
        suit = cardArray[cardNumber];
        
        if (suit=="")        
          isAllowed = false;        
        else         
          isAllowed = true;          
      }      
      if (isAllowed)
      {        
        cardArray[cardNumber] = "";     
        currentCard = cards1(counter1,suit);
        gamePanel.add (currentCard);        
        playerTwoScore = playerTwoScore + returnScore(cardNumber); 
        score2.setText("" + playerTwoScore);
        if (playerTwoScore > 21)
          scoreLabel.setText (winnerCalculation(playerOneScore,playerTwoScore) + " " + playerOneScore + " - " + playerTwoScore);
        gamePanel.repaint();        
      }
    }      
    else if(e.getSource() == endGameButton)  // if the end button is pressed
    {      
      scoreLabel.setText (winnerCalculation(playerOneScore,playerTwoScore) + " " + playerOneScore + " - " + playerTwoScore); // displays the winner based on the score  
      hitButton.removeActionListener(this);
      hitButton2.removeActionListener(this);
      standButton.removeActionListener(this);
      standButton2.removeActionListener(this);
    }  
    else if(e.getSource() == standButton)  // if the player presses the stand button
    {   
      pressedStand = true; 
      if (pressedStand && pressedStand2)   // if both (the dealer and the player ) have pressed stand 
      {
        scoreLabel.setText (winnerCalculation(playerOneScore,playerTwoScore) + " " + playerOneScore + " - " + playerTwoScore);//the game is ended & score is displayed 
        hitButton2.removeActionListener(this);
        hitButton.removeActionListener(this);  
      }
      else if (pressedStand2 == false)  // else it is the dealer turn 
      {
        turnLabel.setText ("Dealer's Turn");
        hitButton.removeActionListener(this);
      }
      
    }  
    else if(e.getSource() == standButton2)  // if the dealer presses the stand button
    { 
      pressedStand2 = true;
      if (pressedStand && pressedStand2) // if both (the dealer and the player ) have pressed stand
      {
        hitButton2.removeActionListener(this);
        hitButton.removeActionListener(this); 
        scoreLabel.setText (winnerCalculation(playerOneScore,playerTwoScore) + " " + playerOneScore + " - " + playerTwoScore); //the game is ended & the score is displayed
      }      
      else 
      {
        turnLabel.setText ("Player's Turn"); // else it is the player's turn   
        hitButton2.removeActionListener(this);
      }
    }  
  }  
  
  /** 
   * This method creates plays background music when the user presses
   * start on the JFrame
   * INPUT (parameters): none
   * OUTOUT (return): none
   */ 
  
  public static void music()
  {
    InputStream song;
    try
    {
      song = new FileInputStream(new File ("Poker Face- Lady Gaga.wav"));
      AudioStream audio = new AudioStream(song);
      AudioPlayer.player.start(audio);
    }
    catch(Exception e)
    {
      System.out.println("File could not be loaded");
    }
  } 
  
  /** 
   * This method creates a JFrame where everything will be displayed   
   * INPUT (parameters): none
   * OUTOUT (return): none
   */ 
  
  public static void createAndShowGUI()
  {
    JFrame frame = new JFrame("Black Jack"); // title of the JFrame                                          
    BlackJack demo = new BlackJack();     //create and set up the content pane  
    frame.setContentPane(demo.createContentPane());    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // what happens if the user presses the x button
    frame.setSize(950, 760);    
    frame.setVisible(true);  // ensure frame is visible 
  } 
  
  /** 
   * The main method 
   * - displays the frame 
   * INPUT (parameters): none
   * OUTOUT (return): none
   */   
  public static void main(String[] args) {
    
    //Schedule a job for the event-dispatching thread:
    //creating and showing this application's GUI.
    
    SwingUtilities.invokeLater(new Runnable() {
      public void run() 
      {        
        createAndShowGUI();
      }
    });
  }
}

