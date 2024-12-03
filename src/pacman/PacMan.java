package pacman;

//Contient des classes pour dessiner des graphiques, gérer des couleurs, des formes, etc.
import java.awt.*;
//Fournit des interfaces et des classes pour gérer les événements (clavier, souris, etc.).
import java.awt.event.*;
//class pour manipuler des grps de données
import java.util.HashSet;
//class pour générer des nombres aléatoires
import java.util.Random;
//package qui contient des classes pour créer des interfaces graphiques comme JPanel, JFrame, JButton
import javax.swing.*;

public class PacMan extends JPanel {
	private int rowCount = 21;
	private int columnCount = 19;
	private int tileSize = 32;
	private int boardWidth = columnCount * tileSize;
	private int boardHeight = rowCount * tileSize;
	
	private Image wallImage;
    private Image blueGhostImage;
    private Image orangeGhostImage;
    private Image pinkGhostImage;
    private Image redGhostImage;

    private Image pacmanUpImage;
    private Image pacmanDownImage;
    private Image pacmanLeftImage;
    private Image pacmanRightImage;
	
	PacMan() {
		setPreferredSize(new Dimension(boardWidth, boardHeight));
		setBackground(Color.BLACK);
		
	}
	
}
