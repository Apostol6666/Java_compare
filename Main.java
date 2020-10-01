package com.company;

abstract class Clothes implements Comparable<Clothes> {
    Clothes(){}
    Clothes(String n) {this.name = n;}
    String name;
    
    abstract int getCost();

    public String getName() {
        return this.name;
    }

    public void messCompare(Clothes s) {
        int k = compareTo(s);
        switch (k) {
            case 1:
                System.out.println("The first product has a higher price");
                break;
            case -1:
                System.out.println("The second product has a higher price");
                break;
            default:
                System.out.println("Products have the same price");
                break;
        }
    }

    public void messCompareObject(Clothes c) {
        if (equals(c)==false) {
            System.out.println("Objects are not equal");
        } else System.out.println("Objects are equal");
    }

    @Override
    public int compareTo(Clothes s)
    {
        if (s == null)
            return 1;
        if (this.getCost() > s.getCost())
            return 1;
        else if (this.getCost() < s.getCost())
            return -1;
        else return 0;
    }
    public boolean equals(Clothes c) {
        return (this.getCost()==c.getCost() && this.getName()==c.getName());
    }
}
class Shirt  extends Clothes
{
    Shirt (){}
    Shirt (int c)
    {
        this.markup= c;
    }
    Shirt (int c, String n)
    {
        this.markup= c;
        this.name= n;
    }
    int markup;
    @Override
    int getCost() {
        return markup + 700;
    }
    public String toString() {
        return this.name+" it costs "+this.getCost();
    }
}
class Skirt  extends Clothes
{
    Skirt (){}
    Skirt (int s)
    {
        this.markup = s;
    }
    Skirt (int c, String n)
    {
        this.markup= c;
        this.name= n;
    }
    int markup;
    @Override
    int getCost() {
        return 400+markup;
    }
    public String toString() {
        return this.name+" it costs "+this.getCost();
    }
}

class Jacket extends Clothes
{
    Jacket (){}
    Jacket (int m)
    {
        this.markup = m;
    }
    Jacket (int c, String n)
    {
        this.markup= c;
        this.name= n;
    }
    int markup;
    @Override
    int getCost() {
        return 1300+markup;
    }
    public String toString() {
        return this.name+" it costs "+this.getCost();
    }
}

public class Main {
    public static void main(String[] args) {

        Skirt  sc = new Skirt (2700, "charming skirt");
        Shirt  sh = new Shirt (3300, "magic shirt");
        Jacket  j = new Jacket (5600, "best jacket");
        Clothes c;

        sc.messCompare(sh);
        sc.messCompareObject(sh);
        
        j.toString();
    }
}
