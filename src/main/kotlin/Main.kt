fun main() {
    val denominaciones = listOf(20, 50, 100, 200, 500)
    val cantidades = IntArray(denominaciones.size)

    while (true) {
        println("Alcancía Virtual")
        println("1. Agregar moneda")
        println("2. Contar monedas por denominación")
        println("3. Calcular total ahorrado")
        println("4. Romper la alcancía ")
        print("Seleccione una opción: ")

        when (val opcion = readln() . toInt()) {
            1 -> {
                println("Ingrese la denominación de la moneda (20, 50, 100, 200, o 500): ")
                val denominacion = readln() . toInt()
                val index = denominaciones.indexOf(denominacion)
                if (index != -1) {
                    cantidades[index]++
                    println("Moneda de $denominacion agregada.")
                } else {
                    println("Denominación no válida.")
                }
            }
            2 -> {
                println("Monedas en la alcancía por denominación:")
                for (i in 0 until denominaciones.size) {
                    println("${denominaciones[i]}: ${cantidades[i]}")
                }
            }
            3 -> {
                var total = 0
                for (i in 0 until denominaciones.size) {
                    total += denominaciones[i] * cantidades[i]
                }
                println("Total ahorrado en la alcancía: $$total")
            }
            4 -> {
                cantidades.size
                println("alcancía rota")
            }

            else -> {
                println("Opción no válida.")
            }
        }
    }
}
