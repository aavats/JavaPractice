// Inheritance 

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
		System.out.println("Generic Info : The foodHabit is "+foodHabit);
	}
	
	


}



class Mammal extends Animal
{
	
	public String IsDomestic;
	
	public void ShowDomesticStatus()
	{
			System.out.println("The Mammal : The domestic status is "+IsDomestic);
	
	}
	
	

}

class Avian extends Animal
{
	
	public String canFly;
	
	
	public void ShowFlyingStatus()
	{
			System.out.println("The Avian : The canFly status is "+canFly);
	
	}
	
	

}

class II_GenVsSpecialization
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




