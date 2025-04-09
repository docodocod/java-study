package ch06;

public class array{
    public static void main(String[] args) {
        int[][] scoreArray= {
                {85, 70, 90, 95},
                {80, 95, 90, 75},
                {75, 85, 90, 80}
        };
        int[] scoreAverage=new int[3];
        System.out.println("학생들의 성적은 다음과 같습니다.");
        for( int i=0; i<3; i++){
            System.out.print("학생"+(i+1)+":");
            for(int j=0; j<3; j++) {
                System.out.print(scoreArray[i][j] + " ");
                scoreAverage[i]+=scoreArray[i][j];
            }
            System.out.printf("평균:%.1f\n",scoreAverage[i]/3.0);
        }
    }
}
