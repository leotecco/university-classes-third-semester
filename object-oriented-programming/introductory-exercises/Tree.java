public class Tree {
	int leaves;
	int branches;
	
	void born() {
		leaves += 50;
		branches += 1;
	}
	
	void fall() {
		leaves -= 50;
		branches -= 1;
	}
}
