public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        smartTv.mudarCanal(10);

        System.out.println("TV ligada? "+ smartTv.ligada);
        System.out.println("Canal Atual:"+ smartTv.canal);
        System.out.println( "Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV ligada? "+ smartTv.ligada);
    }
}
