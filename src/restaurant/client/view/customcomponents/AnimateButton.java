package restaurant.client.view.customcomponents;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by Аркадий on 06.04.2016.
 */
public class AnimateButton extends ImageButton {
    private static final int WIDTH = 50;
    private static final int HEIGHT = 50;
    private static final Image PLUS_IMAGE = new ImageIcon(
            "src/restaurant/client/view/resources/controlbuttons/plus.png").getImage();
    //TODO: change image to be drawn
    private static final Image LITTLE_PLUS_IMAGE = new ImageIcon(
            "src/restaurant/client/view/resources/controlbuttons/smallPlus.png").getImage();


    public AnimateButton() {
        super(WIDTH, HEIGHT, PLUS_IMAGE);
    }

    public void startAnimation() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                image = LITTLE_PLUS_IMAGE;
                repaint();
                try {
                    TimeUnit.MILLISECONDS.sleep(150);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                image = PLUS_IMAGE;
                repaint();
            }
        }).start();
    }
}
