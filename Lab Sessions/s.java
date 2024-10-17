import java.util.*;

interface Searchable{
 public void search(String s, String toBeSearched);
}

class Document implements Searchable{
 public void search(String s, String search){
  if(s.contains(search)){
   System.out.println("Index of first occurence of \"" + search + "\' is : " + s.indexOf(search));
   //System.out.println("Count of occurrence : " + cnt);
  }
  else{
   System.out.println("Substring to be searched isn't present in the original string.");
  }
 }
}

class WebPage implements Searchable{
 public void search(String s, String search){
    if(s.contains(search)){
   System.out.println("Index of first occurence of \"" + search + "\' is : " + s.indexOf(search));
   //System.out.println("Count of occurrence : " + cnt);
  }
  else{
   System.out.println("Number to be searched isn't present in the original string.");
  }
 }
}

class s{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
   System.out.print("Enter a documnetary string : ");
   String doc = sc.nextLine();
   System.out.print("Enter a string to be searched : ");
   String search = sc.nextLine();
   Document d = new Document();
   d.search(doc,search);
   
   System.out.print("Enter a web page string : ");
   String doc = sc.nextLine();
   System.out.print("Enter a string to be searched : ");
   String search = sc.nextLine();
   Document d = new Document();
   d.search(doc,search);  
 }
}
//System.out.println("");
