public class ArrayMission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] oneDimentionalArray = { 1, 2, 3, 4 ,5};
		int [][] twoDimentionalArray = {{1}, {1,2}, {1,2,3}};
		
		//Solution1
		print1DArray(oneDimentionalArray);
		
		//Solution2
		printReverse1DArray(oneDimentionalArray);
		
		//Solution3
		print2DArrayWithIndex(twoDimentionalArray);
		
		//Solution4
		copy1DArrayAndPrint(oneDimentionalArray);
		
		//Solution5
		makeReverse1DArrayAndPrint(oneDimentionalArray);
		
		//Solution6
		printOddIndex1DArray(oneDimentionalArray);
		
		//Solution7
		printOddNum1DArray(oneDimentionalArray);
	}
		

	static void print1DArray(int[] oneDimentionalArray) {
		
		System.out.println("-----문제1-----");
		
		for(int num : oneDimentionalArray) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		
	}
	
	
	static void printReverse1DArray(int[] oneDimentionalArray) {
		
		System.out.println("-----문제2-----");
		
		for(int i = oneDimentionalArray.length - 1; i>=0; i--) {
			System.out.print(oneDimentionalArray[i] + " ");
		}
		
		System.out.println();
		
	}

	
	static void print2DArrayWithIndex(int [][] twoDimentinalArray) {
		
		System.out.println("-----문제3-----");
		
		for(int i=0; i<twoDimentinalArray.length; i++) {
			for(int j=0; j<twoDimentinalArray[i].length; j++) {
				System.out.print("su2["+i +"][" + j + "]번지 = "+twoDimentinalArray[i][j]+" ");
			}
			System.out.println();
		}		
	}
	
	static void copy1DArrayAndPrint(int[] oneDimentionalArray) {
		
		System.out.println("-----문제4-----");
		int[] new1DArray = oneDimentionalArray.clone(); //제일 간단하지만 속도가 느림
		//System.arraycopy(su, 0, su3, 0, su.length); clone보다는 속도가 빠르지만 매개변수가 너무 많음.. 하지만 이걸통해 디테일하게 제어할 수 있음.
		//int[] copy = Arrays.copyOf(origin, origin.length); //내부적으로 system.arraycopy()를 편리하게 사용도록 함.
		//int[] copy = Arrays.copyOfRAnge(su, 0, su.length); //범위를 지정할 수 있음
		new1DArray[2] = 33;
		System.out.println(oneDimentionalArray[2]);
		
	}
	
	
	static void makeReverse1DArrayAndPrint(int[] oneDimentionalArray) {
		
		System.out.println("-----문제5-----");
		
		int count = 0;
		int temp;
		int arrayLength = oneDimentionalArray.length;
		
		while(count < (arrayLength/2) ) {			
			temp = oneDimentionalArray[count];
			oneDimentionalArray[count] = oneDimentionalArray[(arrayLength-1) - count];
			oneDimentionalArray[(arrayLength-1) - count] = temp;
			count ++;
		}
		
		for(int num : oneDimentionalArray) {
			System.out.print(num + " ");
		}
		System.out.println();
			
	}
	
	
	static void printOddIndex1DArray(int[] oneDimentionalArray) {
		
		System.out.println("-----문제6-----");
		
		for(int i=0; i<oneDimentionalArray.length; i++) {
			if(isOdd(i)) {
				System.out.print("su[" + i + "] ");
			}			
		}
		System.out.println();
		for(int i=0; i<oneDimentionalArray.length; i++) {
			if(isOdd(i)) {
				System.out.print(oneDimentionalArray[i]+"\t");
			}			
		}
		System.out.println();
		
	}
	
	
	static boolean isOdd(int num) {
		if(num%2==1) {
			return true;
		}
		else {
			return false;
		}		
	}
	
	
	static void printOddNum1DArray(int[] oneDimentionalArray) {
		
		System.out.println("-----문제7-----");
		for(int i=0; i<oneDimentionalArray.length; i++) {
			if(isOdd(oneDimentionalArray[i])) {
				System.out.print(oneDimentionalArray[i] + " ");
			}
		}
		
		System.out.println();
	}
	
}
