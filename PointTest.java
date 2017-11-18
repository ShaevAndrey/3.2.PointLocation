package ru.job4j.condition;
 
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Class PointTest 3.2. Тест программы, определяющей принадлежность точки функции.
 * @author Shaev Andrey
 * @version 1.01
 * @since 18.11.17
*/
public class PointTest {
    @Test
    public void whenPointOnLineThenTrue() {
        Point a = new Point(1, 1);
        boolean rsl = a.is(0, 1);
        assertThat(rsl, is(true));
   }
}
