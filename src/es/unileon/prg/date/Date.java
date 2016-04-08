 package es.unileon.prg.date;

//Carlos Fernández Valladares

public class Date{

	private int day;
	private int month;
	private int year;

	public Date(){

		this.day = 1;
		this.month = 1;
		this.year = 2016;
		
	}

	public Date(int day, int month, int year) throws DateException{

		StringBuffer error = new StringBuffer();		

		int d = 0;

		if(day<=0){

			error.append("El día introducido es negativo");

		}

		if(day>28){

			switch(month){

				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
			
						d = 31 ;			

				break;

				case 4:
				case 6:
				case 9:
				case 11:

						d = 30;

				break;

				case 2:

						d = 28;
				

				break;

			}


		

		

			if((day>d)&&(d==31)){

				error.append("El mes tiene 31 días");

			}

			else if((day>d)&&(d==30)){

				error.append("El mes tiene 30 días");

			}

			else if((day>d)&&(d==28)){

				error.append("El mes tiene 28 días");				

			}

		}

		if((month<=0) || (month>12)){

			error.append("El mes introducido es incorrecto");

		}

		if(year<0){
		
			error.append("El año introducido no es correcto");

		}

		if(error.length()!=0){

			throw new DateException(error.toString());

		}

		else{

		this.day = day;
		this.month = month;
		this.year = year;

		}


	}

	public Date(Date aux){

		this.day = aux.getDay();
		this.month = aux.getMonth();
		this.year = aux.getYear();

	}


	public int getYear(){

		return this.year;

	}


	public int getMonth(){

		return this.month;

	}

	public int getDay(){

		return this.day;

	}

	public void setYear(int year) throws DateException{

		StringBuffer error = new StringBuffer();

		if(year<0){
		
			error.append("El año introducido no es correcto");

		}

		if(error.length()!=0){

			throw new DateException(error.toString());

		}

		else{

		this.year = year;

		}


		this.year = year;

	}

	public void setMonth(int month) throws DateException{

		StringBuffer error = new StringBuffer();

		if((month<=0) || (month>12)){

			error.append("El mes introducido es incorrecto");

		}

		if(error.length()!=0){

			throw new DateException(error.toString());

		}

		else{

		this.month = month;

		}

		this.month = month;

	}

	public void setDay(int day) throws DateException{

		StringBuffer error = new StringBuffer();

		int d = 0;

		if(day<=0){

			error.append("El día introducido es negativo");

		}

		if(day>28){

			switch(month){

				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
			
						d = 31 ;			

				break;

				case 4:
				case 6:
				case 9:
				case 11:

						d = 30;

				break;

				case 2:

						d = 28;
				

				break;

			}


		

		

			if((day>d)&&(d==31)){

				error.append("El mes tiene 31 días");

			}

			else if((day>d)&&(d==30)){

				error.append("El mes tiene 30 días");

			}

			else if((day>d)&&(d==28)){

				error.append("El mes tiene 28 días");				

			}

		}

		if(error.length()!=0){

			throw new DateException(error.toString());

		}

		else{
		
			this.day = day;

		}

	}

	public boolean isSameYear(Date other){

		if(this.year==other.getYear()){

			return true;

		}

		else{

			return false;

		}


	}

	public boolean isSameMonth(Date other){

		if(this.month==other.getMonth()){

			return true;

		}

		else{

			return false;
			
		}

	}

	public boolean isSameDay(Date other){

		if(this.day==other.day){

			return true;

		}

		else{

			return false;

		}

	}

	public boolean isSame(Date other){

		if((this.day==other.getDay())&&(this.month==other.getMonth())&&(this.year==other.getYear())){

			return true;

		}

		else{

			 return false;

		}

	}

