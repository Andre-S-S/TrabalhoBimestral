package entities;

//6- Criar uma classe chamada Pessoa.Uma pessoa possui um nome e uma idade. 
public class People {
	private String name;
	private int age;

	// Dois construtores
	public People() {
	}

	public People(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	// GET e SET
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
