package org.example
import org.example.app.Persona
import org.example.Polinomio
import org.example.Cuadratica
import org.example.CuadraticaMejor
import org.example.Cuatrinomio
fun main()  {
    println(Persona("pepe", "honguito", Fecha(5, 6, 2026)))
    println(Polinomio())
    println(Cuadratica())
    println(CuadraticaMejor())
    var objeto: Polinomio
    objeto=Cuadratica()
    println(objeto)
    objeto=CuadraticaMejor()
    println(objeto)
    var lista=ArrayList<Polinomio>()
    for(polinomio in lista)
    print(polinomio)
}