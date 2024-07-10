package collections2;

public class Student {
	
		private long RegNumber;
		private  String  name;
		private   String gender;
		private boolean isPresent;
		private  int age;
		private String depart;
		
		
		public long getRegNumber() {
			return RegNumber;
		}
		public void setRegNumber(long regNumber) {
			RegNumber = regNumber;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public boolean isPresent() {
			return isPresent;
		}
		public void setPresent(boolean isPresent) {
			this.isPresent = isPresent;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getDepart() {
			return depart;
		}
		public void setDepart(String depart) {
			this.depart = depart;
		}
		public Student(long regNumber, String name, String gender, boolean isPresent, int age, String depart) {
			//super();
			RegNumber = regNumber;
			this.name = name;
			this.gender = gender;
			this.isPresent = isPresent;
			this.age = age;
			this.depart = depart;
		}
		
		@Override
		public String toString() {
			return "Student [RegNumber=" + RegNumber + ", name=" + name + ", gender=" + gender + ", isPresent="
					+ isPresent + ", age=" + age + ", depart=" + depart + "]";
		}
			
}
