import java.utils.*;
public class Hello{
	public static void main(String[] args){
		System.out.println("Hello World!");
		System.out.println("Hello China!");
		System.out.println("Hello girls!");
		
		
		
		System.out.println("版本升级，马上更新");
		
		random();
	}
	
	public static void random(){
		Random random = new Random();
		System.out.println("生成的随机数为：" + random.nextInt());
	}
}