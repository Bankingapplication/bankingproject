package test1;



import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

/**
 * @author SoumyaJijo
 *
 */
public class DisplayQuote {
	
	
	 private JFrame quoteDisplay ;
	 private double monthly_paymnt;
	 private String customerID;
	 int pip;
	
	
	 DisplayQuote(String customerID, double monthly_paymnt,int pip) throws ParseException{
	
	this.customerID=customerID;
	this.monthly_paymnt=monthly_paymnt;
	this.pip=pip;
	quoteDisplay = new JFrame();
	quoteDisplay.getContentPane().setBackground(Color.lightGray);
	quoteDisplay.setBackground( Color.blue);
	quoteDisplay.setTitle("Get a Quote");
	//customerRegisterHome.setBounds(100, 100, 600, 600);
	quoteDisplay.setSize(600,600);
	Toolkit tk =Toolkit.getDefaultToolkit();
	Dimension dim = tk.getScreenSize();
	int xPos = (dim.width/2) - (quoteDisplay.getWidth()/2);
	int yPos = (dim.height/2) - (quoteDisplay.getHeight()/2);
	quoteDisplay.setLocation(xPos, yPos);
	
	quoteDisplay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	quoteDisplay.getContentPane().setLayout(null);
	
	JPanel titlePanel = new JPanel();
	titlePanel.setBackground(Color.black);
	titlePanel.setBounds(0, 0, 584, 34);
	titlePanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.BLACK));
	quoteDisplay.getContentPane().add(titlePanel);
	titlePanel.setLayout(null);
	
	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	tabbedPane.setBackground(Color.cyan);
	tabbedPane.setBounds(0, 35, 584, 527);
	tabbedPane.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(100, 149, 237)));
	quoteDisplay.getContentPane().add(tabbedPane);
	
	JPanel quoteDisplayTab = new JPanel();
	quoteDisplayTab.setBackground(Color.pink);
	quoteDisplayTab.setLayout(null);
	tabbedPane.addTab("quote", null, quoteDisplayTab, null);
	//tabbedPane.setDisabledIconAt(0, null);
	tabbedPane.setBackgroundAt(0, Color.pink);
	
	
	JPanel quoteInfoPanel = new JPanel();
	quoteInfoPanel.setBackground(Color.pink);
	quoteInfoPanel.setLayout(null);
	quoteInfoPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), " Details", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
	quoteInfoPanel.setBounds(20, 22, 564, 540);
	quoteDisplayTab.add(quoteInfoPanel);
	
	JLabel label_quote = new JLabel("Quote  ");
	label_quote.setForeground(Color.WHITE);
	label_quote.setBounds(10, 32, 80, 14);
	quoteInfoPanel.add(label_quote);
	
	JTextField text_quote = new JTextField();
	text_quote.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
	text_quote.setColumns(10);
	text_quote.setBounds(200, 29, 223, 20);
	text_quote.setText(Double.toString(monthly_paymnt));
	quoteInfoPanel.add(text_quote);
	text_quote.setFont(new Font("Serif",Font.BOLD,14));
	
	JButton button_buy=new JButton("Buy and Continue");
	button_buy.setBounds(150,300,150,20);
	quoteInfoPanel.add(button_buy);
	
	JLabel conditions_Label=new JLabel("Policy coverage discounts, if applicable please select");
	conditions_Label.setForeground(Color.WHITE);
	conditions_Label.setBounds(80,60,350,20);
	//quoteInfoPanel.add(conditions_Label);
	
	JLabel pip_label=new JLabel("PIP Medical Expenses");
	pip_label.setForeground(Color.WHITE);
	pip_label.setBounds(10,100,223,20);
	quoteInfoPanel.add(pip_label);
	
	JTextField pip_Text=new JTextField();
	pip_Text.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
	pip_Text.setColumns(10);
	pip_Text.setBounds(200,100,223,20);
	pip_Text.setText(Integer.toString(pip));
	quoteInfoPanel.add(pip_Text);
	pip_Text.setFont(new Font("Serif",Font.BOLD,14));
	
	JLabel bi_label=new JLabel("BI (Bodily Injury Liability)");
	bi_label.setForeground(Color.WHITE);
	bi_label.setBounds(10,140,223,20);
	quoteInfoPanel.add(bi_label);
	
	JTextField bi_Text=new JTextField();
	bi_Text.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
	bi_Text.setColumns(10);
	bi_Text.setBounds(200,140,223,20);
	bi_Text.setText("25,000");
	quoteInfoPanel.add(bi_Text);
	bi_Text.setFont(new Font("Serif",Font.BOLD,14));
	
	JLabel pd_label=new JLabel("PD (Property Damage Liability)");
	pd_label.setForeground(Color.WHITE);
	pd_label.setBounds(10,180,223,20);
	quoteInfoPanel.add(pd_label);
	quoteInfoPanel.add(pd_label);
	
	JTextField pd_Text=new JTextField();
	pd_Text.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
	pd_Text.setColumns(10);
	pd_Text.setBounds(200,180,223,20);
	pd_Text.setText("50,000");
	quoteInfoPanel.add(pd_Text);
	pd_Text.setFont(new Font("Serif",Font.BOLD,14));
	
	
	
	
	
	
	
	
	
	//vehicles tab
	
	JPanel paymentDetailsTab = new JPanel();
	paymentDetailsTab.setBackground(new Color(72, 61, 139));
	paymentDetailsTab.setLayout(null);
	tabbedPane.addTab("Payment", null, paymentDetailsTab, null);
	tabbedPane.setDisabledIconAt(0, null);
	tabbedPane.setBackgroundAt(0, new Color(231, 84, 128));
	
	
	JPanel paymentInfoPanel = new JPanel();
	paymentInfoPanel.setBackground(new Color(231, 84, 128));
	paymentInfoPanel.setLayout(null);
	paymentInfoPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Vehicle Details", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
	paymentInfoPanel.setBounds(20, 22, 564, 540);
	paymentDetailsTab.add(paymentInfoPanel);
	
	
	
	JLabel initial = new JLabel("Initial Payment ");
	initial.setForeground(Color.WHITE);
	initial.setBounds(10, 63, 80, 14);
	paymentInfoPanel.add(initial);
	
	String[] types={"Credit","Debit"};
    JComboBox  combo_types= new JComboBox(types);
    paymentInfoPanel.add(combo_types);
    combo_types.setBounds(100, 60, 223, 20);
   
	JTextField text_type = new JTextField();
	text_type.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
	text_type.setColumns(10);
	text_type.setBounds(100, 60, 223, 20);
	paymentInfoPanel.add(text_type);
	//model
	JLabel name = new JLabel("Name on the card ");
	name.setForeground(Color.WHITE);
	name.setBounds(10, 96, 80, 14);
	paymentInfoPanel.add(name);
	
	
	JTextField text_name = new JTextField();
	text_name.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
	text_name.setColumns(10);
	text_name.setBounds(100, 93, 300, 20);
	paymentInfoPanel.add(text_name);
	
	
	
	JLabel number = new JLabel("Card Number ");
	number.setForeground(Color.WHITE);
	number.setBounds(10, 149, 150, 14);
	paymentInfoPanel.add(number);
	
	MaskFormatter fmt = new MaskFormatter("####-####-####-####");
	 fmt.setPlaceholderCharacter('0');
	 JFormattedTextField tft1 = new JFormattedTextField(fmt);
	 //tft2.setValue("732-56-4180");
	tft1.setBounds(100, 145, 300, 20);
	paymentInfoPanel.add(tft1);
	
	
   
	
	JLabel exp_date = new JLabel("Exp. Date ");
 exp_date.setForeground(Color.WHITE);
	exp_date.setBounds(10, 179, 100, 20);
	paymentInfoPanel.add(exp_date);
	
	MaskFormatter fmt1 = new MaskFormatter("##-##");
	 fmt1.setPlaceholderCharacter('0');
	 JFormattedTextField tft2 = new JFormattedTextField(fmt1);
	 //tft2.setValue("732-56-4180");
	tft2.setBounds(100, 179, 300, 20);
	paymentInfoPanel.add(tft2);
	
	JLabel cvv = new JLabel("CVV ");
	 cvv.setForeground(Color.WHITE);
		cvv.setBounds(10, 200 , 100, 20);
		paymentInfoPanel.add(cvv);
		
		MaskFormatter fmt2 = new MaskFormatter("###");
		 fmt2.setPlaceholderCharacter('0');
		 JFormattedTextField tft3 = new JFormattedTextField(fmt2);
		 //tft2.setValue("732-56-4180");
		tft3.setBounds(100, 200, 300, 20);
		paymentInfoPanel.add(tft3);
	
	
            	JButton button_confirm=new JButton("Confirm Payment");
            	button_confirm.setBounds(70,250,150,20);
            	paymentInfoPanel.add(button_confirm);
            	
            	
            	
            	
            	
            	quoteDisplay.setVisible(true);
            	
            	}
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		new DisplayQuote("SG200045",105,15000);

	}

}

