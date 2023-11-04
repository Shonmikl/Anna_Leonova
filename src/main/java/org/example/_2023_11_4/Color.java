package org.example._2023_11_4;

public enum Color {
    RED,
    GREEN,
    BLUE;

    public String getColorCode() {
        return switch (this) {
            case RED -> "#FF0000";
            case BLUE -> "#00FF00";
            case GREEN -> "#0000FF";
        };
    }
}
