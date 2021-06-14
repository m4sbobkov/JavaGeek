
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorFrame extends JFrame {
    private JTextField inputArea;
    private JTextField resultArea;

    public CalculatorFrame() {
        setTitle("Calculator v 1.0");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setBounds(100,100,300,500);
        createMenuBar();



        setLayout(new BorderLayout());



        add(createTopPanel(), BorderLayout.NORTH);
        add(createRightPanel(), BorderLayout. EAST);
        add(createBottomPanel(),BorderLayout.CENTER);


        setVisible(true);
    }

    private JPanel createTopPanel(){
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        resultArea = new JTextField();
        resultArea.setEditable(false);
        top.add(resultArea, BorderLayout.NORTH);
        inputArea = new JTextField();
        inputArea.setEditable(false);
        top.add(inputArea, BorderLayout.CENTER);

        return top;
    }

    private JPanel createRightPanel() {
        JPanel right = new JPanel();
        right.setLayout(new GridLayout(4,2));

        JButton clear = new JButton("C");
        clear.addActionListener(e -> inputArea.setText(""));
        right.add(clear);

        JButton minus = new JButton("-");
        minus.addActionListener(e -> inputArea.setText(inputArea.getText() + "-"));
        minus.addActionListener(new CalcButtonActionListener(inputArea,resultArea));
        right.add(minus);

        JButton plus = new JButton("+");
        plus.addActionListener(e -> {
            inputArea.setText(inputArea.getText() + "+");
        });
        plus.addActionListener(new CalcButtonActionListener(inputArea,resultArea));
        right.add(plus);


        JButton calc = new JButton("=");
        calc.addActionListener(new CalcButtonActionListener(inputArea,resultArea));
        right.add(calc);

        JButton squad = new JButton("√");
        squad.addActionListener(e -> resultArea.setText(String.valueOf(Math.sqrt(Float.parseFloat(inputArea.getText())))));
        right.add(squad);


        return right;
    }

    private JPanel createBottomPanel(){
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(4,3));

        DigitButtonActionListener digitButtonActionListener = new DigitButtonActionListener(inputArea);

        for (int i = 0; i < 10; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(digitButtonActionListener);
            bottom.add(btn);


        }
        JButton multy = new JButton("*");
        multy.addActionListener(e -> inputArea.setText(inputArea.getText() + "*"));
        multy.addActionListener(new CalcButtonActionListener(inputArea,resultArea));
        bottom.add(multy);

        JButton div = new JButton("/");
        div.addActionListener(e -> inputArea.setText(inputArea.getText() + "/"));
        div.addActionListener(new CalcButtonActionListener(inputArea,resultArea));
        bottom.add(div);



        return bottom;
    }


    private JMenuBar createMenuBar (){
        JMenuBar JmenuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        setJMenuBar(JmenuBar);
        JMenuItem openItem = new JMenu("Open");
        fileMenu.add(openItem);


        JMenuItem exitItem = new JMenu("Exit");
        fileMenu.add(exitItem);



        JmenuBar.add(fileMenu);

        return JmenuBar;
    }
}
