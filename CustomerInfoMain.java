/**
 * 
 */
package com.autoinsurance.gui;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import java.time.Year;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import com.autoinsurance.Controllers.CustomerController;
import com.autoinsurance.app.Customer;

/**
 * @author SoumyaJijo
 *
 */
public class CustomerInfoMain {
	
	//soumya
	private JTextField text_FName;
	private JTextField text_LName;
	private JTextField text_Address;
	private JTextField text_State;
	private JTextField text_City;
	private JTextField text_Zip;
	private JTextField text_YOF;
	//soumya
	private String customerID="";
	
	private JLabel label_email;
	private JTextField text_email;
	private JLabel label_pip;
	private JTextField text_pip;
	private JButton button_save;
	private JLabel label_username;
	private JTextField text_username;
	private JLabel label_password;
	private JTextField text_password;
	private JButton button_login;
	private JButton button_CustSave;
	private boolean flag_Validated=false;
	private JPanel vehicleDetailsTab;
	
	 
	private	 MaskFormatter fmt;
	private JFormattedTextField tft1;
	private  JFormattedTextField tft2;
	private  JLabel label_Gender1;
	private  JRadioButton radio_Male1;
    private  JRadioButton radio_Female1 ;
    private  ButtonGroup bg_Gender1;
    private JLabel marst,empstat,ssn,ssn1,ssn2,driverhistory,months;
    private JComboBox  combo_status,combo_estatus,combo_months;
    private JTextField text_status,text_estatus,text_ssn,text_ssn1,text_ssn2,text_months;
    Random ran = new Random();
	
	
	 private JFrame customerRegisterHome ;
	//soumya
	
	private ArrayList<JTextField> arr_text = new ArrayList<JTextField>();
	private String fname;
	private String lname;
	private String address;
	private String state;
	private String city;
	private String zip;
	private String ssntext;
	private Year vehicle_Yr;
	private String vehicle_Make;
	private String vehicle_Model;
	private String vehicle_PrimaryUse;
	private String vehicle_Ownership;
	private String gender;
	private String marital_Status;
	private String emp_Status;
	private int lic_Duration;
	private String email;
	private int pip;
	private String login;
	private String password;
	private JComboBox combo_State;
	 
