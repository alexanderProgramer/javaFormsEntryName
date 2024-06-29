package corporation.alexander.gym.com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Scheduler extends JFrame implements ActionListener {
    private JLabel titulo;
    private JTextField textField;

    public Scheduler() {
        super("Formulario Básico");

        JButton abrirDialogo;
        getContentPane().setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Etiqueta
        JLabel label = new JLabel("Introduce tu nombre:");
        getContentPane().add(label);

        // Campo de texto
        textField = new JTextField("nombre", 20);
        getContentPane().add(textField);

        // Botón

        abrirDialogo = new JButton("Enviar");
        getContentPane().add(abrirDialogo);
        abrirDialogo.setBounds(450,570,100,50);
        abrirDialogo.addActionListener(this);

        setSize(400, 300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        showDialog();
    }
    public void showDialog(){
        JDialog dialogo = new JDialog(this, "Mi JDialog", true);
        dialogo.setLayout(new FlowLayout());
        JLabel label = new JLabel("Hi from Jlabel -- "+ textField.getText());
        dialogo.add(label);
        JButton closeButton = new JButton("close");
        closeButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dialogo.dispose();
                    }
                }

        );
        dialogo.add(closeButton);
        dialogo.pack();
        dialogo.setLocationRelativeTo(this);
        dialogo.setVisible(true);

    }
}
