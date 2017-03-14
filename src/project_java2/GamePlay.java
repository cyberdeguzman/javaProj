/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_java2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author Freddie
 */
public class GamePlay extends javax.swing.JFrame {

    /**
     * Creates new form GamePlay
     */
    int fakecard = 30; // test card

    //Lifepoint Properties
    int lifePoint = 1000;
    int t1LoserLP = 100;
    int t2LoserLP = 200;
    int t3LoserLP = 300;
    int jokLoserLP = 500;
    int pipLoserLP = 250;
    int lifePointOpponent = 1000;
    int lifebar1 = 270;
    int lifebar2 = 270;
    
    String opponentChoice = "";
    String[] myStringArray = {"r1","s1","p1","r2","s2","p2","r3","s3","p3","jok","pip"};
    private Random rand = new Random();
    
    int t1minus = 27;
    int t2minus = 54;
    int t3minus = 81;
    int jokminus = 135;
    int pipminus = 68;
    
    //Deck Properties
    public int [] deck = new int [32]; 
    int drawn = 0;
    int cards=0;
    int turndraw = 0;
    int turn = 0;
    int error = 0;
    int nullop = 0;
    int [] handval = new int [5];
    int handzero = 0;
    int playVal = 60;
    
    //battle log properties
    String battleLog1 = null;
    
    public GamePlay() {
        initComponents();
        lifePoints();
        handval();
        cardval();
        Draw();
    }
    
    //LifePoints
    public void lifePoints(){
    PlayerLifePoints.setText(String.valueOf(lifePoint));
    if(lifePoint == 0)
        {
            //Main_Menu mm = new Main_Menu();
            //mm.show(true);
            this.dispose();
        }
    }
    
    //draw cards
    //change value of handVal[] to deck[index]
    private void Draw(){
    turndraw = 0;
    int temp = 31;
    int index = 0;

    if(cards > 0)
    {
    try
        {
    while (turndraw == 0) 
        {
        for (int x = 0; x < 5; x++)
            {
                for (int i = 0; i < 5; i++) 
                {
                Random randoms = new Random();
                index = randoms.nextInt(temp +1);
                if(index == deck[index])
                        {
                    if (handval[x] == 60)
                                {
                                handval[x] = index;
                                //Status.setText("Hand" + x + "Has value of" + deck[index]) ;
                                deck [index] = 53;
                                turndraw = 1;
                                }
                        }
                }
            }
        }
    }
    
    catch(Exception e)
        {
        error =+1;
        Error_Val.setText(String.valueOf(error));
        }
    }
    cardvalup();
    }
    
    public String getRandom()
    {
        return myStringArray[rand.nextInt(myStringArray.length)];
    }
    
    //initialize card values
    private void cardval(){
        for (int i = 0; i < 32; i++) {
            deck[i] = i;
            Status.setText(Status.getText() + String.valueOf(deck[i]));
            cards = 32;
        }
    }
    
    
    //initialize hand value
    private void handval(){
        for (int i = 0; i < 5; i++) {
            handval[i] = 60;
        }
    }
    
    private void searchnullcardholder(){
        
    }
    
    //updates card and hand values
    private void cardvalup(){
        String cardH = " ";
        status2.setText(" ");
        for (int i = 0; i < 32; i++) {
            status2.setText(status2.getText() + " " + String.valueOf(deck[i]));
        }
        
        Hand1.setText(String.valueOf(cardType(cardH, 0)));
        Hand2.setText(String.valueOf(cardType(cardH, 1)));
        Hand3.setText(String.valueOf(cardType(cardH, 2)));
        Hand4.setText(String.valueOf(cardType(cardH, 3)));
        Hand5.setText(String.valueOf(cardType(cardH, 4)));
        
        Hand1.setForeground(Color.BLACK);
        Hand2.setForeground(Color.BLACK);
        Hand3.setForeground(Color.BLACK);
        Hand4.setForeground(Color.BLACK);
        Hand5.setForeground(Color.BLACK);
        
        //playHand.setText(String.valueOf(playVal));
        iconvalup();
    }
    
