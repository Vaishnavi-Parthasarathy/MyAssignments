package week1.day1;

public class MyStudent {

		String StudentName;
		String CollegeName;
		int RollNo;
		int Markscored;
		double CGPA;
		
		public void Print() {
			
			System.out.println(StudentName);
			System.out.println(CollegeName);
			System.out.println(RollNo);
			System.out.println(Markscored);
			System.out.println(CGPA);
		}
		public static void main(String[] args) {
			MyStudent obj=new MyStudent();
			obj.StudentName="Vaishnavi";
			obj.CollegeName ="Anna University";
			obj.RollNo = 4512;
			obj.Markscored = 495;
			obj.CGPA = 98.2;
			obj.Print();
			
		}
	}


