package com.mycompany.classobj;
public class Undergraduate extends Student
{
   
}


/* The Undergraduate class in overlaps with the Student class. 
The display() method in the Student class, however, cannot be altered in
the Undergraduate class because it is marked as final. A compilation error
would consequently occur if an effort was made to extend the Student class
and inherit its final function display().

We have two options for resolving this problem: either delete the final keyword
from the Student class's display() function or implement the method in the
Undergraduate class's new implementation without using the @Override annotation.
*/