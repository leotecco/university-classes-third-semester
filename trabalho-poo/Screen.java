import java.io.IOException;

public class Screen {
	public static void clear() {
		try {
			ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
			pb.inheritIO();
			pb.start();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
