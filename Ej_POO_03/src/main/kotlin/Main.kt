/*
Crear una clase Rectángulo, con atributos base y altura. La clase debe disponer del constructor y los métodos para calcular el area y el perimetro. Los atributos no se podrán modificar, aunque si consultar. Por último, tendrán que ser mayor que 0.

Opcionalmente se puede crear el método toString() para mostrar información sobre el rectángulo: override fun toString() = "". (Pulsa Ctrl+o)

En el programa principal, crear varios rectángulos. Mostarlos y mostrar por pantalla sus áreas y perímetros.
 */


/**
 * Clase que representa un objeto Rectángulo con atributos de base y altura.
 *
 * @property base Longitud de la base del rectángulo.
 * @property altura Altura del rectángulo.
 */
class Rectangulo(val base: Double,val altura: Double) {

    init {
        require(this.base > 0) { "El valor no puede ser 0" }
        require(this.altura > 0) { "El valor no puede ser 0" }
    }


    /**
     * Calcula el área del rectángulo.
     *
     * @return Área del rectángulo.
     */
    fun calcularArea(): Double = this.base * this.altura


    /**
     * Calcula el perímetro del rectángulo.
     *
     * @return Perímetro del rectángulo.
     */
    fun calcularPerimetro(): Double = (this.base + this.altura) * 2


    /**
     * Sobrescribe el método toString para proporcionar una representación de cadena del objeto Rectángulo.
     *
     * @return Cadena que describe la base, altura, área y perímetro del rectángulo.
     */
    override fun toString() = "Esta base: ${this.base} con esta altura: ${this.altura}, tiene ${calcularArea()} de area y ${calcularPerimetro()} de perímetro."
}


fun main() {

    val rectangulo1 = Rectangulo(5.2, 6.3)
    val rectangulo2 = Rectangulo(3.6, 7.2)
    val rectangulo3 = Rectangulo(1.5, 3.5)
    val rectangulo4 = Rectangulo(8.9, 6.1)
    val rectangulo5 = Rectangulo(2.7, 4.8)

    val listaRectangulos = arrayOf(rectangulo1, rectangulo2, rectangulo3, rectangulo4, rectangulo5)

    listaRectangulos.forEach { println(it) }
}