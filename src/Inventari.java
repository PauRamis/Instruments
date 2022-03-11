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

       void search(Especificacio espCerca){
              for (int i = 0; i < this.ninstr; i++) {
                     Instrument inst = this.instruments[i];
                     Especificacio espInstrument = inst.getEspecificacio();
                     if (espInstrument.match(espCerca)){
                            System.out.println(inst);
                     }
              }
       }

       @Override
       public String toString(){
              String resultat = "";
              for (int i = 0; i < this.ninstr; i++) {
                     resultat += this.instruments[i];
              }
              return resultat;
       }
}
