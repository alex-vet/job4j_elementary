package ru.job4j.exercises.arrays;

import java.util.Objects;

public class Cinema {
    public static Place checkEmptyPlace(Place[][] places) {
        for (int row = 0; row < places.length; row++) {
            for (int cell = 0; cell < places[row].length; cell++) {
                if ((row + cell) % 2 == 0) {
                    if (!new Place(row, cell).equals(places[row][cell])) {
                        return new Place(row, cell);
                    }
                }
            }
        }
        return null;
    }

    public static class Place {
        private int row;

        private int cell;

        public Place(int row, int cell) {
            this.row = row;
            this.cell = cell;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Place place = (Place) o;
            return row == place.row && cell == place.cell;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, cell);
        }
    }
}
