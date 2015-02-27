package training.argumentTransaction.byLink;

public class ByLink {

    int a;
    int b;

    ByLink(int a, int b){
        this.a=a;
        this.b=b;
    }

    void meth (ByLink o){
        o.a *=2;
        o.b *=2;
    }

}
