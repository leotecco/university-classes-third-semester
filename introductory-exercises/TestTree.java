public class TestTree {
	public static void main(String args[]) {
		Tree t = new Tree();
		t.leaves = 300;
		t.branches = 6;
		
		System.out.printf("TREE 1 - LEAVES: %d, BRANCHES: %d\n", t.leaves, t.branches);
		
		t.born();
		
		System.out.printf("TREE 1 AFTER BORN - LEAVES: %d, BRANCHES: %d\n", t.leaves, t.branches);
		
		t.fall();
		
		System.out.printf("TREE 1 AFTER FALL - LEAVES: %d, BRANCHES: %d\n", t.leaves, t.branches);
		
		t.born();
		t.born();
		
		System.out.printf("TREE 1 AFTER BORN AGAIN - LEAVES: %d, BRANCHES: %d\n", t.leaves, t.branches);
	}
}
