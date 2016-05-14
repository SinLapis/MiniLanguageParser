package org.sinlapis;

/**
 * Created by SinLapis
 */
class Word {
    private int category;
    private int value;

    Word(int category, int value) {
        this.category = category;
        this.value = value;
    }

    int getCategory(){
        return category;
    }
    int getValue(){
        return value;
    }
}
