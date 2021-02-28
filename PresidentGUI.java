import java.util.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.net.URL;

public class PresidentGUI {

	public static void main(String[] args) {
		
		//GAME VARIABLES
		ArrayList<Integer> cards = new ArrayList<Integer>();
		ArrayList<Integer> current = new ArrayList<Integer>();
		ArrayList<Integer> play = new ArrayList<Integer>();
		
		JLabel notBurns = new JLabel("0");
		JLabel number = new JLabel("0");
		ArrayList<Integer> discard = new ArrayList<Integer>();
		JLabel num = new JLabel("0");
		
		String numberCheck = "0123456789";
		String numCheck = "01234";
		String faceCards = "JQKA";
		String lowercaseFaceCards = "jqka";
		
		JFrame frame = new JFrame("President AI");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(600, 700);
	    JPanel panel = new JPanel();
	    frame.setVisible(true);
	    frame.add(panel);
	    panel.setLayout(null);
	    
	    JLabel label = new JLabel("President AI"); 
	    label.setFont(new Font("Times New Roman", Font.PLAIN, 69));
	    label.setBounds(125,250,400,69);
	    panel.add(label);
      
        JLabel text = new JLabel();
	        
        //Start Menu
        JButton a=new JButton("Start"); 
        JButton b=new JButton("About");
	    a.setBounds(100,525,200,50);  
	    panel.add(a);
	    b.setBounds(300,525,200,50);  
	    panel.add(b);
	    //
	    
	    //About
	    JLabel info = new JLabel("About");
        info.setFont(new Font("Times New Roman", Font.PLAIN, 69));
        info.setBounds(0,0,0,0);
        panel.add(info);
        
	    JButton c = new JButton("Back");
	    c.setBounds(0, 0, 0, 0);
	    panel.add(c);
	    //
	    
	    //Start
	    JButton d=new JButton("Start Game"); 
        JButton e=new JButton("Back");
	    d.setBounds(0,0,0,0);  
	    e.setBounds(0,0,0,0);  
	    panel.add(d);
	    panel.add(e);
	    //
	    
	    //Number of Cards
	    JButton f = new JButton("Advance");
	    JButton g = new JButton("Back");
	    f.setBounds(0,0,0,0);  
	    g.setBounds(0,0,0,0);  
	    panel.add(f);
	    panel.add(g);
	    JTextField input = new JTextField();
	    input.setBounds(10,110,0,0);
	    panel.add(input);
	    JLabel inputNum= new JLabel("Number of cards");
	    inputNum.setBounds(0,0,0,0);
	    inputNum.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	    panel.add(inputNum);
	    JLabel invalid = new JLabel();
	    invalid.setBounds(0,0,0,0);
	    panel.add(invalid);
	    //
	    
	    //Input Cards
	    JButton inputCard = new JButton("Input Card");
	    JButton resetDeck = new JButton("Reset Deck");
	    inputCard.setBounds(0,0,0,0);  
	    resetDeck.setBounds(0,0,0,0);  
	    panel.add(inputCard);
	    panel.add(resetDeck);
	    JLabel deck = new JLabel("");
	    JLabel cardList = new JLabel("");
	    deck.setBounds(0,0,0,0);
	    cardList.setBounds(0,0,0,0);
	    deck.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	    cardList.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	    panel.add(deck);
	    panel.add(cardList);
	    
	    //Continue
	    JButton cont = new JButton("Continue");
	    cont.setBounds(0,0,0,0);
	    panel.add(cont);
	    JLabel contin = new JLabel("Continue?");
	    contin.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	    contin.setBounds(0,0,0,0);
	    panel.add(contin);
	    //
	    
	    //How many cards
	    JButton enter = new JButton("Enter");
	    enter.setBounds(0,0,0,0);
	    panel.add(enter);
	    //
	    
	    //LastTurn
	    JButton enterLast = new JButton("Enter");
	    enterLast.setBounds(0,0,0,0);
	    panel.add(enterLast);
	    
	    //Specify
	    JButton specify = new JButton("Enter");
	    specify.setBounds(0,0,0,0);
	    panel.add(specify);
	    
	    //Play
	    JButton pp = new JButton("Play!");
	    pp.setBounds(0,0,0,0);
	    panel.add(pp);
	    JLabel turn = new JLabel("", (SwingConstants.CENTER));
	    turn.setBounds(0,0,0,0);
	    turn.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	    panel.add(turn);
	    
	    //DECK CLEARED!!!
	    JLabel clear = new JLabel("DECK CLEARED", (SwingConstants.CENTER));
	    clear.setBounds(0,0,0,0);
	    clear.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	    panel.add(clear);
	    
	    //Specify
	    JButton toggle = new JButton("Toggle");
	    toggle.setBounds(0,0,0,0);
	    panel.add(toggle);
	    JLabel visible=new JLabel("");
	    
	    
	    //Code for running the buttons and stuff
	    b.addActionListener(new ActionListener() {

	        public void actionPerformed(ActionEvent about)
	        {
	        	a.setBounds(0,0,0,0);
	            b.setBounds(0,0,0,0);
	            panel.remove(label);
	            info.setBounds(205,50,300,69);
	            c.setBounds(200, 525, 200, 50);
	            panel.validate();
	            panel.repaint();
	            
	        }
	    });
	    
	    c.addActionListener(new ActionListener() {

	        public void actionPerformed(ActionEvent start)
	        {
	        	a.setBounds(100,525,200,50);  
	    	    b.setBounds(300,525,200,50);  	    
	    	    c.setBounds(0,0,0,0);
	    	    info.setBounds(0,0,0,0);
	    	    panel.add(label);
	    	    panel.validate();
	    	    panel.repaint();
	        }
	    });
	    
	    a.addActionListener(new ActionListener() {

	        public void actionPerformed(ActionEvent begin)
	        {
	        	a.setBounds(0,0,0,0);
	            b.setBounds(0,0,0,0);
	            panel.remove(label);
	            d.setBounds(100,525,200,50);  
	    	    e.setBounds(300,525,200,50); 
	            panel.validate();
	            panel.repaint();
	        }
	    });
	    
	    e.addActionListener(new ActionListener() {

	        public void actionPerformed(ActionEvent goback)
	        {
	        	a.setBounds(100,525,200,50);  
	    	    b.setBounds(300,525,200,50);      
	    	    d.setBounds(0,0,0,0);  
	    	    e.setBounds(0,0,0,0); 
	    	    info.setBounds(0,0,0,0);
	    	    panel.add(label);
	    	    panel.validate();
	    	    panel.repaint();
	        }
	    });
	    
	    d.addActionListener(new ActionListener() {

	        public void actionPerformed(ActionEvent startgame)
	        {
	        	f.setBounds(100, 525, 200, 50);  
	    	    g.setBounds(300,525,200,50);  
	    	    input.setBounds(300,290,200,20);
	    	    inputNum.setBounds(100,290,200,20);
	    	    d.setBounds(0,0,0,0);
	    	    e.setBounds(0,0,0,0);
	    	    info.setBounds(0,0,0,0);
	    	    invalid.setBounds(300,310,500,20);
	    	    panel.validate();
	    	    panel.repaint();
	        }
	        
	    });
	    
	    f.addActionListener(new ActionListener() {

	        public void actionPerformed(ActionEvent inputnumberofcards)
	        {
	        	String numberOfCards = input.getText();
	        	boolean b = true;
	        	
	        	if(numberOfCards.length() == 0) {
	        		b = false;
	        	}
	        	
	        	for(int i = 0; i<numberOfCards.length(); i++) {
	        		if(numberCheck.indexOf(numberOfCards.charAt(i)) == -1) {
	        			b = false;
	        			invalid.setText("Please enter a number!");
	        			input.setText("");
	        			break;
	        		}
	        	}
	        	
	        	if(b == true) {
	        		invalid.setText("");
	        		number.setText(numberOfCards);
	        		input.setText("");
	        		f.setBounds(0,0,0,0);
		        	g.setBounds(0,0,0,0);
		        	inputCard.setBounds(100,525,200,50);
		        	resetDeck.setBounds(300,525,200,50);
		        	deck.setBounds(100,300,500,100);
		        	deck.setText("Current Deck: ");
		        	cardList.setText("");
		        	cardList.setBounds(100, 325, 500, 100);
		        	inputNum.setText("Input cards here:");
		        	panel.revalidate();
		        	panel.repaint();
	        	}
	        }
	        
	    });
	    
	    g.addActionListener(new ActionListener() {

	        public void actionPerformed(ActionEvent backtostart)
	        {
	        	f.setBounds(0,0,0,0);
	        	g.setBounds(0,0,0,0);
	        	invalid.setText("");
	        	invalid.setBounds(0,0,0,0);
	        	input.setBounds(0,0,0,0);
	        	inputNum.setBounds(0,0,0,0);
	        	d.setBounds(100,525,200,50);  
	    	    e.setBounds(300,525,200,50); 
	            panel.validate();
	            panel.repaint();
	        }
	        
	    });
	    
	    inputCard.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent addACard)
	        {
	    		String card = input.getText();
	        	boolean b = true;
	        	
	        	if(card.length() == 0) {
	        		b=false;
	        		invalid.setText("That is an invalid input!");
	        	}
	        	else {
	        		for(int i = 0; i<card.length(); i++) {
	        			if(numberCheck.indexOf(card.charAt(i)) == -1) {
	        				b = false;
	        				input.setText("");
	        				break;
	        			}
	        		}
	        	}
	        	
	        	if(b == true) {
	        		if(Integer.parseInt(card) > 2 && Integer.parseInt(card)<14) {
	        			if(Collections.frequency(cards, Integer.parseInt(card)) == 0) {
	        				notBurns.setText(Integer.toString(Integer.parseInt(notBurns.getText())+1));
	        			}
	        			cards.add(Integer.parseInt(card));
	        			invalid.setText("");
	        			
	        		}
	        		else if(Integer.parseInt(card) == 2) {
	        			cards.add(15);
    	        	}
	        	}
	        
	        	else if(!card.contentEquals("")){
	        		if(faceCards.indexOf(card) != -1) {
	        			if(Collections.frequency(cards, 10+1+faceCards.indexOf(card)) == 0) {
	        				notBurns.setText(Integer.toString(Integer.parseInt(notBurns.getText())+1));
	        			}
		        		cards.add(11+faceCards.indexOf(card));
		        	}
	        		else if(lowercaseFaceCards.indexOf(card) != -1){
	        			if(Collections.frequency(cards, 10+1+lowercaseFaceCards.indexOf(card)) == 0) {
	        				notBurns.setText(Integer.toString(Integer.parseInt(notBurns.getText())+1));
	        			}
	        			cards.add(11+lowercaseFaceCards.indexOf(card));
	        		}
	        		else if(card.equals("Joker") || card.equals("joker")) {
	        			cards.add(16);
	        		}
	        		else {
	        			invalid.setText("That is an invalid input!");
	        		}
	        	}
	        	
	        	Collections.sort(cards);
	        	String s = "";
	        	for(int i = 0; i<cards.size(); i++) {
	        		if(3<=cards.get(i) && cards.get(i)<=10)
	        		s = s + " " + cards.get(i);
	        		else if(cards.get(i) == 15) {
	        			s = s + " " + 2;
		        	}
	        		else if(cards.get(i)<=14) {
	        			s = s + " " + faceCards.charAt(cards.get(i) - 11);
	        		}
	        		else if(cards.get(i) == 16) {
	        			s = s + " " + "Joker";
	        		}
	        	}
	        	
	        	s = s.trim();
	        	
	        	cardList.setText(s);
	        	
	        	if(cards.size() == Integer.parseInt(number.getText())) {
	        		input.setBounds(0,0,0,0);
	        		inputNum.setBounds(0,0,0,0);
	        		inputCard.setBounds(0,0,0,0);
	        		resetDeck.setBounds(0,0,0,0);
	        		deck.setBounds(100,50,500,20);
	        		cardList.setBounds(100,75,500,20);
	        		
	        		cont.setBounds(200, 525, 200, 50);
	        		contin.setBounds(260, 450, 300, 50);
	        		
	        		panel.revalidate();
		        	panel.repaint();
	        		
	        	}
	        	
	        	input.setText("");
	        }
	    });
	    
	    resetDeck.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent resetDeck)
	        {
	        	while(cards.size() > 0){
	        		cards.remove(0);
	        	}
	        	cardList.setText("");
	        	input.setText("");
	        }
	    });
	    
	    cont.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent Continue)
	        {
	    		toggle.setBounds(100, 135, 50,50);
	        	visible.setText("1");
	        	
	        	cont.setBounds(0,0,0,0);
	        	contin.setBounds(0,0,0,0);
	        	input.setBounds(350,290,150,20);
	        	invalid.setBounds(350, 310, 250, 20);
	        	inputNum.setBounds(100,290,300,20);
	        	enter.setBounds(200,525,200,50);
	        	inputNum.setFont(new Font("Times New Roman", Font.PLAIN, 10));
	        	inputNum.setText("How many cards have been played since your last turn?");
	        	panel.revalidate();
	        	panel.repaint();
	        }
	    });
	    
	    enter.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent enterNumber)
	        {
	    		String s = input.getText();
	    		boolean b = true;
	    		if(s.length() == 0) {
	    			b = false;
	    		}
	    		for(int i = 0; i<s.length(); i++) {
	    			if(numberCheck.indexOf(s.charAt(i)) == -1) {
	    				b = false;
	    				invalid.setText("That is an invalid input!");
	    				break;
	    			}
	    		}
	    		if(b == true) {
	    			for(int i = 0; i<Integer.parseInt(s); i++) {
	    				discard.add(1);
	    			}
	    			enter.setBounds(0,0,0,0);
	    			enterLast.setBounds(200,525,200,50);
	    			input.setBounds(350,290,150,20);
	        		input.setText("");
	        		inputNum.setFont(new Font("Times New Roman", Font.PLAIN, 15));
	        		inputNum.setText("How many cards were played last turn?");
	        		panel.revalidate();
	        		panel.repaint();
	        	}
	        }
	    });
	    
	    enterLast.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent enterNum)
	        {
	    		String s = input.getText();
	    		boolean b = true;
	    		if(s.length() != 1) {
	    			b = false;
	    		}
	    		
	    		if(numCheck.indexOf(s.charAt(0)) == -1) {
	    			b = false;
	    			invalid.setText("That is an invalid input!");
	    		}
	    		
	    		if(b == true) {
	    			num.setText(s);
	    			enterLast.setBounds(0,0,0,0);
	    			specify.setBounds(200,525,200,50);
	        		inputNum.setText("Specify the "+num.getText()+" cards.");
	        		input.setText("");
	        		panel.revalidate();
	        		panel.repaint();
	        	}
	        }
	    });
	    
	    specify.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent spec)
	        {
	    		String s = input.getText();
	    		int x = 0;
	    		input.setText("");
	    		boolean b = true;
	    		for(int i = 0; i<s.length(); i++) {
	    			if(numberCheck.indexOf(s.charAt(i))==-1) {
	    				b=false;
	    				break;
	    			}
	    		}
	    		
	    		if(b == true) {
	    			x = Integer.parseInt(s);
	    			if(2>x || x>13) {
	    				b=false;
	    			}
	    			
	    			else {
	    				if(x==2) {
	    					x=15;
	    				}
	    			}
	    		}
	    		
	    		if(b == false && s.length()==1 && x==0) {
	    			if(faceCards.indexOf(s.charAt(0))!=-1) {
	    				x = 11+faceCards.indexOf(s.charAt(0));
	    				b = true;
	    			}
	    			if(lowercaseFaceCards.indexOf(s.charAt(0))!=-1) {
	    				x = 11+lowercaseFaceCards.indexOf(s.charAt(0));
	    				b = true;
	    			}
	    		}
	    		
	    		if(s.equals("Joker") || s.equals("joker")) {
	    			x = 16;
	    		}
	    		
	    		if(b == false) {
	    			invalid.setText("That is an invalid input!");
	    		}
	    		
	    		int p = 0;
	    		
	    		if(b == true) {
	    			for(int i = 0; i<Integer.parseInt(num.getText()); i++) {
	    				current.add(x);
	    			}
	    			
	    			if(Integer.parseInt(notBurns.getText()) > 1) {
						if(num.getText().equals("0")) {
							
							int min = cards.get(0);
							boolean c = true;
							for(int i = 0; i<cards.size(); i++) {
								if(cards.get(i) != 15 && cards.get(i) != 16 && cards.get(i) != min) {
									c = false;
								}
							}
							
							if(c == true) {
								if(Collections.frequency(cards, 15)+Collections.frequency(cards, 16)>0) {
									int i = cards.indexOf(15);
									while(Collections.frequency(cards, 15)>0 || Collections.frequency(cards, 16)>0) {
										play.add(cards.get(i));
										discard.add(cards.get(i));
										cards.remove(i);
									}
									
								}
								else {
									if(Collections.frequency(cards, 15)+Collections.frequency(cards, 16)>0) {
										
									}
								}
								while(cards.size() > 0) {
									play.add(min);
									discard.add(min);
									cards.remove(0);
								}		
								
							}
							
							else {
								while(cards.size() > 0 && cards.get(0) == min) {
									play.add(min);
									discard.add(min);
									cards.remove(0);
									
								}
							}	
							
						}
						
						if(num.getText().equals("1")) {
							if(discard.size() > 18 && discard.size()<41) {
								for(int i = 3; i<15; i++) {
									if(i == current.get(0) && cards.indexOf(i) != -1 && p == 0) {
										play.add(i);
										cards.remove(cards.indexOf(i));
										discard.add(i);
										p=i;							
										
									}
									else if(i>current.get(0) && cards.indexOf(current.get(0)) == -1 && Collections.frequency(cards, i) == 1 && p == 0) {
										play.add(i);
										cards.remove(cards.indexOf(i));
										discard.add(i);
										p=i;
										
									}
								}
							}
							else if(discard.size()>40) {
								for(int i = 3; i<15; i++) {
									if(i == current.get(0) && cards.indexOf(i) != -1 && p == 0) {
										play.add(i);
										cards.remove(cards.indexOf(i));
										discard.add(i);
										p=i;							
										
									}
									else if(i>current.get(0) && cards.indexOf(current.get(0)) == -1 && Collections.frequency(cards, i) >= 1 && p == 0) {
										play.add(i);
										cards.remove(cards.indexOf(i));
										discard.add(i);
										p=i;
										
									}
								}
							}
							else{
								for(int i = 3; i<13; i++) {
									if(i == current.get(0) && cards.indexOf(i) != -1 && p==0) {
										play.add(i);
										cards.remove(cards.indexOf(i));
										discard.add(i);
										p=i;							
										
									}
									else if(i>current.get(0) && cards.indexOf(current.get(0)) == -1 && Collections.frequency(cards, i) == 1 && i>current.get(0) && p==0) {
										play.add(i);
										cards.remove(cards.indexOf(i));
										discard.add(i);
										p=i;
										
									}
								}
								
								
							}
							
							if(play.size() == 0) {
								if(current.get(0) >= 11) {
									if(Collections.frequency(cards, 15) > 0) {
										play.add(15);
										cards.remove(cards.indexOf(15));
										discard.add(15);
										p=15;
									}
									
									else if(Collections.frequency(cards, 16) > 0 && discard.size()>40) {
										play.add(16);
										cards.remove(cards.indexOf(16));
										discard.add(16);
										p=16;
									}
									
								}
								
							}
						}
						
						if(num.getText().equals("2")) {
							boolean c = false;
							if(discard.size() > 14 && discard.size()<36) {
								for(int i = 3; i<15; i++) {
									if(i == current.get(0) && Collections.frequency(cards, i) == 2 && p==0) {
										for(int j = 0; j<2; j++) {
											play.add(i);
											cards.remove(cards.indexOf(i));
											discard.add(i);
											p=i;
										}
										
									}
									else if(cards.indexOf(current.get(0)) == -1 && Collections.frequency(cards, i) == 2 && i>current.get(0) && p==0) {
										for(int j = 0; j<2; j++) {
											play.add(i);
											cards.remove(cards.indexOf(i));
											discard.add(i);
											p=i;
										}
										
									}

								}
								
							}
							else if(discard.size() > 35) {
								for(int i = 3; i<15; i++) {
									if(i == current.get(0) && Collections.frequency(cards, i) >= 2 && p==0) {
										for(int j = 0; j<2; j++) {
											play.add(i);
											cards.remove(cards.indexOf(i));
											discard.add(i);
											p=i;						
										}
										
									}
									else if(cards.indexOf(current.get(0)) == -1 && Collections.frequency(cards, i) >= 2 && i>current.get(0) && p==0) {
										for(int j = 0; j<2; j++) {
											play.add(i);
											cards.remove(cards.indexOf(i));
											discard.add(i);
											p=i;
										}
										
									}

								}
							}
							else {
								for(int i = 3; i<13; i++) {
									if(i >= current.get(0) && Collections.frequency(cards, i) == 2 && p==0) {
										for(int j = 0; j<2; j++) {
											play.add(i);
											cards.remove(cards.indexOf(i));
											discard.add(i);
											p=i;					
										}
										
									}

								}
							}
							
							if(play.size() == 0) {
								if(Collections.frequency(cards, 15) > 0) {
									play.add(15);
									cards.remove(cards.indexOf(15));
									discard.add(15);
								}
								
								else if(Collections.frequency(cards, 16) > 0 && discard.size()>20) {
									play.add(16);
									cards.remove(cards.indexOf(16));
									discard.add(16);
								}
							}
						}
						
						if(num.getText().equals("3")) {
							boolean c = false;
							for(int i = 2; i<15; i++) {
								if(Collections.frequency(cards, i) == 3) {
									if(current.get(0)<i) {
										for(int j = 0; j<3; j++) {
											play.add(i);
											cards.remove(cards.indexOf(i));
											discard.add(i);
										}
										b = true;
										break;
										
									}
								}
								
							}
							
							if(b == false) {
								if(discard.size() > 10) {
									if(cards.indexOf(16) != -1) {
										play.add(16);
										cards.remove(cards.indexOf(16));
										discard.add(16);
									}
								}
								
								else if(cards.get(cards.size()-1) == 15 && cards.get(cards.size()-2) == 15 && discard.size()>35){
									for(int i = 0; i < 2; i++) {
										play.add(15);
										cards.remove(cards.indexOf(15));
										discard.add(15);
									}
									
								}
								
							}
						}
						
						if(num.getText().equals("4")) {
							boolean c = false;
							for(int i = 2; i<15; i++) {
								if(Collections.frequency(cards, i) == 4) {
									if(current.get(0)<i) {
										for(int j = 0; j<4; j++) {
											play.add(i);
											cards.remove(cards.indexOf(i));
											discard.add(i);
										}
										b = true;
										
									}
								}
							}
							
							if(b == false) {
								if(discard.size() > 10) {
									if(cards.indexOf(16) != -1) {
										play.add(16);
										cards.remove(cards.indexOf(16));
										discard.add(16);
									}
								}
								
								else if(cards.get(cards.size()-1) == 15 && cards.get(cards.size()-2) == 15 && discard.size()>35){
									for(int i = 0; i < 2; i++) {
										play.add(15);
										cards.remove(cards.indexOf(15));
										discard.add(15);
									}
									
								}
								
							}
							
						}
						
					}
					//ENDGAME MOVE
					else {
						if(Integer.parseInt(num.getText())>2) {
							if(cards.contains(16) || Collections.frequency(cards, 15) >=2) {
								while(cards.size() >0) {
									play.add(cards.get(0));
									cards.remove(0);
								}
							}
							else {
								if(Collections.frequency(cards, cards.get(0)) >= Integer.parseInt(num.getText()) && cards.get(0)>=current.get(0)) {
									for(int i = 0; i<Integer.parseInt(num.getText()); i++) {
										play.add(cards.get(0));
										cards.remove(0);
									}
								}
							}
							
						}
						else {
							if(Collections.frequency(cards, 15)+Collections.frequency(cards, 16) == 0) {
								if(Collections.frequency(cards, cards.get(0)) >= Integer.parseInt(num.getText()) && cards.get(0)>=current.get(0)) {
									for(int i = 0; i<Integer.parseInt(num.getText()); i++) {
										play.add(cards.get(0));
										cards.remove(0);
									}
								}
							}
							
							else {
								while(cards.size() > 0) {
									play.add(cards.get(0));
									cards.remove(0);
								}
								
							}
						}
					}
	    			
	    			enterLast.setBounds(0,0,0,0);
	    			input.setBounds(0,0,0,0);
	    			inputNum.setBounds(0,0,0,0);
	    			pp.setBounds(200,525,200,50);
	    			turn.setBounds(200,200,200,200);
	    			
	    			String t = "";
	    			
	    			if(play.size() == 0) {
						turn.setText("Pass");
					}
					else {
						t = "Playing: ";
						for(int i = 0; i<play.size(); i++) {
							if(play.get(i)>=3 && play.get(i)<=10) {
								t = t + play.get(i) + " ";
							}
							else if(play.get(i)==11) {
								t = t + "J ";
							}
							else if(play.get(i)==12) {
								t = t + "Q ";
							}
							else if(play.get(i)==13) {
								t = t + "K ";
							}
							else if(play.get(i)==14) {
								t = t + "A ";
							}
							else if(play.get(i)==15) {
								t = t + "2 ";
							}
							else {
								t = t + "Joker ";
							}
						}
						turn.setText(t);
					}
					System.out.println("You have "+cards.size()+" cards remaining");
					
					while(current.size()>0) {
						current.remove(0);
					}
					
					while(play.size()>0) {
						play.remove(0);
					}
					
					ArrayList<Integer> distinct = new ArrayList<Integer>();
					for(int i = 0; i<cards.size(); i++) {
						if(distinct.contains(cards.get(i)) == false && cards.get(i)<15) {
							distinct.add(cards.get(i));
						}
					}
					
					notBurns.setText(Integer.toString(distinct.size()));
					
					while(distinct.size()>0) {
						distinct.remove(0);
					}
					
					if(cards.size() == 0) {
						System.out.println("Deck cleared!");
						toggle.setBounds(0,0,0,0);
					}
					
					specify.setBounds(0,0,0,0);
					enterLast.setBounds(0,0,0,0);
	    			input.setBounds(0,0,0,0);
	    			inputNum.setBounds(0,0,0,0);
	    			pp.setBounds(200,525,200,50);
	    			panel.validate();
	    			panel.repaint();
	        	}
	    		
	        }
	    	
	    });
	    
	    pp.addActionListener(new ActionListener() {

	        public void actionPerformed(ActionEvent PP)
	        {
	        	String t = "";
	        	if(cards.size()>0) {
	        		for(int i = 0; i<cards.size(); i++) {
	        			if(cards.get(i)>=3 && cards.get(i)<=10) {
							t = t + cards.get(i) + " ";
						}
						else if(cards.get(i)==11) {
							t = t + "J ";
						}
						else if(cards.get(i)==12) {
							t = t + "Q ";
						}
						else if(cards.get(i)==13) {
							t = t + "K ";
						}
						else if(cards.get(i)==14) {
							t = t + "A ";
						}
						else if(cards.get(i)==15) {
							t = t + "2 ";
						}
						else {
							t = t + "Joker ";
						}
	        			cardList.setText(t);
	        		}
	        		turn.setBounds(0,0,0,0);
	        		pp.setBounds(0,0,0,0);
	        		input.setBounds(350,290,150,20);
		        	invalid.setBounds(350, 310, 250, 20);
		        	inputNum.setBounds(100,290,300,20);
		        	enter.setBounds(200,525,200,50);
		        	inputNum.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		        	inputNum.setText("How many cards have been played since your last turn?");
	        	}
	        	else {
	        		turn.setBounds(0,0,0,0);
	        		pp.setBounds(0,0,0,0);
	        		deck.setBounds(0,0,0,0);
	        		cardList.setBounds(0,0,0,0);
	        		clear.setBounds(200,200,200,200);
	        	}
	        	
	        }
	    });
	    
	    toggle.addActionListener(new ActionListener() {

	        public void actionPerformed(ActionEvent tog)
	        {
	        	if(visible.getText().equals("")) {
	        		visible.setText("1");
	        		cardList.setBounds(100, 75, 500, 20);
	        		deck.setBounds(100,50,500,20);
	        	}
	        	else {
	        		visible.setText("");
	        		cardList.setBounds(0,0,0,0);
	        		deck.setBounds(0,0,0,0);
	        	}
	        	
	        }
	    });
	}

}
