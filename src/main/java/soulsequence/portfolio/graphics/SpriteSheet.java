package soulsequence.portfolio.graphics;

import soulsequence.portfolio.game.entity.Direction;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpriteSheet extends Sprite{

    // Sprite Dimensions
    private final int spriteWidth;
    private final int spriteHeight;
    private Map<Direction, Integer> animationDelays = new HashMap<>();
    //Sprite Animations
    private BufferedImage[][] animations = new BufferedImage[4][3];
    private BufferedImage[] downDir = new BufferedImage[4];
    private BufferedImage[] leftDir = new BufferedImage[4];
    private BufferedImage[] rightDir = new BufferedImage[4];
    private BufferedImage[] upDir = new BufferedImage[4];

    public SpriteSheet(String path, int spriteWidth, int spriteHeight) {
        super(path);
        this.spriteWidth = spriteWidth;
        this.spriteHeight = spriteHeight;
        setDirs();
        setDefaultDelays();
        // Debugging, Writing the separate images to a file.
        animations[0] = downDir;
        animations[1] = leftDir;
        animations[2] = rightDir;
        animations[3] = upDir;

        File dir = new File("src/main/resources/player/testSprites");
        if (!dir.exists()) {
            dir.mkdirs();
        }

        for (int j = 0; j < animations.length; j++) {
            BufferedImage[] animation = animations[j];
            for (int i = 0; i < animation.length; i++) {
                try {
                    if (animation[i] != null) {
                        ImageIO.write(animation[i], "png", new File("src/main/resources/player/" +
                                "testSprites/splitimg" + j + "_" + i + ".png"));
                        System.out.println("Image " + j + "_" + i + " written successfully.");
                    } else {
                        System.out.println("Failed to write image " + j + "_" + i + ": BufferedImage is null.");
                    }
                } catch (IOException e) {
                    System.out.println("Error writing image " + j + "_" + i + ": " + e.getMessage());
                    e.printStackTrace();
                }
            }
        }
    }

    public BufferedImage getFrame(Direction direction) {
        return getFrame(direction, 0);
    }

    public BufferedImage getFrame(Direction direction, int time) {
        int animationLength = getAnimationLength(direction);
        int validTime = Math.min(time, animationLength - 1);
        return animations[direction.getDirection()][validTime];
    }

    private void setDirs() {
        // Down
        downDir[0] = getSprite(1, 0);
        downDir[1] = getSprite(2, 0);
        downDir[2] = getSprite(1, 0);
        downDir[3] = getSprite(0, 0);

        // Left
        leftDir[0] = getSprite(1, 1);
        leftDir[1] = getSprite(2, 1);
        leftDir[2] = getSprite(1, 1);
        leftDir[3] = getSprite(0, 1);

        // Right
        rightDir[0] = getSprite(1, 2);
        rightDir[1] = getSprite(2, 2);
        rightDir[2] = getSprite(1, 2);
        rightDir[3] = getSprite(0, 2);

        // Up
        upDir[0] = getSprite(1, 3);
        upDir[1] = getSprite(2, 3);
        upDir[2] = getSprite(1, 3);
        upDir[3] = getSprite(0, 3);
    }

    private BufferedImage getSprite(int x, int y) {
        return this.sprite.getSubimage(x * spriteWidth, y * spriteHeight, this.spriteWidth, this.spriteHeight);
    }

    public int getAnimationLength(Direction direction) {
        return animations[direction.getDirection()].length;
    }

    // Set default delays for each direction (in milliseconds)
    private void setDefaultDelays() {
        animationDelays.put(Direction.Down, 200);  // 200ms for down direction
        animationDelays.put(Direction.Left, 150);  // 150ms for left direction
        animationDelays.put(Direction.Right, 150);  // 150ms for right direction
        animationDelays.put(Direction.Up, 200);  // 200ms for up direction
    }

    // Get the delay for the given direction
    public int getAnimationDelay(Direction direction) {
        return animationDelays.getOrDefault(direction, 200);  // Default delay if not set
    }
}
