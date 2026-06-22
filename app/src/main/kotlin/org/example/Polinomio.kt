package org.example

open class Polinomio(private var terminos: ArrayList<Terminos> = ArrayList<Terminos>()) {
override fun toString():String{
    return terminos.toString()
}
}