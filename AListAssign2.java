import java.util.*;
import java.util.ArrayList;
public class AListAssign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> l1 =new ArrayList<Integer>();
		l1.add(9);
		l1.add(1);
		l1.add(9);
		ArrayList <Integer> l2 =new ArrayList<Integer>();
		l2.add(8);
		l2.add(5);
		ArrayList <Integer> l = getPrime(100);
		for(int i:l)
			System.out.println(i);
		GoldBatch(120);
		ArrayList <Integer> ans = addBigInt(l1, l2);
		for(int i:ans)
			System.out.print(i);
		
	}
	public static ArrayList<Integer> getPrime(int n) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		int p=2;
		for(int i=0; i<=n-2; i++) {
			list.add(i+2);
		}
		int j=1;
		while(p<=n) {
			
		for(int i=j; i<list.size(); i++) {
			if(list.get(i)%p==0) {
				list.remove(i);
				i--;
			}
		}
		p++;
		j++;
		}
		return list;
	}
	public static void GoldBatch(int n) {
		ArrayList <Integer> list = getPrime(n);
		for(int i=0; i<list.size(); i++) {
			if(list.contains(n-list.get(i))) {
				System.out.println(list.get(i)+ ", "+ (n-list.get(i)));
				break;
			}
		}
	}
	public static ArrayList<Integer> addBigInt(ArrayList<Integer> l1, ArrayList<Integer> l2){
		while(Math.abs(l1.size()-l2.size())>0) {
			if(l1.size()>l2.size())
				l2.add(0,0);
			else if(l1.size()<l2.size())
				l1.add(0,0);
			else
				System.out.println(1);
				break;
		}
		ArrayList<Integer> list= new ArrayList<Integer>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int x=0;
		for(int i=l1.size()-1; i>=0; i--) {
			if(l1.get(i)+l2.get(i)+x>=10) {
				list.add((l1.get(i)+l2.get(i)+x)%10);
				x=1;
			}
			else {
				list.add((l1.get(i)+l2.get(i))%10+x);
				x=0;
			}
		}
		if(x>0) {
			list.add(x);
		}
		for(int i=0; i<list.size();i++)
			ans.add(list.get(list.size()-1-i));
		return (ans);
		
	}
}
