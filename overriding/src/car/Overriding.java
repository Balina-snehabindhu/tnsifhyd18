package car;

public class Overriding {
	  void sound() {
		System.out.println("dont sound horn");
	}
}
	class B extends Overriding{
		 void sound() {
			System.out.println("i hate sounds");
		}
	}

	

	
