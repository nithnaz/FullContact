package com.travels.fullContact.model;

import org.junit.Test;
import org.meanbean.test.BeanTester;
import org.meanbean.test.EqualsMethodTester;
import org.meanbean.test.HashCodeMethodTester;
import com.travels.fullContact.model.request.HolidayRequest;

/**
 * Created by Nithin on 5/30/2018.
 */
public class TestAllRequestModels {

  Class[] classes = { HolidayRequest.class };

  @Test()
  public void testGettersAndSetters() {
    final BeanTester tester = new BeanTester();

    for (Class clas : classes) {
      tester.testBean(clas);
    }
  }

  @Test()
  public void testEquals() {
    final EqualsMethodTester tester = new EqualsMethodTester();
    for (Class clas : classes) {
      tester.testEqualsMethod(clas);
    }
  }

  @Test()
  public void testHashCode() {
    final HashCodeMethodTester tester = new HashCodeMethodTester();
    for (Class clas : classes) {
      tester.testHashCodeMethod(clas);
    }
  }
}
