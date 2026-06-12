package org.example.app
import org.example.Fecha
class Persona(
    private val nombre: String,
    private val apellido: String,
    private val fecha: Fecha){
    override fun toString(): String{
    return "${nombre}, ${apellido}, ${fecha}"
    }
}

