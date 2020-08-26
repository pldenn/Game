package domain;

import lombok.Data;

import java.util.ArrayList;

@Data

public class Ship {
    private int numOfHits;
    ArrayList<String> location = new ArrayList<>();

}
