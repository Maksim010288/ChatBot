package org.goiteens;

public class Questions {

    public boolean isHelloMessage(String message) {
        message = message.toLowerCase();

        String helloWord1 = "привет";
        String helloWord2 = "здравствуй";

        return message.contains(helloWord1) || message.contains(helloWord2);
    }

    public boolean imFine(String message){
        message = message.toLowerCase();
        String imFine1 = "як справи";
        String imFine2 = "як ти";
        return message.contains(imFine1) || message.contains(imFine2);
    }

    public boolean asTheWeather(String message){
        String weather = "как погода?";
        return message.toLowerCase().contains(weather);
    }
}
