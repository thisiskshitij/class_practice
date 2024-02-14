// case 1: 1st loop 1 to less than eq to 5 , 2nd loop iterates 1 to less than eq to 4 
// if i==2 or j==4 apply branching statement continue , print value of i and j 
// for every iteration


// case 2: use continue label 2
// case 3: break label 2
// case 4: break label 1


public class Labels{
     public static void main(String a[])
     {
      
        label1: for(int i=1;i<=5;i++){
            label2: for(int j=1;j<=4;j++)
            {
                if(i==2 || j==4){
                    break label1;
                    // continue label1;
                }
                System.out.println(i+" "+j);
            }
            
        }
     }
}


