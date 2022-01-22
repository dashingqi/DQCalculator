/**
 * 解析运算符
 */
fun parseOperator(input: String): Operation? {
    Operation.values().forEach {
        if (input.contains(it.value)) {
            return it
        }
    }
    return null
}

/**
 * 解析Expression对象
 */
fun parseExpression(input: String): Expression? {
    val operation = parseOperator(input) ?: return null
    val valueList = input.split(operation.value)
    if (valueList.size != 2) return null
    return Expression(valueList[0].trim(), operation, valueList[1].trim())
}

fun shouldExit(input: String): Boolean {
    return input == EXIT
}

fun addOperation(left: String, right: String): String {
    val result = left.toDouble() + right.toDouble()
    return result.toString()
}

fun minusOperation(left: String, right: String): String {
    val result = left.toDouble() - right.toDouble()
    return result.toString()
}

fun mulitOperation(left: String, right: String): String {
    val result = left.toDouble() * right.toDouble()
    return result.toString()
}

fun diviOperation(left: String, right: String): String {
    val result = left.toDouble() / right.toDouble()
    return result.toString()
}