package Number

/* This function description please refer -
 https://www.youtube.com/watch?v=_F7ejdDCpyg&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=33 */


fun main()
{
    benzaminBulbs(20)
}


fun benzaminBulbs(numberOfBulbs: Int)
{
var bulbOnOffStatusHashMap = mutableMapOf<Int, Int>()

    for (i in 1..numberOfBulbs)
    {
        bulbOnOffStatusHashMap.put(i,0)
    }

    for (i in 1..numberOfBulbs)
    {
        for (j in i..numberOfBulbs) {
            if (j%i==0) {
                if (bulbOnOffStatusHashMap.get(j)==0)
                {
                    bulbOnOffStatusHashMap.put(j,1)
                }
                else{
                    bulbOnOffStatusHashMap.put(j, 0)
                }
            }
        }
    }

    for (i in 1..numberOfBulbs)
    {
        if (bulbOnOffStatusHashMap.get(i)==1)
        {
            print("$i, ")
        }
    }
  //print( bulbOnOffStatusHashMap.filterValues { it==1})
}