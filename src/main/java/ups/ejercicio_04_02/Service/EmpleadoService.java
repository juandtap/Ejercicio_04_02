/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.ejercicio_04_02.Service;

import java.util.ArrayList;
import java.util.List;
import ups.ejercicio_04_02.Model.Departamento;
import ups.ejercicio_04_02.Model.Empleado;

/**
 *
 * @author Diego
 */
public class EmpleadoService implements IEmpleadoService{
    private static final List<Empleado> listaEmpleados = new ArrayList<>();

    @Override
    public Empleado crearEmpleado(Empleado empleado) {
        if(codeExists(empleado.getCedula())){
            throw new RuntimeException("Cedula de empleado existente");
        
        }
        listaEmpleados.add(empleado);
        return empleado;
    }

    @Override
    public List<Empleado> listarEmpleados() {
        if(listaEmpleados.isEmpty()){
            throw new NullPointerException("Lista de empleados vacia");
        }
        
        return listaEmpleados;
    }

    @Override
    public Empleado getEmpleadoByCedula(String cedula) {
        for (Empleado emp : listaEmpleados) {
            if(emp.getCedula().equals(cedula)){
                return emp;
            }
        }
        return null;
    }
    
    public void asignarDepartamento(String cedula, Departamento departamento){
        getEmpleadoByCedula(cedula).asignarDepartamento(departamento);
    }

    @Override
    public void actualizarEmpleado(String cedula, Empleado empleadoNuevo) {
        int posicion = getPositionEmpleado(getEmpleadoByCedula(cedula));
        
       
        if (empleadoNuevo.getNombre().equals("")){
            throw new NullPointerException("Debe ingresar un nombre");
        }
        if (empleadoNuevo.getCargo().equals("")){
            throw new NullPointerException("Debe ingresar un cargo");
        }
        listaEmpleados.get(posicion).setNombre(empleadoNuevo.getNombre());
        listaEmpleados.get(posicion).setNacionalidad(empleadoNuevo.getNacionalidad());
        listaEmpleados.get(posicion).setCargo(empleadoNuevo.getCargo());
        listaEmpleados.get(posicion).setSalario(empleadoNuevo.getSalario());
        listaEmpleados.get(posicion).setFechaNacimiento(empleadoNuevo.getFechaNacimiento());
        listaEmpleados.get(posicion).setDireccion(empleadoNuevo.getDireccion());
        listaEmpleados.get(posicion).asignarDepartamento(empleadoNuevo.getDepartamento());
    }

    @Override
    public Empleado eliminarEmpleado(String cedula) {
       var posicion = getPositionEmpleado(getEmpleadoByCedula(cedula));
       return listaEmpleados.remove(posicion);
    }

    @Override
    public int getPositionEmpleado(Empleado empleado) {
        for (int i = 0; i < listaEmpleados.size(); i++) {
            if (empleado.getCedula().equals(listaEmpleados.get(i).getCedula())) {
                return i;
            }
        }
        return -1;
    }
     private boolean codeExists(String cedula){
        
        for (var emp: listaEmpleados) {
            if (emp.getCedula().equals(cedula)) {
                return true;
            }
        }
        return false;
    }
    
}
