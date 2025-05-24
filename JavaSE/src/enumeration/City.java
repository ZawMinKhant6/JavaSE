package enumeration;

public enum City {
	
	YANGON(1,8000000L),
	MANDALAY(2,10000000L),
	NAYPYITAW(3,1288888L),
	SITGAING(4,100000L),
	TAUNGGYI(5,3789999L);
	
	
	private final Integer rank;
	private final Long population;
	
	private City(Integer rank, Long population) {
		this.rank = rank;
		this.population = population;
	}

	public Integer getRank() {
		return rank;
	}

	public Long getPopulation() {
		return population;
	}
	
	static void description() {
		System.out.println("Enumeration of City with Constant Value of Emumerated Items");
	}
	
}
