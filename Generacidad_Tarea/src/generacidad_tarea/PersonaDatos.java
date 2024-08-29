package generacidad_tarea;

import java.time.LocalDate;

class PersonaDatos {
    public String nombre;
    public int edad;
    public String eps;
    public LocalDate fechaNacimiento;
    
    public PersonaDatos(String nombre, int edad, String eps, LocalDate fechaNacimiento){
        this.nombre = nombre;
        this.edad = edad;
        this.eps = eps;
        this.fechaNacimiento = fechaNacimiento;
    };
    
    public String getNombre(){
        return nombre;
    };
    public Integer getEdad(){
        return edad;
    };
    public String getEps(){
        return eps;
    };
    public LocalDate getFecha(){
        return fechaNacimiento;
    };
}
