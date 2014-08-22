package core;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GUI extends JFrame {
	private static final long serialVersionUID = 1L;
	Methods methods = new Methods();
	private JPanel contentPane;
	private JTextField txtRufnummerKopieren;
	private JButton btnAbbrechen;
	private JButton btnHalten;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton btnAuflegen;
	private JButton btnLautsprecher;
	private JButton btnLauter;
	private JButton btnLeiser;
	private JButton btnModus;
	private JTextField txtTastaturmodus;
	private Boolean modus = false;
	private String nummernfeld = "Rufnummer einfügen";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 426);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmBeenden = new JMenuItem("Beenden");
		mntmBeenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menuBar.add(mntmBeenden);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		txtRufnummerKopieren = new JTextField();
		txtRufnummerKopieren.setBounds(17, 5, 135, 26);
		txtRufnummerKopieren.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				if (txtRufnummerKopieren.getText().equals(nummernfeld)) {
					txtRufnummerKopieren.setText("");
				}
			}
		});
		txtRufnummerKopieren.setText(nummernfeld);
		txtRufnummerKopieren.setColumns(10);

		JButton btnBestaetigen = new JButton("Best\u00E4tigen");
		btnBestaetigen.setBounds(416, 5, 117, 26);
		btnBestaetigen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					methods.pressKey("ENTER");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		btnAbbrechen = new JButton("Abbrechen");
		btnAbbrechen.setBounds(416, 81, 117, 26);
		btnAbbrechen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					methods.pressKey("CANCEL");

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		btnHalten = new JButton("Halten");
		btnHalten.setBounds(287, 43, 117, 26);
		btnHalten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					methods.pressKey("F_HOLD");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		button = new JButton("*");
		button.setBounds(17, 133, 41, 26);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (modus == false) {
					try {
						methods.pressKey("*");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else if (modus == true) {
					try {
						methods.dtmf("*");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		button_1 = new JButton("0");
		button_1.setBounds(64, 133, 41, 26);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (modus == false) {
					try {
						methods.pressKey("0");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else if (modus == true) {
					try {
						methods.dtmf("0");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		button_2 = new JButton("#");
		button_2.setBounds(111, 133, 41, 26);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (modus == false) {
					try {
						// ASCII Kodierung, da sonst nicht richtig erkannt
						methods.pressKey("%23");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else if (modus == true) {
					try {
						// ASCII Kodierung, da sonst nicht richtig erkannt
						methods.dtmf("%23");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		button_3 = new JButton("7");
		button_3.setBounds(17, 101, 41, 26);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (modus == false) {
					try {
						methods.pressKey("7");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else if (modus == true) {
					try {
						methods.dtmf("7");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		button_4 = new JButton("8");
		button_4.setBounds(64, 101, 41, 26);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (modus == false) {
					try {
						methods.pressKey("8");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else if (modus == true) {
					try {
						methods.dtmf("8");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		button_5 = new JButton("9");
		button_5.setBounds(111, 101, 41, 26);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (modus == false) {
					try {
						methods.pressKey("9");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else if (modus == true) {
					try {
						methods.dtmf("9");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		button_6 = new JButton("4");
		button_6.setBounds(17, 69, 41, 26);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (modus == false) {
					try {
						methods.pressKey("4");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else if (modus == true) {
					try {
						methods.dtmf("4");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		button_7 = new JButton("5");
		button_7.setBounds(64, 69, 41, 26);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (modus == false) {
					try {
						methods.pressKey("5");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else if (modus == true) {
					try {
						methods.dtmf("5");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		button_8 = new JButton("6");
		button_8.setBounds(111, 69, 41, 26);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (modus == false) {
					try {
						methods.pressKey("6");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else if (modus == true) {
					try {
						methods.dtmf("6");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		button_9 = new JButton("1");
		button_9.setBounds(17, 37, 41, 26);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (modus == false) {
					try {
						methods.pressKey("1");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else if (modus == true) {
					try {
						methods.dtmf("1");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		button_10 = new JButton("2");
		button_10.setBounds(64, 37, 41, 26);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (modus == false) {
					try {
						methods.pressKey("2");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else if (modus == true) {
					try {
						methods.dtmf("2");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		button_11 = new JButton("3");
		button_11.setBounds(111, 37, 41, 26);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (modus == false) {
					try {
						methods.pressKey("3");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else if (modus == true) {
					try {
						methods.dtmf("3");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		JButton btnAbheben = new JButton("Abheben");
		btnAbheben.setBounds(287, 5, 117, 26);
		btnAbheben.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtRufnummerKopieren.getText().equals(nummernfeld)) {
					try {
						methods.pressKey("OFFHOOK");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else {
					try {
						methods.makeCall(txtRufnummerKopieren.getText());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
				
			}
		});

		btnAuflegen = new JButton("Auflegen");
		btnAuflegen.setBounds(287, 81, 117, 26);
		btnAuflegen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					methods.pressKey("ONHOOK");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		btnLautsprecher = new JButton("Lautsprecher");
		btnLautsprecher.setBackground(UIManager
				.getColor("CheckBoxMenuItem.acceleratorForeground"));
		btnLautsprecher.setBounds(287, 119, 117, 26);
		btnLautsprecher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					methods.pressKey("SPEAKER");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		btnLauter = new JButton("Lauter");
		btnLauter.setBounds(17, 247, 135, 26);
		btnLauter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					methods.pressKey("VOLUME_UP");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		btnLeiser = new JButton("Leiser");
		btnLeiser.setBounds(17, 279, 135, 26);
		btnLeiser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					methods.pressKey("VOLUME_DOWN");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		txtTastaturmodus = new JTextField();
		txtTastaturmodus.setBounds(17, 197, 135, 20);
		txtTastaturmodus.setEnabled(false);
		txtTastaturmodus.setHorizontalAlignment(SwingConstants.CENTER);
		txtTastaturmodus.setText("Standardmodus");
		txtTastaturmodus.setEditable(false);
		txtTastaturmodus.setColumns(10);

		btnModus = new JButton("Tastaturmodus");
		btnModus.setBounds(17, 165, 135, 26);
		btnModus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (modus.booleanValue() == false) {
					modus = true;
					txtTastaturmodus.setText("DTMF-Modus");
				} else if (modus.booleanValue() == true) {
					modus = false;
					txtTastaturmodus.setText("Standardurmodus");
				}
			}
		});
		contentPane.setLayout(null);

		JButton btnLeeren = new JButton("Leeren");
		btnLeeren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtRufnummerKopieren.setText(nummernfeld);
			}
		});
		btnLeeren.setBounds(158, 5, 117, 26);
		contentPane.add(btnLeeren);
		contentPane.add(txtTastaturmodus);
		contentPane.add(btnModus);
		contentPane.add(button);
		contentPane.add(button_3);
		contentPane.add(button_4);
		contentPane.add(button_1);
		contentPane.add(button_2);
		contentPane.add(button_5);
		contentPane.add(button_6);
		contentPane.add(button_7);
		contentPane.add(button_8);
		contentPane.add(button_9);
		contentPane.add(button_10);
		contentPane.add(button_11);
		contentPane.add(txtRufnummerKopieren);
		contentPane.add(btnLauter);
		contentPane.add(btnLeiser);
		contentPane.add(btnLautsprecher);
		contentPane.add(btnAbbrechen);
		contentPane.add(btnBestaetigen);
		contentPane.add(btnHalten);
		contentPane.add(btnAuflegen);
		contentPane.add(btnAbheben);
	}
}
