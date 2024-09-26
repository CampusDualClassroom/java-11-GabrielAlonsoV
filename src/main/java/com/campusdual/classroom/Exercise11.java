package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());

        // Encender la TV con el mando rojo
        if (redRemote.turnOn()) {
            System.out.println("La TV está encendida con el mando rojo.");
        }

        // Subir un canal con el mando rojo
        redRemote.channelUp();
        System.out.println("Canal actual después de subir un canal (mando rojo): " + redRemote.channel);

        // Bajar un canal con el mando rojo
        redRemote.channelDown();
        System.out.println("Canal actual después de bajar un canal (mando rojo): " + redRemote.channel);

        // Establecer el canal en 0 e intentar bajar un canal (mando rojo)
        redRemote.channel = 0;
        System.out.println("Canal establecido en 0 (mando rojo): " + redRemote.channel);
        redRemote.channelDown();  // Intentar bajar el canal cuando está en 0
        System.out.println("Canal después de intentar bajar desde 0 (mando rojo): " + redRemote.channel);

        // Subir el volumen con el mando negro
        blackRemote.volumeUp();
        System.out.println("Volumen actual después de subir el volumen (mando negro): " + blackRemote.volume);

        // Bajar el volumen con el mando negro
        blackRemote.volumeDown();
        System.out.println("Volumen actual después de bajar el volumen (mando negro): " + blackRemote.volume);

        // Establecer el volumen en 0 e intentar bajar el volumen (mando negro)
        blackRemote.volume = 0;
        System.out.println("Volumen establecido en 0 (mando negro): " + blackRemote.volume);
        blackRemote.volumeDown();  // Intentar bajar el volumen cuando está en 0
        System.out.println("Volumen después de intentar bajar desde 0 (mando negro): " + blackRemote.volume);

        // Apagar la TV con el mando rojo
        if (redRemote.turnOff()) {
            System.out.println("La TV está apagada con el mando rojo.");
        }
    }
}
