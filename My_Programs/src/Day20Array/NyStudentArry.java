package Day20Array;

public class NyStudentArry {

	public static void main(String[] args) {
		NYStudent ny1 = new NYStudent();
		System.out.println(ny1);
		NYStudent []nyArr = new NYStudent[100];
		System.out.println(nyArr[0]);
	
		nyArr[0] =new NYStudent();
		for(int i=0;  i<nyArr.length ; i++ ) {
			nyArr[i]=new NYStudent();
		}
		System.out.println(nyArr[3]);
		
	}

}
