
public abstract class Animal {
	String name;
	String breed;
	int age;
	public Animal(String name, String breed, int age){
		this.name = name;
		this.breed = breed;
		this.age = age;
		
	}
	public String getName(){
		return name;
	}
	public String getBreed(){
		return breed;
	}
	public int getAge(){
		return age;
	}
	public abstract void makeNoise();
	
	public abstract void uniqueSkill();
	
	

}
