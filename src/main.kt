fun main(){
    println("Hello list")
    even(listOf("0","1","2","3","4","5","6","16","20","24","10","8"))
    Height(listOf(4,7,7,8,9,34))
    var kibet=Person("Harmony",15,5,45)
    var sang=Person("Kiprugut",57,8,80)
    var effence=Person("Kamau",35,6,65)
    var mylist=  mutableListOf(kibet,sang)
    var sorted=mylist.sortedByDescending { data->data.age }
    println(sorted)

    var others=Person("Kahaki",42,5,83)
    var mwigne=Person("Muthoni",39,7,75)
    var otherlist= listOf(others,mwigne)
    var ongezawote=more(mylist.plus(otherlist))
    println(ongezawote)

    var toyota= Carobjec("KCAT123",400)
    var lambo=Carobjec("KCU78",500)
    var assets= listOf(toyota,lambo)
    var ty=carobjects(listOf(toyota,lambo))
    println(ty)






    }
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index
fun even(numb:List<String>):List<String>{
    numb.forEachIndexed { index, i ->
        if (index%2==0){
            println(i)
        }
    }
    return numb

}
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height

fun Height(height:List<Int>):String{
        var ongeza=height.sum()
    var av= height.average()
    var total=("sum is $ongeza and avarage is $av")
    println(total)

return  total
}

//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age

//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
//(1 points)


data class Person(var name:String,var age:Int,var urefu: Int,var weight:Int)
fun more(plus:List<Person>){
}

//5. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.      (3 points)

data class Carobjec(var registration:String,var mileage:Int)
fun carobjects(obj:List<Carobjec>):Double{
    var y=0.0
    obj.forEach { p->
        y+=p.mileage

    }

  return y/obj.count()

}
