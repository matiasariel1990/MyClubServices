package com.matiasservices.servicios.Model;

public class Cuota {
        int referencia;
        int importe;
        String descripcion;
        int fechaPago;
        int estado;

        public Cuota(int refencia, int importe, String descripcion, int estado, int fechaPago){
            this.referencia = refencia;
            this.importe = importe;
            this.fechaPago = fechaPago;
            this.descripcion = descripcion;
            this.estado = estado;
        }

        public int getEstado(){
            return estado;
        }

        public int getRefencia(){
            return referencia;
        }

        public int getimporte(){
            return importe;
        }

        public String getDescripcion(){
            return descripcion;
        }

        public int getFechaPago(){
            return fechaPago;
        }

}
