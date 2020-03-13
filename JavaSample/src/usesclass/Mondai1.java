package usesclass;

import java.util.Calendar;

public class Mondai1 {

	public static void main(String[] args) {
		Calendar cl=Calendar.getInstance();
		String[] week= {"日","月","火","水","木","金","土"};
		int year=2014;
		int month=12;
		int date=31;
		cl.set(year,month,date);
		System.out.println(year+"年"+month+"月"+date+"日は"+week[cl.get(Calendar.DAY_OF_WEEK)-1]+"曜日です。");
	}

}
