package prog.oop.Lessons_3.Developers;

/*		Создать список разработчиков и заполнить его случайным
		образом. Вывести на экран только Senior developer-ов с
		зарплатой больше*/

import java.util.Random;

public class DevelopersMain {

	private static Random random = new Random();

	public static String randomName(){
		StringBuilder sb = new StringBuilder();
		int length = random.nextInt(6);
		sb.append((char) (65 + random.nextInt(26)));
		for (int i = 0; i < length; i++) {
			sb.append((char) (97 + random.nextInt(26)));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Developer[] list = new Developer[200];

		for (int i = 0; i < 200; i++) {
			int iType = random.nextInt(4);
			switch (iType) {
				case 0:
					list[i] = new JuniorDeveloper(randomName(), random.nextInt(3000), random.nextInt(10));
					break;
				case 1:
					list[i] = new MiddleDeveloper(randomName(), random.nextInt(3000), random.nextInt(10));
					break;
				case 2:
					list[i] = new SeniorDeveloper(randomName(), random.nextInt(3000), random.nextInt(10));
					break;
				case 3:
					list[i] = new TeamLeadDeveloper(randomName(), random.nextInt(3000), random.nextInt(10));
					break;
			}
		}
		StringBuilder sb;
		
		for (Developer d : list) {
			if (d instanceof SeniorDeveloper && d.getSalary() > 1500) {
				sb = new StringBuilder() // !!!
						.append(d.getClass().getSimpleName())
						.append(" is Name: ")
						.append(d.getName())
						.append(": ")
						.append(d.getSalary());

				System.out.println(sb.toString());
			}
		}
	}
}
