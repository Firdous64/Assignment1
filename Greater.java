public class Greater {

	public static void main(String[] args) {
		int[] a= {2,3,9,6,8};
		int index=0;
		int greater=a[0];
		for (int i = 1; i < a.length; i++) {
			if(greater<a[i]) {
				greater=a[i];
			    index=i;
				
			}	
		}
		System.out.println("Greater :"+greater+" at index:"+index);

	}

}