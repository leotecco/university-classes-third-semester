public class TesteArray {

	public static void main(String args[]) {
		int vet[] = new int[100];
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = vet.length - i;
		}
		
		for (int i = vet.length - 1; i >= 0; i--) {
			System.out.println(vet[i]);
		}
		
		for (int aux: vet) {
			System.out.println(aux);
		}
		
		int mat[][] = new int[3][];
		mat[0] = new int[3];
		mat[1] = new int[5];
		mat[2] = new int[8];
	}
}
