import java.util.HashSet;
public class PermCheck {
    public int solution(int[] A) {
        HashSet<Integer> zeki = new HashSet<>();
        for(int i=1; i<=A.length;i++){
            zeki.add(i);
        }
        for(int a:A){
            if(zeki.contains(a)){
                zeki.remove(a);
            }
        }
        if(zeki.isEmpty()){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        PermCheck permCheck = new PermCheck();
        System.out.println(permCheck.solution(new int[]{4,1,3,}));
    }
}
