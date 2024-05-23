package Snake;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

import RandomStuff.Area;

public class CustomButton extends JButton {
    private int round = 5;

    public CustomButton(){
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(0,0,0,0));
    }

    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int x = 0;
        int y = 0;
        int width = getWidth();
        int height = getHeight();
        // Area area = new Area(new RoundRectangle2D.Double(x, y, width, height, round, round));
    }

}
