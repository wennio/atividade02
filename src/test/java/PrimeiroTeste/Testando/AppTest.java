package PrimeiroTeste.Testando;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */

public class AppTest 
    extends TestCase
{
	ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
	Pessoa p1 = new Pessoa("kelson", 22);
    @Test
    public void teste01(){
    	lista.add(p1);
    	assertEquals(lista.size(), 1);
    }
    
    @Test
    public void teste02(){
    	assertEquals(p1.getNome(), "kelson");
    }
    
    @Test
    public void teste03(){
    	assertEquals(p1.getIdade(), 22);
    }
    
}