    private void iconvalup(){
        //Rock I
        if(Hand1.getText().equals("Rock I")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierItemplate.png"));
            Hand1.setIcon(ii);
        }
        if(Hand2.getText().equals("Rock I")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierItemplate.png"));
            Hand2.setIcon(ii);
        }
        if(Hand3.getText().equals("Rock I")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierItemplate.png"));
            Hand3.setIcon(ii);
        }
        if(Hand4.getText().equals("Rock I")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierItemplate.png"));
            Hand4.setIcon(ii);
        }
        if(Hand5.getText().equals("Rock I")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierItemplate.png"));
            Hand5.setIcon(ii);
        }
        
        //Paper I
        if(Hand1.getText().equals("Paper I")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierItemplate.png"));
            Hand1.setIcon(ii);
        }
        if(Hand2.getText().equals("Paper I")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierItemplate.png"));
            Hand2.setIcon(ii);
        }
        if(Hand3.getText().equals("Paper I")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierItemplate.png"));
            Hand3.setIcon(ii);
        }
        if(Hand4.getText().equals("Paper I")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierItemplate.png"));
            Hand4.setIcon(ii);
        }
        if(Hand5.getText().equals("Paper I")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierItemplate.png"));
            Hand5.setIcon(ii);
        }
        
        //Scissors I
        if(Hand1.getText().equals("Scissors I")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierItemplate.png"));
            Hand1.setIcon(ii);
        }
        if(Hand2.getText().equals("Scissors I")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierItemplate.png"));
            Hand2.setIcon(ii);
        }
        if(Hand3.getText().equals("Scissors I")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierItemplate.png"));
            Hand3.setIcon(ii);
        }
        if(Hand4.getText().equals("Scissors I")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierItemplate.png"));
            Hand4.setIcon(ii);
        }
        if(Hand5.getText().equals("Scissors I")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierItemplate.png"));
            Hand5.setIcon(ii);
        }
        
        //Rock II
        if(Hand1.getText().equals("Rock II")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIItemplate.png"));
            Hand1.setIcon(ii);
        }
        if(Hand2.getText().equals("Rock II")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIItemplate.png"));
            Hand2.setIcon(ii);
        }
        if(Hand3.getText().equals("Rock II")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIItemplate.png"));
            Hand3.setIcon(ii);
        }
        if(Hand4.getText().equals("Rock II")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIItemplate.png"));
            Hand4.setIcon(ii);
        }
        if(Hand5.getText().equals("Rock II")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIItemplate.png"));
            Hand5.setIcon(ii);
        }
        
        //Paper II
        if(Hand1.getText().equals("Paper II")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIItemplate.png"));
            Hand1.setIcon(ii);
        }
        if(Hand2.getText().equals("Paper II")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIItemplate.png"));
            Hand2.setIcon(ii);
        }
        if(Hand3.getText().equals("Paper II")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIItemplate.png"));
            Hand3.setIcon(ii);
        }
        if(Hand4.getText().equals("Paper II")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIItemplate.png"));
            Hand4.setIcon(ii);
        }
        if(Hand5.getText().equals("Paper II")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIItemplate.png"));
            Hand5.setIcon(ii);
        }
        
        //Scissors II
        if(Hand1.getText().equals("Scissors II")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIItemplate.png"));
            Hand1.setIcon(ii);
        }
        if(Hand2.getText().equals("Scissors II")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIItemplate.png"));
            Hand2.setIcon(ii);
        }
        if(Hand3.getText().equals("Scissors II")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIItemplate.png"));
            Hand3.setIcon(ii);
        }
        if(Hand4.getText().equals("Scissors II")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIItemplate.png"));
            Hand4.setIcon(ii);
        }
        if(Hand5.getText().equals("Scissors II")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIItemplate.png"));
            Hand5.setIcon(ii);
        }
        //Rock III
        if(Hand1.getText().equals("Rock III")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIIItemplate.png"));
            Hand1.setIcon(ii);
        }
        if(Hand2.getText().equals("Rock III")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIIItemplate.png"));
            Hand2.setIcon(ii);
        }
        if(Hand3.getText().equals("Rock III")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIIItemplate.png"));
            Hand3.setIcon(ii);
        }
        if(Hand4.getText().equals("Rock III")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIIItemplate.png"));
            Hand4.setIcon(ii);
        }
        if(Hand5.getText().equals("Rock III")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIIItemplate.png"));
            Hand5.setIcon(ii);
        }
        
        //Paper III
        if(Hand1.getText().equals("Paper III")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIIItemplate.png"));
            Hand1.setIcon(ii);
        }
        if(Hand2.getText().equals("Paper III")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIIItemplate.png"));
            Hand2.setIcon(ii);
        }
        if(Hand3.getText().equals("Paper III")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIIItemplate.png"));
            Hand3.setIcon(ii);
        }
        if(Hand4.getText().equals("Paper III")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIIItemplate.png"));
            Hand4.setIcon(ii);
        }
        if(Hand5.getText().equals("Paper III")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIIItemplate.png"));
            Hand5.setIcon(ii);
        }
        
        //Scissors III
        if(Hand1.getText().equals("Scissors III")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIIItemplate.png"));
            Hand1.setIcon(ii);
        }
        if(Hand2.getText().equals("Scissors III")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIIItemplate.png"));
            Hand2.setIcon(ii);
        }
        if(Hand3.getText().equals("Scissors III")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIIItemplate.png"));
            Hand3.setIcon(ii);
        }
        if(Hand4.getText().equals("Scissors III")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIIItemplate.png"));
            Hand4.setIcon(ii);
        }
        if(Hand5.getText().equals("Scissors III")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIIItemplate.png"));
            Hand5.setIcon(ii);
        }
        //Joker
        if(Hand1.getText().equals("Joker")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/Joker.png"));
            Hand1.setIcon(ii);
        }
        if(Hand2.getText().equals("Joker")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/Joker.png"));
            Hand2.setIcon(ii);
        }
        if(Hand3.getText().equals("Joker")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/Joker.png"));
            Hand3.setIcon(ii);
        }
        if(Hand4.getText().equals("Joker")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/Joker.png"));
            Hand4.setIcon(ii);
        }
        if(Hand5.getText().equals("Joker")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/Joker.png"));
            Hand5.setIcon(ii);
        }
        
        //Pip
        
        
        
        if(Hand1.getText().equals("Pip")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/Pip.png"));
            Hand1.setIcon(ii);
        }
        if(Hand2.getText().equals("Pip")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/Pip.png"));
            Hand2.setIcon(ii);
        }
        if(Hand3.getText().equals("Pip")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/Pip.png"));
            Hand3.setIcon(ii);
        }
        if(Hand4.getText().equals("Pip")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/Pip.png"));
            Hand4.setIcon(ii);
        }
        if(Hand5.getText().equals("Pip")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/Pip.png"));
            Hand5.setIcon(ii);
        }
        
        
        
        //playhand
        if( playHand.getText().equals("Paper I")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierItemplate.png"));
             playHand.setIcon(ii);
        }
        if( playHand.getText().equals("Rock I")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierItemplate.png"));
             playHand.setIcon(ii);
        }
        if( playHand.getText().equals("Scissors I")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierItemplate.png"));
             playHand.setIcon(ii);
        }
        if( playHand.getText().equals("Paper II")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIItemplate.png"));
             playHand.setIcon(ii);
        }
        if( playHand.getText().equals("Rock II")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIItemplate.png"));
             playHand.setIcon(ii);
        }
        if( playHand.getText().equals("Scissors II")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIItemplate.png"));
             playHand.setIcon(ii);
        }
        if( playHand.getText().equals("Paper III")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIIItemplate.png"));
             playHand.setIcon(ii);
        }
        if( playHand.getText().equals("Rock III")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIIItemplate.png"));
             playHand.setIcon(ii);
        }
        if( playHand.getText().equals("Scissors III")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIIItemplate.png"));
             playHand.setIcon(ii);
        }
        if( playHand.getText().equals("Joker")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/Joker.png"));
             playHand.setIcon(ii);
        }
        if( playHand.getText().equals("Pip")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/Pip.png"));
             playHand.setIcon(ii);
        }

        //opponHand
        if( opponentChoice.equals("p1")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierItemplate.png"));
             opponHand.setIcon(ii);
        }
        if( opponentChoice.equals("r1")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierItemplate.png"));
             opponHand.setIcon(ii);
        }
        if( opponentChoice.equals("s1")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierItemplate.png"));
             opponHand.setIcon(ii);
        }
        if( opponentChoice.equals("p2")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIItemplate.png"));
             opponHand.setIcon(ii);
        }
        if( opponentChoice.equals("r2")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIItemplate.png"));
             opponHand.setIcon(ii);
        }
        if( opponentChoice.equals("s2")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIItemplate.png"));
             opponHand.setIcon(ii);
        }
        if( opponentChoice.equals("p3")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIIItemplate.png"));
             opponHand.setIcon(ii);
        }
        if( opponentChoice.equals("r3")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIIItemplate.png"));
             opponHand.setIcon(ii);
        }
        if( opponentChoice.equals("s3")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/TierIIItemplate.png"));
             opponHand.setIcon(ii);
        }
        if( opponentChoice.equals("jok")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/Joker.png"));
             opponHand.setIcon(ii);
        }
        if( opponentChoice.equals("jok")){
            ImageIcon ii = new ImageIcon(getClass().getResource("/project_java2/Images/RealDeck/Pip.png"));
             opponHand.setIcon(ii);
        }



    }
    
