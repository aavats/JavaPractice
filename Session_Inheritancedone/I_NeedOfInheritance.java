// Inheritance 
class Mammal
{
	public String foodHabit;
	public String species;
	public String typeOfSound;
	public int noOfClawes;

	public String IsDomestic;
	
	public void GenInfo()
	{
	
		System.out.println("The Mammal : The name of the spcies is "+species);
		System.out.println("The Mammal : The no of claws are"+noOfClawes);
		System.out.println("The Mammal : It make sound as "+typeOfSound);
		
	}
	
	public void ShowFoodHabit()
	{
		System.out.println("The Mammal : The foodHabit is "+foodHabit);
	}
	
	public void ShowDomesticStatus()
	{
			System.out.println("The Mammal : The domestic status is "+IsDomestic);
	
	}
	
	

}

class Avian
{
	public String foodHabit;
	public String species;
	public String typeOfSound;
	public int noOfClawes;

	public String canFly;
	
	public void GenInfo()
	{
	
		System.out.println("The Avian : The name of the spcies is "+species);
		System.out.println("The Avian : The no of claws are"+noOfClawes);
		System.out.println("The Avian : It make sound as "+typeOfSound);
	
	}
	
	public void ShowFoodHabit()
	{
		System.out.println("The Avian : The foodHabit is "+foodHabit);
	}
	
	public void ShowFlyingStatus()
	{
			System.out.println("The Avian : The canFly status is "+canFly);
	
	}
	
	

}

class I_NeedOfInheritance
{
	public static void main(String[] args)
	{
		Mammal mammalobj = new Mammal();
		
		mammalobj.species = "Lion";
		mammalobj.foodHabit = "Carnivores";
		mammalobj.noOfClawes = 4;
		mammalobj.typeOfSound = "Gurr";
		
		mammalobj.IsDomestic = "No";
	
		mammalobj.GenInfo();
		mammalobj.ShowFoodHabit();
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




