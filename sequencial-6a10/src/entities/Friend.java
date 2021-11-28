package entities;

//7-Crie uma classe Amigo, que herda Pessoa, e possui uma data de aniversário. 
public class Friend extends People {
	private String birthday;

	// Construtor
	public Friend() {
		super();
	}

	// GET e SET
	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

}
