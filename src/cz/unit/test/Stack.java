package cz.unit.test;

public class Stack {
    private String hodnota;
    private Stack zamnou;

    private Stack(String hodnota, Stack zamnou) {
        this.hodnota = hodnota;
        this.zamnou = zamnou;
    }

    Stack(String hodnota) {
        this.hodnota = hodnota;
    }


    void push(String hodnota){
        this.zamnou=new Stack(this.hodnota, this);
        this.hodnota=hodnota;
    }

    String pop(){
        String returnable = this.hodnota;
        this.hodnota=this.zamnou.hodnota;
        this.zamnou=this.zamnou.zamnou;
        return returnable;
    }

    String peek(){
        return this.hodnota;
    }
}
