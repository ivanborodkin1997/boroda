public class Variable {
	public static void main(String[] args) {
		byte nucleus = 2; //ядра
		short frequency = 2700; //  частота МГЦ
		int memory = 8; // оперативная память
		long discharge = 64; //разрядная ос
		float sizeFile = 526e-3F; //Размер файла подкачки
		double physMemory =  5.18; //доступно физической памяти
		char name = 'D'; // прост
		boolean answer = true; //тож прост)

		System.out.println("Количество ядер - " + nucleus + " МГц");
		System.out.println("Частота процессора - " + frequency);
		System.out.println("Оперативная память - " + memory + " Гб");
		System.out.println(discharge + " - разрядная ОС");
		System.out.println("Размер файла подкачки - " + sizeFile + " Гб");
		System.out.println("Доступно физической памяти - " + physMemory + " Гб");
		System.out.println("Просто char - " + name);
		System.out.println("Просто boolean - " + answer);
	}
}