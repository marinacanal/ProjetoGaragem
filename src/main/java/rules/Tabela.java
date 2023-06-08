/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rules;

import java.util.List;
import java.util.ArrayList;
import model.Carro_vaga;

/**
 *
 * @author marin
 */
public class Tabela {
    
    static List<Carro_vaga> listaCarroVagas = new ArrayList<Carro_vaga>();

    public Tabela() {
        
    }

    public static List<Carro_vaga> getListaCarroVagas() {
        return listaCarroVagas;
    }
    
    public static void setListaCarroVagas(Carro_vaga cv) {
        listaCarroVagas.add(cv);
    }   
}