    //play cards
    private void play()
    {
//        if(playVal != 60){
//            if(fakecard > playVal)
//            {
//            Status.setText("You lost");            
//            battleLogLose();
//            lifePoint -= loserLP;
//            lifePoints();
//            
//            }
//            else
//            {
//            Status.setText("You win");
//            }
//        }
//        loseState();
        opponentChoice = getRandom();
        iconvalup();
        String playChoice = stringChoice();
        
        if(playChoice.equals(opponentChoice))
        {
            Status.setText("It's a tie!!");
        }
        else if(!playChoice.equals(opponentChoice))
        {
            //r1 win
            if(playChoice == "r1" && opponentChoice == "s1"){
                Status.setText("You Win!");
                battleLogWin(t1LoserLP);
                lifePointOpponent -= t1LoserLP;
                lifePoints();
            }
            //r1 lose
            else if(playChoice == "r1" && opponentChoice == "p1"){
                Status.setText("You Lose!");
                battleLogLose(t1LoserLP);
                lifePoint -= t1LoserLP;
                lifePoints();
            }else if(playChoice == "r1" && opponentChoice == "r2"){
                Status.setText("You Lose!");
                battleLogLose(t2LoserLP);
                lifePoint -= t2LoserLP;
                lifePoints();
            }else if(playChoice == "r1" && opponentChoice == "p2"){
                Status.setText("You Lose!");
                
                
                
                battleLogLose(t2LoserLP);
                lifePoint -= t2LoserLP;
                lifePoints();
            }else if(playChoice == "r1" && opponentChoice == "s2"){
                Status.setText("You Lose!");
                battleLogLose(t2LoserLP);
                lifePoint -= t2LoserLP;
                lifePoints();
            }else if(playChoice == "r1" && opponentChoice == "r3"){
                Status.setText("You Lose!");
                battleLogLose(t3LoserLP);
                lifePoint -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "r1" && opponentChoice == "p3"){
                Status.setText("You Lose!");
                battleLogLose(t3LoserLP);
                lifePoint -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "r1" && opponentChoice == "s3"){
                Status.setText("You Lose!");
                battleLogLose(t3LoserLP);
                lifePoint -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "r1" && opponentChoice == "pip"){
                Status.setText("You Lose!");
                battleLogLose(pipLoserLP);
                lifePoint -= pipLoserLP;
                lifePoints();
            }
            
            //p1 win
            else if(playChoice == "p1" && opponentChoice == "r1"){
                Status.setText("You Win!");
                battleLogWin(t1LoserLP);
                lifePointOpponent -= t1LoserLP;
                lifePoints();
            }
            //p1 lose
            else if(playChoice == "p1" && opponentChoice == "s1"){
                Status.setText("You Lose!");
                battleLogLose(t1LoserLP);
                lifePoint -= t1LoserLP;
                lifePoints();
            }else if(playChoice == "p1" && opponentChoice == "r2"){
                Status.setText("You Lose!");
                battleLogLose(t2LoserLP);
                lifePoint -= t2LoserLP;
                lifePoints();
            }else if(playChoice == "p1" && opponentChoice == "p2"){
                Status.setText("You Lose!");
                battleLogLose(t2LoserLP);
                lifePoint -= t2LoserLP;
                lifePoints();
            }else if(playChoice == "p1" && opponentChoice == "s2"){
                Status.setText("You Lose!");
                battleLogLose(t2LoserLP);
                lifePoint -= t2LoserLP;
                lifePoints();
            }else if(playChoice == "p1" && opponentChoice == "r3"){
                Status.setText("You Lose!");
                battleLogLose(t3LoserLP);
                lifePoint -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "p1" && opponentChoice == "p3"){
                Status.setText("You Lose!");
                battleLogLose(t3LoserLP);
                lifePoint -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "p1" && opponentChoice == "s3"){
                Status.setText("You Lose!");
                battleLogLose(t3LoserLP);
                lifePoint -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "p1" && opponentChoice == "pip"){
                Status.setText("You Lose!");
                battleLogLose(pipLoserLP);
                lifePoint -= pipLoserLP;
                lifePoints();
            }
            
            //s1 win
            else if(playChoice == "s1" && opponentChoice == "p1"){
                Status.setText("You Win!");
                battleLogWin(t1LoserLP);
                lifePointOpponent -= t1LoserLP;
                lifePoints();
            }
            //s1 lose
            else if(playChoice == "s1" && opponentChoice == "r1"){
                Status.setText("You Lose!");
                battleLogLose(t1LoserLP);
                lifePoint -= t1LoserLP;
                lifePoints();
            }else if(playChoice == "s1" && opponentChoice == "r2"){
                Status.setText("You Lose!");
                battleLogLose(t2LoserLP);
                lifePoint -= t2LoserLP;
                lifePoints();
            }else if(playChoice == "s1" && opponentChoice == "p2"){
                Status.setText("You Lose!");
                battleLogLose(t2LoserLP);
                lifePoint -= t2LoserLP;
                lifePoints();
            }else if(playChoice == "s1" && opponentChoice == "s2"){
                Status.setText("You Lose!");
                battleLogLose(t2LoserLP);
                lifePoint -= t2LoserLP;
                lifePoints();
            }else if(playChoice == "s1" && opponentChoice == "r3"){
                Status.setText("You Lose!");
                battleLogLose(t3LoserLP);
                lifePoint -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "s1" && opponentChoice == "p3"){
                Status.setText("You Lose!");
                battleLogLose(t3LoserLP);
                lifePoint -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "s1" && opponentChoice == "s3"){
                Status.setText("You Lose!");
                battleLogLose(t3LoserLP);
                lifePoint -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "s1" && opponentChoice == "pip"){
                Status.setText("You Lose!");
                battleLogLose(pipLoserLP);
                lifePoint -= pipLoserLP;
                lifePoints();
            }
            
            //r2 win
            else if(playChoice == "r2" && opponentChoice == "r1"){
                Status.setText("You Win!");
                battleLogWin(t2LoserLP);
                lifePointOpponent -= t2LoserLP;
                lifePoints();
            }else if(playChoice == "r2" && opponentChoice == "s1"){
                Status.setText("You Win!");
                battleLogWin(t2LoserLP);
                lifePointOpponent -= t2LoserLP;
                lifePoints();
            }else if(playChoice == "r2" && opponentChoice == "p1"){
                Status.setText("You Win!");
                battleLogWin(t2LoserLP);
                lifePointOpponent -= t2LoserLP;
                lifePoints();
            }else if(playChoice == "r2" && opponentChoice == "s2"){
                Status.setText("You Win!");
                battleLogWin(t2LoserLP);
                lifePointOpponent -= t2LoserLP;
                lifePoints();
            }
            //r2 lose
            else if(playChoice == "r2" && opponentChoice == "p2"){
                Status.setText("You Lose!");
                battleLogLose(t2LoserLP);
                lifePoint -= t2LoserLP;
                lifePoints();
            }else if(playChoice == "r2" && opponentChoice == "r3"){
                Status.setText("You Lose!");
                battleLogLose(t3LoserLP);
                lifePoint -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "r2" && opponentChoice == "p3"){
                Status.setText("You Lose!");
                battleLogLose(t3LoserLP);
                lifePoint -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "r2" && opponentChoice == "s3"){
                Status.setText("You Lose!");
                battleLogLose(t3LoserLP);
                lifePoint -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "r2" && opponentChoice == "jok"){
                Status.setText("You Lose!");
                battleLogLose(jokLoserLP);
                lifePoint -= jokLoserLP;
                lifePoints();
            }
            
            //p2 win 
            else if(playChoice == "p2" && opponentChoice == "r1"){
                Status.setText("You Win!");
                battleLogWin(t2LoserLP);
                lifePointOpponent -= t2LoserLP;
                lifePoints();
            }else if(playChoice == "p2" && opponentChoice == "s1"){
                Status.setText("You Win!");
                battleLogWin(t2LoserLP);
                lifePointOpponent -= t2LoserLP;
                lifePoints();
            }else if(playChoice == "p2" && opponentChoice == "p1"){
                Status.setText("You Win!");
                battleLogWin(t2LoserLP);
                lifePointOpponent -= t2LoserLP;
                lifePoints();
            }else if(playChoice == "p2" && opponentChoice == "r2"){
                Status.setText("You Win!");
                battleLogWin(t2LoserLP);
                lifePointOpponent -= t2LoserLP;
                lifePoints();
            }
            //p2 lose
            else if(playChoice == "p2" && opponentChoice == "s2"){
                Status.setText("You Lose!");
                battleLogLose(t2LoserLP);
                lifePoint -= t2LoserLP;
                lifePoints();
            }else if(playChoice == "p2" && opponentChoice == "r3"){
                Status.setText("You Lose!");
                battleLogLose(t3LoserLP);
                lifePoint -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "p2" && opponentChoice == "p3"){
                Status.setText("You Lose!");
                battleLogLose(t3LoserLP);
                lifePoint -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "p2" && opponentChoice == "s3"){
                Status.setText("You Lose!");
                battleLogLose(t3LoserLP);
                lifePoint -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "p2" && opponentChoice == "jok"){
                Status.setText("You Lose!");
                battleLogLose(jokLoserLP);
                lifePoint -= jokLoserLP;
                lifePoints();
            }
            
            //s2 win
            else if(playChoice == "s2" && opponentChoice == "r1"){
                Status.setText("You Win!");
                battleLogWin(t2LoserLP);
                lifePointOpponent -= t2LoserLP;
                lifePoints();
            }else if(playChoice == "s2" && opponentChoice == "s1"){
                Status.setText("You Win!");
                battleLogWin(t2LoserLP);
                lifePointOpponent -= t2LoserLP;
                lifePoints();
            }else if(playChoice == "s2" && opponentChoice == "p1"){
                Status.setText("You Win!");
                battleLogWin(t2LoserLP);
                lifePointOpponent -= t2LoserLP;
                lifePoints();
            }else if(playChoice == "s2" && opponentChoice == "p2"){
                Status.setText("You Win!");
                battleLogWin(t2LoserLP);
                lifePointOpponent -= t2LoserLP;
                lifePoints();
            }
            //s2 lose
            else if(playChoice == "s2" && opponentChoice == "r2"){
                Status.setText("You Lose!");
                battleLogLose(t2LoserLP);
                lifePoint -= t2LoserLP;
                lifePoints();
            }else if(playChoice == "s2" && opponentChoice == "r3"){
                Status.setText("You Lose!");
                battleLogLose(t3LoserLP);
                lifePoint -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "s2" && opponentChoice == "p3"){
                Status.setText("You Lose!");
                battleLogLose(t3LoserLP);
                lifePoint -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "s2" && opponentChoice == "s3"){
                Status.setText("You Lose!");
                battleLogLose(t3LoserLP);
                lifePoint -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "s2" && opponentChoice == "jok"){
                Status.setText("You Lose!");
                battleLogLose(t3LoserLP);
                lifePoint -= t3LoserLP;
                lifePoints();
            }
            
            //r3 win
            else if(playChoice == "r3" && opponentChoice == "s1"){
                Status.setText("You Win!");
                battleLogWin(t3LoserLP);
                lifePointOpponent -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "r3" && opponentChoice == "p1"){
                Status.setText("You Win!");
                battleLogWin(t3LoserLP);
                lifePointOpponent -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "r3" && opponentChoice == "r1"){
                Status.setText("You Win!");
                battleLogWin(t3LoserLP);
                lifePointOpponent -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "r3" && opponentChoice == "r2"){
                Status.setText("You Win!");
                battleLogWin(t3LoserLP);
                lifePointOpponent -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "r3" && opponentChoice == "p2"){
                Status.setText("You Win!");
                battleLogWin(t3LoserLP);
                lifePointOpponent -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "r3" && opponentChoice == "s2"){
                Status.setText("You Win!");
                battleLogWin(t3LoserLP);
                lifePointOpponent -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "r3" && opponentChoice == "s3"){
                Status.setText("You Win!");
                battleLogWin(t3LoserLP);
                lifePointOpponent -= t3LoserLP;
                lifePoints();
            }
            //r3 lose
            else if(playChoice == "r3" && opponentChoice == "p3"){
                Status.setText("You Lose!");
                battleLogLose(t3LoserLP);
                lifePoint -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "r3" && opponentChoice == "jok"){
                Status.setText("You Lose!");
                battleLogLose(jokLoserLP);
                lifePoint -= jokLoserLP;
                lifePoints();
            }
            
            //p3 win
            else if(playChoice == "p3" && opponentChoice == "r1"){
                Status.setText("You Win!");
                battleLogWin(t3LoserLP);
                lifePointOpponent -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "p3" && opponentChoice == "s1"){
                Status.setText("You Win!");
                battleLogWin(t3LoserLP);
                lifePointOpponent -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "p3" && opponentChoice == "p1"){
                Status.setText("You Win!");
                battleLogWin(t3LoserLP);
                lifePointOpponent -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "p3" && opponentChoice == "r2"){
                Status.setText("You Win!");
                battleLogWin(t3LoserLP);
                lifePointOpponent -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "p3" && opponentChoice == "p2"){
                Status.setText("You Win!");
                battleLogWin(t3LoserLP);
                lifePointOpponent -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "p3" && opponentChoice == "s3"){
                Status.setText("You Win!");
                battleLogWin(t3LoserLP);
                lifePointOpponent -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "p3" && opponentChoice == "r3"){
                Status.setText("You Win!");
                battleLogWin(t3LoserLP);
                lifePointOpponent -= t3LoserLP;
                lifePoints();
            }
            //p3 lose
            else if(playChoice == "p3" && opponentChoice == "s3"){
                Status.setText("You Lose!");
                battleLogLose(t3LoserLP);
                lifePoint -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "p3" && opponentChoice == "jok"){
                Status.setText("You Lose!");
                battleLogLose(jokLoserLP);
                lifePoint -= jokLoserLP;
                lifePoints();
            }
            
            //s3 win
            else if(playChoice == "s3" && opponentChoice == "p1"){
                Status.setText("You Win!");
                battleLogWin(t3LoserLP);
                lifePointOpponent -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "s3" && opponentChoice == "r1"){
                Status.setText("You Win!");
                battleLogWin(t3LoserLP);
                lifePointOpponent -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "s3" && opponentChoice == "s1"){
                Status.setText("You Win!");
                battleLogWin(t3LoserLP);
                lifePointOpponent -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "s3" && opponentChoice == "p2"){
                Status.setText("You Win!");
                battleLogWin(t3LoserLP);
                lifePointOpponent -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "s3" && opponentChoice == "p2"){
                Status.setText("You Win!");
                battleLogWin(t3LoserLP);
                lifePointOpponent -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "s3" && opponentChoice == "s2"){
                Status.setText("You Win!");
                battleLogWin(t3LoserLP);
                lifePointOpponent -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "s3" && opponentChoice == "p3"){
                Status.setText("You Win!");
                battleLogWin(t3LoserLP);
                lifePointOpponent -= t3LoserLP;
                lifePoints();
            }
            //s3 lose
            else if(playChoice == "s3" && opponentChoice == "r3"){
                Status.setText("You Lose!");
                battleLogLose(t3LoserLP);
                lifePoint -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "s3" && opponentChoice == "jok"){
                Status.setText("You Lose!");
                battleLogLose(jokLoserLP);
                lifePoint -= jokLoserLP;
                lifePoints();
            }
            
            //jok win
            else if(playChoice == "jok" && opponentChoice == "s2"){
                Status.setText("You Win!");
                battleLogWin(jokLoserLP);
                lifePointOpponent -= jokLoserLP;
                lifePoints();
            }else if(playChoice == "jok" && opponentChoice == "p2"){
                Status.setText("You Win!");
                battleLogWin(jokLoserLP);
                lifePointOpponent -= jokLoserLP;
                lifePoints();
            }else if(playChoice == "jok" && opponentChoice == "r2"){
                Status.setText("You Win!");
                battleLogWin(jokLoserLP);
                lifePointOpponent -= jokLoserLP;
                lifePoints();
            }else if(playChoice == "jok" && opponentChoice == "s3"){
                Status.setText("You Win!");
                battleLogWin(jokLoserLP);
                lifePointOpponent -= jokLoserLP;
                lifePoints();
            }else if(playChoice == "jok" && opponentChoice == "p3"){
                Status.setText("You Win!");
                battleLogWin(jokLoserLP);
                lifePointOpponent -= jokLoserLP;
                lifePoints();
            }else if(playChoice == "jok" && opponentChoice == "r3"){
                Status.setText("You Win!");
                battleLogWin(jokLoserLP);
                lifePointOpponent -= jokLoserLP;
                lifePoints();
            }
            //jok lose
            else if(playChoice == "jok" && opponentChoice == "r1"){
                Status.setText("You Lose!");
                battleLogLose(t1LoserLP);
                lifePoint -= t1LoserLP;
                lifePoints();
            }else if(playChoice == "jok" && opponentChoice == "p1"){
                Status.setText("You Lose!");
                battleLogLose(t1LoserLP);
                lifePoint -= t1LoserLP;
                lifePoints();
            }else if(playChoice == "jok" && opponentChoice == "s1"){
                Status.setText("You Lose!");
                battleLogLose(t1LoserLP);
                lifePoint -= t1LoserLP;
                lifePoints();
            }else if(playChoice == "jok" && opponentChoice == "pip"){
                Status.setText("You Lose!");
                battleLogLose(pipLoserLP);
                lifePoint -= pipLoserLP;
                lifePoints();
            }
            
            //pip win
            else if(playChoice == "pip" && opponentChoice == "s1"){
                Status.setText("You Win!");
                battleLogWin(pipLoserLP);
                lifePointOpponent -= pipLoserLP;
                lifePoints();
            }else if(playChoice == "pip" && opponentChoice == "p1"){
                Status.setText("You Win!");
                battleLogWin(pipLoserLP);
                lifePointOpponent -= pipLoserLP;
                lifePoints();
            }else if(playChoice == "pip" && opponentChoice == "r1"){
                Status.setText("You Win!");
                battleLogWin(pipLoserLP);
                lifePointOpponent -= pipLoserLP;
                lifePoints();
            }else if(playChoice == "pip" && opponentChoice == "jok"){
                Status.setText("You Win!");
                battleLogWin(pipLoserLP);
                lifePointOpponent -= pipLoserLP;
                lifePoints();
            }
            //pip lose
            else if(playChoice == "pip" && opponentChoice == "r2"){
                Status.setText("You Lose!");
                battleLogLose(t2LoserLP);
                lifePoint -= t2LoserLP;
                lifePoints();
            }else if(playChoice == "pip" && opponentChoice == "p2"){
                Status.setText("You Lose!");
                battleLogLose(t2LoserLP);
                lifePoint -= t2LoserLP;
                lifePoints();
            }else if(playChoice == "pip" && opponentChoice == "s2"){
                Status.setText("You Lose!");
                battleLogLose(t2LoserLP);
                lifePoint -= t2LoserLP;
                lifePoints();
            }else if(playChoice == "pip" && opponentChoice == "r3"){
                Status.setText("You Lose!");
                battleLogLose(t3LoserLP);
                lifePoint -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "pip" && opponentChoice == "p3"){
                Status.setText("You Lose!");
                battleLogLose(t3LoserLP);
                lifePoint -= t3LoserLP;
                lifePoints();
            }else if(playChoice == "pip" && opponentChoice == "s3"){
                Status.setText("You Lose!");
                battleLogLose(t3LoserLP);
                lifePoint -= t3LoserLP;
                lifePoints();
            }
            
        
        
        
        }
        
        loseState();
        
        
    }
    