	 CustomerInfoMain() throws ParseException{
	
		 //MAIN FRAME
	
	customerRegisterHome = new JFrame();
	customerRegisterHome.getContentPane().setBackground(Color.lightGray);
	customerRegisterHome.setBackground( Color.blue);
	customerRegisterHome.setTitle("Get a Quote");
	//customerRegisterHome.setBounds(100, 100, 600, 600);
	customerRegisterHome.setSize(600,600);
	Toolkit tk =Toolkit.getDefaultToolkit();
	Dimension dim = tk.getScreenSize();
	int xPos = (dim.width/2) - (customerRegisterHome.getWidth()/2);
	int yPos = (dim.height/2) - (customerRegisterHome.getHeight()/2);
	customerRegisterHome.setLocation(xPos, yPos);
	
	customerRegisterHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	customerRegisterHome.getContentPane().setLayout(null);
	
	JPanel titlePanel = new JPanel();
	titlePanel.setBackground(Color.blue);
	titlePanel.setBounds(0, 0, 584, 34);
	titlePanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.BLACK));
	customerRegisterHome.getContentPane().add(titlePanel);
	titlePanel.setLayout(null);
	
	//TABBED PANE 
	
	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	tabbedPane.setBackground(Color.cyan);
	tabbedPane.setBounds(0, 35, 584, 527);
	tabbedPane.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(100, 149, 237)));
	customerRegisterHome.getContentPane().add(tabbedPane);
	
	
	//Customer details tab
	JPanel cusPersonalDetailsTab = new JPanel();
	cusPersonalDetailsTab.setBackground(Color.pink);
	cusPersonalDetailsTab.setLayout(null);
	tabbedPane.addTab("Customer", null, cusPersonalDetailsTab, null);
	//tabbedPane.setDisabledIconAt(0, null);
	tabbedPane.setBackgroundAt(0, Color.pink);
	
	//personal Info panel
	JPanel personalInfoPanel = new JPanel();
	personalInfoPanel.setBackground(Color.pink);
	personalInfoPanel.setLayout(null);
	personalInfoPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), " Details", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
	personalInfoPanel.setBounds(20, 22, 564, 540);
	cusPersonalDetailsTab.add(personalInfoPanel);
	
	JLabel label_FName = new JLabel("First Name  ");
	label_FName.setForeground(Color.WHITE);
	label_FName.setBounds(10, 32, 80, 14);
	personalInfoPanel.add(label_FName);
	
	text_FName = new JTextField();
	text_FName.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
	text_FName.setColumns(10);
	text_FName.setBounds(100, 29, 223, 20);
	personalInfoPanel.add(text_FName);
	//soumya
	arr_text.add(text_FName);
	
	JLabel label_LName = new JLabel("Last Name");
	label_LName.setForeground(Color.WHITE);
	label_LName.setBounds(10, 63, 80, 14);
	personalInfoPanel.add(label_LName);
	
	text_LName = new JTextField();
	text_LName.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
	text_LName.setColumns(10);
	text_LName.setBounds(100, 63, 223, 20);
	personalInfoPanel.add(text_LName);
	//soumya
	arr_text.add(text_LName);
			
	
	JLabel label_Address = new JLabel("Address");
	label_Address.setForeground(Color.WHITE);
	label_Address.setBounds(10, 96, 80, 14);
	personalInfoPanel.add(label_Address);
	
	text_Address = new JTextField();
	text_Address.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
	text_Address.setColumns(10);
	text_Address.setBounds(100, 97, 300, 20);
	personalInfoPanel.add(text_Address);
	//soumya
	arr_text.add(text_Address);
	
	
	JLabel label_State = new JLabel("State");
	label_State.setForeground(Color.WHITE);
	label_State.setBounds(10, 149, 80, 14);
	personalInfoPanel.add(label_State);
	
	String[] states_USA={"CA California", "NY New York", "NJ New Jersey"};
	combo_State= new JComboBox(states_USA);
    personalInfoPanel.add(combo_State);
    //combo_State.setPreferredSize(new Dimension(200,30));
    combo_State.setBounds(100, 145, 223, 20);
    
	
	
	text_State = new JTextField();
	text_State.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
	text_State.setColumns(10);
	text_State.setBounds(100, 145, 223, 20);
	personalInfoPanel.add(text_State);	
	//arr_text.add(text_State);
	
	
	
	JLabel label_Zip = new JLabel("Zip");
	label_Zip.setForeground(new Color(255, 255, 255));
	label_Zip.setBounds(10, 179, 19, 20);
	personalInfoPanel.add(label_Zip);
	
	text_Zip = new JTextField();
	text_Zip.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
	text_Zip.setColumns(10);
	text_Zip.setBounds(100, 179, 111, 20);
	personalInfoPanel.add(text_Zip);
	arr_text.add(text_Zip);//soumya
	
	
	JLabel label_City = new JLabel("City");
	label_City.setForeground(new Color(255, 255, 255));
	label_City.setBounds(10, 205, 39, 20);
	personalInfoPanel.add(label_City);
	
	text_City = new JTextField();
	text_City.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
	text_City.setColumns(10);
	text_City.setBounds(100, 210, 224, 20);
	personalInfoPanel.add(text_City);
	arr_text.add(text_City);//soumya
	
	//soumya
    
    button_CustSave=new JButton("Save");
	button_CustSave.setBounds(150,285,150,50);
	personalInfoPanel.add(button_CustSave);
	
	
	button_CustSave.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e)
    {
		
 	   try{
 		  
 		   
 			
 			if(e.getSource() == button_CustSave)
 			{
 				
 				for(JTextField a:arr_text){
 					
 				a.requestFocusInWindow();
 					
 				flag_Validated = validateTextfields(a);
 				
 				if(flag_Validated){
 					a.setBackground(Color.white);
 					continue;
 				}
 				else{
 					
 					a.setBackground(Color.lightGray);
 					break;
 				}
 				}
 				
 				if(flag_Validated){
 					JOptionPane.showMessageDialog(null,"Information stored");
 					vehicleDetailsTab.requestFocus();
 					text_YOF.requestFocusInWindow();
 				customerID = create_CustomerID();
 				
 	 		  
 				}
 				
 		
 			}
 			text_YOF.requestFocusInWindow();
 	   }
 			catch(Exception er){}
 			finally{
 				
 			}
 			
    }
	});//soumya
	
	
	//vehicles tab
     vehicleDetailsTab = new JPanel();
    vehicleDetailsTab.setBackground(new Color(72, 61, 139));
    vehicleDetailsTab.setLayout(null);
    tabbedPane.addTab("Vehicle", null, vehicleDetailsTab, null);
    tabbedPane.setDisabledIconAt(0, null);
    tabbedPane.setBackgroundAt(0, new Color(231, 84, 128));
     
	
    JPanel vehicleInfoPanel = new JPanel();
    vehicleInfoPanel.setBackground(new Color(231, 84, 128));
    vehicleInfoPanel.setLayout(null);
    vehicleInfoPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Vehicle Details", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
    vehicleInfoPanel.setBounds(20, 22, 564, 540);
    vehicleDetailsTab.add(vehicleInfoPanel);
    //year
    JLabel YearOfManfacture = new JLabel("Year: ");
    YearOfManfacture.setForeground(Color.WHITE);
    YearOfManfacture.setBounds(10, 32, 150, 14);
    vehicleInfoPanel.add(YearOfManfacture);
     
    text_YOF = new JTextField();
    text_YOF.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
    text_YOF.setColumns(10);
    text_YOF.setBounds(100, 29, 223, 20);
    vehicleInfoPanel.add(text_YOF);
    //make
    JLabel make = new JLabel("Make: ");
    make.setForeground(Color.WHITE);
    make.setBounds(10, 63, 80, 14);
    vehicleInfoPanel.add(make);
     
    String[] models={"Chevrolet","Mistubishi","Jeep","Alfa Romeo","Volkswagon","BMW","Hyundai","Porshe"};
    JComboBox  combo_models= new JComboBox(models);
    vehicleInfoPanel.add(combo_models);
    combo_models.setBounds(100, 60, 223, 20);
    
    JTextField text_make = new JTextField();
    text_make.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
    text_make.setColumns(10);
    text_make.setBounds(100, 60, 223, 20);
    vehicleInfoPanel.add(text_make);
    //model
    JLabel model = new JLabel("Model: ");
    model.setForeground(Color.WHITE);
    model.setBounds(10, 96, 80, 14);
    vehicleInfoPanel.add(model);
     
    String[] models_types={"spark","2015 BMW 640","I10","458 Italia","Micra","458 Speciale","F12 berlinetta","FerrariFF","sedan","F-type"};
    JComboBox  combo_types= new JComboBox(models_types);
    vehicleInfoPanel.add(combo_types);
    combo_types.setBounds(100, 93, 300, 20);
    
    JTextField text_model = new JTextField();
    text_model.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
    text_model.setColumns(10);
    text_model.setBounds(100, 93, 300, 20);
    vehicleInfoPanel.add(text_model);
     
    //primary reason
     
    JLabel own = new JLabel("Primary use: ");
    own.setForeground(Color.WHITE);
    own.setBounds(10, 149, 150, 14);
    vehicleInfoPanel.add(own);
     
    String[] own_reasons={"Personal use(commute)","Pleasure","Business Purpose"};
    JComboBox  combo_reasons= new JComboBox(own_reasons);
    vehicleInfoPanel.add(combo_reasons);
    combo_reasons.setBounds(100, 145, 223, 20);
    
    JTextField text_reason = new JTextField();
    text_reason.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
    text_reason.setColumns(10);
    text_reason.setBounds(100, 145, 223, 20);
    vehicleInfoPanel.add(text_reason);
     
    //own or lease
    JLabel own1 = new JLabel("Own Or Lease: ");
