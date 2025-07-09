package Number

fun main()
{
    findAllPrimeNumberTillGivenNumber(100)
    findGivenNumberIsPrimeOrNot(4)
}

var primeNumbersList = mutableListOf<Int>()


/* Find given number is prime number or not*/
fun findGivenNumberIsPrimeOrNot(givenNumber: Int)
{
var counter = 2
while (counter<=givenNumber/2)
{
if (givenNumber % counter ==0 )
break

counter++
}

    if (counter>givenNumber/2) {
//        println("$givenNumber is prime number")
    primeNumbersList.add(givenNumber)
    }
 //   else
  //      println("$givenNumber is not prime number")
}


/* Find All Prime Numbers till given number*/
fun findAllPrimeNumberTillGivenNumber(limit: Int):List<Int>
{
    for (i in 2..limit)
        findGivenNumberIsPrimeOrNot(i)

    return primeNumbersList
}