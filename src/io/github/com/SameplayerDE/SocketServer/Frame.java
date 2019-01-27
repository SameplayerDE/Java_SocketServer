package io.github.com.SameplayerDE.SocketServer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {

    private JPanel panel;
    private JPanel top, bottom;
    private JButton exit, reconnect, pause;
    private JList<String> console;


    public Frame() {

        console = new JList<>();
        console.setListData(new String[] {"Hallo"});

        exit = new JButton("Beenden");
        reconnect = new JButton("Neue Verbindung herstellen");
        pause = new JButton("Pausieren");

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });

        panel = new JPanel();
        top = new JPanel();
        bottom = new JPanel();

        panel.setLayout(new GridLayout(2, 1));
        top.setLayout(new GridLayout(1,1));
        bottom.setLayout(new GridLayout(1, 3, 10, 0));

        panel.add(top);
        panel.add(bottom);

        top.add(console);

        bottom.add(exit);
        bottom.add(reconnect);
        bottom.add(pause);

        setTitle("Server");
        setPreferredSize(new Dimension(400, 200));
        setSize(new Dimension(400, 200));
        setResizable(false);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        add(panel);
    }

}
