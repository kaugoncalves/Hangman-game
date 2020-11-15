public class Tracinhos implements Cloneable
{
    private char texto [];

    public Tracinhos (int qtd) throws Exception
    {
		
        if(qtd <= 0)
        throw new Exception("tamanho invalido");

        this.texto = new char[qtd];

        for(int i =0; i < qtd; i++)
            this.texto[i] = '_';



    }

    public void revele (int posicao, char letra) throws Exception
    {
		
        
        if((posicao < 0) || (posicao >=this.texto.length))
        throw new Exception("posicao invalida");

        this.texto[posicao] = letra;
    }

    public boolean isAindaComTracinhos ()
    {
        
        for(int i =0; i < texto.length; i++)
            if(this.texto[i] == '_')
                return true;
    


        return false;
    }

    public String toString ()
    {
        
        String ret = "";     
        
        
        for(int i = 0; i < this.texto.length; i++)
            ret += this.texto[i] + " ";
            
        
			
		return ret;
    }

    public boolean equals (Object obj)
    {
        
        if (this==obj)
			return true;

		if (obj==null)
			return false;

		if (this.getClass() != obj.getClass())
			return false;

		Tracinhos controle = (Tracinhos)obj;

		if(!this.texto.equals(controle.texto))
			return false;

		return true;
    }

    public int hashCode ()
    {
        
        int ret = 666;
        
        if (this.texto != null)       
		ret = 3*ret + this.texto.hashCode();

		if(ret<0) ret = -ret;
		
		return ret;
    }

    public Tracinhos (Tracinhos t) throws Exception // construtor de cópia
    {
        
        if (t==null)
        throw new Exception ("Modelo ausente");
        
        this.texto = t.texto;   
    }

    public Object clone ()
    {
       
        Tracinhos ret=null;
		
		try
		{
			ret = new Tracinhos(this);
		}
		catch (Exception erro)
		{} // ignorando Exception, pois sei que não ocorrera
		
		return ret;
    }
}
