public class Tree
{
	//Create 2 attributes.
	private int treeType;
	private int treeHeight;
	private int treeAge;

	//Constructor.
	public Tree(int treeType, int treeHeight, int treeAge)
	{
		this.treeType = treeType;
		this.treeHeight = treeHeight;
		this.treeAge = treeAge;
	}


   	//Mutator for int treeType.
  	public void setTreeType(int treeType)
  	{
  		this.treeType = treeType;
	}
	//Accessor for int type.
 	public int getTreeType()
 	{
		return treeType;
 	}


    //Mutator for int treeHeight.
   	public void setTreeHeight(int treeHeight)
   	{
   		this.treeHeight = treeHeight;
 	}
 	//Accessor for int treeHeight.
  	public int getTreeHeight()
  	{
 		return treeHeight;
  	}


    //Mutator for int treeAge.
   	public void setTreeAge(int treeAge)
   	{
   		this.treeAge = treeAge;
 	}
 	//Accessor for int treeAge.
  	public int getTreeAge()
  	{
 		return treeAge;
  	}

}