package Calculator

/**
 * Created by eugenew on 11/1/15.
 */
class Calculator {
    def add(def x, def y) {
        x + y
    }

    def subtract(def x, def y) {
        y - x
    }

    def multiply(def x, def y) {
        x * y
    }

    def divide(def x, def y) {
        def quotient
        if (y == 0)
            quotient = 'undefined'
        else
            quotient = x / y
    }
}
