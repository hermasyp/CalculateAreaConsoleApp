import shape.Circle
import shape.Rectangle
import shape.Shape
import shape.Triangle
import utils.StarGeneratorUtils

class App {
    private var starGeneratorUtils = StarGeneratorUtils()

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            App().start()
        }
    }

    fun start() {
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
            4. Print Stars
            ======================================
            Enter menu ? (1/2/3/4)
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
            "4" -> {
                openMenuPrintStar()
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
        printShape(Rectangle(length, width))
    }

    private fun openMenuCircle() {
        println("Enter Radius = ")
        val radius = readLine()?.toInt() ?: 0
        printShape(Circle(radius))
    }

    private fun openMenuTriangle() {
        println("Enter Base = ")
        val base = readLine()?.toInt() ?: 0
        println("Enter Height = ")
        val height = readLine()?.toInt() ?: 0
        println("Enter Hypotenusa = ")
        val hypotenusa = readLine()?.toInt() ?: 0
        printShape(Triangle(base, height, hypotenusa))
    }

    private fun openMenuPrintStar() {
        println("Enter Total Star (max stars = 20) = ")
        val totalStar = readLine()?.toInt() ?: 0
        starGeneratorUtils.printStars(totalStar)
    }

    private fun printShape(shape: Shape) {
        shape.printShapeName()
        shape.calculateAreaAndCircular()
    }
}