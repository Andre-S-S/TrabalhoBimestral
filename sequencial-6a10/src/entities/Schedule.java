package entities;

//9- Crie agora, uma classe Agenda. 
public class Schedule {

	// Array que possui pessoas e dois atributos que controlam a quantidade de amigos e conhecidos.
	private int amountFriends;
	private int amountKnown;
	private String[] people;

	// Construtor que recebe por parâmetro a quantidade de pessoas que a agenda
	// terá.
	public Schedule(int amountFriends, int amountKnown) {
		this.amountFriends = amountFriends;
		this.amountKnown = amountKnown;

		// Inicialização do array de Pessoa.
		people[0] = "Douglas";
		people[1] = "André";
		people[2] = "Gefer";

		// Comando: 1 + (int) (Math.random() * 2) para sortear valores entre 1 e 2
		int random = 1 + (int) (Math.random() * 2);

		// Se o valor encontrado for 1, crie um Amigo. Se o valor encontrado for 2, crie um Conhecido.
		if (random == 1) {
			People p = (People) new Friend();
		}

		if (random == 2) {
			People c = (People) new Known();
		}
	}

	// GET e SET
	public String[] getPeople() {
		return people;
	}

	public void setPeople(String[] people) {
		this.people = people;
	}

	public int getAmountFriends() {
		return amountFriends;
	}

	public void setAmountFriends(int amountFriends) {
		this.amountFriends = amountFriends;
	}

	public int getAmountKnown() {
		return amountKnown;
	}

	public void setAmountKnown(int amountKnown) {
		this.amountKnown = amountKnown;
	}

	public void addInformation() {
	}

	public void printsBirthday() {
	}

	public void printEmail() {
	}
}
