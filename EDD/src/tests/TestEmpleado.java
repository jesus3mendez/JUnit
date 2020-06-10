package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import syspagos.*;
import excepciones.*;

public class TestEmpleado 
{
	@Test
	public void establecerNumeroDeEmpleadoCorrecto()
	{
		Empleado e = new Empleado();
		try
		{
			e.establecerNumeroEmpleado("4");
		} catch (NumeroEmpleadoException ex)
		{
			fail();
		}
		assertEquals(4, e.getNumeroEmpleado());
	}
	
	@Test
	public void establecerNumeroDeEmpleadoError1()
	{
		Empleado e = new Empleado();
		try
		{
			e.establecerNumeroEmpleado("000");
		} catch (NumeroEmpleadoException ex)
		{
			fail();
		}
		assertEquals(4, e.getNumeroEmpleado());
	}
	
	@Test
	public void establecerNumeroDeEmpleadoError2()
	{
		Empleado e = new Empleado();
		try
		{
			e.establecerNumeroEmpleado("-103");
		} catch (NumeroEmpleadoException ex)
		{
			fail();
		}
		assertEquals(4, e.getNumeroEmpleado());
	}
	
	@Test
	public void establecerNumeroDeEmpleadoError3()
	{
		Empleado e = new Empleado();
		try
		{
			e.establecerNumeroEmpleado("asdf");
		} catch (NumeroEmpleadoException ex)
		{
			fail();
		}
		assertEquals(4, e.getNumeroEmpleado());
	}
	
	@Test
	public void establecerNumeroDeEmpleadoError4()
	{
		Empleado e = new Empleado();
		try
		{
			e.establecerNumeroEmpleado(" ");
		} catch (NumeroEmpleadoException ex)
		{
			fail();
		}
		assertEquals(4, e.getNumeroEmpleado());
	}
	
	@Test
	public void establecerNombreDeEmpleadoCorrecto()
	{
		Empleado e = new Empleado();
		try
		{
			e.estableceNombreEmpleado("PabloFerrerLavapies");
		} catch (NombreEmpleadoException ex)
		{
			fail();
		}
		assertEquals("PabloFerrerLavapies", e.getNombreEmpleado());
	}
	
	@Test
	public void establecerNombreDeEmpleadoError1()
	{
		Empleado e = new Empleado();
		try
		{
			e.estableceNombreEmpleado("asdf");
		} catch (NombreEmpleadoException ex)
		{
			fail();
		}
		assertEquals("PabloFerrerLavapies", e.getNombreEmpleado());
	}
	
	@Test
	public void establecerNombreDeEmpleadoError2()
	{
		Empleado e = new Empleado();
		try
		{
			e.estableceNombreEmpleado(" ");
		} catch (NombreEmpleadoException ex)
		{
			fail();
		}
		assertEquals("PabloFerrerLavapies", e.getNombreEmpleado());
	}
	
	

	@Test
	public void estableceMesesTrabajoCorrecto()
	{
		Empleado e = new Empleado();
		try
		{
			e.estableceMesesTrabajo("22");
		} catch (MesesTrabajoException ex)
		{
			fail();
		}
		assertEquals(22, e.getMesesTrabajo());
	}

	
	@Test
	public void estableceMesesTrabajoError1()
	{
		Empleado e = new Empleado();
		try
		{
			e.estableceMesesTrabajo("1234");
		} catch (MesesTrabajoException ex)
		{
			fail();
		}
		assertEquals(22, e.getMesesTrabajo());
	}
	
	@Test
	public void estableceMesesTrabajoError2()
	{
		Empleado e = new Empleado();
		try
		{
			e.estableceMesesTrabajo("02");
		} catch (MesesTrabajoException ex)
		{
			fail();
		}
		assertEquals(22, e.getMesesTrabajo());
	}

	@Test
	public void establecerSerDirectivoCorrecto()
	{
		Empleado e = new Empleado();
		try
		{
			e.establecerSerDirectivo("+");
		} catch (CargoException ex)
		{
			fail();
		}
		assertEquals(true, e.getDirectivo());
	}
	
	@Test
	public void establecerSerDirectivoError()
	{
		Empleado e = new Empleado();
		try
		{
			e.establecerSerDirectivo("No");
		} catch (CargoException ex)
		{
			fail();
		}
		assertEquals(true, e.getDirectivo());
	}
	
	@Test
	public void calcularPrimaCorrecta1()
	{
		Empleado e = new Empleado();
		try
		{
			e.calcularPrima("123", "PabloFerrerLavapies", "35", "+");
		} catch (Exception ex)
		{
			fail();
		}
		assertEquals(Prima.P1, e.getPrima());
	}
	
	@Test
	public void calcularPrimaCorrecta2()
	{
		Empleado e = new Empleado();
		try
		{
			e.calcularPrima("123", "PabloFerrerLavapies", "11", "+");
		} catch (Exception ex)
		{
			fail();
		}
		assertEquals(Prima.P3, e.getPrima());
	}
	
	@Test
	public void calcularPrimaCorrecta3()
	{
		Empleado e = new Empleado();
		try
		{
			e.calcularPrima("123", "PabloFerrerLavapies", "35", "-");
		} catch (Exception ex)
		{
			fail();
		}
		assertEquals(Prima.P2, e.getPrima());
	}
	
	@Test
	public void calcularPrimaCorrecta4()
	{
		Empleado e = new Empleado();
		try
		{
			e.calcularPrima("123", "PabloFerrerLavapies", "11", "-");
		} catch (Exception ex)
		{
			fail();
		}
		assertEquals(Prima.P4, e.getPrima());
	}
	
	
	
}

 
