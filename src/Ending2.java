import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ending2 extends Frame {
	private JButton btA = new JButton("一次輸出");
	private JButton btB = new JButton("個別輸出");
	private TextArea TA = new TextArea("");
	private int count = 0;
	private int[] num = new int[7];
	private int a;

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
		btA.setBounds(25, 390, 450, 35);
		btB.setBounds(25, 440, 450, 35);
		this.add(btA);
		this.add(btB);
		this.add(TA);
		resetData();
		btA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
				for (int i = 0; i < 7; i++){
					if(i<6){
						TA.append(num[i] + " ");
						}else{
						TA.append("特別號："+num[i] + " ");
					   }
					   }
					
				TA.append("\n");
				resetData();
			}


				
		});

		btB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
				if (count < 6) {
					btA.setEnabled(false);
					TA.append(num[count] + " ");
					count++;
				} else if (count == 6) {
					TA.append("特別號："+num[count] + "\n");
					count = 0;
					btA.setEnabled(true);
					resetData();
				}
			}
		});
	}

	private void bubbleSort(int[] num) {
		// TODO Auto-generated method stub
		for(int i=num.length-2;i>=0;i--){
			for(int b=0;b<i;b++){
				if(num[b]>num[b+1]){
					int tmp=num[b];
					num[b]=num[b+1];
					num[b+1]=tmp;
				}
			}
		}
			
	}

	private void resetData() {
		for (int i = 0; i <7; i++) {
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
		bubbleSort(num);
	}
		
	}


