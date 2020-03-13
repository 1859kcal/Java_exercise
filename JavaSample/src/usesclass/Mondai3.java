package usesclass;

public class Mondai3 {

	public static void main(String[] args) {
		String theDate="2015-01-01";
		String[] st=theDate.split("-");
		String stYear=st[0];
		String stMonth=st[1];
		String stDate=st[2];
		int year=Integer.parseInt(stYear);
		int month=Integer.parseInt(stMonth);
		int date=Integer.parseInt(stDate);
		System.out.println(year+"年"+month+"月"+date+"日");
	}

}
