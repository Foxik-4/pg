import java.util.Iterator;

public class Prvocisla implements Iterable<Integer>, Iterator<Integer>{
    int predano;
    int limit;
    int[] doposud;

    public Prvocisla iterator(){
        return this;
    }

    @Override
    public boolean hasNext() {
        return predano < limit;
    }

    @Override
    public Integer next() {
        int posledni = doposud[predano];
        if (predano == 0) posledni = 1;
        int i = posledni;
        while(true){
            i++;
            boolean delitelny = false;
            for (int it : doposud) {
                if(it != 0 && i % it == 0){
                    delitelny = true;
                }
            }
            if(!delitelny){
                doposud[++predano] = i;
                return new Integer(i);
            }
            
        }
    }


    public Prvocisla(int it) {
        it *= Integer.signum(it);
        this.limit = it;
        this.predano = 0;
        this.doposud = new int[it + 2];
    }

    public static void main(String[] args) {
        Prvocisla prv = new Prvocisla(10);
        for (Object object : prv) {
            System.out.println(object);
        }
    }
}