 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author marin
 */
public class Carro_vaga {
    
    private String nomeVaga;
    private String nomeCarro;
    
    public Carro_vaga(String nomeVaga, String nomeCarro) {
        this.nomeVaga = nomeVaga;
        this.nomeCarro = nomeCarro;
    }
    
    public String getIdVaga() {
        return nomeVaga;
    }
    
    public void setIdVaga(String idVaga) {
        this.nomeVaga = nomeVaga;
    }
    
    public String getNomeCarro() {
        return nomeCarro;
    }
    
    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }
    
}
