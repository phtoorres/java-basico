public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTV = new SmartTV();

        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        smartTV.diminuirVolume();
    

        smartTV.mudarCanal(13);

        System.out.println("TV ligada:" + smartTV.ligada);
        System.out.println("Qual canal atual:" + smartTV.canal);
        System.out.println("Qual volume atual:" + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo status - TV ligada:" + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo status - TV ligada:" + smartTV.ligada);
    }
}
