/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.AntrianPasien;
import Model.Pasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

/**
 *
 * @author asus
 */
public class MainFrame extends JFrame implements ActionListener {

    private JMenuBar MenuBar;
    private JMenu fileMenu;
    private JMenuItem exitMenuItem;
    private JLabel judulLabel;
    private JLabel namaLabel;
    private JTextField namaText;
    private JButton saveButton;
    private JLabel noRekam;
    private JLabel alamat;
    private JTextField noRekamText;
    private JTextField alamatText;
    AntrianPasien daftar = new AntrianPasien();
    Pasien a = new Pasien();
    private JLabel Antrian;
    
    

    private JMenuItem fileMenuItem;

    public MainFrame() {
        init();
    }

    public void init() {

        MenuBar = new JMenuBar();
        fileMenu = new JMenu("File");

        MenuBar.add(fileMenu);
        this.setJMenuBar(MenuBar);

        exitMenuItem = new JMenuItem("Exit");
        fileMenuItem = new JMenuItem("New");

        fileMenu.add(fileMenuItem);
        fileMenu.add(exitMenuItem);
        MenuBar.add(fileMenu);

        exitMenuItem.addActionListener(this);
        fileMenuItem.addActionListener(this);

        this.setLayout(null);
        judulLabel = new JLabel("DAFTAR ANTRIAN");
        judulLabel.setBounds(70, 20, 300, 50);
        this.add(judulLabel);

        noRekam = new JLabel("No. RM");
        noRekam.setBounds(20, 60, 100, 50);
        this.add(noRekam);

        noRekamText = new JTextField(" ");
        noRekamText.setBounds(70, 75, 200, 20);
        this.add(noRekamText);

        namaLabel = new JLabel("Nama ");
        namaLabel.setBounds(20, 100, 100, 50);
        this.add(namaLabel);

        namaText = new JTextField(" ");
        namaText.setBounds(70, 115, 200, 20);
        this.add(namaText);

        alamat = new JLabel("Alamat ");
        alamat.setBounds(20, 140, 100, 50);
        this.add(alamat);

        alamatText = new JTextField(" ");
        alamatText.setBounds(70, 155, 200, 20);
        this.add(alamatText);

        saveButton = new JButton("SIMPAN");
        saveButton.setBounds(100, 200, 100, 30);
        this.add(saveButton);
        saveButton.addActionListener(this);

        Antrian = new JLabel();
        Antrian.setBounds(100, 290, 100, 30);
        this.add(Antrian);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitMenuItem) {
            System.exit(0);
        }
        if (e.getSource() == fileMenuItem) {
            TambahPasienJFrame tampil = new TambahPasienJFrame();
            tampil.setSize(300, 400);
            tampil.setVisible(true);
        }
    }

}
