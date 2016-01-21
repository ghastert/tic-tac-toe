package edu.jsu.mcis;

import java.util.*;

public class TicTacToeBoard extends javax.swing.JFrame {

    public static TicTacToe game = new TicTacToe();
	public static WinnerMessage winnerMessage = new WinnerMessage();
    public TicTacToeBoard() {
        boardComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void boardComponents() {

        resetButton = new javax.swing.JButton();
        horizontalBar1 = new javax.swing.JSeparator();
        horizontalBar2 = new javax.swing.JSeparator();
        middleLeftVerticalBar = new javax.swing.JSeparator();
        middleRightVerticalBar = new javax.swing.JSeparator();
        bottomRightVerticalBar = new javax.swing.JSeparator();
        bottomLeftVerticalBar = new javax.swing.JSeparator();
        upperLeftVerticalBar = new javax.swing.JSeparator();
        welcomeMessage = new javax.swing.JLabel();
        upperRightVerticalBar = new javax.swing.JSeparator();
        upperLeftButton = new javax.swing.JButton();
        upperMiddleButton = new javax.swing.JButton();
        upperRightButton = new javax.swing.JButton();
        middleLeftButton = new javax.swing.JButton();
        middleMiddleButton = new javax.swing.JButton();
        middleRightButton = new javax.swing.JButton();
        bottomRightButton = new javax.swing.JButton();
        bottomMiddleButton = new javax.swing.JButton();
        bottomLeftButton = new javax.swing.JButton();
        middleText = new javax.swing.JTextField();
        middleRightText = new javax.swing.JTextField();
        upperMiddleText = new javax.swing.JTextField();
        upperRightText = new javax.swing.JTextField();
        bottomRightText = new javax.swing.JTextField();
        bottomMiddleText = new javax.swing.JTextField();
        upperLeftText = new javax.swing.JTextField();
        middleLeftText = new javax.swing.JTextField();
        bottomLeftText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        resetButton.setText("Reset");

        middleLeftVerticalBar.setOrientation(javax.swing.SwingConstants.VERTICAL);

        middleRightVerticalBar.setOrientation(javax.swing.SwingConstants.VERTICAL);

        bottomRightVerticalBar.setOrientation(javax.swing.SwingConstants.VERTICAL);

        bottomLeftVerticalBar.setOrientation(javax.swing.SwingConstants.VERTICAL);

        upperLeftVerticalBar.setOrientation(javax.swing.SwingConstants.VERTICAL);

        welcomeMessage.setText("Welcome To Tic Tac Toe!");

        upperRightVerticalBar.setOrientation(javax.swing.SwingConstants.VERTICAL);

        upperLeftButton.setText("Positon 1");

        upperMiddleButton.setText("Position 2");

        upperRightButton.setText("Position 3");

        middleLeftButton.setText("Position 4");

        middleMiddleButton.setText("Position 5");

        middleRightButton.setText("Position 6");

        bottomRightButton.setText("Position 9");

        bottomMiddleButton.setText("Position 8");

        bottomLeftButton.setText("Position 7");
        
        upperLeftButton.addActionListener(new java.awt.event.ActionListener()
                {
                    public void actionPerformed(java.awt.event.ActionEvent event)
                    {
                        upperLeftButtonClicked(event);
                    }
                });
        upperMiddleButton.addActionListener(new java.awt.event.ActionListener()
                {
                    public void actionPerformed(java.awt.event.ActionEvent event)
                    {
                        upperMiddleButtonClicked(event);
                    }
                });
        upperRightButton.addActionListener(new java.awt.event.ActionListener()
        {
           public void actionPerformed(java.awt.event.ActionEvent event)
           {
               upperRightButtonClicked(event);
           }
        });
        middleLeftButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent event)
            {
                middleLeftButtonClicked(event);
            }
        });
        middleMiddleButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent event)
            {
                middleButtonClicked(event);
            }
        });
        middleRightButton.addActionListener(new java.awt.event.ActionListener()
        {
           public void actionPerformed(java.awt.event.ActionEvent event)
           {
               middleRightButtonClicked(event);
           }
        });
        bottomLeftButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent event)
            {
                bottomLeftButtonClicked(event);
            }
        });
        bottomMiddleButton.addActionListener(new java.awt.event.ActionListener()
        {
           public void actionPerformed(java.awt.event.ActionEvent event)
           {
               bottomMiddleButtonClicked(event);
           }
        });
        bottomRightButton.addActionListener(new java.awt.event.ActionListener()
        {
           public void actionPerformed(java.awt.event.ActionEvent event)
           {
               bottomRightButtonClicked(event);
           }
        });
		resetButton.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent event)
			{
				resetButtonClicked(event);
			}
		});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(horizontalBar2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(middleLeftButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(middleLeftText, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addComponent(middleLeftVerticalBar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(middleText, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                        .addGap(91, 91, 91))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(middleMiddleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(middleRightVerticalBar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(middleRightButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(middleRightText, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
            .addComponent(horizontalBar1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(upperLeftButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(upperLeftText, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addComponent(upperLeftVerticalBar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(upperMiddleButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(upperMiddleText, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(upperRightVerticalBar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(upperRightText, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(upperRightButton)))
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(bottomLeftButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(bottomLeftText, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addComponent(bottomLeftVerticalBar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(bottomMiddleButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(bottomMiddleText, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bottomRightVerticalBar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(bottomRightButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(bottomRightText, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resetButton)))
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(welcomeMessage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeMessage)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(upperRightVerticalBar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upperLeftVerticalBar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(upperLeftText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(upperLeftButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(upperMiddleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(upperMiddleButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(upperRightText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(upperRightButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(horizontalBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(middleRightVerticalBar, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                            .addComponent(middleLeftVerticalBar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(middleText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(middleRightText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(middleRightButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(middleMiddleButton)))
                        .addGap(62, 62, 62)))
                .addComponent(horizontalBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bottomRightVerticalBar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bottomRightText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bottomRightButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resetButton)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bottomMiddleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bottomMiddleButton))
                            .addComponent(bottomLeftVerticalBar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bottomLeftText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bottomLeftButton)))
                        .addContainerGap(88, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(middleLeftText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(middleLeftButton)
                .addGap(275, 275, 275))
        );

        pack();
    }// </editor-fold>                        

    private void upperLeftButtonClicked(java.awt.event.ActionEvent event)
    {
        char mark = 'a';
        String currentMark = "a";
		String message = "b";
        if(game.isSpotAvailable(0, 0)){
        game.placeMark(0,0);
        currentMark = game.getCurrentMark(mark, currentMark);
        upperLeftText.setText(currentMark);
        if(game.isTheBoardFull() && !game.isThereAWinner())
        {
			message = "Game is a tie!";
			winnerMessage.newMessage(message);
            winnerMessage.setVisible(true);
        }
        else if(game.isThereAWinner() && game.getCurrentMark(mark, currentMark).equals("X"))
        {
			message = "Player 1 Wins!";
			winnerMessage.newMessage(message);
            winnerMessage.setVisible(true);
        }
		else if(game.isThereAWinner() && game.getCurrentMark(mark, currentMark).equals("O"))
		{
			message = "Player 2 Wins!";
			winnerMessage.newMessage(message);
			winnerMessage.setVisible(true);
		}
        else{
        game.changePlayer();
        }
        }
    }
    
    private void upperMiddleButtonClicked(java.awt.event.ActionEvent event)
    {
        char mark = 'a';
        String currentMark = "a";
		String message = "b";
        if(game.isSpotAvailable(0, 1)){
        game.placeMark(0,1);
        upperMiddleText.setText(game.getCurrentMark(mark, currentMark));
        if(game.isTheBoardFull() && !game.isThereAWinner())
        {
			message = "Game is a tie!";
			winnerMessage.newMessage(message);
            winnerMessage.setVisible(true);
        }
        else if(game.isThereAWinner() && game.getCurrentMark(mark, currentMark).equals("X"))
        {
			message = "Player 1 Wins!";
			winnerMessage.newMessage(message);
            winnerMessage.setVisible(true);
        }
		else if(game.isThereAWinner() && game.getCurrentMark(mark, currentMark).equals("O"))
		{
			message = "Player 2 Wins!";
			winnerMessage.newMessage(message);
			winnerMessage.setVisible(true);
		}
        else{
        game.changePlayer();
        }
        }
    }
    
    private void upperRightButtonClicked(java.awt.event.ActionEvent event)
    {
        char mark = 'a';
        String currentMark = "a";
		String message = "b";
        if(game.isSpotAvailable(0, 2)){
        game.placeMark(0,2);
        upperRightText.setText(game.getCurrentMark(mark, currentMark));
        if(game.isTheBoardFull() && !game.isThereAWinner())
        {
			message = "Game is a tie!";
			winnerMessage.newMessage(message);
            winnerMessage.setVisible(true);
        }
        else if(game.isThereAWinner() && game.getCurrentMark(mark, currentMark).equals("X"))
        {
			message = "Player 1 Wins!";
			winnerMessage.newMessage(message);
            winnerMessage.setVisible(true);
        }
		else if(game.isThereAWinner() && game.getCurrentMark(mark, currentMark).equals("O"))
		{
			message = "Player 2 Wins!";
			winnerMessage.newMessage(message);
			winnerMessage.setVisible(true);
		}
        else{
        game.changePlayer();
        }
        }
    }
    private void middleLeftButtonClicked(java.awt.event.ActionEvent event)
    {
        
        char mark = 'a';
        String currentMark = "a";
		String message = "b";
        if(game.isSpotAvailable(1, 0)){
        game.placeMark(1,0);
        middleLeftText.setText(game.getCurrentMark(mark, currentMark));
        if(game.isTheBoardFull() && !game.isThereAWinner())
        {
			message = "Game is a tie!";
			winnerMessage.newMessage(message);
            winnerMessage.setVisible(true);
        }
        else if(game.isThereAWinner() && game.getCurrentMark(mark, currentMark).equals("X"))
        {
			message = "Player 1 Wins!";
			winnerMessage.newMessage(message);
            winnerMessage.setVisible(true);
        }
		else if(game.isThereAWinner() && game.getCurrentMark(mark, currentMark).equals("O"))
		{
			message = "Player 2 Wins!";
			winnerMessage.newMessage(message);
			winnerMessage.setVisible(true);
		}
        else{
        game.changePlayer();
        }
        }
    }
    private void middleButtonClicked(java.awt.event.ActionEvent event)
    {
        char mark = 'a';
        String currentMark = "a";
		String message = "Player";
        if(game.isSpotAvailable(1, 1)){
        game.placeMark(1,1);
        middleText.setText(game.getCurrentMark(mark, currentMark));
        if(game.isTheBoardFull() && !game.isThereAWinner())
        {
			message = "Game is a tie!";
			winnerMessage.newMessage(message);
            winnerMessage.setVisible(true);
        }
        else if(game.isThereAWinner() && game.getCurrentMark(mark, currentMark).equals("X"))
        {
			message = "Player 1 Wins!";
			winnerMessage.newMessage(message);
            winnerMessage.setVisible(true);
        }
		else if(game.isThereAWinner() && game.getCurrentMark(mark, currentMark).equals("O"))
		{
			message = "Player 2 Wins!";
			winnerMessage.newMessage(message);
			winnerMessage.setVisible(true);
		}
        else{
        game.changePlayer();
        }
        }   
    }
    private void middleRightButtonClicked(java.awt.event.ActionEvent event)
    {
        char mark = 'a';
        String currentMark = "a";
		String message = "b";
        if(game.isSpotAvailable(1, 2)){
        game.placeMark(1,2);
        middleRightText.setText(game.getCurrentMark(mark, currentMark));
        if(game.isTheBoardFull() && !game.isThereAWinner())
        {
			message = "Game is a tie!";
			winnerMessage.newMessage(message);
            winnerMessage.setVisible(true);
        }
        else if(game.isThereAWinner() && game.getCurrentMark(mark, currentMark).equals("X"))
        {
			message = "Player 1 Wins!";
			winnerMessage.newMessage(message);
            winnerMessage.setVisible(true);
        }
		else if(game.isThereAWinner() && game.getCurrentMark(mark, currentMark).equals("O"))
		{
			message = "Player 2 Wins!";
			winnerMessage.newMessage(message);
			winnerMessage.setVisible(true);
		}
        else{
        game.changePlayer();
        }
        } 
    }
    private void bottomLeftButtonClicked(java.awt.event.ActionEvent event)
    {
        char mark = 'a';
        String currentMark = "a";
		String message = "b";
        if(game.isSpotAvailable(2, 0)){
        game.placeMark(2, 0);
        bottomLeftText.setText(game.getCurrentMark(mark, currentMark));
        if(game.isTheBoardFull() && !game.isThereAWinner())
        {
			message = "Game is a tie!";
			winnerMessage.newMessage(message);
            winnerMessage.setVisible(true);
        }
        else if(game.isThereAWinner() && game.getCurrentMark(mark, currentMark).equals("X"))
        {
			message = "Player 1 Wins!";
			winnerMessage.newMessage(message);
            winnerMessage.setVisible(true);
        }
		else if(game.isThereAWinner() && game.getCurrentMark(mark, currentMark).equals("O"))
		{
			message = "Player 2 Wins!";
			winnerMessage.newMessage(message);
			winnerMessage.setVisible(true);
		}
        else{
        game.changePlayer();
        }
        } 
    }
    private void bottomMiddleButtonClicked(java.awt.event.ActionEvent event)
    {
        char mark = 'a';
        String currentMark = "a";
		String message = "b";
        if(game.isSpotAvailable(2, 1)){
        game.placeMark(2,1);
        bottomMiddleText.setText(game.getCurrentMark(mark, currentMark));
        if(game.isTheBoardFull() && !game.isThereAWinner())
        {
			message = "Game is a tie!";
			winnerMessage.newMessage(message);
            winnerMessage.setVisible(true);
        }
        else if(game.isThereAWinner() && game.getCurrentMark(mark, currentMark).equals("X"))
        {
			message = "Player 1 Wins!";
			winnerMessage.newMessage(message);
            winnerMessage.setVisible(true);
        }
		else if(game.isThereAWinner() && game.getCurrentMark(mark, currentMark).equals("O"))
		{
			message = "Player 2 Wins!";
			winnerMessage.newMessage(message);
			winnerMessage.setVisible(true);
		}
        else{
        game.changePlayer();
        }
        } 
    }
    private void bottomRightButtonClicked(java.awt.event.ActionEvent event)
    {
        char mark = 'a';
        String currentMark = "a";
		String message = "b";
        if(game.isSpotAvailable(2, 2)){
        game.placeMark(2, 2);
        bottomRightText.setText(game.getCurrentMark(mark, currentMark));
        if(game.isTheBoardFull() && !game.isThereAWinner())
        {
			message = "Game is a tie!";
			winnerMessage.newMessage(message);
            winnerMessage.setVisible(true);
        }
        else if(game.isThereAWinner() && game.getCurrentMark(mark, currentMark).equals("X"))
        {
			message = "Player 1 Wins!";
			winnerMessage.newMessage(message);
            winnerMessage.setVisible(true);
        }
		else if(game.isThereAWinner() && game.getCurrentMark(mark, currentMark).equals("O"))
		{
			message = "Player 2 Wins!";
			winnerMessage.newMessage(message);
			winnerMessage.setVisible(true);
		}
        else{
        game.changePlayer();
        }
        } 
    }
	private void resetButtonClicked(java.awt.event.ActionEvent event)
	{
		char mark = 'a';
		String currentMark = "a";
		game.initializeBoard();
		upperLeftText.setText("");
		upperMiddleText.setText("");
		upperRightText.setText("");
		middleLeftText.setText("");
		middleText.setText("");
		middleRightText.setText("");
		bottomLeftText.setText("");
		bottomMiddleText.setText("");
		bottomRightText.setText("");
		if(game.getCurrentMark(mark, currentMark).equals("O"))
		{
			game.changePlayer();
		}
	}
    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToeBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeBoard().setVisible(true);
            }
        });
        
        game.initializeBoard();
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton bottomLeftButton;
    private javax.swing.JTextField bottomLeftText;
    private javax.swing.JSeparator bottomLeftVerticalBar;
    private javax.swing.JButton bottomMiddleButton;
    private javax.swing.JTextField bottomMiddleText;
    private javax.swing.JButton bottomRightButton;
    private javax.swing.JTextField bottomRightText;
    private javax.swing.JSeparator bottomRightVerticalBar;
    private javax.swing.JSeparator horizontalBar1;
    private javax.swing.JSeparator horizontalBar2;
    private javax.swing.JButton middleLeftButton;
    private javax.swing.JTextField middleLeftText;
    private javax.swing.JSeparator middleLeftVerticalBar;
    private javax.swing.JButton middleMiddleButton;
    private javax.swing.JButton middleRightButton;
    private javax.swing.JTextField middleRightText;
    private javax.swing.JSeparator middleRightVerticalBar;
    private javax.swing.JTextField middleText;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton upperLeftButton;
    private javax.swing.JTextField upperLeftText;
    private javax.swing.JSeparator upperLeftVerticalBar;
    private javax.swing.JButton upperMiddleButton;
    private javax.swing.JTextField upperMiddleText;
    private javax.swing.JButton upperRightButton;
    private javax.swing.JTextField upperRightText;
    private javax.swing.JSeparator upperRightVerticalBar;
    private javax.swing.JLabel welcomeMessage;
    // End of variables declaration     
}