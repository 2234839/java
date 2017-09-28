import java.util.Scanner;
public class aa {

	/**
	 * @param args
	 */
	//加法
	public static float sz(int a,char b,int c){
		switch(b){
		case '+':return a+c;
		case '-':return a-c;
		case '*':return a*c;
		case '/':return a/c;
		}
		return 0x01;
	}
	//重载
	public static void cf99(int a){
		for(int i=1;i<=a;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.print("\n");
		}
	}
	public static void cf99(){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+i*j+" ");
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( sz(1,'+',2));
		cf99(11);
	}

}
