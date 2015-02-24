package homework.work6.Task4;

/**
 * Created by Tonya on 24.02.2015.
 */
public class Bankomat {
    private int Note20Cnt;
    private int Note50Cnt;
    private int Note100Cnt;

    public Bankomat(int note20Cnt, int note50Cnt, int note100Cnt) {
        Note20Cnt = note20Cnt;
        Note50Cnt = note50Cnt;
        Note100Cnt = note100Cnt;
    }

    public boolean addNote(int nom,int value){
        if (nom == 20){
            Note20Cnt += value;
            return true;
        }
        else if (nom == 50){
            Note50Cnt += value;
            return true;
        }
        else if (nom == 100){
            Note100Cnt += value;
            return true;
        }
        else return false;
    }

    public boolean Money(int sum){


        //if (sum%20!=0)return false;//проверка на вшивость
        int note100 = sum/100;//число требуемых купюр номиналом 100
        if (note100>Note100Cnt) {//нету стоолько купюр - выдаем что есть
            note100 = Note100Cnt;
        }
        int note50 = 0;
        if ((sum - note100*100)%20==10||note100 == 0||(sum - note100*100)%50==0||(sum - note100*100)%50>=20) {
            note50 = (sum - note100 * 100) / 50;//число требуемых купюр номиналом 50
            if (note50 > Note50Cnt) {//нету стоолько купюр - выдаем что есть
                note50 = Note50Cnt;
            }
        }

        if ((sum-note100*100-note50*50)%20!=0)return false;
        int note20 = (sum-note100*100-note50*50)/20;//число требуемых купюр номиналом 20
        if (note20>Note20Cnt){//нету стоолько купюр - ну не смагла я
            return false;
        }

        Note100Cnt -= note100;
        Note50Cnt -= note50;
        Note20Cnt -= note20;
        System.out.println("Выдано купюр: "+note100+" номиналом 100, "+note50+" номиналом 50, "+note20+" номиналом 20");
        return true;

    }
}
