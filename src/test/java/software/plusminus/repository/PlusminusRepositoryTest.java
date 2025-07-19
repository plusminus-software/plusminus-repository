package software.plusminus.repository;

import org.junit.jupiter.api.Test;

import static software.plusminus.check.Checks.check;

class PlusminusRepositoryTest {

    @Test
    void add() {
        int result = new PlusminusRepository().add(1, 2);
        check(result).is(3);
    }
}