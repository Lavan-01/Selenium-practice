import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaBsics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub--------*------
		int myNum=5;
		String website ="Lavan Andhavarapu";
		char letter ='l';
		double dec = 5.99;
		boolean mycard = true;
		System.out.println(dec);
		System.out.println(myNum+ " is the value stored in myNum Variable");
		
		//Arrays
		
		int[] arr = new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		int[] arr2 = {1,2,4,5,6};
		System.out.println(arr2[3]);
		
		// for loop
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		//enhanced for loop
		
		for(int s : arr) {
			System.out.println(s);
		}
		
		//check if array has multiple of 2
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]%2==0) {
				System.out.println(arr2[i]);
				break;
			}
			else {
				System.out.println(arr2[i]+" is not multiple of 2");
			}
		}
		
		//ArrayList
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("lavan");
		a.add("a");
		a.add("selenium");
		System.out.println(a.get(2));
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		for(String ss : a) {
			System.out.println(ss);
		}
		
		//contains method in arrayList
		
		System.out.println(a.contains("selenium"));
		
		//to convert array to ArrayList
		String[] arr3 = {"array", "to","List"};
		
		List<String> nameArrayList = Arrays.asList(arr3);
		System.out.println(nameArrayList.get(1));
		
		//Splitting the string by spaces
		String s= "welcome to strings";
		String[] splittedString =s.split(" ");
		for(String sss : splittedString) {
			System.out.println(sss);
		}
		//splitting the string by to
		String[] ssss = s.split("to");
		System.out.println(ssss[0]);
		System.out.println(ssss[1]);
		System.out.println(ssss[1].trim());
		
		// to print all the characters seperately
		for(int i=0;i<s.length();i++){
			System.out.println(s.charAt(i));
			
		}
		
		//print the string in reverse order
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
		
		
		
	}

}
