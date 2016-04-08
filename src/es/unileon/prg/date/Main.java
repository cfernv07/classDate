 package es.unileon.prg.date;

public class Main {

	public static void main(String[] args) {

		int day;

		int month;

		int year;
	
		int year2=0;

		int month2=0;
	
		int day2=0;

		try{

		System.out.println("Introduce la primera fecha");

		day = Teclado.readInteger();

		month = Teclado.readInteger();

		year = Teclado.readInteger();

		System.out.println("Introduce la segunda fecha");

		day2 = Teclado.readInteger();

		month = Teclado.readInteger();

		year = Teclado.readInteger();

		Date date = new Date(day, month, year);

		Date fecha = new Date(day2, month2, year2);

		//date.setDay();

		//date.setMonth();

		//date.setYear();

		System.out.println(date.isSameYear(fecha));

		System.out.println(date.isSameMonth(fecha));

		System.out.println(date.isSameDay(fecha));

		System.out.println(date.isSame(fecha));

		System.out.println(date.getMonthName());

		System.out.println(date.isValidDay());

		System.out.println(date.getSeason());

		System.out.println(date.monthsLeft());
	
		System.out.println(date.getDate());

		System.out.println(date.getNumDays());

		System.out.println(date.getDatesUntilEnd());

		System.out.println(date.getEqualsMonths());

		System.out.println(date.dayCount());

		System.out.println(date.getAttemps());

		System.out.println(date.getDayOfWeek(3));

		}catch(DateException error){

			System.err.print(error.getMessage());

		}
	}
}
