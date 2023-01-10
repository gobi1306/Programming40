package Array;

public class DescendingOrder {

	public static void main(String[] args) {

		int a[]= {50,10,60,40,20,30,100};
		//i=0; 0<=7
		for (int i = 0; i < a.length; i++) {
			//j=0+1;1<=7;
			for (int j = i+1; j < a.length; j++) {
				//50<10
				if (a[i]<a[j]) {
					int temp=a[i];//
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
			
		}
		for (int des : a) {
			System.out.println(des);
			
		}
		
	}

}
