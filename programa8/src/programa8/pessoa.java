package programa8;

import javax.xml.crypto.Data;

public class pessoa {

private String nome;
private String sobrenome;
private int idade;
private Data Datanascimento;
private Data dataNascimento2;
public Data getDatanascimento() {
	return Datanascimento;
}
public void setDatanascimento(Data datanascimento) {
	Datanascimento = datanascimento;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getSobrenome() {
	return sobrenome;
}
public void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
}

}
