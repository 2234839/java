
public class aaaaa {

	/**
	 * @param args
	 */
	static class Student{
		Student(){
			
		}
		Student(String name){
			setName(name);
		}
		Student(String name,int age){
			setName(name);
			setAge(age);
		}
		 private String name="张三";
		 private int age=19;
		 String getName(){
			 return name;
		 }
		 void setName(String name){
			 this.name=name;
		 }
		 int getAge(){
			 return age;
		 }
		 void setAge(int age){
			 if(age>0)
				 this.age=age;
			 else
				 System.out.println("年龄输入不合法...修改失败");
		 }
		 void speak(){
			System.out.println(name+":"+"我今年"+age+"岁。");
		}
	}
	static class Singleton{
		private static Singleton d=new Singleton();
		private Singleton(){}
		public static Singleton getInstance(){
			return d;
		}
		void speak(){
			System.out.println("单例模式");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a=new Student();
		a.setAge(-20);
		a.setName("李四");
		a.speak();
		
		Student b=new Student("王五");
		b.speak();
		
		Student c=new Student("朱六",24);
		c.speak();
		
		Singleton d=Singleton.getInstance();
		d.speak();
	}
	

}
