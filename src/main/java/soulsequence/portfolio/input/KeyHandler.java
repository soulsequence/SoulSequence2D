package soulsequence.portfolio.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    public boolean upPressed, downPressed, leftPressed, rightPressed;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();

        if(code == KeyEvent.VK_W) { // Up
            upPressed = true;
        }

        if(code == KeyEvent.VK_S) { // Down
            downPressed = true;
        }

        if(code == KeyEvent.VK_A) { // Left
            leftPressed = true;
        }

        if(code == KeyEvent.VK_D) { // Right
            rightPressed = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();

        if(code == KeyEvent.VK_W) { // Up
            upPressed = false;
        }

        if(code == KeyEvent.VK_S) { // Down
            downPressed = false;
        }

        if(code == KeyEvent.VK_A) { // Left
            leftPressed = false;
        }

        if(code == KeyEvent.VK_D) { // Right
            rightPressed = false;
        }
    }
}
