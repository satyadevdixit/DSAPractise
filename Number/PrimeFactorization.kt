package Number

/* This function for find prime numbers by those given number is divided for description please refer
*  https://www.youtube.com/watch?v=P97Ms8kSzjg&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=29  */


fun main()
{
findPrimeFactorization(46)
}

fun findPrimeFactorization(givenNumber: Int){
var numberForFindPrimeFactorization = givenNumber
var primeNumbersList = findAllPrimeNumberTillGivenNumber(givenNumber/2)
    var primeFactorList = mutableListOf<Int>()
var  listCounter = 0

    while (numberForFindPrimeFactorization!=1)
    {
        if (numberForFindPrimeFactorization % primeNumbersList.get(listCounter) == 0) {
            numberForFindPrimeFactorization = numberForFindPrimeFactorization / primeNumbersList.get(listCounter)
            primeFactorList.add(primeNumbersList.get(listCounter))
        }
        else{
            listCounter++
        }
    }

    primeFactorList.let { print("$it, ") }
}