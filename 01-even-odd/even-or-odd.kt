fun main() {
	print("Escreva um numero: ");
	val numb = readLine()?.toIntOrNull();
	if(numb == null) {
		println("Digite um numero válido!");
		return;
	}

	if(isEven(numb)) println("O número $numb é par!");
	if(isOdd(numb)) println("O número $numb é ímpar!");
}

fun isEven(value: Int) = value % 2 == 0;
fun isOdd(value: Int) = !isEven(value);
