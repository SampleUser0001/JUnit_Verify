package ittimfn.sample.junit.controller;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import static org.mockito.Mockito.*;

public class ControllerTest {
    private Controller controller = new Controller();

    /**
     * 同一キーの場合は生成メソッドが1回しか呼ばれないことを確認する
     */
    @Test
    public void sameKeyOnceGenerate() {
        String key = "hoge";
        assertThat(this.controller.getRandomValue(key), is(this.controller.getRandomValue(key)));

        Controller spyController = spy(this.controller);
        spyController.getRandomValue(key);
        spyController.getRandomValue(key);
        verify(spyController, times(1)).generate();
    }

}