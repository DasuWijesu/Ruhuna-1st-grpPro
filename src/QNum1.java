import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class QNum1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton button1, button2, button3, button4, button5, button6 ;
	private JTextField textField1, textField2, textField3,textField4, textField5, messageField, keyField;  //create textField variable
	private JLabel answerQ1, answerQ2, answerQ3, answerQ4, answerQ5, answerQ6 ;  //create variable to assign the answer

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QNum1 frame = new QNum1();
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
	public QNum1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		 
		//Set FlowLayout for vertical alignment
        contentPane.setLayout((LayoutManager) new FlowLayout(FlowLayout.LEFT, 10, 10));
        
        //Set BoxLayout for vertical alignment
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        
		 //Font for labels
		 Font labelFont = new Font("Arial", Font.BOLD, 20);
		 Font labelFont2 = new Font("jeorgia", Font.BOLD, 25);
		//1st question starts from here....
		
		JLabel lblNewLabel = new JLabel("Enter value to get the largest prime factor : ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(labelFont2);
		contentPane.add(lblNewLabel);
		
		textField1 = new JTextField();
		textField1.setFont(labelFont);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		answerQ1 = new JLabel("");
		answerQ1.setFont(labelFont);
		contentPane.add(answerQ1);
		
		button1 = new JButton("Click");
		button1.setFont(labelFont);
		button1.setBackground(Color.GREEN);
		button1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			String inputText = textField1.getText();
			
			try {
				long val = Long.parseLong(inputText);
				long i;
				
				for(i = 2; i<= val; i++) {
					while(val % i == 0) {
						val /= i;
						if(val == 1) {
							i--;
							break;
						}
					}
				}
				answerQ1.setText("<html><font color = 'blue'>The larget prime val is : " + i + "</font></html>");
			}catch(NumberFormatException ex) {
				answerQ1.setText("<html><font color='red'>Invalid input.Please enter a vaild number.</font></html>");
			}
		}

		
		});
		contentPane.add(button1);
		
		//2nd question starts from here....
		JLabel lblNewLabe2 = new JLabel("Enter value to get the Sum of Primes bellow : ");
		lblNewLabe2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabe2.setFont(labelFont2);
		contentPane.add(lblNewLabe2);
		
		textField2 = new JTextField();
		textField2.setFont(labelFont);
		contentPane.add(textField2);
		textField2.setColumns(10);
		
		answerQ2 = new JLabel("");
		answerQ2.setFont(labelFont);
		contentPane.add(answerQ2);
		
		button2 = new JButton("Click");
		button2.setFont(labelFont);
		button2.setBackground(Color.GREEN);
		button2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			String inputText = textField2.getText();
			
			try {
				long limit = Long.parseLong(inputText);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
				int sum2 = 0;
				
				boolean[] isPrime = new boolean [(int)limit];
				for(int i = 2; i < limit ; i++) {
					isPrime[i] = true;
				}
				
				for(int i = 2; i < Math.sqrt(limit); i++) {
					if(isPrime[i]) {
						for (int j = i*i; j < limit; j += i) {
							isPrime[j] = false;
						}
					}
				}
				
				for(int i = 2; i < limit; i++) {
					if(isPrime[i]) {
						sum2 += i;
					}
				}
				answerQ2.setText("<html><font color = 'blue'>Sum of primes below " + limit + " : " + sum2+ "</font></html>");
			}catch(NumberFormatException ex) {
				answerQ2.setText("<html><font color='red'>Invalid input.Please enter a vaild number.</font></html>");
			}
		}

		
		});
		contentPane.add(button2);
		
		//3rd question starts from here....
		JLabel lblNewLabe3 = new JLabel("Enter value to get the Prime Number : ");
		lblNewLabe3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabe3.setFont(labelFont2);
		contentPane.add(lblNewLabe3);
		
		textField3 = new JTextField();
		textField3.setFont(labelFont);
		contentPane.add(textField3);
		textField3.setColumns(10);
		
		answerQ3 = new JLabel("");
		answerQ3.setFont(labelFont);
		contentPane.add(answerQ3);
		
		button3 = new JButton("Click");
		button3.setFont(labelFont);
		button3.setBackground(Color.GREEN);
		
		button3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			String inputText = textField3.getText();
			
			try {
				long n = Long.parseLong(inputText);
				int count = 0;
				long num = 2;
				
				while (count < n ) {
					if(isPrime(num)) {
						count ++;
					}
					num++;
				}
				answerQ3.setText("<html><font color='blue'>" + n + " prime number is: " + (num - 1) + "</font></html>");

			}catch(NumberFormatException ex) {
				answerQ3.setText("<html><font color='red'>Invalid input.Please enter a vaild number.</font></html>");
			}
		}

		
		});
		contentPane.add(button3);
		
		//4ht question starts from here....
		JLabel lblNewLabe4 = new JLabel("Enter value to get the Prime Number : ");
		lblNewLabe4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabe4.setFont(labelFont2);
		contentPane.add(lblNewLabe4);
		
		textField4 = new JTextField();
		textField4.setFont(labelFont);
		contentPane.add(textField4);
		textField4.setColumns(10);
		
		answerQ4 = new JLabel("");
		answerQ4.setFont(labelFont);
		contentPane.add(answerQ4);
		
		button4 = new JButton("Click");
		button4.setFont(labelFont);
		button4.setBackground(Color.GREEN);
		
		button4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			String inputText = textField4.getText();
			
			try {
				long lmt4 = Long.parseLong(inputText);
				int count = 0;
				
				for(long i = 2; i < lmt4; i++) {
					if(CircularPrime(i)) {
						count++;
					}
				}
				
				answerQ4.setText("<html><font color='blue'> Number of Circular Primes Below " + lmt4 + "=" + count + "</font></html>");

			}catch(NumberFormatException ex) {
				answerQ4.setText("<html><font color='red'>Invalid input.Please enter a vaild number.</font></html>");
			}
		}

		
		});
		contentPane.add(button4);
		
		
		//5ht question starts from here....
		JLabel lblNewLabe5 = new JLabel("Enter the limit for digits which are equal to the sum of their factorial: ");
		lblNewLabe5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabe5.setFont(labelFont2);
		contentPane.add(lblNewLabe5);
		
		textField5 = new JTextField();
		textField5.setFont(labelFont);
		contentPane.add(textField5);
		textField5.setColumns(10);
		
		answerQ5 = new JLabel("");
		answerQ5.setFont(labelFont);
		contentPane.add(answerQ5);
		
		button5 = new JButton("Click");
		button5.setFont(labelFont);
		button5.setBackground(Color.GREEN);
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputText = textField5.getText();
				try {
					long lmt5 = Long.parseLong(inputText);
					int sum = 0;
					for (long i = 10; i < lmt5; i++) {
						if (isCuriousNumber(i)) {
							sum += i;
						}
					}
					answerQ5.setText("<html><font color='blue'>Sum of curious numbers below " + lmt5 + ": " + sum + "</font></html>");
				} catch (NumberFormatException ex) {
					answerQ5.setText("<html><font color='red'>Invalid input. Please enter a valid number.</font></html>");
				}
			}
		});
		contentPane.add(button5);
		
		//6ht question starts from here....
		JLabel lblNewLabe6 = new JLabel("Enter message and key for Caesar Cipher : ");
		lblNewLabe6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabe6.setFont(labelFont2);
		contentPane.add(lblNewLabe6);
		
		messageField = new JTextField();
		messageField.setFont(labelFont);
		contentPane.add(messageField);
		messageField.setColumns(10);
		
		keyField = new JTextField();
		keyField.setFont(labelFont);
		contentPane.add(keyField);
		keyField.setColumns(5);
		
		answerQ6 = new JLabel("");
		answerQ6.setFont(labelFont);
		contentPane.add(answerQ6);
		
		button6 = new JButton("Encrypt/Decrypt");
		button6.setFont(labelFont);
		button6.setBackground(Color.GREEN);
		
		button6.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = messageField.getText();
				String keyText = keyField.getText();
			
			 try {
				 int key = Integer.parseInt(keyText);
				 String result = caesarCipher(message, key);
				 answerQ6.setText("<html><font color='blue'>Encrypted/Decrypted Message : " + result + "</font></html>");
			 }catch(NumberFormatException ex) {
				 answerQ6.setText("<html><font color='red'>Invalid key.Please enter a valid integer.</font></html>");
			 }
		}

		});
		
		contentPane.add(button6);
	}

	private static boolean isCuriousNumber(long number) {
		int sum =0; 
		long num = number;
		
		while(num > 0) {
			long digit =  num % 10;
			sum += factorial(digit);
			num/= 10;
		}
		return sum == number;
	}

	private static int factorial(long digit) {
		if(digit == 0 || digit == 1) {
			return 1;
		}
		
		int result = 1;
		for (int i = 2; i <= digit; i++) {
			result *= i;
		}
		return result;
	}

	private static boolean isPrime(long num) {
		for(long i = 2; i<= Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean CircularPrime(long num) {
		String numStr = String.valueOf(num);
		long length = numStr.length();
		
		for(int i = 0; i < length; i++) {
			if(!isPrime(Long.parseLong(numStr.substring(i) + numStr.substring(0,i)))) {
				return false;
			}
		}
		return true;
	}
	
	private String caesarCipher(String message, int key) {
		StringBuilder result = new StringBuilder();
		
		for(int i = 0; i < message.length(); i++) {
			char ch = message.charAt(i);
			if(Character.isLetter(ch)) {
				char base = Character.isLowerCase(ch)? 'a': 'A';
				result.append((char) ((ch - base + key) % 26 + base));
			}else {
				result.append(ch);
			}
		}
		return result.toString();
	}

}
