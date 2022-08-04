package homework;


/* Que 17

Write a class with the name Floor. The class needstwo fields(instance variables) with name width
and length of type double.
The class needsto have one constructor with parameters width and length of type double and it
needs to initialize the fields.
In case the width parameter is lessthan 0 it needs to set the width field value to 0, in case the length
parameter islessthan 0 it needsto set the length field value to 0.
Write the following methods (instance methods):
● Method named getArea without any parameters, it needs to return the calculated area
(width * length).

 */

public class Floor {

    double width;
    double length;

    Floor (double width, double length){

        if(width>0 && length<0){
            this.width = width;
            this.length = 0.0;

        } else if (width<0 && length>0) {
            this.width = 0.0;
            this.length = length;
        } else if (width<0 && length <0) {
            this.width = width;
            this.length = length;
        } else {
            this.width = width;
            this.length = length;
        }

    }
    public double getArea() { return this.width * this.length;}



}
