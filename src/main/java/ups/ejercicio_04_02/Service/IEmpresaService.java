/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ups.ejercicio_04_02.Service;

import java.util.List;
import ups.ejercicio_04_02.Model.Empresa;

/**
 *
 * @author Diego
 */
public interface IEmpresaService {
    public Empresa crearEmpresa(Empresa empresa);
    public List<Empresa> listarEmpresas();
    public Empresa getEmpresaByCode(int codigo);
    public void actualizarEmpresa(int codigo, Empresa empresaNueva);
    public Empresa eliminarEmpresa(int codigo);
    public int getPositionEmpresa(Empresa empresa);
    
}
