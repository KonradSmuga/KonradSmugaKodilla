package com.kodilla.stream.beautifier;

public class PoemBeautifier {

     public void beautify(String words, PoemDecorator poemDecorator){
          String result = poemDecorator.decorate(words);
          System.out.println(result);
     }
}
