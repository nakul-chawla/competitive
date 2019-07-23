import java.util.HashMap;
import java.util.Scanner;

class ransom{
    static void checkMagazine(String[] a,String[] b){
        HashMap<String,Integer> hm = new HashMap<>();
        int y=0;
        for(int i=0;i<a.length;i++){
             if(hm.containsKey(a[i])){
               y=hm.get(a[i]);
               y=y+1;
               hm.put(a[i],y); 
            }else{
                hm.put(a[i],1);
            }
        }

        for(int i=0;i<b.length;i++){
            if(hm.containsKey(b[i])){
                y = hm.get(b[i]);
                y=y-1;
                if(y==0){
                    hm.remove(b[i]);
                }else{
                    hm.put(b[i],y);
                }
            }else{
                System.out.println("No");
            }
        }
        System.out.println("Yes");

    }
    public static void main(String args[]){
        String[] a=new String();
        String[] b = new String();
        Scanner sc =new Scanner(System.in);

        for(int i=0;i<2;i++){
            System.out.println("Enter size of string");
            int n=sc.nextInt();
            for(int j=0;j<n;j++){
                if(i=0){
                    a[j]=sc.nextLine();
                }
                if(i=1){
                    b[j]=sc.nextLine();
                }
            }
        }

        checkMagazine(a,b);
    }
}