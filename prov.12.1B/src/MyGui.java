import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGui implements ActionListener {
    JFrame frame;
    private JButton colorButton;
    private JButton labelButton;
    JLabel label;
    //private JEditorPane label;

    public static void main(String[] args) {
        MyGui gui = new MyGui();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyDrawPanel drawPanel = new MyDrawPanel();
        colorButton = new JButton("Touch me for change color");
        labelButton = new JButton("Touch me for change label");
        colorButton.addActionListener(this);
        labelButton.addActionListener(this);
        label = new JLabel("my text");
        frame.add(BorderLayout.SOUTH,colorButton);
        frame.add(BorderLayout.EAST,labelButton);
        frame.add(BorderLayout.CENTER,drawPanel);
        frame.add(BorderLayout.WEST,label);
        frame.setSize(300,300);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == colorButton) {
            frame.repaint();
        } else {
            label.setText("Pain!");


        }
    }

    //public void setLabel(JEditorPane label) {
    //    this.label = label;
    //}
//
    //public void setFrame(DefaultListCellRenderer frame) {
    //    this.frame = frame;
    //}
}