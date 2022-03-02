package equalshashcode;

public class Usuario {
	String nome;
	String email;
	

	public boolean equals(Object objeto) {
		
		
		if(objeto instanceof Usuario) {
			Usuario outro= (Usuario)objeto;
		boolean nomeIgual= outro.nome.equals(this.nome);
		boolean emailIgual= outro.email.equals(this.email);
		return nomeIgual&&emailIgual;
		}else {
			return false;
		}
		
		// TODO Auto-generated method stub
		//if(obj instanceof Usuario) {
		//Usuario outro = (Usuario) obj;
		
		//return super.equals(obj);
	//}else{return false;
	//}
}
}
