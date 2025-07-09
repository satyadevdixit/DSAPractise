package Sorting

fun main()
{
    //4,3,2,7,8,2,3,1
    val array = IntArray(8)
    array[0] = 6
    array[1] = 5
    array[2] = 2
    array[3] = 4
    array[4] = 8
    array[5] = 9
    array[6] = 3
    array[7] = 1

    for (value :Int in array)
    {
        println(value)
    }

    println("before")

    var index = 0
    while (index<array.size)
    {
        while (index!=array[index]-1 && array[index]<=array.size)
        {
            var indexForSwap = array[index]
            var valueForSwap = array[indexForSwap-1]
            array[indexForSwap-1] = array[index]
            array[index] = valueForSwap
            if (array[indexForSwap-1]==array[index]) {
                //println("duplicate="+array[index] + "=="+array[indexForSwap-1])
                index++
            }
        }
       index++
    }

    for (i  in 0 until array.size)
    {
        if (array[i]!=i+1)
            println(i+1)
    }



}