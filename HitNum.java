import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class HitNum {
    public static void main(String[] args) {
        HitNum hitnum = new HitNum();
        hitnum.game();

    }

    public void game() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//バッファードリーダー
        Random rand = new Random();//乱数クラスのインスタンシエーション
        int np = rand.nextInt(90) + 10;//コンピュータが設定した整数
        String line;
        int nu = 0;//ユーザが入力した数字
        for (int i = 0; i < 5; i++) {
            System.out.println("数字を入力してください");
            if(i==0){
                System.out.println("チャンスは5回");
            }
            try {
                line = br.readLine();
                nu = Integer.parseInt(line);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            int dif = np - nu;//差分
            if (dif == 0) {
                System.out.println("当たり");
                break;
            }else if(dif>=20){//20以上なら表示する
                System.out.println("それより20以上大きいです");
            }else if(dif>0){
                System.out.println("それよりは大きいです");
            }else if(dif<=20){//20以下でも表示する
                System.out.println("それより20以上小さいです");
            }else if(dif<0){
                System.out.println("それより小さいです");
            }

            if(i==4){
                System.out.println("5回終了しました. チャレンジ失敗です");
            }
        }

    }

}
