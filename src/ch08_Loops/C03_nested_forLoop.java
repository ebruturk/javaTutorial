package ch08_Loops;

public class C03_nested_forLoop {
    public static void main(String[] args) {

        /*
eger bir döngünün baody'sinde başka  bir döngü bulunuyorsa bu tür döngülere nested-loop->
içiçe döngü denir
İç döngü dış döngünün her adımda tekrar çalışır.
içiçe döngülerde en içteki döngü en önce çalışır..
 */
// task kat daire örneği ile nested for loop yapnız kat sayıs 10. her katta daire 4

        for (int kat = 0; kat <=10 ; kat++) {
            for (int daire = 1; daire <=4 ; daire++) {
                System.out.println("daire = " + daire);
            }
        

        }











    }



}
