package org.goiteens;

public class Questions {

    public boolean isHelloMessage(String message) {
        message = message.toLowerCase();
        String helloWord1 = "привiт";
        String helloWord2 = "здраствуй";
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

    public boolean whatCanYouDo(String message){
        message = message.toLowerCase();
        String whatCanYouDo = "що ти вмієш";
        String whatCanYouDo1 = "що ти вмієш?";
        String whatCanYouDo2 = "що ти вмієш робити?";
        String whatCanYouDo3 = "що ти вмієш робити";
        return message.contains(whatCanYouDo) || message.contains(whatCanYouDo1) ||
                message.contains(whatCanYouDo2) || message.contains(whatCanYouDo3);
    }
}
