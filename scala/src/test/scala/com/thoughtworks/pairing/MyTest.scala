package com.thoughtworks.pairing

import org.scalatest.{MustMatchers, WordSpec}

class MyTest extends WordSpec with MustMatchers {

  "MyClass" can {
    val x = new MyClass

    "sum" in {
      x.sum(2, 3) mustBe 5
    }

  }
}