    //String representation of numbers
    public String stringChoice(){
        String playChoice = "";
        //String opponentChoice = "r1";
        
        if(playVal >= 0 && playVal <6){
            playChoice = "p1";
        }else if(playVal >= 6 && playVal <12){
            playChoice = "r1";
        }else if(playVal >= 12 && playVal <18){
            playChoice = "s1";
        }else if(playVal >= 18 && playVal <20){
            playChoice = "p2";
        }else if(playVal >= 20 && playVal <22){
            playChoice = "r2";
        }else if(playVal >= 23 && playVal <24){
            playChoice = "s2";
        }else if(playVal == 24){
            playChoice = "p3";
        }else if(playVal == 25){
            playChoice = "r3";
        }else if(playVal == 26){
            playChoice = "s3";
        }else if(playVal >= 27 && playVal < 30){
            playChoice = "jok";
        }else if(playVal >= 30 && playVal < 32){
            playChoice = "pip";
        }
        
        return playChoice;
    
    
    }
    
    //lose 
    private void loseState(){
        if(lifePoint <= 0)
        {
            Status.setText("YOUR LIFEPOINTS IS ZERO");
            turndraw = 3;
            JOptionPane.showMessageDialog(null, "YOU LOST");
            Deck.setEnabled(false);
        }
        else if(lifePointOpponent <= 0)
        {
            Status.setText("OPPONENT'S LIFEPOINT IS ZERO");
            turndraw = 3;
            JOptionPane.showMessageDialog(null, "YOU WIN");
            Deck.setEnabled(false);
        }
    }
    
    
    //sets card type
    private void cardIcon(){
        for (int i = 0; i < 5; i++) {
                        
        }
    }
    
