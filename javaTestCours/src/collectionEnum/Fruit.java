package collectionEnum;

public enum Fruit {
	POMME("vitamine A"),ORANGE("vitamine C"),BANANE("potasium"),FRAISE("vitamine B9");
	
	//atributs
	final String vitamine;
	//constructeur privée
	private Fruit(String vitamine) {
		this.vitamine=vitamine;
	}
	public String getVitamine() {
		String v=this.vitamine;
		System.out.println("la vitamine contenu dans la fruits est"+v);
		return v;
	}
}
