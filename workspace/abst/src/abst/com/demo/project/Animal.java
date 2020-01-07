package abst.com.demo.project;

public abstract class Animal {
public abstract void animalsound();
public void sleep(){
	System.out.println("zzz");
}
}
class Zoo extends Animal {

	@Override
	public void animalsound() {
		System.out.println("wow wow");
		
	}
	
}
class mainclass{
	public static void main(String[] args) {
		Zoo z=new Zoo();
		z.animalsound();
		z.sleep();
	}
}