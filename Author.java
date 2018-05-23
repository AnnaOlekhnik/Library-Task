package by.htp.library.entity;

public class Author {

	private String secondName;
	private String name;
	private int birthYear;

	
	public Author ( String name, String secondName, int birthYear) {
		this.secondName = secondName;
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
}
