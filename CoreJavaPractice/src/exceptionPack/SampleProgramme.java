package exceptionPack;

public class SampleProgramme {

	public static void main(String[] args) {

		int age = 61;
		if (age>60) {
			throw new CustomException("TO young");
		} else {

			System.out.println("Success");
		}
	}
}
