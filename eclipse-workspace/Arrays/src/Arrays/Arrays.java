package Arrays;

public class Arrays {
	
	public static void main(String[] args) {
		intArray();
		
	}
	
	public static void intArray() {
		int [] intArray = new int[10]; 
		for (int i=0; i<intArray.length; i++) {
		   intArray[i] = i;
		   System.out.print(" "+intArray[i]);
		   
		}
		System.out.println();
		for (int j= 0; j<intArray.length; j++) {
			intArray[j] = intArray[j]*10;
			System.out.print(" "+intArray[j]);
		}
		
				
	}
  
}
