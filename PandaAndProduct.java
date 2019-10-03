import java.util.*;


class TestClass {
   
 public static void main(String args[] ) throws Exception {
        
 Scanner sc = new Scanner(System.in);
       
 int n,pro;
      
 int a[]=new int [100000];
      
  n=sc.nextInt();
      
 for(int i=0;i<n;i++)
      
 {
           
  a[i]=sc.nextInt();
       
 }
       
 for(int i=0;i<n;i++)
       
 {
          
 for(int j=i+1;j<n-1;j++)
          
 {
               
    if(a[j]<a[j+1])
               
    {
                   
     int temp=a[j];
                   
     a[j]=a[j+1];
                   
     a[j+1]=temp;
              
    }
           
  }
      
 }
       
       
       
  pro=a[n-2]*a[n-1];
      
  System.out.println(pro);

        
        
       
      

        
   
 }

}
