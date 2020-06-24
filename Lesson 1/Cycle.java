public class Cycle {
	public static void main(String[] args) {

		for(int i = 0; i <= 20; i++) {
			System.out.println(i);
		}
			System.out.println(" ");  // написал для отступа цифр

		int a = 8;
		while(a >= -4) {
			a = a - 2;
			System.out.println(a);
		}
			System.out.println(" ");  // тоже для отступа

		int b = 9;
		int sum = 0;
		do {
			b = b + 2;
			sum = sum + b;
		}while(b < 18);
			System.out.println(sum);  // написал очень коряво, путем подстановок чисел, если есть вариант решить более простым способом - буду рад услышать
	}
}