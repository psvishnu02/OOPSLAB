import java.util.*;
class Publisher{
        String pub_name;
 
        Publisher(String pname){
                pub_name=pname;
 
        }
        void display(){
                System.out.println("Pub_name :"+pub_name);
        }
       
 
}
 
class Book extends Publisher {
        String title;
        String Author;
 
        Book(String pnm,String tit,String aut){
                super(pnm);
                title=tit;
                Author=aut;
               
        }
        void display(){
                super.display();
                System.out.println("Title :"+title+"\nAuthor:"+Author);
        }
 
       
 
}
 
class Literature extends Book{
        String type;
        Literature(String pnm,String tit,String aut,String typ){
                super(pnm,tit,aut);
                type=typ;
 
        }
        void display(){
                super.display();
                System.out.println("Type :"+type);
        }
       
 
}
 
class Fiction  extends Book{
       
        String genre;
 
        Fiction(String pnm,String tit,String aut,String gen){
                super(pnm,tit,aut);
                genre=gen;
       
        }
        void display(){
                super.display();
                System.out.println("Genre :"+genre);
        }
 
}
 
 
class book {
        public static void main(String ar[]){
                Literature[] l =new Literature[ 2];
                Fiction[] f =new Fiction [2];
                l[0] =new Literature("Cassel","Macbeth","William shakespere ","Tragedy");
                l[1] =new Literature("DC Books","India After Gandhi","Ramachandra Guha","history");
                f[0] =new Fiction ("Pottermore Publishing","Harry Potter and the Chamber of Secrets","J.K. Rowling","fantasy");
                f[1] =new Fiction("Penguin Books","The Legends of Kasak","O V Vijayan","Magical Realism");
System.out.println("litratuere books\n");
        for(int i=0;i<l.length;i++)
        {
                System.out.println("BOOK "+(i+1));
                l[i].display();
        }
System.out.println("\nFiction books\n");
     for(int i=0;i<f.length;i++)
     {
        System.out.println("BOOK "+(i+1));
        f[i].display();
     }
}
}
