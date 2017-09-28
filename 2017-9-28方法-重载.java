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
	public static int digui(int n){
		if(n==1)
			return 1;
		return (n*(digui(n-1)));
	}
	
	public static void shuzu() {//数组操作
		int[] arr={2,412,45,25,1,34};
		zuixiaozhi(arr);
		maopao(arr);
		dayin(arr);
	}
	public static void zuixiaozhi(int[] arr) {//最小值
		int temp=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<temp)
				temp=arr[i];
		}
		System.out.println("arr 的最小值:"+temp);
	}
	
	public static void dayin(int[] arr) {//打印
		for(int i=0;i<arr.length;i++){
			System.out.println("arr["+i+"]:"+arr[i]);
		}
	}
	
	public static void maopao(int[] arr) {//冒泡排序
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( sz(1,'+',2));
		cf99(11);
		System.out.println("递归："+ digui(4));
		shuzu();
		
		
	}

}
