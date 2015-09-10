package com.tw.shopping;

public class GoodFactory {
    private String line;

    public GoodFactory(String line) {
        this.line = line;
    }

    public Good ConstructGood() {
        if(line != null && line.length() > 0){
            int i = line.lastIndexOf("at");
            String[] words =  {line.substring(0, i-1), line.substring(i+2)};
            double price = Double.parseDouble(words[1]);
            return new Good(words[0], price);
        }
        return null;
    }
}
