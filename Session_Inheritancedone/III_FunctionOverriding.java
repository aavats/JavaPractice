// Inheritance 
// Run Time Polymorphism = Late Binding e.g, Function Overriding
class Animal
{
	public String foodHabit;
	public String species;
	public String typeOfSound;
	public int noOfClawes;

	public void GenInfo()
	{
	
		System.out.println("Generic Info : The name of the spcies is "+species);
		System.out.println("Generic Info : The no of claws are"+noOfClawes);
		System.out.println("Generic Info : It make sound as "+typeOfSound);
		
	}
	
	public void ShowFoodHabit()
	{
		System.out.println("Generic Info : Food habit defautl msg");
	}
	
	


}



class Mammal extends Animal
{
	
	public String IsDomestic;
	
	public void ShowDomesticStatus()
	{
			System.out.println("The Mammal : The domestic status is "+IsDomestic);
	
	}

	public void ShowFoodHabit()
	{
		System.out.println("Inherited From Animal : Overriden For Logic In Mammal : Mammal foodHabit is "+foodHabit);
		
	
	}
	

}

class Avian extends Animal
{
	
	public String canFly;
	
	
	public void ShowFlyingStatus()
	{
			System.out.println("The Avian : The canFly status is "+canFly);
	
	}
	
	public void ShowFoodHabit()
	{
		System.out.println("Inherited From Animal : Overriden For Logic In Avian : Avian foodHabit is "+foodHabit);
	
	}
	

}

class III_FunctionOverriding
{
	public static void main(String[] args)
	{
		Animal animobj = new Animal();
		animobj.ShowFoodHabit();
		
		
		Mammal mammalobj = new Mammal();
		
		mammalobj.species = "Lion";
		mammalobj.foodHabit = "Carnivores";
		mammalobj.noOfClawes = 4;
		mammalobj.typeOfSound = "Gurr";
		
		mammalobj.IsDomestic = "No";
	
		mammalobj.GenInfo();
		mammalobj.ShowFoodHabit(22);
		mammalobj.ShowDomesticStatus();
	
	
	
	
		Avian avianobj = new Avian();
		
		avianobj.species = "Pigeon";
		avianobj.foodHabit = "Herbivores";
		avianobj.noOfClawes = 2;
		avianobj.typeOfSound = "Beak";
		
		avianobj.canFly = "Yes";
	
		avianobj.GenInfo();
		avianobj.ShowFoodHabit();
		avianobj.ShowFlyingStatus();
	
	
	
	}




}




