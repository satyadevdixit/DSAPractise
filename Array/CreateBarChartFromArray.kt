package Array

fun main()
{
    createBarChartFromGivenArray(getArrayData())
}

/* Create bar chart based on given array */
fun createBarChartFromGivenArray(givenArray: IntArray)
{

var maxNumber = findMaxNumberInArray(givenArray)

for (i in maxNumber downTo  1)
{

    for (j in 0..givenArray.size-1)
    {
       if (givenArray.get(j)>=i)
           print("*")
        else
       {
           print(" ")
       }

    }

    println()

}


}


fun findMaxNumberInArray(givenArray: IntArray): Int
{
    var maxNumber = 0
for (i in 0 until givenArray.size)
{

    if (maxNumber<givenArray.get(i))
        maxNumber = givenArray.get(i)

}

    return maxNumber
}