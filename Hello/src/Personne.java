
public class Personne {
	private String nom;
	private String prenom;
	private int age;
	
	//m�thode constructeur
	public Personne(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	
	
	}
	
	//constructeur pour p2
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	
	
	//assesseurs
	
	//getters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//m�thode1 demand�e par le client
	public void methode1()
	{
		System.out.println("je suis dans la m�thode 1");
	}
	
	

	//m�thode2 demand�e par le client
	public String methode2(String x) {
		return x;
	}
		
	public String methode3(Personne p)
	{
		return p.toString();
	}
	
	public Personne methode4(Personne p)
	{
		return p;
	}
	
	// afficher BONJOUR 5 fois
	public void methode5()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("BONJOUR");
		}
	}
	
	//afficher BONJOUR2 y fois, on pr�cise la valeur de y que l'on souhaite dans le main
	public void methode6(int y)
	{
		for(int i=0;i<y;i++)
		{
			System.out.println("BONJOUR2");
		}
	}
	
	//afficher BONJOUR3 5 fois avec while
	public void methode7()
	{
		int i=0;
		while(i<5)
		{
			System.out.println("BONJOUR3");
			i++;
		}
	}
	
	//methode6 avec while
	public void methode8(int y)
	{
		int i=0;
		while (i<y)
		{
			System.out.println("BONJOUR8");
			i++;
		}
	}
	
	//exemple de structure de controle switch
	public void methode9(int k)
	{
		switch(k)
		{
		case 0 : System.out.println("la valeur de k est 0");
		break;
		case 1 : System.out.println("la valeur de k est 1");
		break;
		default : System.out.println("la valeur de k est autre que 0 et 1");
		break;
		}
	}


	//red�finition de la m�thode toString
	@Override
	public String toString() {
		if(age>0)
		{
			return "Personne [nom=" + nom + ", prenom = " + prenom + ", age=" + age + "]";
		}
		else
		{
			return "Personne [nom=" + nom + ", prenom = " + prenom + "]";
		}
	}
	
	
}
