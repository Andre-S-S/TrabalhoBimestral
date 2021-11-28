package entities;

//8-Crie uma classe Conhecido, que herda Pessoa, e possui um e-mail. 
public class Known extends People {
	private String email;

	// Construtor
	public Known() {
		super();
	}

	// GET e SET
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
