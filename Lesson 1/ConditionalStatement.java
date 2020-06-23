class ConditionalStatement {
	public static void main(String[] args) {
		int yourAge = 21;
		String yourGender = "man";
		double yourGrowth = 1.81;
		char yourName = 'I';

		if(yourAge > 20) {
			System.out.println("Я молодец!");
		}
		if(yourGender == "man") {
			System.out.println("Я мужчина!");
		}
		if(yourGender != "man") {
			System.out.println("Вот так вот!");
		}
		if(yourGrowth < 1.80) {
			System.out.println("Вот так Вау!");
		} else {
			System.out.println("Вот так могу!");
		}
		if(yourName == 'M') {
			System.out.println("Плохое имя!");
		} else if(yourName == 'I') {
				System.out.println("Хорошее имя!");
		} else {
				System.out.println("У меня уже есть хорошее имя!");
		}
	}
}