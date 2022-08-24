public class Main {
    public static void main(String[] args) {
        int [] scores;
        scores = new int[6];
        scores[1] = 30;
        System.out.println(scores[1]);

//        int x;　xが初期化されていなのでエラーになる
//        System.out.println(x);

        int[] score = new int [6];
        System.out.println(score[0]);

//        省略のやりかた
        int[] scores1 = new int[]{10, 20, 30, 40, 50, 60};
        int[] scores2 = {10, 20, 30, 40, 50};

        int[] scores3 = {20, 30, 40, 50, 80};
        int sum = scores3[0] + scores3[1] + scores3[2] + scores3[3] + scores3[4]
                + scores[5];
        int avg = sum / score.length;
        System.out.println("合計：" + sum);
        System.out.println("平均点：" + avg);

        int[] scores4 = {20, 30, 40, 50, 80};
        for (int i = 0; i < scores4.length; i++) {
            System.out.println(scores4[i]);
        }

        int[] scores5 = {20, 30, 40, 50, 80};
        //集計結果を入れるための変数を初期化して準備
        int sum1 = 0;
        int count =0;

        for (int i = 0; i < scores5.length; i++) {

            //1科目ずつSUMに合算していく
            sum1 += scores5[i];
        }

        for (int i = 0; i < scores5.length; i++) {
            if (scores5[i] >= 50){

                //++ だとカウントアップ　--だとカウントダウン
                count++;
            }
        }

        int avg1 = sum1 / scores5.length;
        System.out.println("合計点" + sum1);
        System.out.println("平均点" + avg1);
        System.out.println("５０点以上の科目は" + count);

        //塩基記号での表示（生物学できには　塩基　＝　DNA　の配列）
        int[] seq = new int[10];
        for (int i = 0; i < seq.length; i++) {
            seq[i] = new java.util.Random().nextInt(4);
        }
        for (int i = 0; i < seq.length; i++) {
            char[] base = {'A', 'T', 'G', 'C'};
            System.out.print(base[seq[i]] + " ");
//            switch (seq[i]) {
//                case 0:
//                    System.out.print("A");
//                    break;
//                case 1:
//                    System.out.print("T");
//                    break;
//                case 2:
//                    System.out.print("G");
//                    break;
//                case 3:
//                    System.out.print("C");
//                    break;
//            }

        //拡張for文
        int[] scores6 = {20, 30, 40, 50, 80};
        for(int value : scores6){
            System.out.println(value);
        }

//        int[] array = {1, 2, 3,};
//        array = null;
//        array[0] = 10;
        }

        String str = "Javaで開発";
        System.out.println(str.length());

        //２次元配列
        int [][] scores7 = new int [2][3];
        scores7[0][0] = 40;
        scores7[0][1] = 50;
        scores7[0][2] = 60;
        scores7[1][0] = 80;
        scores7[1][1] = 80;
        scores7[1][2] = 60;

        System.out.println(scores7[1][1]);

        //親配列と子配列の要素数を表示
        int [][] scores8 = {{40, 50, 60, 70}, {80, 60}};
        System.out.println(scores8.length);
        System.out.println(scores8[1].length);

        //練習問題

        int[] points = new int[4];
        double[] weights = new double[5];
        boolean[] answers = new boolean[3];
        String[] names = new String[3];

        int[] moneyList = {121902, 8302, 55100};
        for (int i = 0; i < moneyList.length; i++) {
            System.out.println(moneyList[i]);
        }

        int[] counts = null;
        float[] heights = {171.3F, 175,0F};
        System.out.println(counts[1]);
        System.out.println(heights[2]);

        int[] numbers = {3, 4, 9};
        System.out.println("1桁の数字を入力してください。");
        int input = new java.util.Scanner(System.in).nextInt();
        for (int n : numbers){
            if(n == input){
                System.out.println("アタリ");
        }
        }
    }
}
