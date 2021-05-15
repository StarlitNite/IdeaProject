package observer.v3;

import java.awt.*;

public class LineDecorate extends BarPic{
    private BarPic barPic;
    public LineDecorate(BarPic barPic){
        super(barPic.getColor(),barPic.getName(),barPic.getScope(),barPic.getValue());
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.black);
        g.drawLine(10, 10, 10, 260);
        g.drawLine(0, 250, 200, 250);

    }
}
