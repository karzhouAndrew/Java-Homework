package workbook.lab20;

/**
 * Created by Natashka on 17.02.2015.
 */
public class HexFinderTest {
    public static void main(String[] args) {
        String str = "0x12afbfff 0xffffs воарлыврл 0xfhugdfuikhg 0x1236  10x3215";
        HexFinder hf = new HexFinder();
        hf.setStr(str);
        hf.hexFinder();
    }
}
