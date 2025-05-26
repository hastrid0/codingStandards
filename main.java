import java.util.*; 
 
class Student{ 
 
 String id; 
 String name; 
 List<Double> gradez; 
 String pass = "unknown"; 
 boolean honor; 
 
 public Student(String id, String name){ 
    if(validateEmpty(id) && validateEmpty(name)){
        id = id; 
        name = name; 
        gradez = new ArrayList<>(); 
    }
    else{
        System.out.println('La entrada esta vacia');
    }
     
     
 } 
 
 public void addG(Double g){ 
    try{
        g = Double.parseDouble(g);
        if(g>=0 && g<=100){
            gradez.add(g);
        }
        else{
            System.out.println("Error: Se esperaba un número entre 0 y  100");
        }
    } 
    catch(NumberFormatException e){
        System.out.println("Error: Se esperaba un número pero se recibió texto.");
    }
      
 } 
 


 public double average(){ 
     double total = 0; 
     for(Double g : gradez){ 
         total += g; // ClassCastException 
     } 
     if(total>0){
        total = total / gradez.size() ; 
        return total;
     }
     else return total;
 } 

 public string letterGrade(Double average){
    switch(average) 
    case average>=90 && average<=100
        return 'A';
        break;
    case average>=80 && average<=89
        return 'B';
        break;
    case average>=70 && average<=79
        return 'C';
        break;
    case average>=60 && average<=69
        return 'D';
        break;
    case average<60 
        return 'F';
        break;
 }
 
 public void checkHonorStatus(){ 
     if (average() > 90){ 
         honor = "yes";  
     } 
 } 

 public string checkPassFailed(){
    if(average()>=60){
        return 'passed';
    }
    else{
        return 'failed';
    }
 }
 
public void removeGradeByIndex(int i){ 
    try {
        gradez.remove(i);
    } catch (IndexOutOfBoundsException e) {
        System.out.println("Error: el índice " + i + " está fuera de rango.");
    }
} 

public void removeGradeByValue(string i){ 
    try {
        gradez.remove(Double.parseDouble(i));

    } catch (Exception e) {
        System.out.println("No se encuentra el valor a eliminar: ");
    }
 } 

public void reportCard(){ 
System.out.println("Student: " + name); 
System.out.println("ID: " + id); 
System.out.println("Grades #: " + gradez.size()); 
System.out.println("Average: " + avg);  
System.out.println("Honor Roll: " + honorRoll);  
} 

public static boolean validateEmpty(String data) {
    return data != null && !data.trim().isEmpty();
}
} 
public class Main { 
public static void main(String[] args){ 
student s = new Student("abc", null); 
s.addG(100); 
s.addG("Ninety");  
s.average(); 
s.checkHonorStatus(); 
s.removeGradeByIndex(9); 
s.reportCard(); 
} 
} 