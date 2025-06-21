package dependency;

public class Oil {
private String type;
	
	public Oil() {
		
	}

	public Oil(String type) {
		super();
		this.type = type;
	}

	public String getName() {
		return type;
	}

	public void setName(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Flavour [type=" + type + "]";
	}
}
