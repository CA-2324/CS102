package quiz.domain.membership;
public class Staff extends SMUCitizen {
	private String office;
	public Staff(String name, String office) {
		super(name);
		this.office = office;
	}
	public boolean equals(Object obj) {
		if (!(obj instanceof Staff)) {
			return false;
		}
		Staff another = (Staff) obj;
		return getName().equalsIgnoreCase(another.getName())
						&& office.equalsIgnoreCase(another.office);
	}
}