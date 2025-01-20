package opdrachten;

public class SteenPapierSchaar {

	public static void main(String[] args) {

		import javax.swing.*;
		import java.awt.*;
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;
		import java.util.Random;

		public class RockPaperScissors extends JFrame implements ActionListener {

		    private JLabel label;
		    private JButton rockButton, paperButton, scissorsButton;
		    private JTextArea resultArea;

		    public RockPaperScissors() {
		        setTitle("Steen, Papier, Schaar");
		        setSize(400, 300);
		        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        setLocationRelativeTo(null);

		        // Panel voor de knoppen
		        JPanel panel = new JPanel();
		        panel.setLayout(new GridLayout(2, 2));

		        // Knoppen voor keuzes
		        rockButton = new JButton("Steen");
		        paperButton = new JButton("Papier");
		        scissorsButton = new JButton("Schaar");

		        // Voeg actie listeners toe aan de knoppen
		        rockButton.addActionListener(this);
		        paperButton.addActionListener(this);
		        scissorsButton.addActionListener(this);

		        // Voeg knoppen toe aan het panel
		        panel.add(rockButton);
		        panel.add(paperButton);
		        panel.add(scissorsButton);

		        // Label voor het weergeven van het resultaat
		        label = new JLabel("Maak je keuze!", SwingConstants.CENTER);
		        label.setFont(new Font("Arial", Font.PLAIN, 20));

		        // Resultaat area
		        resultArea = new JTextArea();
		        resultArea.setEditable(false);
		        resultArea.setFont(new Font("Arial", Font.PLAIN, 16));

		        // Voeg alles toe aan het frame
		        add(label, BorderLayout.NORTH);
		        add(panel, BorderLayout.CENTER);
		        add(resultArea, BorderLayout.SOUTH);
		    }

		    @Override
		    public void actionPerformed(ActionEvent e) {
		        String playerChoice = "";
		        if (e.getSource() == rockButton) {
		            playerChoice = "Steen";
		        } else if (e.getSource() == paperButton) {
		            playerChoice = "Papier";
		        } else if (e.getSource() == scissorsButton) {
		            playerChoice = "Schaar";
		        }

		        // Kies voor de computer
		        String computerChoice = getComputerChoice();

		        // Bepaal de winnaar
		        String result = determineWinner(playerChoice, computerChoice);

		        // Toon het resultaat
		        label.setText("Jij koos: " + playerChoice + " | Computer koos: " + computerChoice);
		        resultArea.setText(result);
		    }

		    private String getComputerChoice() {
		        String[] choices = {"Steen", "Papier", "Schaar"};
		        Random random = new Random();
		        return choices[random.nextInt(3)];
		    }

		    private String determineWinner(String playerChoice, String computerChoice) {
		        if (playerChoice.equals(computerChoice)) {
		            return "Gelijkspel!";
		        }
		        switch (playerChoice) {
		            case "Steen":
		                return computerChoice.equals("Schaar") ? "Jij wint!" : "Computer wint!";
		            case "Papier":
		                return computerChoice.equals("Steen") ? "Jij wint!" : "Computer wint!";
		            case "Schaar":
		                return computerChoice.equals("Papier") ? "Jij wint!" : "Computer wint!";
		            default:
		                return "Ongeldige keuze!";
		        }
		    }

		    public static void main(String[] args) {
		        // Maak het spel venster zichtbaar
		        SwingUtilities.invokeLater(() -> {
		            new RockPaperScissors().setVisible(true);
		        });
		    }
		}


	}

}
