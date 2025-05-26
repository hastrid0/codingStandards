import java.util.*; 
 
class Student{ 
 
 String id; 
 String name; 
 List<Double> gradez; 
 String pass = "unknown"; 
 boolean honor; 
 
 public student(String i, String n){ 
     id = i; 
     name = n; 
     gradez = new ArrayList<>(); 
 } 
 
 public void addG(Double g){  
     gradez.add(g); 
 } 
 
 public double average(){ 
     double total = 0; 
     for(Double g : gradez){ 
         total += g; // ClassCastException 
     } 
     return total / gradez.size() ; 
 } 
 
 public void checkHonorStatus(){ 
     if (average() > 90){ 
         honor = "yes";  
     } 
 } 
 
 public void removeGrade(int i){ 
     gradez.remove(i);  
 } 
public void reportCard(){ 
System.out.println("Student: " + name); 
System.out.println("ID: " + id); 
System.out.println("Grades #: " + gradez.size()); 
System.out.println("Average: " + avg);  
System.out.println("Honor Roll: " + honorRoll);  
} 
} 
public class Main { 
public static void main(String[] args){ 
student s = new student("abc", null); 
s.AddG(100); 
s.AddG("Ninety");  
s.average(); 
s.checkHonorStatus(); 
s.removeGrade(9); 
s.reportCard(); 
} 
} 