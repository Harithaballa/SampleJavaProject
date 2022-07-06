
public class Sample {

	public static void main(String[] args) {
		for(int num=1;num<=6;num++) {
			for(int i=1;i<=num;i++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("========================");
		for(int alphabet='A';alphabet<='C';alphabet++) {
			for(int i='A';i<=alphabet;i++) {
				System.out.print((char)i+" ");
			}
			System.out.println();
		}
		
		System.out.println("========================");
		for(int row=1;row<=4;row++) {
			for(int col=1;col<=4;col++) {
				if(row==1)
					System.out.print("$");
				else if(col==1 || col==4)
					System.out.print("$");
				else if(row==4)
					System.out.print("$");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
