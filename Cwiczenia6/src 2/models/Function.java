package models;

import interfaces.Fun;

public abstract class Function implements Fun {
    public abstract void increaseCoefficientsBy(double delta);

    public abstract void decreaseCoefficientsBy(double delta);
}
