import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RPSGui implements ActionListener{
    JFrame frame;
    JButton rockButton;
    JButton paperButton;
    JButton scissorsButton;
    JButton lizardButton;
    JButton spockButton;
    String none = "---------------";
    Rules model = new Rules();
    JLabel playerChoice;
    JLabel compChoice;
    JLabel outcome;
    JLabel wins;
    JLabel losses;
    JLabel ties;
    int w = 0;
    int l = 0;
    int t = 0;
    
    public RPSGui(){
        // Creates JFrame
        frame = new JFrame("Rock-Paper-Scissors");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // GameInfo
        Color darkBlue = new Color(0, 0, 50);
        // Color(red, green, blue)
        playerChoice = new JLabel("User Choice: " + none, JLabel.CENTER);
        playerChoice.setFont(new Font("Impact", Font.PLAIN, 15));
        playerChoice.setForeground(darkBlue);
        compChoice = new JLabel("CPU choice: " + none, JLabel.CENTER);
        compChoice.setFont(new Font("Impact", Font.PLAIN, 15));
        compChoice.setForeground(darkBlue);
        outcome = new JLabel("Outcome: " + none, JLabel.CENTER);
        outcome.setFont(new Font("Impact", Font.PLAIN, 15));
        outcome.setForeground(darkBlue);
        
        // Buttons
        rockButton = new JButton("Rock");
        rockButton.addActionListener(this);
		paperButton = new JButton("Paper");
		paperButton.addActionListener(this);
		scissorsButton = new JButton("Scissors");
		scissorsButton.addActionListener(this);
		lizardButton = new JButton("Lizard");
		lizardButton.addActionListener(this);
		spockButton = new JButton("Spock");
		spockButton.addActionListener(this);
		
		// Stats
		Color purple = new Color(100, 0, 50);
		wins = new JLabel("Wins: --", JLabel.CENTER);
		wins.setFont(new Font("Impact", Font.PLAIN, 15));
		wins.setForeground(purple);
		losses = new JLabel("Losses: --", JLabel.CENTER);
		losses.setFont(new Font("Impact", Font.PLAIN, 15));
		losses.setForeground(purple);
		ties = new JLabel("Ties: --", JLabel.CENTER);
		ties.setFont(new Font("Impact", Font.PLAIN, 15));
		ties.setForeground(purple);
		
        // North panel
        JPanel gameInfo = new JPanel();
        gameInfo.setLayout(new BorderLayout());
        gameInfo.add(playerChoice, BorderLayout.WEST);
        gameInfo.add(compChoice, BorderLayout.EAST);
        gameInfo.add(outcome, BorderLayout.SOUTH);
        
        // Center panel
        JPanel buttons = new JPanel();
		//buttons.setLayout(new BoxLayout(buttons, BoxLayout.X_AXIS));
		buttons.setLayout(new FlowLayout());
		buttons.add(rockButton);
		buttons.add(paperButton);
		buttons.add(scissorsButton);
		buttons.add(lizardButton);
		buttons.add(spockButton);
        
		// South panel
		JPanel stats = new JPanel();
		stats.setLayout(new BorderLayout());
		stats.add(wins, BorderLayout.WEST);
		stats.add(losses, BorderLayout.EAST);
		stats.add(ties, BorderLayout.CENTER);
		
        // Sets frame layout
        frame.setLayout(new BorderLayout());
        
        // Sets panels at positions
        frame.add(gameInfo, BorderLayout.NORTH);
        frame.add(buttons, BorderLayout.CENTER);
		frame.add(stats, BorderLayout.SOUTH);
        
        // Size of frame
        frame.pack();
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        // Variables
		String playerChoice;
		String compChoice = model.getRandomChoice();
		
		// Tests buttons
		if(e.getSource() == rockButton){
			playerChoice = "ROCK";
		}
		else if(e.getSource() == paperButton){
			playerChoice = "PAPER";
		}
		else if(e.getSource() == scissorsButton){
			playerChoice = "SCISSORS";
		}
		else if(e.getSource() == lizardButton){
		    playerChoice = "LIZARD";
		}
		else if(e.getSource() == spockButton){
		    playerChoice = "SPOCK";
		}
		else{
			//if the code gets here, something is wrong
			playerChoice = "ERROR";
		}
		
		//Updates gameInfo
		this.playerChoice.setText("User Choice: " + playerChoice);
		this.compChoice.setText("CPU Choice: " + compChoice);
		
		/* Informs choice
		JOptionPane.showMessageDialog(null, "You choose: " + playerChoice, 
		 "RPS Choice", 1);
		 */
		
		// Changes outcome panel
		String outcome = model.getGameOutcome(playerChoice, compChoice);
		this.outcome.setText("Outcome: " + outcome);
		
		// Checks winner
		String result = model.getGameResult(playerChoice, compChoice);
		if(result.equals("TIE")){
		    t++;
		    this.ties.setText("Ties: " + t);
		} 
		else if(result.equals("WIN")){
		    w++;
		    this.wins.setText("Wins: " + w);
		}
		else if(result.equals("LOSE")){
		    l++;
		    this.losses.setText("Losses: " + l);
		}
	}
	
    public static void main(String[] args){
        new RPSGui();
    }
}