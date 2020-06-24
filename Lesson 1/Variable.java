public class Variable {
	public static void main(String[] args) {
		byte yadro = 2; //ядра
		short chastota = 2700; //  частота МГЦ
		int pamyt = 8; // оперативная память
		long razryad = 64; //разрядная ос
		float razmer_faila = 526e-3F; //Размер файла подкачки
		double fiz_pamyt =  5.18; //доступно физической памяти
		char g = 'D'; // прост
		boolean h = true; //тож прост)

		System.out.println("Количество ядер - " + yadro + " МГц");
		System.out.println("Частота процессора - " + chastota);
		System.out.println("Оперативная память - " + pamyt + " Гб");
		System.out.println(razryad + " - разрядная ОС");
		System.out.println("Размер файла подкачки - " + razmer_faila + " Гб");
		System.out.println("Доступно физической памяти - " + fiz_pamyt + " Гб");
		System.out.println("Просто char - " + g);
		System.out.println("Просто boolean - " + h);
	}
}