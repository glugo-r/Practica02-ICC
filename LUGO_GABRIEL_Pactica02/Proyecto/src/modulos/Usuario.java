package modulos;

public class Usuario {
	private String nombre;
	private String correo;
	private String rol;
	
	public Usuario(){
		this.nombre = "";
		this.correo = "";
		this.rol = "";
	}
	
	public Usuario(String nombre, String correo, String rol){
		this.nombre = nombre;
		this.correo = correo;
		this.rol = rol;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public String getRol() {
		return rol;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public void setRol(String rol) {
		this.rol = rol;
	}
	
	public boolean equals(Usuario otroUsuario){
		return this.nombre.equals(otroUsuario.getNombre()) && this.correo.equals(otroUsuario.getCorreo()) && this.rol.equals(otroUsuario.getRol());
	}
}
