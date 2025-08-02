package q6;

class Hobbies {
	String h1;
	String h2;
	public Hobbies(String h1, String h2) {
		super();
		this.h1 = h1;
		this.h2 = h2;
	}
	@Override
	public String toString() {
		return "Hobbies [h1=" + h1 + ", h2=" + h2 + "]";
	}
}

class Skills {
	String tech;
	String nontech;
	public Skills(String tech, String nontech) {
		super();
		this.tech = tech;
		this.nontech = nontech;
	}
	@Override
	public String toString() {
		return "Skills [tech=" + tech + ", nontech=" + nontech + "]";
	}
}

class Emp {
	String empname;
	int pid;
	Hobbies hobbies;
	Skills skills;
	@Override
	public String toString() {
		return "Emp [empname=" + empname + ", pid=" + pid + ", hobbies=" + hobbies + ", skills=" + skills + "]";
	}

	public Emp(String empname, int pid, Hobbies hobbies, Skills skills) {
		super();
		this.empname = empname;
		this.pid = pid;
		this.hobbies = hobbies;
		this.skills = skills;
	}

}
public class Main {
public static void main(String[] args) {
	Hobbies hobbies = new Hobbies("Writing", "Sketching");
	Skills skills = new Skills("Java", "Empath");
	Emp emp = new Emp("Stro", 54, hobbies , skills);
	
	System.out.println(emp);
}

}
