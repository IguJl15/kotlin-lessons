fun main() {
	println("Digite alguns numeros inteiros separados por espaços (ex.: \"5 2 3\")");
	val list = readLine()!!.split(" " )
	
	val numberList: List<Int> = list.map { it.toIntOrNull () 
	}.filterNotNull();

	var greatestNumber = Int.MIN_VALUE;
	var greatestNumberPosition = 0;

	for (i in 0 until numberList.size) {
		if(greatestNumber < numberList[i]) {
			greatestNumberPosition = i;
			greatestNumber = numberList[i]!!;
		}
	}
	
	println("Lista: $numberList")
	println("Maior número: $greatestNumber")
	println("Posição maior número: $greatestNumberPosition")
}
