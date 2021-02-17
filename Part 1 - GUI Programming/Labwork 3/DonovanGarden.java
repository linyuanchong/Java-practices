public class DonovanGarden
{
	public static void main(String[] args)
	{
		//Creating new flowers into flowerCount[], assigning all of the 2 attributes.
		Flower flowerCount[] ={new Flower(4, 1), new Flower(5, 1), new Flower(9, 6)};
		//Creating new trees into treeCount[], assigning all of the 3 attributes.
		Tree treeCount[] ={new Tree(3, 2, 6), new Tree(1, 7, 8), new Tree(6, 8, 6)};

		//Printing out results for first flower.
		System.out.println("Flower type: " + flowerCount[0].getFlowerType());
		System.out.println("Flower colour: " + flowerCount[0].getFlowerColour());

		System.out.println("");

		//Printing out results for first tree.
		System.out.println("Tree type: " + treeCount[0].getTreeType());
		System.out.println("Flower height: " + treeCount[0].getTreeHeight());
		System.out.println("Flower height: " + treeCount[0].getTreeAge());
	}

}