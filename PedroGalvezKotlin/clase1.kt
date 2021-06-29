fun main() {
    var nombre = "Pedro"
    println(nombre)
    val apellido = "Galvez"
    println(apellido)
    
    nombre = "Javier"
    
    println(nombre)
    println(apellido)
    
    var saludo = "Hola soy $nombre $apellido"
    println(saludo)
    
    val text = """
    	|linea uno
        |linea dos
        |linea tres
        """.trimMargin();
    
    println(text)
    
    var str = "Kotlin string alfa"
    var substr = ""
    
    substr = str.substring(0..5)
    println("substring $substr")
    
    substr = str.substring(14..17)
    println("alfa $substr")
    
    substr = str.substring(14..17)
    println("alfa $substr")
    
}
