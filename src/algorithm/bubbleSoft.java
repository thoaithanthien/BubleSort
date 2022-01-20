package algorithm;

public class bubbleSoft {
	
	// Sap xep noi bot
	// So dung truoc lon hon so dung sau se doi cho~ cho nhau
	
	public static void printArray(int no, int[] a) {
		
	    System.out.printf("%d: ", no);
	    for (int i = 0; i < a.length; i++) {
	        System.out.printf("%d ", a[i]);
	    }       
	    System.out.println();
	}
	
	public static void bubbleSort(int [] a) {
	    int n = a.length;
	    for (int i = 0; i < n; i++) {
	    	boolean isSort = true;
	        for (int j = 0; j < n-i-1; j++) {
	        	if(a[j] > a[j+1]) {
	        		
	        		isSort = false;
	        	    int t = a[j];
	        	    a[j] = a[j+1];
	        	    a[j+1] = t;
	        	}
	        	          
	        }
	        
	        printArray(i, a);
	        if (isSort) {
				break;
			}
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {5, 3, 2 ,7, 8, 1, 2 }; 
		bubbleSort(a);
	}

}



