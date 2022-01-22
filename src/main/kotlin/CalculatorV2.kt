import kotlin.system.exitProcess

/**
 * 计算器2.0
 */
class CalculatorV2 {
    /**
     * 计算
     * @param input 用户控制台输入
     */
    fun calculate(input: String): String? {
        if (shouldExit(input)) exitProcess(0)
        val expression = parseExpression(input) ?: return null
        val (left, operation, right) = expression
        left.toDoubleOrNull() ?: return null
        right.toDoubleOrNull() ?: return null
        return when (operation) {
            Operation.ADD -> addOperation(left, right)
            Operation.MULIT -> mulitOperation(left, right)
            Operation.DIVI -> diviOperation(left, right)
            Operation.MINUS -> minusOperation(left, right)
        }
    }
}