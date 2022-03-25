
public class Lab_2_3 {
public static void main(String args[] ) {
	yigit y = new yigit(3);
	y.push(-5);
	y.push(7);
	y.push(9);
	y.push(-5);
	y.push(1);
	
	while(y.bas> -1){
		System.out.println(y.pop());
	}
	
 }
}
interface intyigin{
	void push (int item);
	int pop();	
}
class yigit implements intyigin{ 
	private int dizi[];
	 int bas;
	yigit(int N){
		dizi = new int [N];
		bas = -1;
}	
	public void push (int item) {
		if(bas == dizi.length-1) 
			System.out.println("Slotumuz doldu.");
		
		else{
			bas++;
			dizi[bas] = item;
	}
}
	public int pop() {
		if( bas <0) {
			System.out.println("Slot boþ");
			return 0;
	}
		else {
			bas--;
			return dizi[bas+1];
	}
 }
}