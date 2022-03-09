public class Inventari {
       private final static int MAX_INSTR = 1000;

       private Instrument[] instruments = new Instrument[MAX_INSTR];
       private int ninstr = 0;

       void add(Instrument instrument){
              if (this.ninstr < MAX_INSTR){
                     this.instruments[this.ninstr] = instrument;
                     this.ninstr++;
              }
       }

       void search(Especificacio esp){

       }
}
