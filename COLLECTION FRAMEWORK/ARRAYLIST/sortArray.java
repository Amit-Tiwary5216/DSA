import java.util.*;
class sortArrayList{
	public static void main(String args[]){
	ArrayList<String> list1 = new ArrayList<String>();
	list1.add("Amit");
	list1.add("Ummid");
	list1.add("Rohit");
	list1.add("Ankit");
	Collections.sort(list1);
	for(String name:list1)
	System.out.println(name);
	ArrayList<Integer> list2 = new ArrayList<>();
	list2.add(26);
	list2.add(78);
	list2.add(52);
	list2.add(0);
	System.out.println(" sorted no.:- ");
	Collections.sort(list2);
	for(int no:list2)
	System.out.println(no);
	}
}
