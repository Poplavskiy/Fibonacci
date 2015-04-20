package info.poplavskiy.www;

public class Fibanacci {

	public static void main(String[] args) {
		
		int n1=1, n2=2, n=n1+n2, n3=n2;
		System.out.printf("%x \n%x \n",n1,n2);
		while(n<4000000){
			if(n%2==0){n3+=n;}
			System.out.println(n);
			n1=n2;
			n2=n;
			n=n2+n1;
		}
		System.out.println("Сумма четных значных чисел равна: " + n3);

	}

}
