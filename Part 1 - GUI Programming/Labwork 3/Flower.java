public class Flower
{
	//Create 2 attributes.
	private int flowerType;
	private int flowerColour;

	//Constructor.
	public Flower(int flowerType, int flowerColour)
	{
		this.flowerType = flowerType;
		this.flowerColour = flowerColour;
	}


   	//Mutator for int flowerType.
  	public void setFlowerType(int flowerType)
  	{
  		this.flowerType = flowerType;
	}
	//Accessor for int flowerType.
 	public int getFlowerType()
 	{
		return flowerType;
 	}


    //Mutator for int flowerColour.
   	public void setFlowerColour(int flowerColour)
   	{
   		this.flowerColour = flowerColour;
 	}
 	//Accessor for int flowerColour.
  	public int getFlowerColour()
  	{
 		return flowerColour;
  	}

}