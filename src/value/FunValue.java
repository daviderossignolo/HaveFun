package value;
import java.util.ArrayList;
import java.util.List;
import antlr.*;

public class FunValue extends Value{

    private String id;
    private ArrayList<String> parametri;
    private HaveFunParser.ComContext corpo;
    private HaveFunParser.ExpContext ritorno;

    public FunValue(String id, ArrayList<String> params, HaveFunParser.ComContext corpo, HaveFunParser.ExpContext ritorno){
        this.id = id;
        this.parametri = params;
        this.corpo = corpo;
        this.ritorno = ritorno;
    }

    public String getFun(){
        return id;
    }
    public HaveFunParser.ComContext getCorpo(){ return corpo; }

    public HaveFunParser.ExpContext getRitorno(){ return ritorno; }

    public List<String> getParams(){
        return parametri;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

}