    public String cardType(String cardH, int i)
    {
        //cardH = "";
        //for (int i = 0; i < 5; i++) {
            if (handval[i] != 60)
            {
               if(handval[i] >= 0 && handval[i] < 6)
               {
                   cardH = "Paper I";
               }
               else if(handval[i] >= 6 && handval[i] < 12)
               {
                   cardH = "Rock I";
               }
               else if(handval[i] >= 12 && handval[i] < 18)
               {
                   cardH = "Scissors I";
               }
               else if(handval[i] >= 18 && handval[i] < 20)
               {
                   cardH = "Paper II";
               }
               else if(handval[i] >= 20 && handval[i] < 22)
               {
                   cardH = "Rock II";
               }
               else if(handval[i] >= 22 && handval[i] < 24)
               {
                   cardH = "Scissors II";
               }
               else if(handval[i] == 24)
               {
                   cardH = "Paper III";
               }
               else if(handval[i] == 25)
               {
                   cardH = "Rock III";
               }
               else if(handval[i] == 26)
               {
                   cardH = "Scissors III";
               }
               else if(handval[i] >= 27 && handval[i] < 30)
               {
                   cardH = "Joker";
               }
               else if(handval[i] >= 30 && handval[i] < 32)
               {
                   cardH = "Pip";
               }  
            }
            
        //}
        return cardH;
    }
    
