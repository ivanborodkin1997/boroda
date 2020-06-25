public class Cycle {
	public static void main(String[] args) {

		for(int i = 0; i <= 20; i++) {
			System.out.println(i);
		}
				System.out.println(" ");  // написал для отступа цифр

		int a = 6;
		while(a >= -6) {
			System.out.println(a);
			a -= 2;
		}
				System.out.println(" ");  // тоже для отступа

		int b = 10;
		int sum = 0;
		do {
			b += 1;
			if(b % 2 == 1) {
			sum += b;
			}	
		}while(b < 20);
			System.out.println(sum);  // написал очень коряво, путем подстановок чисел, если есть вариант решить более простым способом - буду рад услышать
	}
}