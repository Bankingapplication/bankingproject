import java.util.*;
import java.io.*;
public class CalInfo {
public static void main(String args[]){
	Calendar cal=Calendar.getInstance();
	int dd=cal.get(Calendar.DATE);
	int mm=cal.get(Calendar.MONTH);
	int yy=cal.get(Calendar.YEAR);
	System.out.println(mm +"/" +dd+"/"+ yy);
	cal.set(2014,2,26);
	System.out.println(cal.getActualMaximum(Calendar.DATE));//max days 31
	System.out.println(cal.get(Calendar.DAY_OF_WEEK));//weekday 4
	System.out.println(cal.get(Calendar.DAY_OF_YEAR));
	Date d=new Date();
	System.out.println(d.getYear()+ 2015);
	File f=new File("CalInfo.java");
	System.out.println(new Date(f.lastModified()));
}
}
