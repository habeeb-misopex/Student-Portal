package application;

public class SimpleRecord {

	 private String snum;
	 private String sname;
	 private String major;
	 private String age;
	 private String level;


	 
	 public SimpleRecord (String snum, String sname, String age, String major, String level) {
		 this.snum = snum;
		 this.sname = sname;
		 this.age = age;
		 this.major = major;
		 this.level = level;
	 }
	
	public  void setRecords(String sg, int i) {
		
		switch  (i) {
		
		case 1:
			snum = sg;
			break;
		case 2:
			sname = sg;
			break;
		case 3:
			age = sg;
			break;
		case 4:
			major = sg;
			break;
		case 5:
			level = sg;
			
		}
	}
	
	public String getField(int i) {
		
			
		String res = null;
		switch(i) {
		case 1:
			res = snum;
			break;
		case 2:
			res = sname;
			break;
		case 3:
			res = age;
			break;
		case 4:
			res = major;
			break;
		case 5: 
			res = level;
			
			
		}
	return res;
	}
}