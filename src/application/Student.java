package application;

public class Student {

	 private int snum;
	 private String sname;
	 private int age;
	 private String major;
	 private String level;

	 
	 public Student (int snum, String sname, int age, String major, String level) {
		 this.snum = snum;
		 this.sname = sname;
		 this.age = age;
		 this.major = major;
		 this.level = level;

	 }
	
	public String getName() {
		return sname;
	}
	
	public int getAge() {
		return age;
	}
	
	
	public int getSnum() {
		return snum;
	}
	
	public String getMajor() {
		return major;
	}
	
	public String getLevel() {
		return level;
	}
	
	public void setSnum(int snum) {
		this.snum = snum;
	}
	
	public void setName(String sname) {
		this.sname = sname;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setLevel(String level) {
		this.level = level;
	}
}
