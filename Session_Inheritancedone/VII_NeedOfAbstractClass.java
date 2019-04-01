// Concrete Vs Abstract Class & Interface (Logical Container) 

abstract class Animal
{
	public String typeOfSpecies;
	public String foodhabit;
	public String typeOfSound;

	
	public Animal()
	{
		
		System.out.println("defaut constructor of Animal");
	}
	
	public void GenInfo()
	{
		System.out.println("The species name is"+typeOfSpecies);
	}

	
	abstract public void showfoodhabit();
	
	abstract public void showtypeOfSound();
	
}
class Mammal extends Animal
{
	
	public Mammal(int i)
	{
		
		System.out.println("mammal constructor with one parameter"+i);
	}
	
	public Mammal()
	{
			//this(2);
		//super.GenInfo();
		super();
		
		System.out.println("mammal constructor with zero parameter");
	}
	
	
	
	
	
	public void GenInfo()
	{
		super.typeOfSpecies = "Lion";
		super.GenInfo();
		
		System.out.println("In Mammal : The species name is"+typeOfSpecies);
	}
	
	
	
	public void showtypeOfSound()
	{
		System.out.println("In mammal : "+typeOfSound);
	
	}
	public void showfoodhabit()
	{
		System.out.println("In mammal : "+foodhabit);
		
	}
	
	


}
class VII_NeedOfAbstractClass
{
	public static void main(String[] args)
	{
		
		
		//Animal animmem = new Animal();
		//animmem.typeOfSound = "not valid";
		//animmem.showtypeOfSound();
		
		
		Mammal mammalmem = new Mammal();
		
		mammalmem.typeOfSpecies = "Bat";
		mammalmem.typeOfSound = "Beak";
		mammalmem.foodhabit = "Carnivores";
		
		mammalmem.GenInfo();
		mammalmem.showfoodhabit();
		mammalmem.showtypeOfSound();
	
	
	}
	

}


