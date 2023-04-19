import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class MainTest {
    List<Card> flush = new ArrayList<>();
    List<Card> house = new ArrayList<>();
    List<Card> three = new ArrayList<>();
    List<Card> four = new ArrayList<>();
    List<Card> none = new ArrayList<>();
    @BeforeEach
    void setUp(){
        flush.add(new Card(1, "Hearts"));
        flush.add(new Card(2, "Hearts"));
        flush.add(new Card(3, "Hearts"));
        flush.add(new Card(4, "Hearts"));
        flush.add(new Card(5, "Hearts"));
        house.add(new Card(1, "Hearts"));
        house.add(new Card(1, "Diamonds"));
        house.add(new Card(1, "Spades"));
        house.add(new Card(4, "Diamonds"));
        house.add(new Card(4, "Hearts"));
        three.add(new Card(1, "Hearts"));
        three.add(new Card(3, "Hearts"));
        three.add(new Card(7, "Hearts"));
        three.add(new Card(4, "Spades"));
        three.add(new Card(5, "Diamonds"));
        four.add(new Card(1, "Hearts"));
        four.add(new Card(2, "Hearts"));
        four.add(new Card(3, "Hearts"));
        four.add(new Card(4, "Hearts"));
        four.add(new Card(5, "Clubs"));
        none.add(new Card(2, "Diamonds"));
        none.add(new Card(5, "Hearts"));
        none.add(new Card(10, "Spades"));
        none.add(new Card(4, "Clubs"));
        none.add(new Card(6, "Clubs"));

    }

    @Test
    void checkForFullHouse() {
        System.out.println("House Check");
        System.out.println(Main.checkForFullHouse(flush));
        System.out.println(Main.checkForFullHouse(house));
        System.out.println(Main.checkForFullHouse(three));
        System.out.println(Main.checkForFullHouse(four));
        System.out.println(Main.checkForFullHouse(none));
    }

    @Test
    void checkForFlush() {
        System.out.println("Flush Check");
        System.out.println(Main.checkForFlush(flush));
        System.out.println(Main.checkForFlush(house));
        System.out.println(Main.checkForFlush(three));
        System.out.println(Main.checkForFlush(four));
        System.out.println(Main.checkForFlush(none));
    }

    @Test
    void checkFor3Kind() {
        System.out.println("Three Check");
        System.out.println(Main.checkFor3Kind(flush));
        System.out.println(Main.checkFor3Kind(house));
        System.out.println(Main.checkFor3Kind(three));
        System.out.println(Main.checkFor3Kind(four));
        System.out.println(Main.checkFor3Kind(none));
    }

    @Test
    void checkFor4Kind() {
        System.out.println("Four Check");
        System.out.println(Main.checkFor4Kind(flush));
        System.out.println(Main.checkFor4Kind(house));
        System.out.println(Main.checkFor4Kind(three));
        System.out.println(Main.checkFor4Kind(four));
        System.out.println(Main.checkFor4Kind(none));
    }
}