package observer;

import javax.swing.*;
import java.awt.*;

public class nfOb implements Observer{
    @Override
    public void noGoods(String name) {

    }

    @Override
    public void update(JButton button) {
        button.setBackground(Color.red);
    }
}
