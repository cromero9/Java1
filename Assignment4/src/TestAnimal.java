
public class TestAnimal {
	public static void main(String[] args) 
	
	{
		
		Dog d = new Dog("Chris", "Sheperd", 5);
		
		System.out.print("The new dog is " + d.getName() + " " + d.getBreed() + " " + 
		d.getAge() + " ");
		d.makeNoise();
		d.uniqueSkill();
		

}

}