    //battle log
    private void battleLogLose(int loserLP){
        //battleLogPlayer1
        lifebar1 -= (loserLP/4) - 10;
        battlogP1.append("Player LOSE || [" + lifePoint + "-" + loserLP + "] \n");
        PlayerLifePoints.setSize(lifebar1,30); //lifebar width
        battlogP2.append("Player WIN || [" + lifePoint + "] \n");
    }
    
    //battle log opponent
    private void battleLogWin(int winLP){
        lifebar2 -= (winLP/4) - 10;
        battlogP2.append("Player 1 WIN || [" + lifePointOpponent + "-" +  winLP + "] \n");
        EnemyLifePoints.setSize(lifebar2,30); //lifebar width
        battlogP1.append("Player WIN\n");
    }
    
    private void battleLogTie(){
        battlogP1.append("ITS A TIE");
        battlogP2.append("ITS A TIE");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Deck = new javax.swing.JLabel();
        Hand1 = new javax.swing.JLabel();
        Hand2 = new javax.swing.JLabel();
        Hand5 = new javax.swing.JLabel();
        Hand3 = new javax.swing.JLabel();
        Hand4 = new javax.swing.JLabel();
        Error_Val = new javax.swing.JTextField();
        Status = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        status2 = new javax.swing.JTextField();
        playHand = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Hand6 = new javax.swing.JLabel();
        Hand7 = new javax.swing.JLabel();
        Hand8 = new javax.swing.JLabel();
        Hand9 = new javax.swing.JLabel();
        Hand10 = new javax.swing.JLabel();
        Deck1 = new javax.swing.JLabel();
        opponHand = new javax.swing.JLabel();
        PlayerLifePoints = new javax.swing.JLabel();
        EnemyLifePoints = new javax.swing.JLabel();
        HealthBorder1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        battlogP1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        battlogP2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        HealthBorder2 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(null);

        Deck.setBackground(new java.awt.Color(153, 204, 255));
        Deck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java2/Images/Cards/BackDeckpile.png"))); // NOI18N
        Deck.setText("DECK");
        Deck.setOpaque(true);
        Deck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeckMouseClicked(evt);
            }
        });
        getContentPane().add(Deck);
        Deck.setBounds(20, 400, 90, 140);

        Hand1.setBackground(new java.awt.Color(255, 255, 255));
        Hand1.setText("Hand");
        Hand1.setOpaque(true);
        Hand1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Hand1MouseClicked(evt);
            }
        });
        getContentPane().add(Hand1);
        Hand1.setBounds(130, 470, 90, 118);

        Hand2.setBackground(new java.awt.Color(255, 255, 255));
        Hand2.setText("Hand");
        Hand2.setOpaque(true);
        Hand2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Hand2MouseClicked(evt);
            }
        });
        getContentPane().add(Hand2);
        Hand2.setBounds(240, 470, 90, 118);

        Hand5.setBackground(new java.awt.Color(255, 255, 255));
        Hand5.setText("Hand");
        Hand5.setOpaque(true);
        Hand5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Hand5MouseClicked(evt);
            }
        });
        getContentPane().add(Hand5);
        Hand5.setBounds(570, 470, 90, 118);

        Hand3.setBackground(new java.awt.Color(255, 255, 255));
        Hand3.setText("Hand");
        Hand3.setOpaque(true);
        Hand3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Hand3MouseClicked(evt);
            }
        });
        getContentPane().add(Hand3);
        Hand3.setBounds(350, 470, 90, 118);

        Hand4.setBackground(new java.awt.Color(255, 255, 255));
        Hand4.setText("Hand");
        Hand4.setOpaque(true);
        Hand4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Hand4MouseClicked(evt);
            }
        });
        getContentPane().add(Hand4);
        Hand4.setBounds(460, 470, 90, 118);

        Error_Val.setText("jTextField1");
        getContentPane().add(Error_Val);
        Error_Val.setBounds(931, 11, 59, 20);

        Status.setText(" ");
        getContentPane().add(Status);
        Status.setBounds(20, 280, 0, 20);

        jButton1.setText("VALUES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(140, 240, 0, 23);

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(230, 240, 0, 23);

        status2.setText("jTextField1");
        getContentPane().add(status2);
        status2.setBounds(20, 310, 0, 20);

        playHand.setBackground(new java.awt.Color(204, 255, 204));
        playHand.setText("Play Hand");
        playHand.setOpaque(true);
        playHand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playHandMouseClicked(evt);
            }
        });
        getContentPane().add(playHand);
        playHand.setBounds(440, 310, 90, 117);

        jLabel1.setBackground(new java.awt.Color(255, 102, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java2/Images/GamePlayComponents/backtodeck.png"))); // NOI18N
        jLabel1.setText("[X]");
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(540, 310, 20, 16);

        jLabel2.setBackground(new java.awt.Color(153, 255, 153));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java2/Images/GamePlayComponents/play.png"))); // NOI18N
        jLabel2.setText("PLAY");
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(440, 430, 90, 15);

        Hand6.setBackground(new java.awt.Color(204, 204, 204));
        Hand6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java2/Images/Cards/BackDeck.png"))); // NOI18N
        Hand6.setText("Hand");
        Hand6.setOpaque(true);
        Hand6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Hand6MouseClicked(evt);
            }
        });
        getContentPane().add(Hand6);
        Hand6.setBounds(350, 10, 90, 117);

        Hand7.setBackground(new java.awt.Color(204, 204, 204));
        Hand7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java2/Images/Cards/BackDeck.png"))); // NOI18N
        Hand7.setText("Hand");
        Hand7.setOpaque(true);
        Hand7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Hand7MouseClicked(evt);
            }
        });
        getContentPane().add(Hand7);
        Hand7.setBounds(460, 10, 90, 117);

        Hand8.setBackground(new java.awt.Color(204, 204, 204));
        Hand8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java2/Images/Cards/BackDeck.png"))); // NOI18N
        Hand8.setText("Hand");
        Hand8.setOpaque(true);
        Hand8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Hand8MouseClicked(evt);
            }
        });
        getContentPane().add(Hand8);
        Hand8.setBounds(790, 10, 90, 117);

        Hand9.setBackground(new java.awt.Color(204, 204, 204));
        Hand9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java2/Images/Cards/BackDeck.png"))); // NOI18N
        Hand9.setText("Hand");
        Hand9.setOpaque(true);
        Hand9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Hand9MouseClicked(evt);
            }
        });
        getContentPane().add(Hand9);
        Hand9.setBounds(570, 10, 90, 117);

        Hand10.setBackground(new java.awt.Color(204, 204, 204));
        Hand10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java2/Images/Cards/BackDeck.png"))); // NOI18N
        Hand10.setText("Hand");
        Hand10.setOpaque(true);
        Hand10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Hand10MouseClicked(evt);
            }
        });
        getContentPane().add(Hand10);
        Hand10.setBounds(680, 10, 90, 117);

        Deck1.setBackground(new java.awt.Color(255, 204, 204));
        Deck1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java2/Images/Cards/BackDeckpile2.png"))); // NOI18N
        Deck1.setText("DECK");
        Deck1.setOpaque(true);
        Deck1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Deck1MouseClicked(evt);
            }
        });
        getContentPane().add(Deck1);
        Deck1.setBounds(900, 70, 90, 140);

        opponHand.setBackground(new java.awt.Color(204, 204, 255));
        opponHand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java2/Images/Cards/BackDeck.png"))); // NOI18N
        opponHand.setText("Oppenent Play");
        opponHand.setOpaque(true);
        opponHand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opponHandMouseClicked(evt);
            }
        });
        getContentPane().add(opponHand);
        opponHand.setBounds(440, 150, 90, 117);

        PlayerLifePoints.setBackground(new java.awt.Color(153, 255, 255));
        PlayerLifePoints.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java2/Images/GamePlayComponents/health.png"))); // NOI18N
        PlayerLifePoints.setText("Player LIFEPOINTS");
        PlayerLifePoints.setMaximumSize(new java.awt.Dimension(90, 14));
        PlayerLifePoints.setOpaque(true);
        getContentPane().add(PlayerLifePoints);
        PlayerLifePoints.setBounds(720, 450, 270, 30);

        EnemyLifePoints.setBackground(new java.awt.Color(153, 255, 255));
        EnemyLifePoints.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java2/Images/GamePlayComponents/health.png"))); // NOI18N
        EnemyLifePoints.setText("Player LIFEPOINTS");
        EnemyLifePoints.setOpaque(true);
        getContentPane().add(EnemyLifePoints);
        EnemyLifePoints.setBounds(12, 10, 270, 30);

        HealthBorder1.setBackground(new java.awt.Color(255, 255, 255));
        HealthBorder1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java2/Images/GamePlayComponents/healthborder.png"))); // NOI18N
        HealthBorder1.setText("  ");
        HealthBorder1.setOpaque(true);
        getContentPane().add(HealthBorder1);
        HealthBorder1.setBounds(0, 1, 283, 39);

        battlogP1.setColumns(20);
        battlogP1.setRows(5);
        jScrollPane1.setViewportView(battlogP1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(720, 490, 270, 96);

        battlogP2.setColumns(20);
        battlogP2.setRows(5);
        jScrollPane2.setViewportView(battlogP2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 50, 270, 96);

        jLabel3.setBackground(new java.awt.Color(255, 51, 0));
        jLabel3.setText("DISCONNECT");
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(910, 310, 80, 20);

        HealthBorder2.setBackground(new java.awt.Color(255, 255, 255));
        HealthBorder2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java2/Images/GamePlayComponents/healthborder2.png"))); // NOI18N
        HealthBorder2.setText("  ");
        HealthBorder2.setOpaque(true);
        getContentPane().add(HealthBorder2);
        HealthBorder2.setBounds(719, 441, 283, 39);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java2/Images/GamePlayComponents/background.png"))); // NOI18N
        bg.setText("  ");
        getContentPane().add(bg);
        bg.setBounds(0, 0, 1010, 600);

        setSize(new java.awt.Dimension(1016, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DeckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeckMouseClicked
//        Draw();
    }//GEN-LAST:event_DeckMouseClicked

    private void Hand1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hand1MouseClicked
        if(turndraw == 1){
        playHand.setText(Hand1.getText());
        playVal = handval [0];
        handval[0] = 60;
        cardvalup();
        Hand1.setForeground(Color.red);
        Hand1.setIcon(null);
        turndraw = 0;
        }
        if(turndraw == 3){
        JOptionPane.showMessageDialog(null, "YOU LOST");
        }
    }//GEN-LAST:event_Hand1MouseClicked

    private void Hand2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hand2MouseClicked
        if(turndraw == 1){
        playVal = handval [1];
        playHand.setText(Hand2.getText());
        handval[1] = 60;
        cardvalup();
        Hand2.setForeground(Color.red);
        Hand2.setIcon(null);
        turndraw = 0;
        }
    }//GEN-LAST:event_Hand2MouseClicked

    private void Hand3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hand3MouseClicked
        if(turndraw == 1){
        playVal = handval [2];
        playHand.setText(Hand3.getText());
        handval[2] = 60;
        cardvalup();
        Hand3.setForeground(Color.red);
        Hand3.setIcon(null);
        turndraw = 0;
        }
    }//GEN-LAST:event_Hand3MouseClicked

    private void Hand4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hand4MouseClicked
        if(turndraw == 1){
        playVal = handval [3];
        playHand.setText(Hand4.getText());
        handval[3] = 60;
        cardvalup();
        Hand4.setForeground(Color.red);
        Hand4.setIcon(null);
        turndraw = 0;
        }
    }//GEN-LAST:event_Hand4MouseClicked

    private void Hand5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hand5MouseClicked
        if(turndraw == 1){
         playVal = handval [4];
        playHand.setText(Hand1.getText());
        handval[4] = 60;
        cardvalup();
        Hand5.setForeground(Color.red);
        Hand5.setIcon(null);
        turndraw = 0;
        }
    }//GEN-LAST:event_Hand5MouseClicked

    private void playHandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playHandMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_playHandMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        for (int i = 0; i < 5; i++) 
        {
            if(handval[i]== 60)
            {
            Status.setText(String.valueOf(i));
            if(i == 0){handval[0] = playVal; playVal = 60; turndraw = 1; cardvalup();}
            if(i == 1){handval[1] = playVal; playVal = 60; turndraw = 1; cardvalup();}
            if(i == 2){handval[2] = playVal; playVal = 60; turndraw = 1; cardvalup();}
            if(i == 3){handval[3] = playVal; playVal = 60; turndraw = 1; cardvalup();}
            if(i == 4){handval[4] = playVal; playVal = 60; turndraw = 1; cardvalup();}
            }
            
        }
        
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        play();
        Draw();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void Hand6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hand6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Hand6MouseClicked

    private void Hand7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hand7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Hand7MouseClicked

    private void Hand8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hand8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Hand8MouseClicked

    private void Hand9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hand9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Hand9MouseClicked

    private void Hand10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hand10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Hand10MouseClicked

    private void Deck1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Deck1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Deck1MouseClicked

    private void opponHandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opponHandMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_opponHandMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cardvalup();

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GamePlay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Deck;
    private javax.swing.JLabel Deck1;
    private javax.swing.JLabel EnemyLifePoints;
    private javax.swing.JTextField Error_Val;
    private javax.swing.JLabel Hand1;
    private javax.swing.JLabel Hand10;
    private javax.swing.JLabel Hand2;
    private javax.swing.JLabel Hand3;
    private javax.swing.JLabel Hand4;
    private javax.swing.JLabel Hand5;
    private javax.swing.JLabel Hand6;
    private javax.swing.JLabel Hand7;
    private javax.swing.JLabel Hand8;
    private javax.swing.JLabel Hand9;
    private javax.swing.JLabel HealthBorder1;
    private javax.swing.JLabel HealthBorder2;
    private javax.swing.JLabel PlayerLifePoints;
    private javax.swing.JTextField Status;
    private javax.swing.JTextArea battlogP1;
    private javax.swing.JTextArea battlogP2;
    private javax.swing.JLabel bg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel opponHand;
    private javax.swing.JLabel playHand;
    private javax.swing.JTextField status2;
    // End of variables declaration//GEN-END:variables
}
