package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * A method that greets person
   *
   * @param someone A person to greet
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
