package prog.oop.Lessons_3.Developers;

/*		Написать своего наследника Developer. Добавить его в
		существующий проект.*/

import prog.oop.Lessons_3.Developers.Developer;

public class MiddleDeveloper extends Developer {

	public MiddleDeveloper(String name, double basicSalary, int experience) {
		super(name, basicSalary, experience);
	}

	@Override
	public double getSalary() {
		return (basicSalary * 1.5) + (experience > 0 ? basicSalary * experience * 0.1 : 0);
	}
}
