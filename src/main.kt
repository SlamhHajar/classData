class Student(name:String,age:Int,phone:String){//Do not must be add var befor the propriety

}
data class Teacher(var name:String,var age:Int,var phone:String)//must be add var befor the propriety

fun main() {
    val stud1=Student("reem",12,"77097977")
    val stud2=Student("mareem",22,"77969462")
    val stud3=Student("mareem",22, "77969462")
   println("When you use the usuall class to print the object it print the address of obj = "+stud1)
    println("When you use the usuall class to Compare the objects it compare between the address = "+stud2.equals(stud3))

    var tech1=Teacher("Ali",50,"55525244")
    var tech2=Teacher("Abrar",21,"1425879")
    var tech3=Teacher("Abrar",21,"1425879")
    println("When you use the Data class and print the object it print the valu of obj  = "+tech1)
    println("When you use the data class to Compare the objects it compare between the value= "+tech2.equals(tech3))

    println( "you can copy object value to another object="+tech2.copy())



}