	public String getMonthName(){

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

			case 8: mes = "Agosto";
			break;

			case 9: mes = "Septiembre";
			break;

			case 10: mes = "Octubre";
			break;

			case 11: mes = "Noviembre";
			break;

			case 12: mes = "Diciembre";
			break;
			

		}
		return mes;
	
	}

	public boolean isValidDay(){

		boolean validez=true;

		switch(this.month){

			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:

				if((this.day<1)||(this.day>31)){
			
					validez = false;			

				}

			break;

			case 4:
			case 6:
			case 9:
			case 11:

				if((this.day<1)||(this.day>30)){

					validez = false;

				}

			break;

			case 2:

				if((this.day<1)||(this.day>28)){

					validez = false;
				
				}

			break;

		}

		return validez;

	}

	public int getLimitRange(){

		int validez=0;

		switch(this.month){

			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			
					validez = 31 ;			

			break;

			case 4:
			case 6:
			case 9:
			case 11:

					validez = 30;

			break;

			case 2:

					validez = 28;
				

			break;

		}

		return validez;

	}


	public String getSeason(){

		String season="";		/*
							Hemisferio norte
							Primavera: 21 marzo hasta 20 junio
							Verano: 21 junio hasta 20 septiembre
							Otoño: 21 septiembre hasta 20 diciembre
							Invierno: 21 diciembre hasta 20 marzo
						*/

		switch(this.month){

			case 1: season = "Invierno";
			break;
			case 2: season = "Invierno";
			break;
			case 3:
			
				if(this.day<21){
			
					season = "Invierno";

				}
				
				else{

					season = "Primavera";

				}

			break;

			case 4: season = "Primavera";
			break;
			case 5: season = "Primavera";
			break;
			case 6: 

				if(this.day<21){

					season = "Primavera";

				}
			
				else{

					season = "Verano";

				}

			break;

			case 7: season = "Verano";
			break;
			case 8: season = "Verano";
			break;
			case 9: 

				if(this.day<21){

					season = "Verano";

				}

				else{

					season = "Otoño";

				}

			break;

			case 10: season = "Otoño";
			break;
			case 11: season= "Otoño";
			break;
			case 12:

				if(this.day<21){

					season ="Otoño";

				}

				else{
				
					season = "Invierno";
	
				}
		
			break;
			

		}


		return season;

	}

	public String monthsLeft(){

		StringBuffer months = new StringBuffer();

		Date fecha = new Date(this);

		try{

			for(int i=this.month;i<=12;i++){

				fecha.setMonth(fecha.getMonth()+1);

				months.append(fecha.getMonthName()+" ");	

			}

		}catch(DateException error){

			System.err.print(error.getMessage());
	
		}

		return months.toString();

	}

	public String getDate(){

		String date="";

		date = ("La fecha es: "+this.day+"/"+this.month+"/"+this.year);

		return date.toString();

	}

	int getNumDays(){

		int days = 0;

		if((this.month==1)||(this.month==3)||(this.month==5)||(this.month==7)||(this.month==8)||(this.month==10)||(this.month==12)){

			days = 31;

		}

		else if((this.month==4)||(this.month==6)||(this.month==9)||(this.month==11)){

			days = 30;

		}

		else{

			days = 28;

		}

		return days;

	}

	public String getDatesUntilEnd(){

		StringBuffer dates = new StringBuffer();

		Date fecha =new Date(this);

		int j = 0;

		try{

			for(int i=this.day;i<=getNumDays();i++){

				setDay(fecha.getDay()+j++);

				dates.append(this.day+"/"+this.month+"/"+this.year+" ");

			}

		}catch(DateException error){

			System.err.print(error.getMessage());

		}

		return dates.toString();

	}

	public String getEqualsMonths(){

		StringBuffer equalMonths = new StringBuffer();
		
		int dias = getNumDays();

		int otrosDias = 0;

		Date fecha = new Date(this);

		Date fecha2 = new Date(this);

		try{

			for(int i=1;i<=12;i++){

				fecha2.setMonth(i);

				if(dias==fecha2.getNumDays()){

					equalMonths.append(fecha2.getMonthName()+" ");

				}	
		
			}

		}catch(DateException error){

			System.err.print(error.getMessage());
	
		}

		

		return equalMonths.toString();

	}

	int dayCount(){

		int dias = 0;

		Date fecha = new Date(this);

		Date fecha2 = new Date(this);

		try{

			for(int i = 1; i < fecha2.getMonth(); i++){

				fecha.setMonth(i);
	
			

				dias = dias + fecha.getNumDays();
			
			


			}

		}catch(DateException error){

			System.err.print(error.getMessage());

		}

		return dias + this.getDay();

	}

	int getAttemps(){

		int intentos = 0;
		int randomDay;;
		int randomMonth;
		int randomYear;

		do{

			randomDay = (int) (Math.random()*31+1);
			randomMonth = (int) (Math.random()*12+1);
			randomYear = (int) (Math.random()*3000);

			intentos++;

		}while(this.year!=randomYear);

		return intentos;

	}

	public int getDayOfWeek(int diaSemana){

		return (dayCount()%7) + diaSemana;

	}


}

//Carlos Fernández Valladares










