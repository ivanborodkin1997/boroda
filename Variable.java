public class Variable{
	public static void main (String[] args){
	byte a = 2; //ядра
	short b = 2700; //  частота МГЦ
	int c = 8; // оперативная память
	long d = 64; //разрядная ос
	float e = 526e-3F; //Размер файла подкачки
	double f =  5.18; //доступно физической памяти
	char g = 'D'; // прост
	boolean h = true; //тож прост)

	System.out.println("Количество ядер - "+a+" МГц");
	System.out.println("Частота процессора - "+b);
	System.out.println("Оперативная память - "+c+" Гб");
	System.out.println(d+" - разрядная ОС");
	System.out.println("Размер файла подкачки - "+e+" Гб");
	System.out.println("Доступно физической памяти - "+f+" Гб");
	System.out.println("Просто char - "+g);
	System.out.println("Просто boolean - "+h);

	}
}