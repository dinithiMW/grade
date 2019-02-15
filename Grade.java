
public class Grade {
    public static void main(String args[]){
    
        int[]ar={90,63,60,45};
        String[]name={"std1","std2","std3","std4"};
        char[] grade=new char[10];
        System.out.println("name\t"+"\t"+"marks"+"\t"+"grade");
        for(int i=0;i<ar.length;i++){
        if(ar[i]>=75){
        grade[i]='A';
        
        }else if (ar[i]>=55 and ar[i<75]){
        grade[i]='B'
        }else if{
        grade[i]="D"
        }
        
        }
        
        
    }
    
}
