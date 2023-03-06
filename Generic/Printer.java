package Generic;

public class Printer <T>{
    T print;
    T display;
    public Printer(T print, T display){
        this.print=print;
        this.display=display;
    }
    void print(){
        System.out.println(print);
        System.out.println(display);
    }
}
