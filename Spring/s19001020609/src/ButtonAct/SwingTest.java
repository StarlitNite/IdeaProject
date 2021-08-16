package ButtonAct;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingTest extends JFrame implements ActionListener {
    JButton jb = new JButton();

    public SwingTest() {
        this.setTitle("Java——");

        jb.setText("确定");

        jb.setMnemonic('a');

        this.add(jb);

        this.setBounds(200, 300, 250, 300);

        this.setVisible(true);

        jb.addActionListener(this); //由于SwingTest实现了ActionListener接口，所以给jb添加的ActionListener就是SwingTest实例。

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {// 实现ActionListener接口的actionPerformed接口。

        JDialog frame = new JDialog();//构造一个新的JFrame，作为新窗口。

        frame.setBounds(// 让新窗口与SwingTest窗口示例错开50像素。

                new Rectangle(

                        (int) this.getBounds().getX() + 50,

                        (int) this.getBounds().getY() + 50,

                        (int) this.getBounds().getWidth(),

                        (int) this.getBounds().getHeight()

                )

        );

        JLabel jl = new JLabel();// 注意类名别写错了。

        frame.getContentPane().add(jl);

        jl.setText("这是新窗口");

        jl.setVerticalAlignment(JLabel.CENTER);

        jl.setHorizontalAlignment(JLabel.CENTER);// 注意方法名别写错了。

// 参数 APPLICATION_MODAL：阻塞同一 Java 应用程序中的所有顶层窗口(它自己的子层次

        frame.setModalityType(Dialog.ModalityType.APPLICATION_MODAL); // 设置模式类型。

        frame.setVisible(true);

    }

    public static void main(String args[]) {
        SwingTest s = new SwingTest();

    }

}