own1.setForeground(Color.WHITE);
    own1.setBounds(10, 179, 100, 20);
    vehicleInfoPanel.add(own1);
     
    String[] own_types={"Own(monthly payments)","Own(no monthly payments)","Lease"};
    JComboBox  combo_own= new JComboBox(own_types);
    vehicleInfoPanel.add(combo_own);
    combo_own.setBounds(100, 176, 200, 20);
    
    JTextField text_own = new JTextField();
    text_own.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
    text_own.setColumns(10);
    text_own.setBounds(100, 176, 200, 20);
    vehicleInfoPanel.add(text_own);
	
	/*JPanel vehicleInfoPanel = new JPanel();
	vehicleInfoPanel.setBackground(new Color(72, 61, 139));
	vehicleInfoPanel.setLayout(null);
	vehicleInfoPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Vehicle Details", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
	vehicleInfoPanel.setBounds(100, 150, 524, 63);
	vehicleDetailsTab.add(vehicleInfoPanel);*/
	
	//drivers tab
	
	JPanel driverDetailsTab = new JPanel();
	driverDetailsTab.setBackground(new Color(72, 61, 139));
	driverDetailsTab.setLayout(null);
	tabbedPane.addTab("Drivers", null, driverDetailsTab, null);
	tabbedPane.setDisabledIconAt(0, null);
	tabbedPane.setBackgroundAt(0, new Color(230, 230, 250));
	
	
	
	JPanel driversInfoPanel = new JPanel();
	driversInfoPanel.setBackground(new Color(255, 219, 88));
	driversInfoPanel.setLayout(null);
	driversInfoPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Driver Details", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
	driversInfoPanel.setBounds(20, 22, 564, 540);
	driverDetailsTab.add(driversInfoPanel);
	
	//gender
	
	label_Gender1 = new JLabel("Gender :");
	label_Gender1.setForeground(new Color(255, 255, 255));
	label_Gender1.setBounds(10, 32, 80, 14);
	driversInfoPanel.add(label_Gender1);
	
	radio_Male1 = new JRadioButton("Male");
    radio_Female1 = new JRadioButton("Female");
    bg_Gender1 = new ButtonGroup();
    bg_Gender1.add(radio_Male1);
    bg_Gender1.add(radio_Female1);
    driversInfoPanel.add(radio_Male1);
    radio_Male1.setBounds(100, 27, 100, 20);  
    radio_Male1.setBackground(Color.white);
    driversInfoPanel.add(radio_Female1);
    radio_Female1.setBounds(200, 27, 100, 20);
    radio_Female1.setBackground(Color.white);
    
    //Marital status
    marst = new JLabel("Marital Status: ");
    marst.setForeground(Color.WHITE);
    	marst.setBounds(10, 63, 80, 14);
    	driversInfoPanel.add(marst);
    	
    	String[] status={"Married","Single","Widower","Divorced"};
        combo_status= new JComboBox(status);
        driversInfoPanel.add(combo_status);
        combo_status.setBounds(100, 60, 223, 20);
       
    	text_status = new JTextField();
    	text_status.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
    	text_status.setColumns(10);
    	text_status.setBounds(100, 60, 223, 20);
    	driversInfoPanel.add(text_status);
	
    		//employement status
    	
    	empstat = new JLabel("Employment status ");
        empstat.setForeground(Color.WHITE);
        	empstat.setBounds(10, 96, 100, 14);
        	driversInfoPanel.add(empstat);
        	
        	String[] estatus={"Student","Business","Employed","Unemployed"};
            combo_estatus= new JComboBox(estatus);
            driversInfoPanel.add(combo_estatus);
            combo_estatus.setBounds(150, 93, 223, 20);
           
        	text_estatus = new JTextField();
        	text_estatus.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        	text_estatus.setColumns(10);
        	text_estatus.setBounds(150, 93, 223, 20);
        	driversInfoPanel.add(text_estatus);
    
        	//ssn
        	ssn = new JLabel("SSN: ");
        	ssn.setForeground(Color.WHITE);
        	ssn.setBounds(10, 149, 100, 14);
        	driversInfoPanel.add(ssn);
        	
        	 fmt = new MaskFormatter("###-##-####");
        	 fmt.setPlaceholderCharacter('0');
        	 tft2 = new JFormattedTextField(fmt);
        	 //tft2.setValue("732-56-4180");
         	tft2.setBounds(100, 145, 150, 20);
         	driversInfoPanel.add(tft2);
    	//months
         	 months = new JLabel("Months Licensed: ");
             months.setForeground(Color.WHITE);
             	months.setBounds(10, 179, 120, 14);
             	driversInfoPanel.add(months);
             	
             	String[] months_status={"Less than 1year","2-6yrs","7-11yrs","more than 12yrs"};
                 combo_months= new JComboBox(months_status);
                 driversInfoPanel.add(combo_months);
                 combo_months.setBounds(120, 176, 223, 20);
                
             	text_months = new JTextField();
             	text_months.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
             	text_months.setColumns(10);
             	text_months.setBounds(120, 176, 223, 20);
             	driversInfoPanel.add(text_months);
	//final details
             	
             	JPanel finalDetailsTab = new JPanel();
            	finalDetailsTab.setBackground(new Color(72, 61, 139));
            	finalDetailsTab.setLayout(null);
            	tabbedPane.addTab("Final Details", null, finalDetailsTab, null);
            	tabbedPane.setDisabledIconAt(0, null);
            	tabbedPane.setBackgroundAt(0, new Color(230, 230, 250));
            	
                JPanel finalInfoPanel = new JPanel();
            	finalInfoPanel.setBackground(Color.green);
            	finalInfoPanel.setLayout(null);
            	finalInfoPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), " Additional Detials", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(130,45,200)));
            	finalInfoPanel.setBounds(20, 22, 500, 200);
            	finalDetailsTab.add(finalInfoPanel);
            	
            	
            	
                label_email = new JLabel("Email");
            	label_email.setForeground(Color.WHITE);
            	label_email.setBounds(5, 63, 80, 14);
            	finalInfoPanel.add(label_email);
            	
            	text_email = new JTextField();
            	text_email.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
            	text_email.setColumns(10);
            	text_email.setBounds(150, 63, 223, 20);
            	finalInfoPanel.add(text_email);
            	
            	label_pip = new JLabel("PIP Coverage Limit");
            	label_pip.setForeground(Color.WHITE);
            	label_pip.setBounds(5, 109, 120, 14);
            	finalInfoPanel.add(label_pip);
            	
            	
            	String[] coverage_pip={"$15000", "$25000", "$50000" , "$75000"};
                JComboBox  combo_pip= new JComboBox(coverage_pip);
                finalInfoPanel.add(combo_pip);
                //combo_State.setPreferredSize(new Dimension(200,30));
                combo_pip.setBounds(150, 109, 223, 20);
                
                text_pip = new JTextField();
            	text_pip.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
            	text_pip.setColumns(10);
            	text_pip.setBounds(150, 63, 223, 20);
            	finalInfoPanel.add(text_pip);
            	
            	button_save=new JButton("Save and Continue");
            	button_save.setBounds(70,160,150,20);
            	finalInfoPanel.add(button_save);
            	
            	button_save.addActionListener(new ActionListener() {
            		 public void actionPerformed(ActionEvent e)
            		 
            		
            			 
                     {
                  	   EmailValidator emailValidator = new EmailValidator();
                  	   if(!emailValidator.validate(text_email.getText().trim())) {
                  		   JOptionPane.showMessageDialog(null,"Please enter valid email.");
   
                  	        /*
                  	           Action that you want to take. For ex. make email id field red
                  	           or give message box saying invalid email id.
                  	        */
                  	   }
                  	
                  	   String str;
                         int age;
                         str = text_email.getText();

                         if (str.equals("")){
                             JOptionPane.showMessageDialog(null,"Please enter your email.");

                             
                                 text_email.requestFocusInWindow();
                                 
                         }
                         try {
                        	 
                        	 //soumya
                        	 customerID = create_CustomerID();
                        	 create_Customer();
                        	 //need to pass monthly payment which is calculated 
  						new DisplayQuote(customerID);
  					} catch (ParseException e1) {
  						// TODO Auto-generated catch block
  						e1.printStackTrace();
  					}
                     }
                     
              	});
            		 
                   
            	
            	JPanel additionalPanel = new JPanel();
            	additionalPanel.setBackground(Color.green);
            	additionalPanel.setLayout(null);
            	additionalPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), " Create Login", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(130,45,200)));
            	additionalPanel.setBounds(20, 260, 500, 200);
            	finalDetailsTab.add(additionalPanel);
            	
            	label_username = new JLabel("Username");
            	label_username.setForeground(Color.WHITE);
            	label_username.setBounds(5,63, 80, 14);
            	additionalPanel.add(label_username);
            	
            	text_username = new JTextField();
            	text_username.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
            	text_username.setColumns(10);
            	text_username.setBounds(150, 63, 223, 20);
            	additionalPanel.add(text_username);
            	
            	label_password = new JLabel("Password");
            	label_password.setForeground(Color.WHITE);
            	label_password.setBounds(5, 109, 80, 14);
            	additionalPanel.add(label_password);
            	
            	text_password = new JTextField();
            	text_password.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
            	text_password.setColumns(10);
            	text_password.setBounds(150,109, 223, 20);
            	additionalPanel.add(text_password);
            	
            	button_login=new JButton("Login");
            	button_login.setBounds(70,160,150,20);
            	additionalPanel.add(button_login);
            	

            	button_login=new JButton("Login");
            	button_login.setBounds(70,160,150,20);
            	additionalPanel.add(button_login);
            	
            	button_login.addActionListener(new ActionListener() {
           		 
                    public void actionPerformed(ActionEvent e)
                    {
                    	 String str1,str2;
                         str1 = text_username.getText();

                         if (str1.equals("")){
                             JOptionPane.showMessageDialog(null,"Please enter your username.");

                             
                                 text_username.requestFocusInWindow();
                                 
                         }
                         str2 = text_password.getText();

                         if (str2.equals("")){
                             JOptionPane.showMessageDialog(null,"Please enter your password.");

                             
                                 text_password.requestFocusInWindow();
                                 
                         }
                         
                     }
                     
              	});
                    
            	
            	
            	
            	
            	customerRegisterHome.setVisible(true);
            	
            	}
	
	



	

	

	
	
	//soumya
	
	
	
	public boolean validateTextfields(JTextField a)
	{
		try{
			
			
						
			
				
			if (a.getText().equals(""))
				
				
			{
				
                JOptionPane.showMessageDialog(null,"Information is mandatory");

                	a.requestFocusInWindow();
                	flag_Validated = false;
                	
                	
                 
              }
			else
				flag_Validated= true;
				
			
			
		
		}
		
		catch(Exception er){}
		finally{}
		return flag_Validated;
		
		
	}

	//soumya
	public String create_CustomerID(){
		
		
		Integer x = ran.nextInt((9999999 - 1000000) + 1) + 1000000;
		
		
		String customerId = "SG" + x.toString();
		JOptionPane.showMessageDialog(null,customerId);
		
				return customerId;
		//return customerID = "SG" + UUID.randomUUID().toString();
		
	}
	//soumya
	public void create_Customer(){
		
		//get personal details
		
	 fname = text_FName.getText();
	 lname = text_LName.getText();
	 address = text_Address.getText();
	 state = (String) combo_State.getSelectedItem();
	 city = text_City.getText();
	 zip=text_Zip.getText();
	 
	 // get vehicle tab fields
	 //get driver tab fields
	 //get final details fields
	 
	 
		
		
		CustomerController newcust = new CustomerController();
try {
	newcust.createCustomer(customerID, fname, lname, address, state, city, zip, vehicle_Yr, vehicle_Make, vehicle_Model, vehicle_PrimaryUse, vehicle_Ownership, gender, marital_Status, emp_Status, ssntext, lic_Duration, email, pip, login, password);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
		
	}
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		new CustomerInfoMain();

	}
}
	