package ittimfn.sample.junit;

import ittimfn.sample.junit.controller.Controller;

/**
 * Hello world!
 *
 */
public class App {
    private Controller controller;

    public void exec( String[] args) {
        System.out.println( this.format("key") );
        System.out.println( this.format("piyo") );
        System.out.println( this.format("key") );
    }
    public static void main( String[] args ) {
        new App().exec(args);
    }

    private String format(String key) {
        return String.format("%s:%s", key, this.controller.getRandomValue(key));
    }

    public App() {
        this.controller = new Controller();
    }
}
