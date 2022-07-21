/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.ejercicio_04_02.Controller;

import java.time.LocalDate;


import java.util.List;

import ups.ejercicio_04_02.Model.Empresa;
import ups.ejercicio_04_02.Service.EmpresaService;

/**
 *
 * @author Diego
 */
public class EmpresaController {
    private final EmpresaService empresaService = new EmpresaService();
    
    public Empresa crearEmpresa(int codigo,String nombre, String nombreFundador, String pais, String direccion, int anio, int mes, int dia ){
        
        if (nombre.equals("")) {
            throw new NullPointerException("Empresa debe tener un nombre");
            
        }
        
        if (nombreFundador.equals("")) {
             throw new NullPointerException("Empresa debe tener un  fundador");
        }
        
        
        
        LocalDate fechaFundacion = LocalDate.of(anio, mes, dia);
        return empresaService.crearEmpresa(new Empresa(codigo, nombre, nombreFundador, pais, direccion, fechaFundacion));
    }
    
    public List<Empresa> listarEmpresas(){
        return empresaService.listarEmpresas();
    }
    
    public Empresa getEmpresaByCode(int code){
        if(code > 0){
            return empresaService.getEmpresaByCode(code);
        }
        return null;
        
    }
    
    public void actualizarEmpresa(int codigo, Empresa empresaNueva){
        empresaService.actualizarEmpresa(codigo, empresaNueva);
    }
    
    public Empresa eliminarEmpresa(int codigo){
        return empresaService.eliminarEmpresa(codigo);
    }
    
 
    
    // Metodos validacion KeyEvent
    
    // valida que solo se ingresen numeros en el campo "codigo"
    public boolean validarSoloNumeros(char codigo){
        boolean flag = false;
        if(Character.isDigit(codigo)){
            flag = true;
        }
        return flag;
    }
    
    // valida que solo se ingrese texto en el campo "fundador"
    public boolean validarSoloTexto(char texto){
        boolean flag = false;
        if(Character.isLetter(texto) || Character.isSpaceChar(texto) || Character.isUpperCase(texto)){
            flag = true;
        }
        return flag;
                
    }
   
}
