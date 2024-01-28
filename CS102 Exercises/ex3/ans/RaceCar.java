public class RaceCar extends Car {
	private Person owner;
	public RaceCar(String name, int age) {
		super(4);
		owner = new Person(name, age);
	}
	public Person getOwner() {
		return owner;
	}
	@Override
	public int getSpeed() {
		return (int)(super.getSpeed() * 1.5);
	}
}