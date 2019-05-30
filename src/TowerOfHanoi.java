public class TowerOfHanoi {

    public void hanoi(int total_disk, String from_peg, String to_peg ,String aux_peg){
        if(total_disk==1){
            System.out.println(from_peg + "\t--->\t" + to_peg);
            return ;
        }
        hanoi(total_disk-1,from_peg,aux_peg,to_peg);
        System.out.println("from disk\t"+ total_disk + "\t---->\t" + from_peg + " \t---->\t" + to_peg );
        hanoi(total_disk-1, aux_peg,to_peg,from_peg);

    }

    public static void main(String[] args) {
        TowerOfHanoi T1= new TowerOfHanoi();
        T1.hanoi(3,"From peg","to peg","moving disk");
    }
}

