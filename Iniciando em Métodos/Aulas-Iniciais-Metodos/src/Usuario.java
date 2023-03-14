public class Usuario {
    public static void main(String [] args){
        SmartTv smartTv = new SmartTv();
        System.out.println("Status TV: "+smartTv.ligada);
        System.out.println("Canal: "+smartTv.canal);
        System.out.println("Volume: "+smartTv.volume);

        smartTv.ligar();
        System.out.println("Status TV: "+smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume: "+smartTv.volume);

        smartTv.mudarCanal(19);
        System.out.println("Novo Canal: "+smartTv.canal);
    }
}
