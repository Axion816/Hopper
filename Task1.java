public class Task1{
    public static void main(String[] args){
        GameArena firstGame = new GameArena(1000,450);
        Ball a=new Ball(100,300,50,"BLUE");
        Ball b=new Ball(150,200,50,"MAGENTA");
        Ball c=new Ball(400,275,50,"GREEN");
        Ball d=new Ball(350,150,50,"WHITE");
        Ball[] balls={a,b,c,d};
        for(int i=0;i<4;i++){
            firstGame.addBall(balls[i]);
        }
        while(true){
            firstGame.pause();
            for(int i=0;i<4;i++){
                balls[i].changeX();
                balls[i].changeY();
            }
        }  
    }
}