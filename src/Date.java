public class Date{

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year){

		this.day = day;
		this.month = month;
		this.year = year;

	}


	int getYear(){

		return this.year;

	}


	int getMonth(){

		return this.month;

	}

	int getDay(){

		return this.day;

	}

	void setYear(int year){

		this.year = year;

	}

	void setMonth(int month){

		this.month = month;

	}

	void setDay(int day){

		this.day = day;

	}

	boolean isSameYear(Date other){

		if(this.year==other.getYear()){

			return true;

		}

		else{

			return false;

		}


	}

	boolean isSameMonth(Date other){

		if(this.month==other.getMonth()){

			return true;

		}

		else{

			return false;
			
		}

	}

	boolean isSameDay(Date other){

		if(this.day==other.day){

			return true;

		}

		else{

			return false;

		}

	}

	boolean isSame(Date day, Date month, Date year){

		if((this.day==day.getDay())&&(this.month==month)&&(this.year==year)){

			return true;

		}

		else{

			 return false;

		}

	}

	String getMonthName(){

		String mes="";

		switch(this.month){

			case 1: mes = "Enero";
			break;

			case 2: mes = "Febrero";
			break;

			case 3: mes = "Marzo";
			break;

			case 4: mes = "Abril";
			break;

			case 5: mes = "Mayo";
			break;

			case 6: mes = "Junio";
			break;

			case 7: mes = "Julio";
			break;

			case 8:
			

		}
	
	}

}
