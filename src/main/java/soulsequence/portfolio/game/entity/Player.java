package soulsequence.portfolio.game.entity;

import soulsequence.portfolio.graphics.Sprite;
import soulsequence.portfolio.graphics.GamePanel;
import soulsequence.portfolio.graphics.SpriteSheet;
import soulsequence.portfolio.input.KeyHandler;

import java.awt.*;

public class Player extends Entity {
    private GamePanel gp;
    private KeyHandler keyH;
    private int time = 0;
    private long lastFrameTime = 0;
    private long animationDelay = 200;
    private boolean isMoving = false;
    private SpriteSheet sprite; // 24x36
    private int spriteWidth = 24;
    private int spriteHeight = 36;

    public Player(GamePanel gp, KeyHandler keyH) {
        this.gp = gp;
        this.keyH = keyH;
        init();
    }

    public void init() {
        this.sprite = new SpriteSheet("src/main/resources/player/Player.png", spriteWidth, spriteHeight);
        x = 100;
        y = 100;
        speed = 8;
        direction = Direction.Down;
    }

    public void update() {
        boolean keyPressed = false;

        if (keyH.upPressed) {
            direction = Direction.Up;
            y -= speed;
            keyPressed = true;
        }
        else if (keyH.downPressed) {
            direction = Direction.Down;
            y += speed;
            keyPressed = true;
        }
        else if (keyH.leftPressed) {
            direction = Direction.Left;
            x -= speed;
            keyPressed = true;
        } else if (keyH.rightPressed) {
            direction = Direction.Right;
            x += speed;
            keyPressed = true;
        }

        if (keyPressed) {
            long currentTime = System.currentTimeMillis();
            if (currentTime - lastFrameTime >= animationDelay) {
                lastFrameTime = currentTime;
                time = (time + 1) % sprite.getAnimationLength(direction);
            }
        } else {
            time = 0;
        }
    }

    public void draw(Graphics2D g2) {
        g2.drawImage(sprite.getFrame(direction, time), x, y, spriteWidth * 2, spriteHeight * 2, null);
    }
}
