package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.SneakyThrows;

@Data
@AllArgsConstructor
public class Triangle {

    public int a;
    public int b;
    public int c;

    @SneakyThrows
    private void ifSidesArePositive() {
        if (a <= 0 || b <= 0 || c <= 0) {
        throw new IllegalAccessException("set the size to the sides");
        }
    }

    public int countPerimeter() {
    ifSidesArePositive();
        return a + b + c;
    }
}
