import utils.CalculateAreaUtils

class App {
    private lateinit var calculateAreaUtils: CalculateAreaUtils

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            App().start()
        }
    }

    fun start() {
        calculateAreaUtils = CalculateAreaUtils()
        printHeader()
        readLine()?.let {
            openMenu(it)
        }
    }

    private fun printHeader() {
        println(
            """
            ======================================
            Console app for Calculating Area in 2D
            ======================================
            1. Calculate Rectangle Area
            2. Calculate Circle Area
            3. Calculate Triangle Area
            ======================================
            Enter menu ? (1/2/3)
            ======================================
        """.trimIndent()
        )
    }

    private fun openMenu(menu: String) {
        when (menu) {
            "1" -> {
                //open menu rectangle
                openMenuRectangle()
            }
            "2" -> {
                //open menu circle
                openMenuCircle()
            }
            "3" -> {
                //open menu Triangle
                openMenuTriangle()
            }
            else -> {
                println("No menu matches")
                start()
            }
        }
    }

    private fun openMenuRectangle() {
        println("Enter Length = ")
        val length = readLine()?.toInt() ?: 0
        println("Enter Width = ")
        val width = readLine()?.toInt() ?: 0
        println("Area of Rectangle is = ${calculateAreaUtils.calculateAreaRectangle(length, width)}")
    }

    private fun openMenuCircle() {
        println("Enter Radius = ")
        val radius = readLine()?.toInt() ?: 0
        println("Area of Cicle is = ${calculateAreaUtils.calculateAreaCircle(radius)}")
    }

    private fun openMenuTriangle() {
        println("Enter Base = ")
        val base = readLine()?.toInt() ?: 0
        println("Enter Height = ")
        val height = readLine()?.toInt() ?: 0
        println("Area of Triangle is = ${calculateAreaUtils.calculateAreaTriangle(base, height)}")
    }

}