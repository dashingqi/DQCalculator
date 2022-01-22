import kotlin.system.exitProcess

val help = """
   --------------------------------------
   使用说明：
   1. 输入 1 + 1，按回车，即可使用计算器；
   2. 注意：数字与符号之间要有空格；
   3. 想要退出程序，请输入：exit
   --------------------------------------
""".trimIndent()

/** 退出*/
const val EXIT = "exit"

fun main() {
    while (true) {
        println(help)
        val input = readLine() ?: continue
        val calculatorV2 = CalculatorV2()
        val result = calculatorV2.calculate(input)
        if (result == null) {
            println("非有效格式")
            continue
        } else {
            println("input = $result")
        }
    }
}

