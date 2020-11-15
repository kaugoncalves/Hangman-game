public class ControladorDeErros implements Cloneable
{
    private int qtdMax, qtdErr=0;

    public ControladorDeErros (int qtdMax) throws Exception
    {
        if(qtdMax < 0)
        throw new Exception ("qtdMax é menor que zero");

        this.qtdMax = qtdMax;
		
        
    }

    public void registreUmErro () throws Exception
    {
        

        if(isAtingidoMaximoDeErros())
        throw new Exception ("quantidade de erros é maior que a quantidade maxima");

        else
        this.qtdErr++;



    }

    public boolean isAtingidoMaximoDeErros  ()
    {
        
        if(this.qtdErr >= this.qtdMax)
        return true;

        return false;
    }

    public String toString ()
    {
        return this.qtdErr + "/" + this.qtdMax;
    }

    public boolean equals (Object obj)
    {
        
        if (this==obj)
			return true;

		if (obj==null)
			return false;

		if (this.getClass() != obj.getClass())
			return false;

		ControladorDeErros erro = (ControladorDeErros)obj;

		if(this.qtdMax != erro.qtdMax)
            return false;

        if(this.qtdErr != erro.qtdErr)
            return false;
          

		return true;
    }

    public int hashCode ()
    {
       
        int ret = 666;

		ret = 13*ret + new Integer  (this.qtdMax).hashCode();
        ret =  3*ret + new Integer  (this.qtdErr).hashCode(); 

		if (ret<0)
			ret=-ret;

		return ret;
    }

    public ControladorDeErros (ControladorDeErros c) throws Exception  //construtor de c�pia
    {
        if (c==null)
            throw new Exception ("Modelo ausente");
            
        this.qtdErr = c.qtdErr;
        this.qtdMax = c.qtdMax;
        
    }

    public Object clone ()
    {
        ControladorDeErros ret=null;
		
		try
		{
			ret = new ControladorDeErros(this);
		}
		catch (Exception erro)
		{} // ignorando Exception, pois sei que não ocorrera
		
		return ret;
    }
}
