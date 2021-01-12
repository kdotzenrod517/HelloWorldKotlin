fun main() {


    //class
    class Dog {

        // properties
        var name : String
        var age : Int
        var furColor: String

        constructor(name: String, age: Int, furColor: String){
            this.name = name
            this.age = age
            this.furColor = furColor
        }

        constructor(){
            name = ""
            age = 0
            furColor = ""
        }

        fun dogInfo(){
            println("$name is $age years old and her fur color is $furColor")
        }
    }

    // object from class
    val myDog = Dog("Fido", 8, "Brown")
    myDog.dogInfo()
}