package pacman;

//package qui contient des classes pour créer des interfaces graphiques comme JPanel, JFrame, JButton
import javax.swing.JFrame;

public class App {

	public static void main (String [] args) throws Exception {
		int rowCount = 21;
		int columnCount = 19;
		int tileSize = 32;
		int boardWidth = columnCount * tileSize;
		int boardHeight = rowCount * tileSize;
		
		JFrame frame = new JFrame("Pac Man");
		//definit la taille correcte en fonction du calcul
		frame.setSize(boardWidth, boardHeight);
		//centre la fenetre sur l'écran
		frame.setLocationRelativeTo(null);
		//empeche l'utilisateur de redimensionner la fenetre
		frame.setResizable(false);
		//l'app doit se fermer quand l'utilisateur clique sur la croix
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PacMan pacmanGame = new PacMan();
		frame.add(pacmanGame);
		frame.pack();
		pacmanGame.requestFocus();
		
		//rend la fenetre visible -- à mettre à la fin pour que toutes les conditions soient prises en compte
		frame.setVisible(true);
	}

}