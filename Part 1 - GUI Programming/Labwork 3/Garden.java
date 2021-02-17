public class Garden
{
	//Create flower array to store flowers.
	private Flower[] flowerCount;

	//Create tree array to store trees.
	private Tree[] treeCount;


   	//Mutator for int flowerCount.
  	public void setFlowerCount(Flower flowerCount[])
  	{
  		this.flowerCount = flowerCount;
	}
	//Accessor for int flowerCount.
 	public Flower[] getFlowerCount()
 	{
		return flowerCount;
 	}

   	//Mutator for int treeCount.
  	public void setTreeCount(Tree treeCount[])
  	{
  		this.treeCount = treeCount;
	}
	//Accessor for int treeCount.
 	public Tree[] getTreeCount()
 	{
		return treeCount;
 	}


}