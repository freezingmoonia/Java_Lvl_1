import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JFrame {

    private int value;

    public Counter(int init) {
        setTitle("Counter");                                                 //название главного окна
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);             //"Х" закрывает приложение
        setBounds(300, 300, 300, 120);                                       //координаты
        Font font = new Font("Arial", Font.BOLD, 32);                        //шрифт

        //начало текстового поля
        JTextField counterValueView = new JTextField();
        counterValueView.setFont(font);                                      //применение шрифта
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);      //выравнивание текста по центру
        add(counterValueView, BorderLayout.CENTER);                          //инициализация и выравнивание кнопки по центру
        value = init;
        counterValueView.setText(String.valueOf(value));
        counterValueView.addActionListener(new ActionListener() {            //добавление функций к текстовому полю
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Integer.parseInt(counterValueView.getText());        //применение значения при нажатии "Enter"
            }
        });
        //конец текстового поля

        //начало кнопки
        JButton increment = new JButton(">");
        increment.setFont(font);
        add(increment, BorderLayout.EAST);
        increment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;
                counterValueView.setText(String.valueOf(value));
            }
        });
        //конец кнопки

        //начало второй кнопки
        JButton decrement = new JButton("<");
        decrement.setFont(font);
        add(decrement, BorderLayout.WEST);
        decrement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                counterValueView.setText(String.valueOf(value));
            }
        });
        //конец второй кнопки

        setVisible(true);                                                     //сдклать видимым наше главное окно
    }

    public static void main(String[] args) {
        new Counter(100);
    }
}