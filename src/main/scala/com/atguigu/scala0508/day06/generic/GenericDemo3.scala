package com.atguigu.scala0508.day06.generic

/**
  * Author lzc
  * Date 2019-09-10 10:29
  */
object GenericDemo3 {
    def printer(petContainer: PetContainer[Pet]) = {
        println(petContainer.pet.name)
    }
    
    def main(args: Array[String]): Unit = {
        val dog: Dog = new Dog()
        val cat: Cat = new Cat()
        val lion: Lion = new Lion()
        
        
        new PetContainer(new Object)
        new PetContainer(new Animal)
        new PetContainer(new Pet)
        new PetContainer(new Dog)
        new PetContainer(10)
        
        
        
//        val dogContainer: PetContainer[Dog] = new PetContainer[Dog](dog)
        //        val catContainer: PetContainer[Cat] = new PetContainer[Cat](cat)
        //        val lionContainer: PetContainer[Lion] = new PetContainer[Lion](lion) //Error
        
    }
    
    
}

class Animal {
    val name: String = "animal"
}

class Pet extends Animal {
    override val name: String = "Pet"
}

class Dog extends Pet {
    override val name: String = "dog"
}

class Cat extends Pet {
    override val name: String = "cat"
}

class Lion extends Animal {
    override val name: String = "lion"
}

class PetContainer[P >: Pet](val pet: P) {
}


/*
泛型:  类型的参数化

泛型类:
    把参数话的类型定义在类上, 这个泛型在整个类都可以使用(当数据的类型来用)


泛型方法:
    把泛型定义在方法上, 这个泛型只能这个方法内使用(当数据的类型来用)
    
泛型的上下限:
    java:
        T super ..
        T extends ...
        
scala的泛型界定:
    
    scala的上界
        T <: Comparable[T]
    
    
    scala的上界
    
    
    上下文界定
    
    
    视图界定(过时)
 */