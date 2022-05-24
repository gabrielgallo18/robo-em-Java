import java.util.Scanner;
 
public class Robo {

    int bateria;
    int descarregar;

    void questionar () {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual direção deseja virar o Robo?");

        int entrada = leitor.nextInt();

        if(entrada == 90) {

            System.out.println("Robo rotacionado em 90 Graus");
            
            this.descarregarBateria();


        }else{ 
            if(entrada == 180){

                System.out.println("Robo rotacionado em 180 Graus");
            
                this.descarregarBateria();
                
            }else{
                if(entrada == 270){

                    System.out.println("Robo rotacionado em 270 Graus");
            
                    this.descarregarBateria();
                }else{
                    if(entrada == 360){
                        System.out.println("Robo rotacionado em 360 Graus");
            
                        this.descarregarBateria();
                    }else{
                        System.out.println("Comando Invalído");
                    }
                }

            }
        }

    }

    void descarregarBateria() {

        if(bateria < 10){
            this.carregar();
            System.out.println("Bateria está sendo carregada");
        }else{

            bateria -= descarregar;
    
            System.out.println("A bateria está em " + bateria);
        }
    }

    void questionarDirecao(){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Aperte W para ir para frente e S para ir para trás:");

        String direcao = leitor.nextLine();

        if(direcao.contains ("W") || direcao.contains ("w")) {

            System.out.println("o Robo andou para frente");
            this.descarregarBateria();

        }else{

            if(direcao.contains ("S") || direcao.contains ("s")){

             System.out.println("O Robo andou para trás");
             this.descarregarBateria();
            }
        }
    }
    
    void tirarFoto() {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Aperte X para tirar uma foto ou Y para sair");

        String foto = leitor.nextLine();

        if(foto.contains("X") || foto.contains("x")) {

            System.out.println("O robo capturou uma foto");
            this.descarregarBateria();

        }else{
            if(foto.contains("Y") || foto.contains("y"));

            System.out.println("Você saiu, até mais!");
        }
    }
    
    void carregar(){

        bateria = 100;

    }
}