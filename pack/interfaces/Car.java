package pack.interfaces;

public class Car extends Vehicle implements carInterface{
 @Override
 public int getMaxSpeed() {
     return 0;
 }   
 @Override
 public void print() {
     System.out.println("this implement");
 }
 @Override
 public String getCompany() {
     
    return null;
 }

}
