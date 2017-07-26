public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("BONJOUR JAVA");
		Personne p1 = new Personne("toto", "dupont", 25);
		System.out.println(p1);
		
		p1.setNom("test");
		System.out.println(p1);
		
		p1.methode1();
		
		Personne p2 = new Personne("test", "titi");
		System.out.println(p2);
		
		p2.setAge(35);
		System.out.println(p2);

		p2.methode5();
		
		p2.methode6(3);
		
		p2.methode7();
		
		p2.methode8(4);
		
		p2.methode9(10);
		
		p1.setAge(0);
		System.out.println(p1);
	
}
}
