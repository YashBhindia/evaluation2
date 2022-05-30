package com.masai;

//Q1) Explain the difference between IS-A and Has-A relationship with the help of an
//example and explain about access modifiers and their accessibility?

//Ans ) An IS-A relationship is inheritance. The classes which inherit are known as sub classes or
//child classes . On the other hand,HAS-A relationship is composition.abstract
//
//In OOP, IS-A relationship is completely inheritance. This mean, that the child class is type of parent
//class. for example, an apple is a fruit.so you will extend fruit to get apple.

//      Example -:
//
//                   class Apple extends Fruit{
//	 
//                   }

//There are of two type of modifier in java access modifier and non-modifier .
//
//the access modifier in java specifies the accessibility or scope of a field ,method,constructor 
//,or class. we can change the access level of fields, constructor ,methods, and class by applying the acess
//modifier on it.
//There are four type of modifier

//1.) Private -: The access level of a private modifier is only within the class . it cannot be accessed
//from outside the class.
//
//2.) Default -: The access level of a default modifier is only within the package. it cannot be accessed from 
//outside the package . if you do not specify any access level, it will be the default.
//
//3.) Public -: The access level of a public modifier is everywhere. it can be accessed from within the class, 
//outside the class, within the package and outside the package.
//
//4.) Protected -: The access level of a protected modifier is within the package and outside the package
//through child class, it cannot be accessed from outside the package.abstract



public class Difference {

}
