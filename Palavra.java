public class Palavra implements Comparable<Palavra> {
    private String texto;

    public Palavra(String texto) throws Exception {
        if (texto == null || texto == "")
            throw new Exception("o texto esta vazio");

        this.texto = texto;
        
    }

    public int getQuantidade(char letra) {
        int qtd = 0;

        for (int i = 0; i < this.texto.length(); i++) {
            if (letra == this.texto.charAt(i))                
             qtd++;
        }        
            return qtd;
       
    }

    public int getPosicaoDaIezimaOcorrencia(int i, char letra) throws Exception {
        if(i < 0)
        throw new Exception("i tem um valor invalido");

        //natal     qtd=2    i=0 = primeira vez

        int aux = 0;

         for (int j = 0; j < this.texto.length(); j++){
            if(this.texto.charAt(j) == letra)
            {
                if(aux == i)
                return j; 
                
                aux++;
            }           
        }                 
        
        return -1;
 
    }

    public int getTamanho() {
        return this.texto.length();
    }

    public String toString() {
        return this.texto;
    }

    public boolean equals(Object obj) {
        if (this==obj)
			return true;

		if (obj==null)
			return false;

		if (this.getClass() != obj.getClass())
			return false;

		Palavra palavra = (Palavra)obj;

		if(!this.texto.equals(palavra.texto))
			return false;

		return true;
    }

    public int hashCode() {
        
        int ret = 666;

		if (this.texto != null)
			ret = ret * 7 + this.texto.hashCode();

		if (ret<0)
			ret=-ret;

		return ret;
    }

    public int compareTo(Palavra palavra) {
        return this.texto.compareTo(palavra.texto);
    }
}
