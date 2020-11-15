public class Testador {
    public static void main (String args [])
    {
		System.out.println ("                       TESTANDO PALAVRA");
        // teste 1
		try
		{
		    Palavra p1 = new Palavra (null);
			System.out.println ("\n\ncriou com null");

	    }
	    catch (Exception erro)
	    {
			System.err.println ("\n\nnao e possivel criar palavra com null");
        }
         // teste 2
		try
		{
		    Palavra p2 = new Palavra  ("");
			System.out.println ("\ncriou com nada");

	    }
	    catch (Exception erro)
	    {
			System.err.println ("\nnao e possivel criar palavra com nada");
        }
        //TESTE 3
        Palavra p3 =null;
        try
		{
			p3 = new Palavra ("arroz");
			System.out.println ("\nDeu certo construir palavra com ARROZ");
		}
		catch (Exception erro)
		{
			System.err.println ("\nDeu erro construir palavra com ARROZ");
        }
        
        Palavra p4 =null;
        try
		{
			p4 = new Palavra ("rapaziada");
			System.out.println ("\nDeu certo construir palavra com RAPAZIADA");
		}
		catch (Exception erro)
		{
			System.err.println ("\nDeu erro construir palavra com RAPAZIADA");
		}
		//teste 4
        System.out.println ("\n" + p3.equals(null)+" que ARROZ é igual  a null");
	    // teste 4.5
	    System.out.println (p3.equals(p3)+" que ARROZ É igual  a si mesmo");
	    // teste 5
	    System.out.println (p3.equals("arroz")+" que ARROZ É igual  ao String ARROZ");
	    // teste 6
	    System.out.println ("é " + p3.equals(p3)+" que ARROZ É igual  a ARROZ");
	    // teste 7
	    System.out.println ("é "+p3.equals(p4)+" que ARROZ é igual  a RAPAZIADA");
	    // teste 8
	    System.out.println ("\né "+(p3.hashCode()==p3.hashCode())+" que o hashCode de um ARROZ é igual ao hashCode de outro ARROZ");
	    // teste 9           
        System.out.println ("é "+(p3.hashCode()==p4.hashCode())+" que o hashCode de ARROZ é igual ao hashCode de RAPAZIADA");






		//                                                              TRACINHOS      
		try
		{
			System.out.println ("\n \n                               TESTANDO TRACINHOS");
		    Tracinhos t1 = new Tracinhos (null);
			System.out.println ("criou com null");

	    }
	    catch (Exception erro)
	    {
			System.err.println ("\n \n nao e possivel criar Tracinhos com null");
        }
         // teste 2
		try
		{
		    Tracinhos t2 = new Tracinhos (0);
			System.out.println ("\ncriou com 0");

	    }
	    catch (Exception erro)
	    {
			System.err.println ("\nnao e possivel criar palavra com 0");
        }
		//TESTE 3  
		Tracinhos t3=null;
		try
		{
		    t3 = new Tracinhos (7);
			System.out.println ("\ncriou com 7");

	    }
	    catch (Exception erro)
	    {
			System.err.println ("\nnao e possivel criar palavra com 7");
		}
		//teste 4
		Tracinhos t4 = null;
		try
		{
		    t4 = new Tracinhos (5);
			System.out.println ("\ncriou com 5");

	    }
	    catch (Exception erro)
	    {
			System.err.println ("\nnao e possivel criar palavra com ");
		}
		
		//teste 5
        System.out.println ("\n" + t3.equals(null)+" que 7 tracinhos é igual a null");
	    // teste 6
	    System.out.println (t3.equals(t3)+" que 7 tracinhos É igual a si mesmo");
	    // teste 7
	    System.out.println (t3.equals("_______")+" que 7 tracinhos É igual  ao String 7 tracinhos");
	    // teste 8
	    System.out.println ("é " + t3.equals(t3)+" que 7 tracinhos É igual  a 7 tracinhos");
	    // teste 9
		System.out.println ("é "+t3.equals(t4)+" que 7 tracinhos é igual  a 5 tracinhos");
		// teste 10
	    System.out.println ("\né "+(t3.hashCode()==t3.hashCode())+" que o hashCode de  7 tracinhos é igual ao hashCode de outro 7 tracinhos");
	    // teste 11           
        System.out.println ("é "+(t3.hashCode()==t4.hashCode())+" que o hashCode de 7 tracinhos é igual ao hashCode de 5 tracinhos");

		//teste 12
		Tracinhos t5 = (Tracinhos)t3.clone();		
		System.out.println ("o clone t5 de t3 é " + t5 +" e o t3 é " + t3 );	






		
		   // 									 Controlador De Erros
        
		   try
		   {
			   System.out.println ("\n \n                       TESTANDO CONTROLADOR DE ERROS");
			   ControladorDeErros c1 = new ControladorDeErros (null);
			   System.out.println ("\n \ncriou com null");
   
		   }
		   catch (Exception erro)
		   {
			   System.err.println ("\n \nnao e possivel iniciar a quantidade máxima com null");
		   }
			// teste 2
		   try
		   {
			   ControladorDeErros c2 = new ControladorDeErros (0);
			   System.out.println ("\ncriou com 0");
   
		   }
		   catch (Exception erro)
		   {
			   System.err.println ("\nnao e possivel iniciar a quantidade máxima com 0");
		   }
		   //TESTE 3  
		   ControladorDeErros c3=null;
		   try
		   {
			   c3 = new ControladorDeErros (12);
			   System.out.println ("\ncriou com 12");
   
		   }
		   catch (Exception erro)
		   {
			   System.err.println ("\nnao e iniciar a quantidade máxima com 12");
		   }
		   //teste 4
		   ControladorDeErros c4 = null;
		   try
		   {
			   c4 = new ControladorDeErros (2);
			   System.out.println ("\ncriou com 2");
   
		   }
		   catch (Exception erro)
		   {
			   System.err.println ("\nnao e possivel iniciar a quantidade máxima com 2");
		   }
		   ControladorDeErros c5 = null;
		   try
		   {
			   c5 = new ControladorDeErros(12);
		   }catch(Exception erro)
			   {}
		   
		   
		   //teste 5
		   System.out.println ("\n" + c3.equals(null)+" que quantidade máxima 12 é igual a null");
		   // teste 6
		   System.out.println (c3.equals(c3)+" que quantidade máxima 12 É igual a si mesmo");
		   // teste 7
		   System.out.println ("é " + c3.equals(c3)+" que quantidade máxima 12 É igual  a quantidade máxima 12");
		   // teste 8
		   System.out.println ("é "+c3.equals(c4)+" que quantidade máxima 12 é igual  a quantidade máxima 2");
		   // teste 9
		   System.out.println ("\né "+(c3.hashCode()==c5.hashCode())+" que o hashCode de quantidade máxima 12 é igual ao hashCode de outro quantidade máxima 12");
		   // teste 10         
		   System.out.println ("é "+(c3.hashCode()==c4.hashCode())+" que o hashCode de quantidade máxima 12 é igual ao hashCode de quantidade máxima 2");
		   
		   //teste 11
		   ControladorDeErros c6 = (ControladorDeErros)c3.clone();
		   System.out.println ("o clone c6 de c3 é " + c6 +" e o c3 é " + c3 );	






				  // 									 Controlador Letras Digitadas
		System.out.println ("\n \n             TESTANDO CONTROLADOR DE LETRAS JA DIGITADAS ");
        
		ControladorDeLetrasJaDigitadas cl = new ControladorDeLetrasJaDigitadas ();
		try{
		cl.registre('A');
		cl.registre('B');
		cl.registre('C');
		} catch(Exception erro){}
		ControladorDeLetrasJaDigitadas cl2 = new ControladorDeLetrasJaDigitadas ();
		try{
		cl2.registre('C');
		cl2.registre('A');
		cl2.registre('B');
		} catch(Exception erro){}
		ControladorDeLetrasJaDigitadas cl3 = new ControladorDeLetrasJaDigitadas ();
		try{
		cl3.registre('C');
		cl3.registre('A');
		cl3.registre('B');
		} catch(Exception erro){}
		ControladorDeLetrasJaDigitadas cl4 = new ControladorDeLetrasJaDigitadas ();
		try{
		cl4.registre('D');
		cl4.registre('E');
		cl4.registre('F');
		} catch(Exception erro){}
		ControladorDeLetrasJaDigitadas cl5 = (ControladorDeLetrasJaDigitadas)cl4.clone();
		ControladorDeLetrasJaDigitadas cl6 = cl;

		
		
		// Teste 1 - se o c1 ABC é igual ao cl2 CAB
		System.out.println("\n\né " + cl.equals(cl2) + " que cl é igual cl2");
		// Teste 2 - se o cl3 CAB é igual ao cl2 CAB
		System.out.println("é " + cl3.equals(cl2) + " que cl3 é igual cl2");
		// Teste 3a - verificando valor do clone
		System.out.println("O clone é(" + cl5 + ") O original é (" + cl4 + ")");
		// Teste 3b - verificando o clone com equals
		System.out.println("O clone é igual ao seu original? " + cl4.equals(cl5));
		// Teste 4a - testando hashCode de 2 objetos com mesmo valor
		System.out.println("\nhashcode de dois objetos diferentes guardando o mesmo valor");
		System.out.println("hashcode cl2 é igual ao hashcode cl3 ? " + cl2.hashCode() + " = " + cl3.hashCode() + "? " + (cl2.hashCode()==cl3.hashCode()));
		// Teste 4b - testando hashcode de 2 objetos de valor diferente
		System.out.println("\nhashcode de dois objetos diferentes guardando valores diferentes");
		System.out.println("hashcode cl2 é igual ao hashcode cl ? " + cl2.hashCode() + " = " + cl.hashCode() + "? " + (cl2.hashCode()==cl.hashCode()));
		// Teste 4c - testando hashcode de 2 objetos iguais
		System.out.println("\nhashcode de dois objetos iguais");
		System.out.println("hashcode cl é igual ao hashcode cl6 ? " + cl.hashCode() + " = " + cl6.hashCode() + "? " + (cl.hashCode()==cl6.hashCode()));
		
	   
        
        


      

    } 

}
   
