 package es.unileon.prg.date;

public class Main {

	public static void main(String[] args) {

		Date date = new Date(23, 4, 2016);
	
		System.out.println(date.getEqualsMonths());

		System.out.println(date.dayCount());

		System.out.println(date.getAttemps());

		System.out.println(date.getDayOfWeek());
	}
}
