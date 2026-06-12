package org.example
import org.example.app.Persona
class Fecha (
    private var dia: Int=0,
    private var mes: Int=0,
    private var anio: Int=0){	
override fun toString():String{
    return "${dia}, ${mes}, ${anio}"
}   
    fun asignar (dia:Int, mes:Int, anio:Int){
    this.dia=dia
    this.mes=mes
    this.anio=anio
        }    
}

fun main() {
    println(Persona("pepe", "honguito", Fecha(5, 6, 2026)))
}