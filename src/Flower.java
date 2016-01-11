/**
 * Created by Admin on 11.01.2016.
 */
public class Flower {
    private String color; // цвет цветка
    private String name; // названиеч
    private int height; // высота цветка

    // Цветок расцветает
    public void bloom(){
        System.out.print("Blooming...\n");
    }
    // Цветок цветет
    public void blossom(){
        System.out.print("Blossoming...\n");
    }
    // Цветок вянет
    public void fade(){
        System.out.print("Fading...\n");
    }
}

class Tulip extends Flower {
    private String name; //название тюльпана
}

class Rose extends Flower {
    private String name; //название розы
}

class Astra extends Flower {
    private String name; //название астры
}

class Chamomile extends Flower {
    private String name; //название ромаши
}