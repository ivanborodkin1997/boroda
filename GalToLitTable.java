class GalToLitTable {
	public static void main(String[] args) {
		double gallons; // объем жидкости в голоннах
		double liters; // объем жидкости в литрах
		int counter;
		counter = 0;
		for(gallons = 1; gallons <= 100; gallons++ ){
			liters = gallons * 3.7854; //преобразовываем в литры
			System.out.println(gallons + " галлонам соответсвует " + liters + " литров!");
			counter++;
			if(counter == 10) {
				System.out.println();
				counter = 0; // сбросить счетчик строк
			}
		}
		
	}
}