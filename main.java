//Takes as input a wff and creates a tree
import java.util.Scanner;
import java.util.Vector;
class main
{
	public static void main(String argvs[])
	{
		System.out.println("Enter the formula expression (Please enclose the whole formula in '( )' and don't enter unnecessary spaces or paranthesis):");
		Scanner sc=new Scanner (System.in); 
		String exp=sc.nextLine();

		tree T=new tree();
		T.maketree(exp);

		T.PrintPropositions();

		Tableaux tab=new Tableaux(T.root);
	}
}