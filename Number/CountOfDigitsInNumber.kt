package Number

fun main()
{

println("Count of digits in Number is ${countOfDigitsInNumber(1090)}")
    //digitsOfNumber()
    inverseOfNumber()
}

/* This is function for find count of digits in given number*/
fun countOfDigitsInNumber(givenNumber: Int): Int
{
    var numberForCountDigits = givenNumber
   var digitCounter = 0

    while (numberForCountDigits>0)
    {
        numberForCountDigits = numberForCountDigits / 10
        digitCounter++
    }
    return digitCounter
}


/* This function is for print every digit of given number */
fun digitsOfNumber()
{
    var numberForCountDigits = 123456789
    var lengthOfNumber = countOfDigitsInNumber(numberForCountDigits)
    var divideNumber = Math.pow(10.0, (lengthOfNumber-1).toDouble()).toInt()

    while (numberForCountDigits>0)
    {
        var digit = numberForCountDigits / divideNumber
         numberForCountDigits = numberForCountDigits % divideNumber
        divideNumber = divideNumber / 10
        println("Number is $digit")
    }
}


/* For description of this function refer this video
* https://youtu.be/dbk42TKwk4M?si=BSw-QM3vKOuf4eBe */
fun inverseOfNumber()
{
    var givenNumber = 451237896
    val hashMap = mutableMapOf<Int, Int>()
    var indexCounter = 1
    var inverseNumber = 1

    while (givenNumber>0)
    {
        hashMap.put(givenNumber % 10,indexCounter)
        givenNumber = givenNumber / 10
        indexCounter++
    }

    inverseNumber = hashMap.get(hashMap.size)!!
    for (i in hashMap.size-1 downTo 1)
    {
       inverseNumber = (inverseNumber * 10) + hashMap.get(i)!!
    }

    print("Inverse of Given Number is $inverseNumber")
}