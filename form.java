import java.awt.*;
import javax.swing.*;

public class form {
    JFrame jf;
    JLabel nm, add, sex, hobbies, languages, blank;
    JButton ok, clear;
    JTextField name;
    JTextArea address;
    JRadioButton m, f;
    JCheckBox cric, bad, dance, music;
    ButtonGroup bg;
    JList list;
    JScrollPane scr;
    JPanel panel1, panel2, panel3, panel4, panel5, main;

    form()
    {
        String lang[] = {"C","C++","Java","Pascal","Fortran","COBOL"};
        jf = new JFrame("Demo of Swing components");
        ok = new JButton("OK");
        clear = new JButton("Clear");
        m = new JRadioButton("Male",true);
        f = new JRadioButton("Female");
        bg = new ButtonGroup();
        sex = new JLabel("             Sex");
        hobbies = new JLabel("         hobbies");
        blank = new JLabel();
        cric = new JCheckBox("Cricket",true);
        bad = new JCheckBox("Badminton");
        dance = new JCheckBox("Dance");
        music = new JCheckBox("Music");
        languages = new JLabel("     Languages Known");
        list = new JList(lang);
        list.setVisibleRowCount(3);
        scr = new JScrollPane(list, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        nm = new JLabel("Name");
        add = new JLabel("Address");
        name = new JTextField(20);
        address = new JTextArea(3,18);
        panel1 = new JPanel();
        panel2 = new JPanel(new GridLayout(1,3));
        panel3 = new JPanel();
        panel4 = new JPanel(new GridLayout(1,2));
        panel5 = new JPanel();
        main = new JPanel(new GridLayout(5,1));
        bg.add(m);
        bg.add(f);

        panel1.add(nm);
        panel1.add(name);
        panel1.add(add);
        panel1.add(address);
        panel2.add(sex);
        panel2.add(m);
        panel2.add(f);
        panel3.setLayout(new GridLayout(2,3));
        panel3.add(hobbies);
        panel3.add(cric);
        panel3.add(bad);
        panel3.add(blank);
        panel3.add(dance);
        panel3.add(music);
        panel4.add(languages);
        panel4.add(scr,BorderLayout.NORTH);
        panel5.add(ok);
        panel5.add(clear);

        main.add(panel1);
        main.add(panel2);
        main.add(panel3);
        main.add(panel4);
        main.add(panel5);

        jf.add(main);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setSize(300,350);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        form f = new form();
    }
}
