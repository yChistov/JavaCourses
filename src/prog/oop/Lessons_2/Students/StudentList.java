package prog.oop.Lessons_2.Students;

import java.util.Date;

public class StudentList {
	private Student[] list = new Student[5];
	private int p;
	
	public void add(Student s) {
		if (p == list.length){
			Student[] list = new Student[p + 1];
			System.arraycopy(this.list, 0, list, 0, p);
			this.list = list;
		}
		list[p++] = s;
	}

	public void delete(int n){
		if (n >= 0 && n < p){
			for (int i = n; i < p - 1; i++){
				list[i] = list[++i];
				i--;
			}
			p--;
		}
	}
	
	public Student get(int n) {
		return list[n];
	}
	
	public int find(String name) {
		for (int i = 0; i < p; i++) {
			if (list[i].getName().equalsIgnoreCase(name))
				return i;
		}
		return -1;
	}

	public int findSurname(String surname){
		for (int i = 0; i < p; i++) {
			if (list[i].getSurname().equalsIgnoreCase(surname))
				return i;
		}
		return -1;
	}

	public int findBirth(Date birth){
		for (int i = 0; i < p; i++) {
			if (list[i].getBirth().equals(birth))
				return i;
		}
		return -1;
	}

	public String getNameSurname(int n) {
		return list[n].getName() + " " + list[n].getSurname();
	}

	public void showList(){
		for (int i = 0; i < p; i++)
			System.out.println((i) + ". " + list[i].getName() + " " + list[i].getSurname() + ": " + list[i].getBirth());
	}
}
