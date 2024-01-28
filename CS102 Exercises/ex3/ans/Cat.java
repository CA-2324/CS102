package quiz.farm;
import quiz.family.Pet;

public class Cat implements Animal, Pet {
	@Override
	public String makeNoise() {
		return "meow meow";
	}
}