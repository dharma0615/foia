package basics1;

public class Dog extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal myanimal=new Dog();
myanimal.sound();  //upcasting; overriding is alos hapend


Dog mydog=(Dog)myanimal;  //downcasting
mydog.sound();
mydog.color();


Animal animal=new Animal();
Dog dog=(Dog)animal;   //downcasting but no instance created for sub class so it throws class caste exception
dog.color();
		
	}
	
	void sound() {
		System.out.println("Dog barks");
	}
	
	void color() {
		System.out.println("Dog is in brown");
	}

}
