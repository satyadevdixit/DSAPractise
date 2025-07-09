package Array

import kotlin.math.min

/* This function for find difference between Max and Min number of Array
* https://www.youtube.com/watch?v=8erugyv3WDA&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=93  */

fun  main()
{
var array = insertDataInArray()
    findDifferenceOfMaxAndMinOfArray(array)

}

fun findDifferenceOfMaxAndMinOfArray(givenArray: IntArray)
{
var maxNumberFromGivenArray: Int = givenArray.get(0)
var minNumberFromGivenArray: Int = givenArray.get(0)

for (i in 1 until givenArray.size)
{
if (maxNumberFromGivenArray<givenArray.get(i))
{
maxNumberFromGivenArray = givenArray.get(i)
}

if (minNumberFromGivenArray>givenArray.get(i))
{
    minNumberFromGivenArray = givenArray.get(i)
}
}

    var difference = maxNumberFromGivenArray - minNumberFromGivenArray
    print("Difference is $difference")
}