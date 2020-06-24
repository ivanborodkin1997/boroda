class ConditionalStatement {
	public static void main(String[] args) {
		int Age = 21;
		String Gender = "man";
		double Growth = 1.81;
		char Name = 'I';

		if(Age > 20) {
			System.out.println("Я молодец!");
		}

		if(Gender == "man") {
			System.out.println("Я мужчина!");
		}

		if(Gender != "man") {
			System.out.println("Вот так вот!");
		}

		if(Growth < 1.80) {
			System.out.println("Вот так Вау!");
		} else {
			System.out.println("Вот так могу!");
		}

		if(Name == 'M') {
			System.out.println("Плохое имя!");
		} else if(Name == 'I') {
			System.out.println("Хорошее имя!");
		} else {
			System.out.println("У меня уже есть хорошее имя!");
		}
	}
}