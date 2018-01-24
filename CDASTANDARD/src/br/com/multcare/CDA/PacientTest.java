package br.com.multcare.CDA;

public class PacientTest extends Pessoa{
	
	private String diaNascimento, mesNascimento, anoNascimento;
	private String id;
	private String localNascimento, enderecoNascimento;
	private String genero;
	private String estadoCivil, religiao, raca, cor, id_exten; //parte que seja nullFlavor.
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil() {
		this.estadoCivil = "nullFlavor";
	}
	public String getReligiao() {
		return religiao;
	}
	public void setReligiao() {
		this.religiao = "nullFlavor";
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca() {
		this.raca = "nullFlavor";
	}
	public String getCor() {
		return cor;
	}
	public void setCor() {
		this.cor = "nullFlavor";
	}
	public String getId_exten() {
		return id_exten;
	}
	public void setId_exten() {
		this.id_exten = "M555";
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getDiaNascimento() {
		return diaNascimento;
	}
	public void setDiaNascimento(String diaNascimento) {
		this.diaNascimento = diaNascimento;
	}
	public String getMesNascimento() {
		return mesNascimento;
	}
	public void setMesNascimento(String mesNascimento) {
		this.mesNascimento = mesNascimento;
	}
	public String getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(String anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLocalNascimento() {
		return localNascimento;
	}
	public void setLocalNascimento(String localNascimento) {
		this.localNascimento = localNascimento;
	}
	public String getEnderecoNascimento() {
		return enderecoNascimento;
	}
	public void setEnderecoNascimento(String enderecoNascimento) {
		this.enderecoNascimento = enderecoNascimento;
	}
	
}
