
public class 申子龙39 {
	public static void main(String[] args){
		int a=127;
		byte b=(byte)a;
		a=b;//a:127 b:127
		b+=a;//b=256  四字节型十进制256强制转换为[字节]的十进制数  溢出之后便是-2  
		System.out.println(b);
	}
}
