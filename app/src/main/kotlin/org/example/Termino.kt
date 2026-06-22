package org.example

class Terminos(
    private var termino_1:Int,
    private var termino_2:Int,
    private var termino_3:Int
    
){
    override fun toString():String{
        return "mis terminos son: ${termino_1}x², ${termino_2}x, ${termino_3}"
    }
}