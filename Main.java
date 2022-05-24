public class Main {

    public static void main(String [] args) {

        Robo robo1 = new Robo();

        robo1.bateria = 100;
        robo1.descarregar = 10;

        while(true){

            robo1.questionar();
            robo1.questionarDirecao();
            robo1.tirarFoto();

        }
    }
    
}
