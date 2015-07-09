package com.marlabs.hbm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
public static void main(String[] args) {
	
	//creating configuration object
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file
	
	//creating seession factory object
	SessionFactory factory=cfg.buildSessionFactory();
	
	//creating session object
	Session session=factory.openSession();
	
	//creating transaction object
	Transaction t=session.beginTransaction();
	Customer c1=new Customer();
	 c1.setId(101);
	c1.setFirstName("Dorinda");
	c1.setLastName("Handler");
	c1.setemailId("dorhan@gmail.com");
	session.saveOrUpdate(c1);
	
	Customer c2=new Customer();
	c2.setId(102);
	c2.setFirstName("Astrid");
	c2.setLastName("Bigley");
	c2.setemailId("Astbig@gmail.com");
	session.saveOrUpdate(c2);
	
	Customer c3=new Customer();
	c3.setId(103);
	c3.setFirstName("Mabelle ");
	c3.setLastName("Mangini");
	c3.setemailId("mabman@gmail.com");
	
	session.saveOrUpdate(c3);
	Customer c4=new Customer();
	c4.setId(104);
	c4.setFirstName("August");
	c4.setLastName("Frenz");
	c4.setemailId("Augfre@gmail.com");
	session.saveOrUpdate(c4);
	Customer c5=new Customer();
	c5.setId(105);
	c5.setFirstName("Refuzia");
	c5.setLastName("Pete");
	c5.setemailId("refpet@gmail.com");
	session.saveOrUpdate(c5);
	Customer c6=new Customer();
	c6.setId(106);
	c6.setFirstName("Denver");
	c6.setLastName("Renz");
	c6.setemailId("denren@gmail.com");
	session.saveOrUpdate(c6);
	Customer c7=new Customer();
	c7.setId(107);
	c7.setFirstName("Modesta");
	c7.setLastName("Renhire");
	c7.setemailId("modren@gmail.com");
	session.saveOrUpdate(c7);
	Customer c8=new Customer();
	c8.setId(108);
	c8.setFirstName("Jeanetta");
	c8.setLastName("Unrein");
	c8.setemailId("jenunr@gmail.com");
	session.saveOrUpdate(c8);
	Customer c9=new Customer();
	c9.setId(109);
	c9.setFirstName("Eulalia");
	c9.setLastName("Neuvis");
	c9.setemailId("eulneu@gmail.com");
	session.saveOrUpdate(c9);
	Customer c10=new Customer();
	c10.setId(110);
	c10.setFirstName("Sha");
	c10.setLastName("Derrico");
	c10.setemailId("shader@gmail.com");
	session.saveOrUpdate(c10);
	Customer c11=new Customer();
	c11.setId(111);
	c11.setFirstName("Adelaide");
	c11.setLastName("Lindo");
	c11.setemailId("adelin@gmail.com");
	session.saveOrUpdate(c11);
	Customer c12=new Customer();
	c12.setId(112);
	c12.setFirstName("Gertie");
	c12.setLastName("Loso");
	c12.setemailId("gerlos@gmail.com");
	session.saveOrUpdate(c12);
	Customer c13=new Customer();
	c13.setId(113);
	c13.setFirstName("Sravya");
	c13.setLastName("Chava");
	c13.setemailId("sracha@gmail.com");
	session.saveOrUpdate(c13);
	Customer c14=new Customer();
	c14.setId(114);
	c14.setFirstName("Retha");
	c14.setLastName("Spino");
	c14.setemailId("retspi@gmail.com");
	session.saveOrUpdate(c14);
	Customer c15=new Customer();
	c15.setId(115);
	c15.setFirstName("Duncan");
	c15.setLastName("Laurin");
	c15.setemailId("dunlau@gmail.com");
	session.saveOrUpdate(c15);
	Customer c16=new Customer();
	c16.setId(116);
	c16.setFirstName("Albert");
	c16.setLastName("Flett");
	c16.setemailId("albfle@gmail.com");
	session.saveOrUpdate(c16);
	Customer c17=new Customer();
	c17.setId(117);
	c17.setFirstName("Dorthy");
	c17.setLastName("Preslar");
	c17.setemailId("dorpre@gmail.com");
	session.saveOrUpdate(c17);
	
	Customer c18=new Customer();
	c18.setId(118);
	c18.setFirstName("Gilberto");
	c18.setLastName("Sullins");
	c18.setemailId("gilsul@gmail.com");
	session.saveOrUpdate(c18);
	Customer c19=new Customer();
	c19.setId(119);
	c19.setFirstName("Sana");
	c19.setLastName("Grandstaff");
	c19.setemailId("sangra@gmail.com");
	session.saveOrUpdate(c19);
	Customer c20=new Customer();
	c20.setId(120);
	c20.setFirstName("Franceso");
	c20.setLastName("Newland");
	c20.setemailId("franew@gmail.com");
	
	session.saveOrUpdate(c20);
	Customer c21=new Customer();
	c21.setId(121);
	c21.setFirstName("Ricki");
	c21.setLastName("Sepulveda");
	c21.setemailId("ricsep@gmail.com");
	session.saveOrUpdate(c21);
	
	Customer c22=new Customer();
	c22.setId(122);
	c22.setFirstName("Santos");
	c22.setLastName("Emmert");
	c22.setemailId("sanemm@gmail.com");
	session.saveOrUpdate(c22);
	Customer c23=new Customer();
	c23.setId(123);
	c23.setFirstName("Lakita");
	c23.setLastName("Fontes");
	c23.setLastName("lakfon@gmail.com");
	session.saveOrUpdate(c23);
	Customer c24=new Customer();
	c24.setId(124);
	c24.setFirstName("Jeannie");
	c24.setLastName("Householder");
	c24.setemailId("jeahou@gmail.com");
	session.saveOrUpdate(c24);
	Customer c25=new Customer();
	c25.setId(125);
	c25.setFirstName("Bradley");
	c25.setLastName("Grego");
	c25.setemailId("bragre@gmail.com");
	session.saveOrUpdate(c25);
	Customer c26=new Customer();
	c26.setId(126);
	c26.setFirstName("Nelle");
	c26.setLastName("Spears");
	c26.setemailId("nelspe@gmail.com");
	session.saveOrUpdate(c26);
	Customer c27=new Customer();
	c27.setId(127);
	c27.setFirstName("Shwanda");
	c27.setLastName("cecho");
	c27.setemailId("shwcec@gmail.com");
	session.saveOrUpdate(c27);
	Customer c28=new Customer();
	c28.setId(128);
	c28.setFirstName("Arletha");
	c28.setLastName("Winebarger");
	c28.setemailId("arlwin@gmail.com");
	session.saveOrUpdate(c28);
	Customer c29=new Customer();
	c29.setId(129);
	c29.setFirstName("Johnny");
	c29.setLastName("Gwozdz");
	c29.setemailId("johgow@gmail.com");
	session.saveOrUpdate(c29);
	Customer c30=new Customer();
	c30.setId(130);
	c30.setFirstName("Marcell");
	c30.setLastName("Scriber");
	c30.setemailId("marser@gmail.com");
	session.saveOrUpdate(c30);
	
	t.commit();//transaction is commited
	session.close();
	
	System.out.println("successfully saved");
	
}
}
