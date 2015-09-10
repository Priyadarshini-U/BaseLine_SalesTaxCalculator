package com.tw.shopping;

public class GoodFactory {
    private String line;

    public GoodFactory(String line) {
        this.line = line;
    }

    public Good ConstructGood() {
        if(line != null && line.length() > 0){
            try {
                int i = line.lastIndexOf("at");
                String[] words = {line.substring(0, i - 1), line.substring(i + 2)};
                double price = Double.parseDouble(words[1]);
                return constructGoodBasedOnType(words[0], price);
            }catch (Exception e){
                return null;
            }
        }
        return null;
    }

    private Good constructGoodBasedOnType(String name, double price) {
        if (name.contains("chocolate"))
            return new Food(name, price);
        if (name.contains("book"))
            return new Book(name, price);
        if (name.contains("pill"))
            return new Medicine(name, price);
        return new Good(name, price);
    }
}
