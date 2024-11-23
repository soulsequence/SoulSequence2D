package soulsequence.portfolio.main;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Logger;

public class GamePanel extends JPanel implements Runnable {

    private static final Logger LOGGER = Logger.getLogger(GamePanel.class.getName());

    // SCREEN SETTINGS
    final int originalTileSize = 36; // 36x36 tile
    final int scale = 2;

    final int tileSize = originalTileSize * scale; // 72x72 tile
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol; // 1152 pixels
    final int screenHeight = tileSize * maxScreenRow; // 864 pixels

    // FPS
    int FPS = 30;

    KeyHandler keyHandler = new KeyHandler();
    Thread gameThread;

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

        if(keyHandler.upPressed == true) {
            playerY -= playerSpeed;
        }
        else if (keyHandler.downPressed == true) {
            playerY += playerSpeed;
        }
        else if (keyHandler.leftPressed == true) {
            playerX -= playerSpeed;
        }
        else if(keyHandler.rightPressed == true) {
            playerX += playerSpeed;
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.white);

        g2.fillRect(playerX, playerY, tileSize, tileSize);

        g2.dispose();
    }
}
