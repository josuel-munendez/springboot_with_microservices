package com.sena.microservices.objects;

public class Vehiculo {
    private int id;
    private String placa;
    private int modelo;
    protected String marca;
    protected String propietario;

    public Vehiculo(int id, String placa, int modelo, String marca, String propietario){
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.propietario = propietario;
    }

/*    public Vehiculo(int idM, String placaM, int modeloM, String marcaM, String propietarioM){
        id = idM;
        placa = placaM;
        modelo = modeloM;
        marca = marcaM;
        propietario = propietarioM;
    }
 */

    public Vehiculo(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int obtenerId(){
        return id;
    }

    public void enviarId(int idM){
        id = idM;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

}
