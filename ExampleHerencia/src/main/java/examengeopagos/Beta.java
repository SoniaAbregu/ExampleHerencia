package examengeopagos;

public class Beta extends Alfa{
	public String nombre;
	
	public Beta() {
	}

	public Beta(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void getMensaje() {
		this.setNombre("Pepe");
		super.setNombre("pepe");
		System.out.println(this.getNombre() + " - " + super.getNombre());
		
	}

}
