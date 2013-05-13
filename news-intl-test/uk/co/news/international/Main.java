package uk.co.news.international;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IService service = new Service();
		String output = service.run(args[0]);
		System.out.println(output);

	}

}
