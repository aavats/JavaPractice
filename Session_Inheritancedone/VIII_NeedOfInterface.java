// Concrete Vs Abstract Class & Interface (Logical Container) 

interface Animal
{
	
	public void GenInfo();
	
	
	public void showfoodhabit();
	
	public void showtypeOfSound();
	
}
class Mammal implements Animal
{
	public String typeOfSpecies;
	public String foodhabit;
	public String typeOfSound;

	
	public void GenInfo()
	{
		System.out.println("In Mammal : "+typeOfSpecies);
		
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
class VIII_NeedOfInterface
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


