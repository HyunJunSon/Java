package chapter2;

public class AppleFancyFormatter implements AppleFormatter{
    @Override
    public String accept(Apple apple) {
        String ch = apple.getWeight() > 150 ? "heavy" : "light";
        return "A " + ch + " "+apple.getColor() + " apple";
    }
}
