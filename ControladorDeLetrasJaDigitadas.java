public class ControladorDeLetrasJaDigitadas implements Cloneable
{
    private String letrasJaDigitadas;

    public ControladorDeLetrasJaDigitadas ()
    {
        
        this.letrasJaDigitadas="";
    }

    public boolean isJaDigitada (char letra)
    {
        
        for (int i=0; i<this.letrasJaDigitadas.length(); i++)
        {
        	if(this.letrasJaDigitadas.charAt(i) == letra)
			{
        		return true;
		    }
		    else
				return false;
		}
		return false;
	}
    

    public void registre (char letra) throws Exception
    {
		
        if (this.isJaDigitada (letra))
            throw new Exception ("Tentativa de registra letra ja registrada!");

        this.letrasJaDigitadas = this.letrasJaDigitadas+letra;
    }

    public String toString ()
    {
		
        String ret = "";
        char[] letrasJaDigitadasVet = letrasJaDigitadas.toCharArray();
        int i = 0;
       
        if(letrasJaDigitadasVet.length  != 0)
        {
            ret += letrasJaDigitadasVet[i];
            
        for(i = 1; i < letrasJaDigitadasVet.length; i++)
            ret += ", " + letrasJaDigitadasVet[i] ;

        
        }          
        
			
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

        ControladorDeLetrasJaDigitadas controle = (ControladorDeLetrasJaDigitadas)obj;
        char[] ret = this.letrasJaDigitadas.toCharArray();

        for(int i = 0; i < ret.length; i++)
        {
            String carac = "" + ret[i];
            if(!controle.letrasJaDigitadas.contains(carac))
                return false; 
        }

		return true;
    }

    public int hashCode ()
    {
        
        
        int ret = 666;

        if (this.letrasJaDigitadas != null)       
		ret = 3*ret + this.letrasJaDigitadas.hashCode();

		if(ret<0) ret = -ret;
		
		return ret;

    }

    public ControladorDeLetrasJaDigitadas(
    ControladorDeLetrasJaDigitadas cc)
    throws Exception // construtor de c�pia
    {
        
        if (cc==null)
        throw new Exception ("Modelo ausente");
        
        this.letrasJaDigitadas = cc.letrasJaDigitadas;       
        

    }

    public Object clone ()
    {
        
        ControladorDeLetrasJaDigitadas ret=null;
		
		try
		{
			ret = new ControladorDeLetrasJaDigitadas(this);
		}
		catch (Exception erro)
		{} // ignorando Exception, pois sei que não ocorrera
		
		return ret;
    }
}
