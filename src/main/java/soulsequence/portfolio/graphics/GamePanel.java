package soulsequence.portfolio.graphics;

import soulsequence.portfolio.game.entity.Player;
import soulsequence.portfolio.input.KeyHandler;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Logger;

public class GamePanel extends JPanel implements Runnable {

    private static final Logger LOGGER = Logger.getLogger(GamePanel.class.getName());

    // SCREEN SETTINGS
    private final int originalTileSize = 36; // 16x16 tile
    private final int scale = 2;

    public final int tileSize = originalTileSize * scale; // 72x72 tile
    private final int maxScreenCol = 16;
    private final int maxScreenRow = 12;
    private final int screenWidth = tileSize * maxScreenCol; // 1152 pixels
    private final int screenHeight = tileSize * maxScreenRow; // 864 pixels

    // FPS
    int FPS = 30;

    KeyHandler keyHandler = new KeyHandler();
    Thread gameThread;
    Player player = new Player(this, keyHandler);


    // Set player's default position
    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 8;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyHandler);
        this.setFocusable(true);
    }


    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        double drawInterval = 1000000000/FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        long timer = 0;
        int drawCount = 0;

        while(gameThread != null) {

            currentTime = System.nanoTime();

            delta += (currentTime - lastTime) / drawInterval;
            timer += (currentTime - lastTime);
            lastTime = currentTime;

            if(delta >= 1) {
                update();
                repaint();
                delta--;
                drawCount++;
            }

            if(timer >= 1000000000) {
                System.out.println("FPS:" + drawCount);
                drawCount = 0;
                timer = 0;
            }
        }
    }

    public void update(){
        player.update();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        player.draw(g2);

        g2.dispose();
    }
}
