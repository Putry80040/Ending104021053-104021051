import java.awt.*;
import javax.imageio.ImageIO;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.Random;
import java.util.Scanner;

public class Ending2 extends Frame {
	private JButton btA = new JButton("一次輸出");
	private JButton btB = new JButton("個別輸出");
	private TextArea TA = new TextArea("");
	private int count = 0;
	private int num[] = new int[7];

	public Ending2() {
		initComp();
	}

	private void initComp() {
		this.setLayout(null);
		this.setBounds(200, 100, 500, 500);
		this.setBackground(new Color(255, 0, 0));
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		TA.setBounds(25, 75, 450, 300);
		btA.setBounds(25, 390, 450, 35);
		btB.setBounds(25, 440, 450, 35);
		this.add(btA);
		this.add(btB);
		this.add(TA);
		btA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {

				int a = 0;
				int i;
				for (i = 0; i <= 6; i++) {
					a = (int) (Math.random() * 49) + 1;
					int j = 0;
					while (j < i) {
						if (num[j] == a) {
							a = (int) (Math.random() * 49) + 1;
							j = 0;
						} else {
							j++;
						}
					}
					num[i] = a;
					if (i < 6) {
						TA.append(a + " ");
					} else {
						TA.append(a + "\n");
					}
				}
			}

		});
		int num[] = new int[7];
		int a = 0;
		int i;
		for (i = 0; i <= 6; i++) {
			a = (int) (Math.random() * 49) + 1;
			int j = 0;
			while (j < i) {
				if (num[j] == a) {
					a = (int) (Math.random() * 49) + 1;
					j = 0;
				} else {
					j++;
				}
			}
			num[i] = a;

		}

		btB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {

				TA.append(num[count] + " ");
				count++;

			}

		});

	}

}
